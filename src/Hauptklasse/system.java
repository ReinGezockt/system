package Hauptklasse;

import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Reinhard Schuster on 22.05.2015.
 */
public class system extends JavaPlugin {

    @Override
    public void onEnable (){







        System.out.println(Daten.pr�fix + " Wurde erfolgreich Geladen!");









    }
    @Override
    public void onDisable() {

        System.out.println(Daten.pr�fix + " Konnte nicht geladen werden!");



    }

}
