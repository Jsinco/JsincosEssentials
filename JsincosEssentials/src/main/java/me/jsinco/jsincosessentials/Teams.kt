package me.jsinco.jsincosessentials

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.scoreboard.Scoreboard
import org.bukkit.scoreboard.Team

class Teams {
    companion object {
        fun createTeams() {
            val board: Scoreboard = Bukkit.getScoreboardManager().mainScoreboard
            val teams: ArrayList<String> = arrayListOf("red", "blue", "green", "yellow", "purple", "aqua", "white")
            val teamColors = arrayListOf(ChatColor.RED, ChatColor.BLUE, ChatColor.GREEN, ChatColor.YELLOW, ChatColor.LIGHT_PURPLE, ChatColor.AQUA, ChatColor.WHITE)
            for (team in teams) {
                if (board.getTeam(team) == null) {
                    board.registerNewTeam(team)
                    val activeTeam: Team? = board.getTeam(team)
                    activeTeam?.color = teamColors[teams.indexOf(team)]
                }
            }
        }
    }
}