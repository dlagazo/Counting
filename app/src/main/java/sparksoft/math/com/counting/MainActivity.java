package sparksoft.math.com.counting;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    boolean choc, van, straw, reg, sug, cwaf, mar, spr, syr;

    int boxSize = 9;
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

        final Button btnGenerate = (Button)findViewById(R.id.btnGenerate);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_combinations);

                Button btnBack = (Button)findViewById(R.id.btnBack);
                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //setContentView(R.layout.activity_main);
                        recreate();
                    }
                });


                //AbsoluteLayout rlScreen = (AbsoluteLayout)findViewById(R.id.rlScreen);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int height = displayMetrics.heightPixels;
                int width = displayMetrics.widthPixels;
                Log.d("COMBO", String.valueOf(width));
                Log.d("COMBO", String.valueOf(height));

                if(choc)
                {
                    ImageView ivChoc = new ImageView(getApplicationContext());
                    ivChoc.setImageDrawable(getDrawable(R.drawable.chocolate));
                    ivChoc.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
                    LinearLayout llOption1 = (LinearLayout)findViewById(R.id.llOption1);

                    ivChoc.setPadding(10, 10, 10, 10);
                    llOption1.addView(ivChoc);
                    ivChoc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(), "Chocolate", Toast.LENGTH_SHORT).show();
                        }
                    });

                    if(sug)
                    {
                        ImageView ivSug = new ImageView(getApplicationContext());
                        ivSug.setImageDrawable(getDrawable(R.drawable.sugar));
                        ivSug.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                        ivSug.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Sugar", Toast.LENGTH_SHORT).show();
                            }
                        });
                        LinearLayout container = new LinearLayout(getApplicationContext());
                        container.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
                        LinearLayout llOption1a = (LinearLayout)findViewById(R.id.llOption1a);
                        llOption1a.setWeightSum(llOption1.getWeightSum() + 1);
                        container.addView(ivSug);
                        llOption1a.addView(container);


                        LinearLayout llOption3 = new LinearLayout(getApplicationContext());
                        llOption3.setOrientation(LinearLayout.HORIZONTAL);
                        llOption3.setGravity(Gravity.CENTER);
                        llOption3.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));

                        if(syr)
                        {
                            ImageView ivSyr = new ImageView(getApplicationContext());
                            ivSyr.setImageDrawable(getDrawable(R.drawable.syrup));
                            ivSyr.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            ivSyr.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(getApplicationContext(), "Syrup", Toast.LENGTH_SHORT).show();
                                }
                            });
                            llOption3.addView(ivSyr);
                        }
                        if(spr)
                        {
                            ImageView ivSpr = new ImageView(getApplicationContext());
                            ivSpr.setImageDrawable(getDrawable(R.drawable.sprinkles));
                            ivSpr.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            ivSpr.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(getApplicationContext(), "Sprinkles", Toast.LENGTH_SHORT).show();
                                }
                            });
                            llOption3.addView(ivSpr);
                        }
                        if(mar)
                        {
                            ImageView ivMar = new ImageView(getApplicationContext());
                            ivMar.setImageDrawable(getDrawable(R.drawable.sprinkles));
                            ivMar.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                            ivMar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Toast.makeText(getApplicationContext(), "Sprinkles", Toast.LENGTH_SHORT).show();
                                }
                            });
                            llOption3.addView(ivMar);
                        }

                        LinearLayout llOption1b = (LinearLayout)findViewById(R.id.llOption1b);
                        llOption1b.setWeightSum(llOption1b.getWeightSum()+1);
                        llOption1b.addView(llOption3);


                    }
                    if(cwaf)
                    {
                        ImageView ivWaf = new ImageView(getApplicationContext());
                        ivWaf.setImageDrawable(getDrawable(R.drawable.waffle));
                        ivWaf.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
                        ivWaf.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Waffle", Toast.LENGTH_SHORT).show();
                            }
                        });
                        LinearLayout llOption1a = (LinearLayout)findViewById(R.id.llOption1a);
                        llOption1a.setWeightSum(llOption1.getWeightSum()+1);

                        llOption1a.addView(ivWaf);

                        LinearLayout llOption1b = (LinearLayout)findViewById(R.id.llOption1b);
                        llOption1b.setWeightSum(llOption1b.getWeightSum() + 1);
                    }
                    if(reg)
                    {
                        ImageView ivReg = new ImageView(getApplicationContext());
                        ivReg.setImageDrawable(getDrawable(R.drawable.regular));
                        ivReg.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT, 1.0f));
                        ivReg.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Regular", Toast.LENGTH_SHORT).show();
                            }
                        });
                        LinearLayout llOption1a = (LinearLayout)findViewById(R.id.llOption1a);
                        llOption1a.setWeightSum(llOption1.getWeightSum()+1);

                        llOption1a.addView(ivReg);

                        LinearLayout llOption1b = (LinearLayout)findViewById(R.id.llOption1b);
                        llOption1b.setWeightSum(llOption1b.getWeightSum() + 1);
                    }
                }

                /*

                if(choc)
                {
                    ImageView ivChoc = new ImageView(getApplicationContext());
                    ivChoc.setImageDrawable(getDrawable(R.drawable.chocolate));
                    ivChoc.setLayoutParams(new ViewGroup.LayoutParams(width / boxSize, height / boxSize));
                    ivChoc.setX(width / 5);
                    ivChoc.setY(height / 18);
                    ivChoc.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(), "Chocolate", Toast.LENGTH_SHORT).show();
                        }
                    });
                    rlScreen.addView(ivChoc);

                    if(reg && !sug && !cwaf)
                    {
                        ImageView ivSug = new ImageView(getApplicationContext());
                        ivSug.setImageDrawable(getDrawable(R.drawable.regular));
                        ivSug.setLayoutParams(new ViewGroup.LayoutParams(width / 9, height / 9 ));
                        ivSug.setX(ivChoc.getX());
                        ivSug.setY(ivChoc.getY() + width/boxSize);
                        ivSug.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Sugar Cone", Toast.LENGTH_SHORT).show();
                            }
                        });
                        rlScreen.addView(ivSug);
                    }
                    else if(!reg && sug && !cwaf)
                    {
                        ImageView ivSug = new ImageView(getApplicationContext());
                        ivSug.setImageDrawable(getDrawable(R.drawable.regular));
                        ivSug.setLayoutParams(new ViewGroup.LayoutParams(width / 9, height / 9 ));
                        ivSug.setX(ivChoc.getX());
                        ivSug.setY(ivChoc.getY() + width/boxSize);
                        ivSug.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getApplicationContext(), "Sugar Cone", Toast.LENGTH_SHORT).show();
                            }
                        });
                        rlScreen.addView(ivSug);
                    }
                }

                if(van)
                {
                    ImageView ivVanilla = new ImageView(getApplicationContext());
                    ivVanilla.setImageDrawable(getDrawable(R.drawable.vanilla));
                    ivVanilla.setLayoutParams(new ViewGroup.LayoutParams(width / boxSize, height / boxSize));
                    ivVanilla.setX(width / 5 * 3);
                    ivVanilla.setY(height / 18);
                    ivVanilla.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(), "Vanilla", Toast.LENGTH_SHORT).show();
                        }
                    });
                    rlScreen.addView(ivVanilla);
                }

                if(straw)
                {
                    ImageView ivStraw = new ImageView(getApplicationContext());
                    ivStraw.setImageDrawable(getDrawable(R.drawable.strawberry));
                    ivStraw.setLayoutParams(new ViewGroup.LayoutParams(width / boxSize, height / boxSize));
                    ivStraw.setX(width / 4 * 3);
                    ivStraw.setY(height / 8);
                    ivStraw.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(getApplicationContext(), "Strawberry", Toast.LENGTH_SHORT).show();
                        }
                    });
                    rlScreen.addView(ivStraw);
                }

                */






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
