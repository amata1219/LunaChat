package com.github.ucchyocean.lc3.bridge;

import com.github.phoenix_dev38.ns.NickSystem;
import org.bukkit.entity.Player;

public class NickSystemBridge {

    public String getNickName(Player player) {
        return NickSystem.nicked.get(player);
    }

}
