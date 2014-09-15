package com.sirnathan.cis490homework2.factory;

import android.util.Log;

import com.sirnathan.cis490homework2.models.RPS;
import com.sirnathan.cis490homework2.models.TheRock;
import com.sirnathan.cis490homework2.models.Paper;
import com.sirnathan.cis490homework2.models.Scissors;

import java.util.Date;
import java.util.Random;

/**
 * Created by SirNathan on 9/14/2014.
 */
public class RPSFactory {
    private static int counter = 1;
    private RPSFactory() {}
    public static RPS getInstance() {
        Random randGen = new Random(new Date().getTime() + ++counter);
        int val randGen.nextInt(4); // up to 4 exclusive
        Log.d("rps", "rps number" + val);
        switch (val) {
            case 1:
                return new TheRock();
            case 2:
                return new Paper();
            case 3:
                return new Scissors();
        }
    }
}
