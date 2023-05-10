package me.jsinco.jsincosessentials

import org.bukkit.entity.EntityType
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.ProjectileLaunchEvent

class Forfun : Listener {
    @EventHandler
    fun throwSnowball(event: ProjectileLaunchEvent) {
        if (event.entityType == EntityType.SNOWBALL) {
            val snowball = event.entity
            snowball.name to "Nice_balls"
            snowball.isGlowing = true
        }
    }

}