package platforms;
import controllers.GameController;
public class Computer extends GamePlatform{

    public  Computer(){
        this.setName ("Computer");
    }
    @Override

    public void addContoller(GameController gameController) {
        System.out.println(gameController.getName() + " controller added ");
    }
}
