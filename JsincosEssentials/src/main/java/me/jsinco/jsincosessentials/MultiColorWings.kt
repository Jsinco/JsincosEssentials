package me.jsinco.jsincosessentials

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.potion.PotionEffectType

class MultiColorWings : Listener {
    var glowPlayers : ArrayList<Player> = arrayListOf()

    fun Glow(){
        val plugin = Bukkit.getServer().pluginManager.getPlugin("JsincosEssentials") ?: return
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, {
                for (player in glowPlayers){
                    player.addPotionEffect(PotionEffectType.GLOWING.createEffect(365, 0))
                }
            }, 100L)
    }

    @EventHandler
    fun ArmorChange(event: PlayerArmorChangeEvent){
        if (event.slotType == PlayerArmorChangeEvent.SlotType.CHEST){
            if (event.newItem == Wings.elyWings){
                val player = event.player
                glowPlayers.add(player)
                player.addPotionEffect(PotionEffectType.GLOWING.createEffect(365, 0))
            }
        }
    }

    @EventHandler
    fun ArmorRemove(event: PlayerArmorChangeEvent){
        if (event.slotType == PlayerArmorChangeEvent.SlotType.CHEST){
            if (event.oldItem == Wings.elyWings && event.newItem != Wings.elyWings || event.newItem == null){
                val player = event.player
                glowPlayers.remove(player)
                player.removePotionEffect(PotionEffectType.GLOWING)
            }
        }
    }
}