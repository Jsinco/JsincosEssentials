package me.jsinco.jsincosessentials

import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

class WIngs {
    var elyWings : ItemStack? = null

    fun init(){
        initializeWings()
    }

    private fun initializeWings(){
        val item = ItemStack(Material.ELYTRA)
        val meta : ItemMeta = item.itemMeta
        meta.setDisplayName("Color Changing Elytra")
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true)
        meta.addEnchant(Enchantment.DURABILITY, 11, true)
        meta.addEnchant(Enchantment.PROTECTION_FALL, 9, true)
        val lore = arrayListOf("§cG§6l§ao§9w §dI")
        meta.lore = lore
        item.itemMeta = meta
        elyWings = item
    }
}