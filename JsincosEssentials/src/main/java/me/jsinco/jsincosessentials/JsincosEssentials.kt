package me.jsinco.jsincosessentials

import org.bukkit.plugin.java.JavaPlugin

class JsincosEssentials : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(JoinLeaves(), this)
        server.pluginManager.registerEvents(Forfun(), this)
        Wings.init()
        Teams.createTeams()
        MultiColorWings().Glow()
        server.pluginManager.registerEvents(MultiColorWings(), this)
    }

}