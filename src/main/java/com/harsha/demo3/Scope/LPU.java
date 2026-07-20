package com.harsha.demo3.Scope;

import com.harsha.demo3.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LPU {
    LPU(){
        System.out.println("LPU rank 100");
    }
    public void admission(Student student) {
        System.out.println("admission");
    }

    public void exam(){
        System.out.println("exam");
    }

    public void preClasses(Student student){
        System.out.println("preClasses");
    }
}
