import controllers.GameController;
import controllers.PlaystationController;
import controllers.XboxController;
import platforms.GamePlatform;
import platforms.Playstation;
import platforms.Xbox;

public class Main {
    public static void main(String[] args) throws Exception {
        GamePlatform playstation = new Playstation();
        GamePlatform xboxPlatform = new Xbox();
        GameController playstationController = new PlaystationController();
        GameController xboxController = new XboxController();

        System.out.println("   .   .   .   .   .   .   .   .   .   .   .\n");

        playstation.open();
        playstation.addController(xboxController);
        playstation.addController(playstationController);
        playstation.playGame();
        playstation.shutdown();


        System.out.println("... ... ... ... ... ... ... ... ... ... ... .. .\n");

        xboxPlatform.open();
        xboxPlatform.addController(xboxController);
        xboxPlatform.addController(playstationController);
        xboxPlatform.playGame();
        xboxPlatform.shutdown();
        xboxPlatform.shutdown();

    }

}
