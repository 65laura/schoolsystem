package com.example.SchoolSystem.repositories;
import com.example.SchoolSystem.StudentDTO;
import com.example.SchoolSystem.model.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
public interface StudentRepository extends JpaRepository<StudentEntity,UUID> {
        Page<StudentEntity> findAll(Pageable pageable);
        List<StudentEntity> findAllByOrderByStudentIdAsc();
        @Query(value = "SELECT s FROM StudentEntity s")
        Page<StudentEntity> getStudents(Pageable pageable);
        @Query(value ="SELECT * FROM StudentEntity s WHERE s.firstName= john",nativeQuery = true)
        Collection<StudentEntity>findAllActiveStudentsNative();
        @Query("SELECT s FROM StudentEntity s WHERE s.studentId = :studentId AND s.firstName = :firstName")
        StudentEntity findUserByStudentIdAndFirstNameNamedParams(@Param("studentId") UUID studentId, @Param("firstName") String firstName);
        @Query("SELECT new com.example.SchoolSystem.StudentDTO(s.studentId, s.firstName, s.lastName) FROM StudentEntity s WHERE s.studentId = :studentId")
        List<StudentDTO> findStudentDTOById(@Param("studentId") UUID studentId);
        }

