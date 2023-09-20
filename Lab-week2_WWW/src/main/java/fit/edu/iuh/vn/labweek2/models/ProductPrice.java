package fit.edu.iuh.vn.labweek2.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product_price")
public class ProductPrice  implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Id
    @Column(name = "price_date_time")
    private Date priceDateTime;

    @Column(name = "price")
    private double price;

    @Column(name = "note")
    private String note;

    public ProductPrice(){

    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ProductPrice(Product product, Date priceDateTime, double price, String note) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }
}
