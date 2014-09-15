package com.sirnathan.cis490homework2;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.R;

import com.sirnathan.cis490homework2.factory.RPSFactory;
import com.sirnathan.cis490homework2.models.RPS;
import com.sirnathan.cis490homework2.models.TheRock;
import com.sirnathan.cis490homework2.models.Paper;
import com.sirnathan.cis490homework2.models.Scissors;
import com.sirnathan.cis490homework2.utils.TextUtils;

public class RPSActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        Button rockBtn = (Button)findViewById(R.id.rockBtnFinder);
        rockBtn.setOnClickListener((view) -> {
            RPS rps = RPSFactory.getInstance();
            Toast toast = Toast.makeText(view.getContext(),rps.showResult(),Toast.LENGTH_LONG);
            toast.show();
            ImageView imageView = (ImageView) findViewById(R.id.yourImgView);
            imageView.setImageResource(rps.showRPSImage());
        });

        Button paperBtn = (Button)findViewById(R.id.paperBtnFinder);
        paperBtn.setOnClickListener((view) -> {
            RPS rps = RPSFactory.getInstance();
            Toast toast = Toast.makeText(view.getContext(),rps.showResult(),Toast.LENGTH_LONG);
            toast.show();
            ImageView imageView = (ImageView) findViewById(R.id.yourImgView);
            imageView.setImageResource(rps.showRPSImage());
        });

        Button scissorsBtn = (Button)findViewById(R.id.scissorsBtnFinder);
        scissorsBtn.setOnClickListener((view) -> {
            RPS rps = RPSFactory.getInstance();
            Toast toast = Toast.makeText(view.getContext(),rps.showResult(),Toast.LENGTH_LONG);
            toast.show();
            ImageView imageView = (ImageView) findViewById(R.id.yourImgView);
            imageView.setImageResource(rps.showRPSImage());
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rps, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
