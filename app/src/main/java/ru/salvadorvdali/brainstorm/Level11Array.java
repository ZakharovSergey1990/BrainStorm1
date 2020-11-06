package ru.salvadorvdali.brainstorm;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Level11Array extends AppCompatActivity implements View.OnClickListener {
    Dialog dialog1, dialog2, dialog3, dialog4;
    Random random = new Random();
    int p, count = 0;
    TextView textView2;
    boolean flag = false;
    public ArrayList <Integer> arrayListShaffle=new ArrayList<>();
    ArrayList<String> arrayListPerson = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal_array1);

        // Разворачиваем игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //кнопка назад начало
        final Button btn_back = (Button) findViewById(R.id.buttonBack);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level11Array.this, GameLevels.class);
                startActivity(intent);
                finish();
            }
        });
        //кнопка назад конец

        // Разворачиваем игру на весь экран - конец
        //Задаем переменные - начало
        TextView tvword2 = (TextView) findViewById(R.id.tvword2);
        TextView tvword3 = (TextView) findViewById(R.id.tvword3);
        TextView tvword4 = (TextView) findViewById(R.id.tvword4);
        TextView tvword5 = (TextView) findViewById(R.id.tvword5);

        //Задаем переменные - конец

        // Создаем переменную TextLevels
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.Lesson3Level1);

        // сортируем список и присваиваем значения - начало
        arrayListShaffle=(ArrayList)Level11.arrayListOriginals.clone();
        Collections.shuffle(arrayListShaffle);

        tvword2.setText(arrayListShaffle.get(0));
        tvword3.setText(arrayListShaffle.get(1));
        tvword4.setText(arrayListShaffle.get(2));
        tvword5.setText(arrayListShaffle.get(3));

        tvword2.setOnClickListener(this);
        tvword3.setOnClickListener(this);
        tvword4.setOnClickListener(this);
        tvword5.setOnClickListener(this);

        // сортируем список и присваиваем значения - конец


        //кнопка продолжить начало
        Button buttonNext = (Button) findViewById(R.id.image_arrow_right);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //создаем диалоговое окно2 - начало
                dialog2 = new Dialog(Level11Array.this);
                dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                dialog2.setContentView(R.layout.dialog_finishround1);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.setCancelable(false);

                TextView btnClose= (TextView) dialog2.findViewById(R.id.buttonclose);
                btnClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Level11Array.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

                //создаем диалоговое окно2 - конец

                //Сравниваем два списка начало
                ArrayList<String> arrayListOriginals2=new ArrayList<>();
                for(int i=0; i<arrayListShaffle.size(); i++){
                    arrayListOriginals2.add(getString(Level11.arrayListOriginals.get(i)));
                }

                if(arrayListOriginals2.equals(arrayListPerson)){

                    //сохраняем прогресс игры - начало
                    SharedPreferences save=getSharedPreferences("Save", MODE_PRIVATE);
                    final  int level3=save.getInt("Level3",1);
                    if(level3>1){}
                    else{
                        SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level3", 2);
                        editor.commit();
                    }
                    //сохраняем прогресс игры - конец

                    TextView tvfinish= (TextView) dialog2.findViewById(R.id.tvfinish);
                    tvfinish.setText(R.string.tv_congratulations);
                    Button btnPlayAgain= (Button) dialog2.findViewById(R.id.buttonnext);
                    btnPlayAgain.setText(R.string.next);
                    btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level11Array.this, GameLevels.class);
                            startActivity(intent);
                            finish();
                        }
                    });


                }
                else{
                    TextView tvfinish= (TextView) dialog2.findViewById(R.id.tvfinish);
                    tvfinish.setText(R.string.tv_nice_try);
                    Button btnPlayAgain= (Button) dialog2.findViewById(R.id.buttonnext);
                    btnPlayAgain.setText(R.string.play_again);
                    btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level11Array.this, Level11.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
                //Сравниваем два списка конец
                dialog2.show();
            }
        });
        //кнопка продолжить конец

    }


    // Системная кнопка назад
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Level11Array.this, GameLevels.class);
        startActivity(intent);
        finish();
    }

    //обрабатываем нажатие на слова - начало
    @Override
    public void onClick(View v) {
arrayListPerson.add(((TextView)v).getText().toString());
        ((TextView)v).setText(null);
    }
//обрабатываем нажатие на слова - конец
}




