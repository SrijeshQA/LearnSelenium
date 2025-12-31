package dataModel;

public class createEmployeeData {

    private String name;
    private int salary;
    private int durationWorked;
    private String grade;
    private String emailId;


    public createEmployeeData(String name, int salary, int durationWorked, String grade, String emailId) {
        this.name = name;
        this.salary = salary;
        this.durationWorked = durationWorked;
        this.grade = grade;
        this.emailId = emailId;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getDurationWorked() {
        return durationWorked;
    }

    public String getGrade() {
        return grade;
    }

    public String getEmailId() {
        return emailId;
    }
}