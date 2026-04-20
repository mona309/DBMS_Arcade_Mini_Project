package com.arcade.management.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;

@Entity @Table(name = "achievement") @Data @NoArgsConstructor @AllArgsConstructor
public class Achievement implements Cloneable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer achievementID;
    @Column(length = 100)
    private String name;
    @Column(length = 255)
    private String description;
    @OneToMany(mappedBy = "achievement")
    private List<PlayerAchievement> playerAchievements;
    @Override public String toString() { return "Achievement{achievementID=" + achievementID + ", name='" + name + "'}"; }

    // Prototype pattern: clone method
    @Override
    public Achievement clone() {
        try {
            return (Achievement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }
}