package pl.sda.szkoła;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static <Lista> void main(String[] args) {
        School school = new School("Ekonomik", "Płock");
        School school1 = new School("Spozywczak", "Toruń");
        School school2 = new School("Jagiellonka", "Płock");
        School school3 = new School("3LO", "Warszawa");

        Student student = new Student("Kuba", "Kowalski", school);
        Student student1 = new Student("Paweł", "Nowak", school);
        Student student2 = new Student("Wojtek", "Wiśniewski", school);
        Student student3 = new Student("Arek", "Wolski", school1);
        Student student4 = new Student("Michał", "Zadroziński", school1);
        Student student5 = new Student("Piotr","Jaworski", school1);
        Student student6 = new Student("Olek", "Bobas", school1);
        Student student7 = new Student("Paweł", "Wojciechowski", school2);
        Student student8 = new Student("Tomek", "Więcławski", school2);
        Student student9 = new Student("Przemek", "Tomaszewski", school2);
        Student student10 = new Student("Michał", "Kamiński", school3);
        Student student11 = new Student("Piotr","Machalica", school3);



        List<Student> listaStudentów = new ArrayList<Student>();
        listaStudentów.add(student);
        listaStudentów.add(student1);
        listaStudentów.add(student2);

        List<Student> listaStudentów1 = new ArrayList<Student>();
        listaStudentów1.add(student3);
        listaStudentów1.add(student4);
        listaStudentów1.add( student5);
        listaStudentów1.add(student6);

        List<Student> listaStudentów2 = new ArrayList<Student>();
        listaStudentów2.add(student7);
        listaStudentów2.add(student8);
        listaStudentów2.add(student9);

        List<Student> listaStudentów3 = new ArrayList<Student>();
        listaStudentów3.add(student10);
        listaStudentów3.add( student11);




        Map<School, List<Student>> map = new HashMap<School, List<Student>>();
        map.put(school, listaStudentów);
        map.put(school1, listaStudentów1);
        map.put(school2, listaStudentów2);
        map.put(school3, listaStudentów3);

        for (Map.Entry<School, List<Student>> entry : map.entrySet ( )) {
            System.out.println (entry.getKey ( ).getName ( ));
            for (Student it : entry.getValue ()) {
                System.out.println (String.format (" ", " ") + it.getName ( ) + " " + it.getLastname ( ));
            }
        }


    }
}



