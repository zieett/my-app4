package rmit.rmitsb.model;

import javax.persistence.*;
import java.util.List;


@Entity
    public class Employer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String name;

        @Column (nullable = false)
        private String address;

        @Column (nullable = false)
        private String phone;

        @Column (nullable = false)
        private String email;

        @Column (nullable = false)
        private String password;
        @Column (nullable = true)
        private String postedJob;

    public String getPostedJob() {
        return postedJob;
    }

    public void setPostedJob(String postedJob) {
        this.postedJob = postedJob;
    }

    public Employer(long id, String name, String address, String phone, String email, String password, String postedJob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.postedJob = postedJob;
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

        public Employer(long id, String name, String address, String phone, String email, String password) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Employer(long id, String name, String address, String password) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.password = password;
        }


        @Override
        public String toString() {
            return "Employer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }

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

        public Employer(long id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;
        }
        public Employer(){}
    }
