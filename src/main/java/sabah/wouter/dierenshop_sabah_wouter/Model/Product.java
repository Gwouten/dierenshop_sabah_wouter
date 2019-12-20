package sabah.wouter.dierenshop_sabah_wouter.Model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;


        // deze classe is aangemaakt om ons catalogus te laten zien; alle informatie komt hieruit
@Entity
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotBlank
        private String name;

        @NotNull
        @DecimalMin(value = "0.50",message = "Has to be bigger than 0.5")
        private BigDecimal price;

        @NotBlank
        @Size(min = 4, max = 400)
        @Column(columnDefinition = "text")
        private String description;

        @NotBlank
        private int rating;

        @NotBlank
        private String imgUrl;

        @NotBlank
        private String category;

        @NotNull
        private int stock;

        @NotBlank
        private int delivery;

        @NotBlank
        private String animal;

        @NotNull
        @DecimalMin(value = "0.50",message = "Has to be bigger than 0.5")
        private BigDecimal promoPrice;



    public Product() {
    }

            public BigDecimal getPromoPrice() {
                return promoPrice;
            }

            public void setPromoPrice(BigDecimal promoPrice) {
                this.promoPrice = promoPrice;
            }

            public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                ", imgUrl='" + imgUrl + '\'' +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                ", delivery=" + delivery +
                '}';
    }
}
