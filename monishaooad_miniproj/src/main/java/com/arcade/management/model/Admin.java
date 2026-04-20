package com.arcade.management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity 
@Table(name = "admin") 
@Data 
@NoArgsConstructor 
@AllArgsConstructor
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    private static Admin instance;

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminID;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false)
    private String role = "SUPER_ADMIN";

    // Singleton getInstance method
    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }
