package pl.sda.szkoła;

import java.util.ArrayList;

public class Main {

    public static <Lista> void main(String[] args) {
	School school  = new School("Ekonomik", "Płock");
	School school1 = new School("Spozywczak", "Toruń");
	School school2 = new School("Jagiellonka", "Płock");
	School school3 = new School("3LO", "Warszawa");

	Student student = new Student("Kuba", "Kowalski");
        Student student1 = new Student("Paweł", "Nowak");
        Student student2 = new Student("Wojtek", "Wiśniewski");
        Student student3 = new Student("Arek","Wolski");
        Student student4 = new Student("Michał", "Zadroziński");

        Lista<Student> listaStudentów = new ArrayList<>()
    }
}
