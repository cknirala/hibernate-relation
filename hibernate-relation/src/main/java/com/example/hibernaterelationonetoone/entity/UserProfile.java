package com.example.hibernaterelationonetoone.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="address")
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(name ="gender")
    private Gender gender;

    @Column(name="birth_of_date")
    private LocalDate birthOfDate;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy ="userProfile")
    private User user;

}
