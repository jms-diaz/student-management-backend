package io.diaz.studentmanagement.service;

import io.diaz.studentmanagement.exception.UserNotFoundException;
import io.diaz.studentmanagement.model.Student;
import io.diaz.studentmanagement.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class StudentService {
    private final StudentRepo studentRepo;

    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student addStudent(Student student) {
        student.setStudentCode(UUID.randomUUID().toString());
        return studentRepo.save(student);
    }

    public List<Student> findAllStudent() {
        return studentRepo.findAll();
    }

    public Student findStudentById(Long id) {
        return studentRepo.findStudentById(id)
                .orElseThrow(() -> new UserNotFoundException("Student by id " + id + " was not found."));
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteStudentById(id);
    }
}
