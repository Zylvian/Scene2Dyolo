package com.jarlescene2d.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jarlescene2d.wescene2dingnowgang;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Scene2DDrop";
		config.width = 1200;
		config.height = 1200;
		new LwjglApplication(new wescene2dingnowgang(), config);
	}
}
