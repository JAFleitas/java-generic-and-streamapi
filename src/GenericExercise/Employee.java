package GenericExercise;

public class Employee extends Person{
    private String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "job='" + job + '\'' +
                "} " + super.toString();
    }
}
