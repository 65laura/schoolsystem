package com.example.SchoolSystem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {

    @Query(value = "SELECT t FROM Teacher t")
    List<Teacher> findAllTeachers(Sort sort);
    @Query(value = "SELECT * Teacher ORDER BY teachersId",countQuery ="SELECT count(*)FROM Teacher",nativeQuery = true)
    Page<Teacher>findAllTeachersWithPagination(Pageable pageable) ;
    @Query(value = "SELECT * FROM Teacher t WHERE t.teachersId = :teachersId and t.teachersName = :teachersName",
            nativeQuery = true)
    Optional<Teacher> findAllTeachersByTeachersIdAndTeachersNameNamedParamsNative(@Param("teachersId") UUID teachersId, @Param("teachersName") String teachersName);
    @Modifying
    @Query(
            value =
                    "insert into Teacher (teachersId,teachersName,teachersAge,) values (:teachersId,:teachersName, :teachersAge,)", nativeQuery = true)
    void insertTeacher(@Param("teachersId") UUID teachersId, @Param("teachersName") String teachersName,
                    @Param("teachersAge") Integer teachersAge);
    @Query("SELECT new com.example.SchoolSystem.TeacherDTO(t.teachersName,t.teachersId, t.teachersAge) FROM Teacher t WHERE t.teachersId = :teachersId")
    Optional<TeacherDTO> findTeacherDTOById(@Param("teachersId") UUID teachersId);
}
