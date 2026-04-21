package com.arcade.management.factory;

import com.arcade.management.model.Player;
import com.arcade.management.model.Achievement;
import com.arcade.management.model.PlayerAchievement;

import java.time.LocalDateTime;

public class PlayerAchievementFactory {

    // Step 1: Create a single static instance
    private static PlayerAchievementFactory instance;

    // Step 2: Private constructor (prevents object creation outside)
    private PlayerAchievementFactory() {}

    // Step 3: Public method to access the single instance
    public static PlayerAchievementFactory getInstance() {
        if (instance == null) {
            instance = new PlayerAchievementFactory();
        }
        return instance;
    }

    // Step 4: Method to create PlayerAchievement
    public PlayerAchievement createPlayerAchievement(Player player, Achievement achievement) {
        PlayerAchievement pa = new PlayerAchievement();
        pa.setPlayer(player);
        pa.setAchievement(achievement);
        pa.setDateEarned(LocalDateTime.now());
        return pa;
    }
}
