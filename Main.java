import java.util.*;

class Student {
    private String id;
    private String name;
    private double marks;

    public Student(String id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Update Student\n4. Delete Student\n5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        String id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(id, name, marks));
        System.out.println("Student added!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        String id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("Student updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        String id = sc.nextInt();
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted if existed.");
    }
}
# 🎓 Student Record Management System (Java Console Application)

## 📘 Overview
This is a simple *Student Record Management System* built in Java using the *OOP (Object-Oriented Programming)* approach.  
It allows users to *add, view, update, and delete* student records using a console-based menu.

---

## ⚙ Features
- ➕ *Add Student* – Add a new student by ID, name, and marks  
- 📋 *View Students* – Display all student records  
- ✏ *Update Student* – Modify an existing student’s name or marks  
- 🗑 *Delete Student* – Remove a student record using their ID  
- 🚪 *Exit* – Safely exit the application  

---

## 🧠 Concepts Used
- Classes and Objects  
- Encapsulation (private fields, getters, setters)  
- ArrayList for dynamic storage  
- Loops and conditional statements  
- Scanner for user input  

---

## 💻 How to Run
Open Terminal / Command Prompt

Navigate to your Java file directory

Compile and Run:

javac main.java
java Main

# Sample output:
====== Student Management System ======
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Choose option: 1
Enter ID: S101
Enter Name: Chinna
Enter Marks: 89
✅ Student added successfully!

Choose option: 2
--- Student List ---
ID: S101, Name: Chinna, Marks: 89.0
Author:
chinna narasimha reddy
