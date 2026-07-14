package com.harsha.demo3.Java;

class P{
    void m1(){

    }

    void m2(){

    }
}

class c1 extends P{
    void m3(){

    }
}

//c1 c=new P();
/*
* The compiler raises an error when we create an object like the way i created above because the parent don't know what's inside the c1 class.
* We cannot put the parent reference in the childs class object
*
*/

public class Test {

}


