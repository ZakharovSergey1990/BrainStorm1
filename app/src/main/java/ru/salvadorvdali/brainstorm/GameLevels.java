package ru.salvadorvdali.brainstorm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

public class GameLevels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);
        SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
        final int level1 = save.getInt("Level1", 1);
        final int level2 = save.getInt("Level2", 1);
        final int level3 = save.getInt("Level3", 1);
        final int level4 = save.getInt("Level4", 1);




        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        Button buttonBack= (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ Intent intent = new Intent(GameLevels.this, MainActivity.class);
startActivity(intent);
finish();
                }

                catch(Exception e){}

            }
        });

        //уровень1 начало
TextView textView1 = (TextView)findViewById(R.id.textView1);
textView1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        try{if (level1>=1) {
            Intent intent = new Intent(GameLevels.this, Level1.class);
            startActivity(intent);
            finish();
        }
        else{}
        }
        catch(Exception e){}
    }
});
        //уровень1 конец
        //уровень2 начало
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level1>=2) {
                    Intent intent= new Intent(GameLevels.this, Level2.class);
                    startActivity(intent); finish();}
                    else{}
                }
                catch(Exception e){}
            }
        });
        //уровень2 конец

        //уровень3 начало
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level1>=3) {
                    Intent intent= new Intent(GameLevels.this, Level3.class);
                    startActivity(intent); finish();
                }else{}}

                catch(Exception e){}
            }
        });
        //уровень3 конец

        //уровень4 начало
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{ if (level1>=4) {
                    Intent intent = new Intent(GameLevels.this, Level4.class);
                    startActivity(intent);
                    finish();
                }else{}
                }
                catch(Exception e){}
            }
        });
        //уровень4 конец
        //уровень5 начало
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level1>=5) {
                    Intent intent = new Intent(GameLevels.this, Level5.class);
                    startActivity(intent);
                    finish();
                }else{}

                }
                catch(Exception e){}
            }
        });
        //уровень5 конец
        //уровень6 начало
        TextView textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level2>=1) {
                    Intent intent= new Intent(GameLevels.this, Level6.class);
                    startActivity(intent); finish();}
                    else{}
                }
                catch(Exception e){}
            }
        });
        //уровень6 конец
        //уровень7 начало
        TextView textView7 = (TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level2>=2) {
                    Intent intent = new Intent(GameLevels.this, Level7.class);
                    startActivity(intent);
                    finish();
                }else{}
                }
                catch(Exception e){}
            }
        });
        //уровень7 конец
        //уровень8 начало
        TextView textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level2>=3) {
                    Intent intent= new Intent(GameLevels.this, Level8.class);
                    startActivity(intent); finish();}
                    else{}
                }
                catch(Exception e){}
            }
        });
        //уровень8 конец

        //уровень9 начало
        TextView textView9 = (TextView)findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level2>=4) {
                    Intent intent = new Intent(GameLevels.this, Level9.class);
                    startActivity(intent);
                    finish();
                }else{}
                }
                catch(Exception e){}
            }
        });
        //уровень9 конец

        //уровень10 начало
        TextView textView10 = (TextView)findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level2>=5) {
                    Intent intent = new Intent(GameLevels.this, Level10.class);
                    startActivity(intent);
                    finish();
                }else{}
                }
                catch(Exception e){}
            }
        });
        //уровень10 конец

        //уровень11 начало
        TextView textView11 = (TextView)findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level3>=1) {
                    Intent intent = new Intent(GameLevels.this, Level11.class);
                    startActivity(intent);
                    finish();
                }else{}
                }
                catch(Exception e){}
            }
        });
        //уровень11 конец
        //уровень12 начало
        TextView textView12 = (TextView)findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level3>=2) {
                    Intent intent= new Intent(GameLevels.this, Level12.class);
                    startActivity(intent); finish();}else{};
                }
                catch(Exception e){}
            }
        });
        //уровень12 конец

        //уровень13 начало
        TextView textView13 = (TextView)findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level3>=3) {
                    Intent intent= new Intent(GameLevels.this, Level13.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень13 конец
        //уровень14 начало
        TextView textView14 = (TextView)findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level3>=4) {
                    Intent intent= new Intent(GameLevels.this, Level14.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень14 конец
        //уровень15 начало
        TextView textView15 = (TextView)findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level3>=5) {
                    Intent intent= new Intent(GameLevels.this, Level15.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень15 конец

        //уровень16 начало
        TextView textView16 = (TextView)findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level4>=1) {
                    Intent intent= new Intent(GameLevels.this, Level16.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень16 конец

        //уровень17 начало
        TextView textView17 = (TextView)findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level4>=2) {
                    Intent intent= new Intent(GameLevels.this, Level17.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень17 конец

        //уровень18 начало
        TextView textView18 = (TextView)findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level4>=3) {
                    Intent intent= new Intent(GameLevels.this, Level18.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень18 конец

        //уровень19 начало
        TextView textView19 = (TextView)findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level4>=4) {
                    Intent intent= new Intent(GameLevels.this, Level19.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень19 конец

        //уровень20 начало
        TextView textView20 = (TextView)findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{if (level4>=5) {
                    Intent intent= new Intent(GameLevels.this, Level20.class);
                    startActivity(intent); finish();}else{}
                }
                catch(Exception e){}
            }
        });
        //уровень20 конец

        final int[] x1={ R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4, R.id.textView5};
        for(int i=1; i<level1; i++){
            TextView tv= findViewById(x1[i]);
            tv.setText(""+(i+1));
        }
        final int[] x2={ R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9, R.id.textView10};
        for(int i=1; i<level2; i++){
            TextView tv= findViewById(x2[i]);
            tv.setText(""+(i+1));
        }

        final int[] x3={ R.id.textView11, R.id.textView12, R.id.textView13, R.id.textView14, R.id.textView15};
        for(int i=1; i<level3; i++){
            TextView tv= findViewById(x3[i]);
            tv.setText(""+(i+1));
        }

        final int[] x4={ R.id.textView16, R.id.textView17, R.id.textView18, R.id.textView19, R.id.textView20};
        for(int i=1; i<level4; i++){
            TextView tv= findViewById(x4[i]);
            tv.setText(""+(i+1));
        }

    }

    @Override
    public void onBackPressed(){
        try{ Intent intent = new Intent(GameLevels.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        catch(Exception e){}
    }
}