package com.myfirst.springservice.democrud.controllers;

import com.myfirst.springservice.democrud.beans.Regetration;
import com.myfirst.springservice.democrud.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RetriveStudentController {
    
    @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")

    @ResponseBody
    public List<Student> getStudent(){
        return Regetration.getInstance().getStudentRecords();
    }
    
}
