package  com.example.SchoolSystem;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.UUID;
public interface StudentRepository extends JpaRepository<StudentEntity,UUID> {
        Page<StudentEntity> findAll(Pageable pageable);
        List<StudentEntity> findAllByOrderByStudentIdAsc();

        @Query(value = "SELECT s FROM StudentEntity s")
        Page<StudentEntity> getStudents(Pageable pageable);
}
