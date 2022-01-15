package rmit.rmitsb.model;

import javax.persistence.*;



@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column (nullable = false)
    private String salary;

    @Column (nullable = false)
    private String specialization;

    @Column (nullable = false)
    private String description;

    @Column (nullable = false)
    private String careerLevel;

    @Column (nullable = false)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Job(long id, String title, String salary, String specialization, String description, String careerLevel, String location) {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.specialization = specialization;
        this.description = description;
        this.careerLevel = careerLevel;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", salary='" + salary + '\'' +
                ", specialization='" + specialization + '\'' +
                ", description='" + description + '\'' +
                ", careerLevel='" + careerLevel + '\'' +
                '}';
    }

    public Job(long id, String title, String salary, String specialization, String description, String careerLevel) {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.specialization = specialization;
        this.description = description;
        this.careerLevel = careerLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCareerLevel() {
        return careerLevel;
    }

    public void setCareerLevel(String careerLevel) {
        this.careerLevel = careerLevel;
    }
    public Job(){}
}
