public class Student {
    String name;
    String address;
    String email;
    String phoneNumber;
    String id;

    Student(String name, String address, String email, String phoneNumber, String id) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    void goToClass() {
        System.out.println("Student " + this.name + " is going to class.");
    }

    void doExercises() {
        System.out.println("Student " + this.name + " is doing exercises.");
    }

    void payTuition() {
        System.out.println("Student " + this.name + " has paid the tuition.");
    }

    void takeExam() {
        System.out.println("Student " + this.name + " is taking the exam.");
    }

    void showInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Email: " + this.email);
        System.out.println("Phone number: " + this.phoneNumber);
        System.out.println("ID: " + this.id);
    }

}
