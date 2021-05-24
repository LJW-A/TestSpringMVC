package gksl.yjk.controller;



import gksl.yjk.entity.Student;
import gksl.yjk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class StudentController {


    @Autowired
    private StudentService iUserService;

    @RequestMapping("/select")
    public ModelAndView selectUser(){
        ModelAndView mv=new ModelAndView();
        Student student = iUserService.selectUser(1);
        mv.addObject("student",student);
        mv.setViewName("user");
        return mv;
    }


    @RequestMapping("/insert")
    public String insertStudent(Student student){
        int i = iUserService.insertStudent(student);
        System.out.println(i);
        return "user";
    }

    @RequestMapping("/delete")
    public ModelAndView deleteStudent(){
        ModelAndView mv=new ModelAndView();
        int deletestudent = iUserService.deletestudent(3);
        System.out.println(deletestudent);
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/update")
    public ModelAndView uodatestudednt(){
        ModelAndView mv=new ModelAndView();
        Student student = iUserService.selectUser(1);
        String name=student.getName();
        int i = iUserService.updateStudent(name, 2);
        System.out.println(i);
        mv.setViewName("user");
        return mv;
    }


}
