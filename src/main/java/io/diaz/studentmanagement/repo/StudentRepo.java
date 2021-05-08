package io.diaz.studentmanagement.repo;

import io.diaz.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    void deleteStudentById(Long Id);

    Optional<Student> findStudentById(Long id);
}
