package controllers;

public class PlaystationController implements GameController {
        private String name = "Playstation Kontrolcüsü";

        @Override
        public String getName(){
            return "Platstation";
        }
}

