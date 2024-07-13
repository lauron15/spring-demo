package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", columnDefinition = "SERIAL", nullable = false)
    private Long id;
    @Column(name = "name", columnDefinition = "VARCHAR(150)", nullable = false)
    private String name;
    @Column(name = "email", columnDefinition = "VARCHAR(150)", nullable = false, unique = true)
    private String email;
    @Column(name = "password", columnDefinition = "VARCHAR(60)", nullable = false)
    private String password;
}
