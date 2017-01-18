package example.codeclan.com.rps;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by user on 18/01/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void setup(){

        game = new Game(Choice.PAPER);

    }


    @Test
    public void thereAreThreeChoices(){
        Game newGame = new Game(Choice.ROCK);
        assertEquals(3, newGame.getLength());
    }


    @Test
    public void canGetCompChoice(){
        assertEquals("Rock", game.getRandomCompChoice());
    }

    @Test
    public void canGetRandomCompChoice(){
        assertNotNull(game.getRandomCompChoice());
    }


}
