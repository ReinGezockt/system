package Hauptklasse;

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
    public void oneDisable() {

        System.out.println(Daten.pr�fix + " Konnte nicht geladen werden!");



    }

}
