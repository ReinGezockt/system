package Commands;

import org.bukkit.Bukkit;
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



        if (!(sender instanceof Player)) {
            System.out.println("Um diesen Command ausführen zu können, musst du ein Spieler sein.");
            return true;
        }
        Player p = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("Broadcast")) {


            if (args.length < 1) {
                p.sendMessage("§4Zu wenig Argumente!");
                return true;

            } else if (args.length >= 1) {
                Bukkit.broadcastMessage(args[1]);


            }


        }
        return false;
    }
    }