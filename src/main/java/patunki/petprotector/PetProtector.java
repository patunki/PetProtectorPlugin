package patunki.petprotector;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Tameable;
import org.bukkit.entity.TextDisplay;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PetProtector extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        System.out.println("Pet Protector starting up.");
        System.out.println("Thanks to BooyaTheSkeleton on Reddit!");

        getServer().getPluginManager().registerEvents(this, this);

        System.out.println("PetProtector started.");
    }


    @EventHandler
    public void onEntityDamage(EntityDamageEvent event){
        Tameable a = (Tameable) event.getEntity();
        if (a.isTamed()){
            event.setCancelled(true);
            System.out.println("This pet is protected by " + a.getOwner().getName() );
        }


    }


}

