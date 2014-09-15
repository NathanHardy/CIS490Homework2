package com.sirnathan.cis490homework2.models;

import com.sirnathan.cis490homework2.utils.TextUtils;

/**
 * Created by SirNathan on 9/14/2014.
 */
public class Scissors {
    @Override
    public int showRPSImage() {return android.R.drawable.scissors;}

    @Override
    public String showResult() {return TextUtils.SCISSORS;}
}
