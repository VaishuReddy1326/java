package edu.in.employee;

public class GovtEmployee {
    public static void pension(){
        System.out.println("employee pension after retirement");
    }
    public static void main(String[] args){
        pension();
        PrivateEmployee p=new PrivateEmployee();
        p.salary();
    }
    
}
