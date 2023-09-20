package fit.edu.iuh.vn.labweek2.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "cus_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cusId;
    @Column(name = "cust_name", nullable = false)
    private String custName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "address")
    private String address;

    public Customer(){

    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", custName='" + custName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public long getCusId() {
        return cusId;
    }

    public void setCusId(long cusId) {
        this.cusId = cusId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
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

    public Customer(long cusId, String custName, String email, String phone, String address) {
        this.cusId = cusId;
        this.custName = custName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
}
