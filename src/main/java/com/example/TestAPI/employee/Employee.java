package com.example.TestAPI.employee;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    private Long id;
    private String name;
    private String nic;

    public Employee() {
    }

    public Employee(Long id, String name, String nic) {
        this.id = id;
        this.name = name;
        this.nic = nic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                '}';
    }
}
