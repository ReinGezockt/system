package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Reinhard Schuster on 22.05.2015.
 */
public class BukkitBroadcast implements CommandExecutor{


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return false;


        if (!(sender instanceof Player)) {
            System.out.println("Um diesen Command ausführen zu können, musst du ein Spieler sein.");





        }
     }
    }