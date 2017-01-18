package example.codeclan.com.rps;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game {

    private ArrayList<String> compOptions;

    private Choice choice;
    private String player;

    public Game(Choice choice){

        compOptions = new ArrayList<String>();
        setupCompChoice();
        this.choice = choice;
        this.player = player;

    }

    public int getLength() {
        return compOptions.size();
    }

    private String getCompChoiceAtIndex(int index) {
        return compOptions.get(index);
    }


    public String getRandomCompChoice(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String compOptions = getCompChoiceAtIndex(index);
        return compOptions;

    }

    public String getPlayer(){
        return this.player;
    }

    public void setupCompChoice(){

        String[] choices = {
            "Rock",
            "Paper",
            "Scissors"
        };
        for (String option : choices){
            addChoice(option);
        }

    }

    private void addChoice(String choice) {
        compOptions.add(choice);
    }

    public String checkResult(){

        switch (getRandomCompChoice()){
            case "Rock":
                if (getRandomCompChoice() == "Rock") {

                }
                return "DRAW";
            default:
                return "IDK";
        }

    }

}
