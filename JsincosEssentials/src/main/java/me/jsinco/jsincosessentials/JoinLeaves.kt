package me.jsinco.jsincosessentials

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

@Suppress("deprecation")
class JoinLeaves : Listener{
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val player = event.player
        if (!player.hasPlayedBefore()) {
            event.joinMessage = "§6${player.name} §7just joined, first time :o"
        } else {
            event.joinMessage = "§6${player.name} §7just joined :o"
        }
    }

    @EventHandler
    fun onPlayerLeave(event: PlayerQuitEvent) {
        val player = event.player
        event.quitMessage = "§6${player.name} §7just left, WTH :("
    }
}