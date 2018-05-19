package ru.avp.submarine

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class SubmarineMain : Game() {
    override fun create() {
        /*Assets.loadPreloader()
        if (Assets.isReady()) {
            Assets.initPreloader()
            println("Init SPlash")
            setScreen(SplashView(this))
        }*/
    }

    override fun dispose() {
        super.dispose()
        //Assets.dispose()
    }
}
