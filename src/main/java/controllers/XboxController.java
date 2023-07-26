package controllers;

public class XboxController implements GameController{
    private String name = "Xbox Kontrolcüsü";

        @Override
        public String getName() {
            return "Xbox";
        }
}
