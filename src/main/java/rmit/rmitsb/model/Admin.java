package rmit.rmitsb.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column (nullable = false)
    private String address;

    @Column (nullable = false)
    private String password;
    @Column (nullable = false)
    private String phone;

    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private int age;
    public Admin(long id, String name, String address, String password, String phone, String email, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin(long id, String name, String address, String password, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
        this.age = age;
    }


    public Admin(){};
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Admin(long id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
