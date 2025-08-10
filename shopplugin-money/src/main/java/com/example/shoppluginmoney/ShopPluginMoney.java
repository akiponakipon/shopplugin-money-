package com.example.shoppluginmoney;

import com.example.shoppluginmoney.commands.SellCommand;
import com.example.shoppluginmoney.commands.SellOffCommand;
import com.example.shoppluginmoney.commands.ShopMoneyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class ShopPluginMoney extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("sell").setExecutor(new SellCommand());
        getCommand("selloff").setExecutor(new SellOffCommand());
        getCommand("shopmoney").setExecutor(new ShopMoneyCommand());
        getLogger().info("ShopPluginMoney が有効になりました！");
    }

    @Override
    public void onDisable() {
        getLogger().info("ShopPluginMoney が無効になりました！");
    }
}

