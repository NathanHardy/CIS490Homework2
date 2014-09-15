package com.sirnathan.cis490homework2.models;

import android.graphics.Bitmap;
import android.R;
import com.sirnathan.cis490homework2.R;
import com.sirnathan.cis490homework2.utils.TextUtils;

/**
 * Created by SirNathan on 9/14/2014.
 */
public class Paper implements RPS {
    @Override
    public int showRPSImage() {return android.R.drawable.paper;}

    @Override
    public String showResult() {return TextUtils.PAPER;}
}
