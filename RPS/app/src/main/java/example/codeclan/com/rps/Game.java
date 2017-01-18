package example.codeclan.com.rps;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/01/2017.
 */

public class Game {

    private ArrayList<String> compChoice;

    private Choice choice;

    public Game(Choice choice){

        compChoice = new ArrayList<String>();
        setupCompChoice();
        this.choice = choice;

    }

    public int getLength() {
        return compChoice.size();
    }

    private String getCompChoiceAtIndex(int index) {
        return compChoice.get(index);
    }


    public String getRandomCompChoice(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String compChoice = getCompChoiceAtIndex(index);
        return compChoice;

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
        compChoice.add(choice);
    }

    public String playGame(Choice choice){

        switch (choice){
            case ROCK:
                if compChoice == "Rock";
                return "WIN";
            default:
                return "IDK";
        }

    }

}
