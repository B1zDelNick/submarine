package ru.avp.submarine.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.mygdx.game.GameConstants
import ru.avp.submarine.SubmarineMain

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        System.setProperty("user.name", "Public")
        val config = LwjglApplicationConfiguration()
        config.width = GameConstants.GAME_WIDTH
        config.height = GameConstants.GAME_HEIGHT
        config.useGL30 = false
        config.title = "Game Name"
        LwjglApplication(SubmarineMain(), config)
    }
}
