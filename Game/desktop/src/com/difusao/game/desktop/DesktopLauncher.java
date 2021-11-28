package com.difusao.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.difusao.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = Game.TITLE;
		config.width = Game.WIDTH;;
		config.height = Game.HEIGHT;;
		config.x = 0;
		config.y = 0;
		config.backgroundFPS = 60;
		config.foregroundFPS = 60;

		new LwjglApplication(new Game(), config);
	}
}
