package platforms;
import controllers.GameController;
public abstract class GamePlatform {

        private String name;
        private boolean state;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


         public boolean isState() {
            return state;
        }

        public void setState(boolean state){
            this.state = state;
        }

        public void open() throws Exception {

            if (state == true) {
                throw new Exception("Warning" + this.name + " is already open ");
            } else {
                System.out.println(this.name + " started ");
                this.state = true;
            }
        }

        public void addController(GameController gameController) {
        if (gameController.getName() == name) {
            System.out.println(gameController.getName() + " controller added successfuly !");
        } else {
            System.out.println("incompatible device !!! ");

        }
    }
        public void shutdown() throws Exception{

            if (state == false) {
                throw new Exception("Warning" + this.name + "already turned off");
            } else {
                System.out.println("incompatible device");
            }
        }

        public void playGame() throws Exception{

        if (state == true) {
            System.out.println("Game started");
        } else {
            throw new Exception("Please open your platform before");
        }
    }

    public abstract void addContoller(GameController gameController);
}
