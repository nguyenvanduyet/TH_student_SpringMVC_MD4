package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.StudentService;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController  {
    private StudentService studentService = new StudentService();

    @GetMapping("")
    public ModelAndView showAll(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Student> studentList = studentService.findAll();
        modelAndView.addObject("list",studentList);
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditStudent(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        Student student = studentService.findById(id);
        modelAndView.addObject("s",student);
        return modelAndView;

    }
    @PostMapping("/edit/{id}")
    public ModelAndView updateStudent(@PathVariable Integer id, @RequestParam String name,String address, int age){
    ModelAndView modelAndView = new ModelAndView("redirect:/student");
    Student student = new Student(id,name, address,age);
    studentService.update(id,student);
    return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView createStudent( @RequestParam int id, String name, String address, int age){
        ModelAndView modelAndView = new ModelAndView("redirect:/student");
        Student student = new Student(id,name, address,age);
        studentService.createStudent(id,student);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreateStudent(){
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteStudent(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("redirect:/student");
        studentService.delete(id);
        return modelAndView;
    }
    @PostMapping("/search")
    public ModelAndView findByName(@RequestParam String name ){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Student> students = studentService.findByName(name);
        modelAndView.addObject("list", students);
        return modelAndView;
    }
}
