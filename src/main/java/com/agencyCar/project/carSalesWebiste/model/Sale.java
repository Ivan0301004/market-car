package com.agencyCar.project.carSalesWebiste.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sale_id")
    private Long id;

    @OneToOne(mappedBy = "sale", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "sale")
    private List<Accessory> accessoryList;

    private LocalDateTime saleDateCompleted;
}
