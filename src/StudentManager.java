import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {private ArrayList<Student> students;
private Scanner scanner;

// Constructor
public StudentManager() {
    students = new ArrayList<>();
    scanner = new Scanner(System.in);
}

// Add Student
public void addStudent() {
    System.out.print("Enter Roll No: ");
    int rollNo = scanner.nextInt();
    scanner.nextLine();  // Consume the newline

    System.out.print("Enter Name: ");
    String name = scanner.nextLine();

    System.out.print("Enter Course: ");
    String course = scanner.nextLine();

    Student student = new Student(rollNo, name, course);
    students.add(student);
    System.out.println("Student added successfully!");
}

// Display all students
public void displayStudents() {
    if (students.isEmpty()) {
        System.out.println("No students to display.");
        return;
    }

    for (Student student : students) {
        System.out.println(student);
    }
}

// Remove a student
public void removeStudent() {
    System.out.print("Enter Roll No of student to remove: ");
    int rollNo = scanner.nextInt();
    scanner.nextLine();  // Consume the newline

    Student studentToRemove = null;

    for (Student student : students) {
        if (student.getRollNo() == rollNo) {
            studentToRemove = student;
            break;
        }
    }

    if (studentToRemove != null) {
        students.remove(studentToRemove);
        System.out.println("Student removed successfully.");
    } else {
        System.out.println("Student not found.");
    }
}

// Menu
public void menu() {
    while (true) {
        System.out.println("\n1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Remove Student");
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                displayStudents();
                break;
            case 3:
                removeStudent();
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}

public static void main(String[] args) {
    StudentManager manager = new StudentManager();
    manager.menu();
}
}


