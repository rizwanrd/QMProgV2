package com.QM.app.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class StudentH2DB {

        private @Id @GeneratedValue Long id;
        private String name;
        private String email;
        private LocalDate dob;

        public StudentH2DB(String name, String email, LocalDate dob) {
                this.name = name;
                this.email = email;
                this.dob = dob;
        }

        public StudentH2DB() {}

        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public LocalDate getDob() {
                return dob;
        }

        public void setDob(LocalDate dob) {
                this.dob = dob;
        }

        @Override
        public String toString() {
                return "StudentH2DB{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", email='" + email + '\'' +
                        ", dob=" + dob +
                        '}';
        }
}
