package sparksoft.math.com.counting;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {

    boolean choc, van, straw, reg, sug, cwaf, mar, spr, syr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        choc = false;
        van = false;
        straw = false;
        reg = false;
        sug = false;
        cwaf = false;
        mar = false;
        spr = false;
        syr = false;

        final Button btnChoc = (Button)findViewById(R.id.btnChoc);
        btnChoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!choc)
                {
                    btnChoc.setTextColor(Color.BLUE);
                    choc = true;
                }
                else{
                    btnChoc.setTextColor(Color.BLACK);
                    choc = false;
                }
            }
        });

        final Button btnVan = (Button)findViewById(R.id.btnVan);
        btnVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!van)
                {
                    btnVan.setTextColor(Color.BLUE);
                    van = true;
                }
                else{
                    btnVan.setTextColor(Color.BLACK);
                    van = false;
                }
            }
        });

        final Button btnStraw = (Button)findViewById(R.id.btnStraw);
        btnStraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!straw)
                {
                    btnStraw.setTextColor(Color.BLUE);
                    straw = true;
                }
                else{
                    btnStraw.setTextColor(Color.BLACK);
                    straw = false;
                }
            }
        });

        final Button btnReg = (Button)findViewById(R.id.btnReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!reg)
                {
                    btnReg.setTextColor(Color.BLUE);
                    reg = true;
                }
                else{
                    btnReg.setTextColor(Color.BLACK);
                    reg = false;
                }
            }
        });

        final Button btnSug = (Button)findViewById(R.id.btnSug);
        btnSug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sug)
                {
                    btnSug.setTextColor(Color.BLUE);
                    sug = true;
                }
                else{
                    btnSug.setTextColor(Color.BLACK);
                    sug = false;
                }
            }
        });

        final Button btnCWaf = (Button)findViewById(R.id.btnCwaf);
        btnCWaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!cwaf)
                {
                    btnCWaf.setTextColor(Color.BLUE);
                    cwaf = true;
                }
                else{
                    btnCWaf.setTextColor(Color.BLACK);
                    cwaf = false;
                }
            }
        });

        final Button btnMar = (Button)findViewById(R.id.btnMar);
        btnMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mar)
                {
                    btnMar.setTextColor(Color.BLUE);
                    mar = true;
                }
                else{
                    btnMar.setTextColor(Color.BLACK);
                    mar = false;
                }
            }
        });

        final Button btnSpr = (Button)findViewById(R.id.btnSpr);
        btnSpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!spr)
                {
                    btnSpr.setTextColor(Color.BLUE);
                    spr = true;
                }
                else{
                    btnSpr.setTextColor(Color.BLACK);
                    spr = false;
                }
            }
        });

        final Button btnSyr = (Button)findViewById(R.id.btnSyr);
        btnSyr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!syr)
                {
                    btnSyr.setTextColor(Color.BLUE);
                    syr = true;
                }
                else{
                    btnSyr.setTextColor(Color.BLACK);
                    syr = false;
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
