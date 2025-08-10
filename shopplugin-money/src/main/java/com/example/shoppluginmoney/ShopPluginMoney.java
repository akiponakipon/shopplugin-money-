package com.example.shoppluginmoney;

import org.bukkit.plugin.java.JavaPlugin;

public class ShopPluginMoney extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ShopPluginMoney が有効になりました！");

        // コマンド登録
        getCommand("sell").setExecutor((sender, command, label, args) -> {
            sender.sendMessage("§a[Shop] §f売却コマンドが実行されました！");
            return true;
        });

        getCommand("selloff").setExecutor((sender, command, label, args) -> {
            sender.sendMessage("§c[Shop] §f売却停止コマンドが実行されました！");
            return true;
        });

        getCommand("shopmoney").setExecutor((sender, command, label, args) -> {
            sender.sendMessage("§e[Shop] §f現在の所持金を確認します！");
            return true;
        });
    }

    @Override
    public void onDisable() {
        getLogger().info("ShopPluginMoney が無効になりました！");
    }
}
