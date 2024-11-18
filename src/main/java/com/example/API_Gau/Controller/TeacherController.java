package com.example.API_Gau.Controller;

import com.example.API_Gau.Entity.Teacher;
import com.example.API_Gau.Service.TeacherService;
import com.example.API_Gau.TeacherDto.TeacherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

   private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/add")
    public String addTeacher(
            @RequestBody Teacher teacher
    ){
        teacherService.addteach(teacher);
        return "Record Saved";

    }

    @DeleteMapping("/delete")
    public String deletetech(
         @RequestParam long id
    ){
        teacherService.deletetecher(id);
        return "Record deleted";

    }

    @PutMapping("/update")
    public String upadteEmp(
            @RequestBody TeacherDto dto,
            @RequestParam  long id
    ){
        teacherService.updateEmp(id,dto);
        return "Record updated";
    }

    @GetMapping("/get")
    public List<Teacher> getTeache(){

        List<Teacher> techers=TeacherService.getTecher();
        return techers;

    }

}
