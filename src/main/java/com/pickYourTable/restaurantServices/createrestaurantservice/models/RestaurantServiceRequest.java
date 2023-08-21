package com.pickYourTable.restaurantServices.createrestaurantservice.models;

import com.pickYourTable.repositories.restaurantrepository.CousineTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class RestaurantServiceRequest {

    @ApiModelProperty(value = "Nazwa restauracji", required = true)
    private String name;

    @ApiModelProperty(value = "Miejscowość", required = true)
    private String city;

    @ApiModelProperty(value = "Kod pocztowy", required = true)
    private String postalCode;

    @ApiModelProperty(value = "Ulica", required = true)
    private String street;

    @ApiModelProperty(value = "Numer domu", required = true)
    private String localNumber;

    @ApiModelProperty(value = "Opis restauracji", required = true)
    private String description;

    @ApiModelProperty(value = "Numer telefonu", required = true)
    private String phoneNumber;

    @ApiModelProperty(value = "Adres e-mail", required = true)
    private String email;

    @ApiModelProperty(value = "Typ kuchni", required = true)
    private CousineTypeEnum cousineType;
}
