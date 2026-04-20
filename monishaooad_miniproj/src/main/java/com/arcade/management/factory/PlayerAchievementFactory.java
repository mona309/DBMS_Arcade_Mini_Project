package com.arcade.management.factory;

import com.arcade.management.model.Player;
import com.arcade.management.model.Achievement;
import com.arcade.management.model.PlayerAchievement;
import java.time.LocalDateTime;

public class PlayerAchievementFactory {
    public static PlayerAchievement createPlayerAchievement(Player player, Achievement achievement) {
        PlayerAchievement pa = new PlayerAchievement();
        pa.setPlayer(player);
        pa.setAchievement(achievement);
        pa.setDateEarned(LocalDateTime.now());
        return pa;
    }
}