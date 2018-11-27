package schedulesystem;

public class Course {

    private String instructor, day, title, department;
    private int startTime, endTime, section, number, hours;
    
    public Course() {
        
    }
    
    public Course(String instructor, String day, String title, String department, int startTime, int endTime, int section, int number, int hours) {
        this.instructor = instructor;
        this.day = day;
        this.title = title;
        this.department = department;
        this.startTime = startTime;
        this.endTime = endTime;
        this.section = section;
        this.number = number;
        this.hours = hours;
    }
    
    public String getInstructor() {
        return instructor;
    }
    
    public String getDay() {
        return day;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public int getStartTime() {
        return startTime;
    }
    
    public int getEndTime() {
        return endTime;
    }
    
    public int getSection() {
        return section;
    }
    
    public int getNumber() {
        return number;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public void setStartTime(int time) {
        this.startTime = time;
    }
    
    public void setEndTime(int time) {
        this.endTime = time;
    }
    
    public void setSection(int section) {
        this.section = section;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setHours(int hours) {
        this.hours = hours;
    }
}
