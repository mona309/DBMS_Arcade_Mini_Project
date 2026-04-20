package com.arcade.management.factory;

import com.arcade.management.model.Rank;

public class RankFactory {
    public static Rank createRank(Integer rankID, String rankName, Integer rankScore) {
        Rank rank = new Rank();
        rank.setRankID(rankID);
        rank.setRankName(rankName);
        rank.setRankScore(rankScore);
        return rank;
    }

    public static Rank createBronzeRank() {
        return createRank(1, "Bronze", 0);
    }

    public static Rank createSilverRank() {
        return createRank(2, "Silver", 1000);
    }

    public static Rank createGoldRank() {
        return createRank(3, "Gold", 2500);
    }

    public static Rank createPlatinumRank() {
        return createRank(4, "Platinum", 5000);
    }
}