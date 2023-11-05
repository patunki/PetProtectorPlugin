package patunki.petprotector;


import org.bukkit.entity.Tameable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

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
            System.out.println("Pet avoided damage. Protected by " + Objects.requireNonNull(a.getOwner()).getName() );

        }


    }
}
