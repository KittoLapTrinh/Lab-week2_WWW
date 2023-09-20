package fit.edu.iuh.vn.labweek2.models;


import fit.edu.iuh.vn.labweek2.enums.EmployeeStatus;
import jakarta.ejb.Local;
import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.persistence.*;

import fit.edu.iuh.vn.labweek2.models.Order;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(name = "full_name", nullable = false)
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private String full_name;

    @Column(name = "dob", nullable = false)

    private LocalDate dob;

    @Column(name = "email", length = 150, unique = true)
    private String email;

    @Column(name = "phone", length = 15, nullable = false)
    private String phone;

    @Column(name = "address",length = 250, nullable = false)
    private String address;

    @Column(name = "status",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EmployeeStatus status;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Order> listOrder;

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", full_name='" + full_name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", listOrder=" + listOrder +
                '}';
    }

    public long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(long emp_id) {
        this.emp_id = emp_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public Employee(long emp_id, String full_name, LocalDate dob, String email, String phone, String address, EmployeeStatus status, List<Order> listOrder) {
        this.emp_id = emp_id;
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.listOrder = listOrder;
    }
}
