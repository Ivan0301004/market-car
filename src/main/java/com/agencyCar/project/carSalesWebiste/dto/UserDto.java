package com.agencyCar.project.carSalesWebiste.dto;

import com.agencyCar.project.carSalesWebiste.model.Reservation;
import com.agencyCar.project.carSalesWebiste.model.Sale;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Data
public class UserDto {

    private Long id;

    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    @Email
    private String email;

    @NotNull
    @NotEmpty
    private String password;

    @NotNull
    @NotEmpty
    private String address;

    @NotNull
    @NotEmpty
    private String phoneNumber;

    private String profilePictureUrl;

    private List<Reservation> reservationList;

    private List<Sale> saleList;
}
