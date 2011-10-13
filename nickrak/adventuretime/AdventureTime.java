package nickrak.adventuretime;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;


public class AdventureTime extends JavaPlugin
{
    private final Logger l = Logger.getLogger("AdventureTime");
    
    @Override
    public void onDisable()
    {
        this.l.info("[AdventureTime] Stopped.");
    }

    @Override
    public void onEnable()
    {      
        this.l.info("[AdventureTime] Started (" + this.getDescription().getVersion() + ").");
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (command.getName().equalsIgnoreCase("beginadventure"))
        {
            
        }
        else if (command.getName().equalsIgnoreCase("endadventure"))
        {
            
        }
        else if (command.getName().equalsIgnoreCase("requestrespawn"))
        {
            
        }
        else if (command.getName().equalsIgnoreCase("acceptrespawn"))
        {
            
        }
        
        return false;
    }
}
