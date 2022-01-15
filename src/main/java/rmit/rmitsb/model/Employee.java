package rmit.rmitsb.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column (nullable = false)
    private String address;
    @Column (nullable = false)
    private int age;
    @Column (nullable = false)
    private String specialization;
    @Column (nullable = false)
    private String phone;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String password;
    @Column (nullable = false)
    private String qualification;
    @Column
    private String yoe;

    @Column (nullable = true)
    private String applied_job;
    public String getPhone() {
        return phone;
    }

    public String getJobRelated() {
        return jobRelated;
    }

    public void setJobRelated(String jobRelated) {
        this.jobRelated = jobRelated;
    }

    public Employee(long id, String name, String address, int age, String specialization, String phone, String email, String password, String qualification, String yoe, String jobRelated) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.qualification = qualification;
        this.yoe = yoe;
        this.jobRelated = jobRelated;
    }

    public String getApplied_job() {
        return applied_job;
    }

    public void setApplied_job(String applied_job) {
        this.applied_job = applied_job;
    }

    public Employee(long id, String name, String address, int age, String specialization, String phone, String email, String password, String qualification, String yoe, String applied_job, String jobRelated) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.qualification = qualification;
        this.yoe = yoe;
        this.applied_job = applied_job;
        this.jobRelated = jobRelated;
    }

    @Column (nullable = true)
    private String jobRelated;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(long id, String name, String address, int age, String specialization, String phone, String email, String password, String qualification, String yoe) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.qualification = qualification;
        this.yoe = yoe;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(long id, String name, String address, int age, String specialization, String password, String qualification, String yoe) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.password = password;
        this.qualification = qualification;
        this.yoe = yoe;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getYoe() {
        return yoe;
    }

    public void setYoe(String yoe) {
        this.yoe = yoe;
    }



    public Employee() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employee(long id,String phone, String name, String address, int age, String specialization, String qualification, String yoe) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.specialization = specialization;
        this.qualification = qualification;
        this.yoe = yoe;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
