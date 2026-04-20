package com.arcade.management.factory;

import com.arcade.management.model.Player;
import com.arcade.management.model.MultiplayerSession;
import com.arcade.management.model.PlayerSession;

public class PlayerSessionFactory {
    public static PlayerSession createPlayerSession(Player player, MultiplayerSession session, Integer score, Integer position) {
        PlayerSession ps = new PlayerSession();
        ps.setPlayer(player);
        ps.setSession(session);
        ps.setScore(score);
        ps.setPosition(position);
        return ps;
    }
}