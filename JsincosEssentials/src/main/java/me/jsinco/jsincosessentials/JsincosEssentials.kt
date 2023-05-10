package me.jsinco.jsincosessentials

import org.bukkit.plugin.java.JavaPlugin

class JsincosEssentials : JavaPlugin() {
    override fun onEnable() {
        server.pluginManager.registerEvents(JoinLeaves(), this)
        server.pluginManager.registerEvents(Forfun(), this)
        val wings = WIngs()
        wings.init()
    }

}