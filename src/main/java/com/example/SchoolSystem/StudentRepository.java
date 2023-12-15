package  com.example.SchoolSystem;
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
        @Query("SELECT s FROM StudentEntity WHERE s.studentId=:studentId and s.firstName = :firstname")
        StudentEntity findUserByStudentIdAndFirstNameNamedParams(@Param("studentId")UUID studentId,@Param("firstName")String firstName);
}
