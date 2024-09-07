package com.example.request;

import com.example.model.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class CreatProductRequest {
    private String title;

    private String description;

    private int price;

    private int dicountedPrice;

    private int discountPersent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size = new HashSet<>();

    private String imageUrl;

    private String topLevelCategory;

    private String secondLevelCategory;

    private String thirdLevelCategory;


}
