package Hauptklasse;

import Commands.BukkitBroadcast;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Reinhard Schuster on 22.05.2015.
 */
public class system extends JavaPlugin {

    @Override
    public void onEnable (){
        this.getCommand("Broadcast").setExecutor(new BukkitBroadcast());


        System.out.println(Daten.präfix + " Wurde erfolgreich Geladen!");









    }
    @Override
    public void onDisable() {

        System.out.println(Daten.präfix + " Konnte nicht geladen werden!");



    }

}
