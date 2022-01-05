package dev.norska.hexp.api;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import dev.norska.hexp.data.CropProfile;

public class HarvestEXPEvent extends Event implements Cancellable{

    private final Player player;
    private final CropProfile cropProfile;
    private boolean isCancelled;

    public HarvestEXPEvent(Player player1, CropProfile cropProfile1) {
        this.player = player1;
        this.cropProfile = cropProfile1;
        this.isCancelled = false;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public CropProfile getCropProfile() {
        return this.cropProfile;
    }
}
