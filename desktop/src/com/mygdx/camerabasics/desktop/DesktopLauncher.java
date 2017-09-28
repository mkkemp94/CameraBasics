package com.mygdx.camerabasics.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.camerabasics.CameraBasics;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "camera";
		config.useGL30 = false;
		config.width = 1280;
		config.height = 720;

		new LwjglApplication(new CameraBasics(), config);
	}
}
