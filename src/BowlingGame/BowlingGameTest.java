package BowlingGame;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 9/11/12
 * Time: 7:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class BowlingGameTest
{

    private BowlingGame game = new BowlingGame();

    @Test
    public void allZeros()
    {
        for (int i = 0; i < 20; i++)
            game.roll(0);

        assertEquals(0, game.getScore());
    }

    @Test
    public void allOnes()
    {
        for (int i = 0; i < 20; i++)
            game.roll(1);

        assertEquals(20, game.getScore());
    }

    //roll spare

    //roll strike

    //roll all strikes
}
