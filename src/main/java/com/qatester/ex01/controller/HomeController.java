package com.qatester.ex01.controller;

import com.qatester.ex01.beans.Student;
import com.qatester.ex01.beans.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage(){
        return "index.html";

    }

    @GetMapping("/studentForm")
    public String studentForm(){
        return "studentForm.html";
    }

    @PostMapping("/studentPost")
    public String studentPost(@RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String email,
                              @RequestParam String dogumTarihi){

        Student student1 = new Student();
       //student1.setId(1);
        student1.setAdi(adi);
        student1.setSoyadi(soyadi);
        student1.setEmail(email);
        student1.setDogumTarihi(LocalDate.parse(dogumTarihi));

        System.out.println(student1.toString());


        // System.out.printf("Adı: %s, Soyadı: %s, E-mail: %s, Doğum Tarihi: %s", adi, soyadi, email, dogumTarihi);

        return "/studentForm.html";
    }

   @PostMapping ("/teacherPost")
    public String teacherPost(@RequestParam String adi,
                              @RequestParam String soyadi,
                              @RequestParam String brans,
                              @RequestParam Integer tecrube){

       Teacher ogretmen1 = new Teacher();
       ogretmen1.setAdi(adi);
       ogretmen1.setSoyadi(soyadi);
       ogretmen1.setBrans(brans);
       ogretmen1.setTecrube(tecrube);

       System.out.println(ogretmen1);
       return "index.html";

   }




}
