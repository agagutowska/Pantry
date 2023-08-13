package com.example.pantry.model;

import com.example.pantry.enums.MeasurementUnitEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ShoppingListModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopping_item_id")
    private Long shoppingItemId;

    @NotEmpty(message = "Product name cannot be empty.")
    @Column(name = "name")
    private String itemName;

    @Min(value = 1, message = "Quantity should not be less than 1.")
    @Column(name = "quantity")
    private Integer itemQuantity;

    @Column(name = "measurement_unit")
    @Enumerated(EnumType.STRING)
    private MeasurementUnitEnum measurementUnit;
}
