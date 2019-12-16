package sabah.wouter.dierenshop_sabah_wouter.Model;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;


@Entity
    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @NotBlank
        private String name;


        @NotNull
        @DecimalMin(value = "0.50",message = "moet groter zijn dan 0.5")
        private BigDecimal price;

        @NotBlank
        @Size(min = 4, max = 400)
        @Column(columnDefinition = "text")
        private String description;


        @NotBlank
        private int rating;

        private String imgUrl;

        private String category;

        @NotNull
        private int stock;

        private int delivery;







}
