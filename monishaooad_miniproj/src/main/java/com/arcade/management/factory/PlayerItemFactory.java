package com.arcade.management.factory;

import com.arcade.management.model.Player;
import com.arcade.management.model.Item;
import com.arcade.management.model.PlayerItem;
import java.time.LocalDate;

public class PlayerItemFactory {
    public static PlayerItem createPlayerItem(Player player, Item item, Integer quantity) {
        PlayerItem pi = new PlayerItem();
        pi.setPlayer(player);
        pi.setItem(item);
        pi.setDateObtained(LocalDate.now());
        pi.setQuantity(quantity);
        return pi;
    }
}