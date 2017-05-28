package Models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Burak Köken on 28.5.2017.
 */
@Entity
@Table(name = "Employee")
@SecondaryTable(name = "EmployeeDetails")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "date", table = "EmployeeDetails")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "salary", table = "EmployeeDetails")
    private int salary;

    @Column(name = "address")
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
