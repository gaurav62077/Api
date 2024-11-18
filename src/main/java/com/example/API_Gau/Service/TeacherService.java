package com.example.API_Gau.Service;

import com.example.API_Gau.Entity.Teacher;
import com.example.API_Gau.Repository.TeacherRepository;
import com.example.API_Gau.TeacherDto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private static TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public  static List<Teacher> getTecher() {
        return teacherRepository.findAll();
    }


    public void addteach(Teacher teacher) {

        teacherRepository.save(teacher);

    }


    public void deletetecher(long id) {
        teacherRepository.deleteById(id);

    }

    public void updateEmp(long id, TeacherDto dto) {

        Optional<Teacher> optec=teacherRepository.findById(id);
        Teacher teacher=optec.get();
        teacher.setName(dto.getName());
        teacherRepository.save(teacher);
    }


}
