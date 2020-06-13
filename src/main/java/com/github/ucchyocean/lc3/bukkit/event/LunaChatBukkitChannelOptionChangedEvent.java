/*
 * @author     ucchy
 * @license    LGPLv3
 * @copyright  Copyright ucchy 2020
 */
package com.github.ucchyocean.lc3.bukkit.event;

import java.util.HashMap;

import org.bukkit.command.CommandSender;

/**
 * オプション変更イベント
 * @author ucchy
 */
public class LunaChatBukkitChannelOptionChangedEvent extends LunaChatBukkitBaseCancellableEvent {

    private CommandSender sender;
    private HashMap<String, String> options;

    public LunaChatBukkitChannelOptionChangedEvent(String channelName,
            CommandSender sender, HashMap<String, String> options) {
        super(channelName);
        this.sender = sender;
        this.options = options;
    }

    /**
     * 変更後のオプションリストをかえす
     * @return オプションリスト
     */
    public HashMap<String, String> getOptions() {
        return options;
    }

    /**
     * オプションリストを上書き設定する
     * @param options オプションリスト
     */
    public void setOptions(HashMap<String, String> options) {
        this.options = options;
    }

    /**
     * チャンネルのオプションを変更した人を取得する。
     * @return チャンネルのオプションを変更したCommandSender
     */
    public CommandSender getSender() {
        return sender;
    }
}