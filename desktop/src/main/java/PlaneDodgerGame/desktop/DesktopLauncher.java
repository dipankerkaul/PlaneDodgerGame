package PlaneDodgerGame.desktop;


import PlaneDodgerGame.PlaneDodgerGame;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class DesktopLauncher
{
	public static void main (String[] args)
	{
		Game myGame = new PlaneDodgerGame();
		LwjglApplication launcher = new LwjglApplication( myGame, "Game Title", 800, 600 );
	}
}