package ru.salvadorvdali.brainstorm;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Level19 extends AppCompatActivity implements View.OnClickListener{
    Dialog dialog1, dialog2, dialog3, dialog4;
    Random random = new Random();
    int p, count = 0;
    HashSet<TextView> matrixSet= new HashSet<>();
    HashSet<TextView> matrixSetPerson= new HashSet<>();
ArrayList<TextView> setTextView= new ArrayList<>();
    boolean flag=true;
    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.matrix4);

        // Разворачиваем игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Разворачиваем игру на весь экран - конец
        //находим все кнопки и заносим их в список - начало
        final TextView tv11=(TextView) findViewById(R.id.tv11); setTextView.add(tv11);
        final TextView tv12=(TextView) findViewById(R.id.tv12); setTextView.add(tv12);
        final TextView tv13=(TextView) findViewById(R.id.tv13); setTextView.add(tv13);
        final TextView tv14=(TextView) findViewById(R.id.tv14); setTextView.add(tv14);
        final TextView tv15=(TextView) findViewById(R.id.tv15); setTextView.add(tv15);
        final TextView tv16=(TextView) findViewById(R.id.tv16); setTextView.add(tv16);
        final TextView tv17=(TextView) findViewById(R.id.tv17); setTextView.add(tv17);
        final TextView tv21=(TextView) findViewById(R.id.tv21); setTextView.add(tv21);
        final TextView tv22=(TextView) findViewById(R.id.tv22); setTextView.add(tv22);
        final TextView tv23=(TextView) findViewById(R.id.tv23); setTextView.add(tv23);
        final TextView tv24=(TextView) findViewById(R.id.tv24); setTextView.add(tv24);
        final TextView tv25=(TextView) findViewById(R.id.tv25); setTextView.add(tv25);
        final TextView tv26=(TextView) findViewById(R.id.tv26); setTextView.add(tv26);
        final TextView tv27=(TextView) findViewById(R.id.tv27); setTextView.add(tv27);

        final TextView tv31=(TextView) findViewById(R.id.tv31); setTextView.add(tv31);
        final TextView tv32=(TextView) findViewById(R.id.tv32); setTextView.add(tv32);
        final  TextView tv33=(TextView) findViewById(R.id.tv33); setTextView.add(tv33);
        final  TextView tv34=(TextView) findViewById(R.id.tv34); setTextView.add(tv34);
        final  TextView tv35=(TextView) findViewById(R.id.tv35); setTextView.add(tv35);
        final  TextView tv36=(TextView) findViewById(R.id.tv36); setTextView.add(tv36);
        final  TextView tv37=(TextView) findViewById(R.id.tv37); setTextView.add(tv37);

        final TextView tv41=(TextView) findViewById(R.id.tv41); setTextView.add(tv41);
        final TextView tv42=(TextView) findViewById(R.id.tv42); setTextView.add(tv42);
        final TextView tv43=(TextView) findViewById(R.id.tv43); setTextView.add(tv43);
        final TextView tv44=(TextView) findViewById(R.id.tv44); setTextView.add(tv44);
        final  TextView tv45=(TextView) findViewById(R.id.tv45); setTextView.add(tv45);
        final TextView tv46=(TextView) findViewById(R.id.tv46); setTextView.add(tv46);
        final TextView tv47=(TextView) findViewById(R.id.tv47); setTextView.add(tv47);

        final TextView tv51=(TextView) findViewById(R.id.tv51); setTextView.add(tv51);
        final TextView tv52=(TextView) findViewById(R.id.tv52); setTextView.add(tv52);
        final TextView tv53=(TextView) findViewById(R.id.tv53); setTextView.add(tv53);
        final TextView tv54=(TextView) findViewById(R.id.tv54); setTextView.add(tv54);
        final TextView tv55=(TextView) findViewById(R.id.tv55); setTextView.add(tv55);
        final TextView tv56=(TextView) findViewById(R.id.tv56); setTextView.add(tv56);
        final TextView tv57=(TextView) findViewById(R.id.tv57); setTextView.add(tv57);

        final TextView tv61=(TextView) findViewById(R.id.tv61); setTextView.add(tv61);
        final TextView tv62=(TextView) findViewById(R.id.tv62); setTextView.add(tv62);
        final  TextView tv63=(TextView) findViewById(R.id.tv63); setTextView.add(tv63);
        final  TextView tv64=(TextView) findViewById(R.id.tv64); setTextView.add(tv64);
        final  TextView tv65=(TextView) findViewById(R.id.tv65); setTextView.add(tv65);
        final  TextView tv66=(TextView) findViewById(R.id.tv66); setTextView.add(tv66);
        final TextView tv67=(TextView) findViewById(R.id.tv67); setTextView.add(tv67);

        final TextView tv71=(TextView) findViewById(R.id.tv71); setTextView.add(tv71);
        final TextView tv72=(TextView) findViewById(R.id.tv72); setTextView.add(tv72);
        final TextView tv73=(TextView) findViewById(R.id.tv73); setTextView.add(tv73);
        final TextView tv74=(TextView) findViewById(R.id.tv74); setTextView.add(tv74);
        final TextView tv75=(TextView) findViewById(R.id.tv75); setTextView.add(tv75);
        final TextView tv76=(TextView) findViewById(R.id.tv76); setTextView.add(tv76);
        final TextView tv77=(TextView) findViewById(R.id.tv77); setTextView.add(tv77);



        tv11.setOnClickListener(this);
        tv12.setOnClickListener(this);
        tv13.setOnClickListener(this);
        tv14.setOnClickListener(this);
        tv15.setOnClickListener(this);
        tv16.setOnClickListener(this);
        tv17.setOnClickListener(this);
        tv17.setOnClickListener(this);

        tv21.setOnClickListener(this);
        tv22.setOnClickListener(this);
        tv23.setOnClickListener(this);
        tv24.setOnClickListener(this);
        tv25.setOnClickListener(this);
        tv26.setOnClickListener(this);
        tv27.setOnClickListener(this);

        tv31.setOnClickListener(this);
        tv32.setOnClickListener(this);
        tv33.setOnClickListener(this);
        tv34.setOnClickListener(this);
        tv35.setOnClickListener(this);
        tv36.setOnClickListener(this);
        tv37.setOnClickListener(this);

        tv41.setOnClickListener(this);
        tv42.setOnClickListener(this);
        tv43.setOnClickListener(this);
        tv44.setOnClickListener(this);
        tv45.setOnClickListener(this);
        tv46.setOnClickListener(this);
        tv47.setOnClickListener(this);

        tv51.setOnClickListener(this);
        tv52.setOnClickListener(this);
        tv53.setOnClickListener(this);
        tv54.setOnClickListener(this);
        tv55.setOnClickListener(this);
        tv56.setOnClickListener(this);
        tv57.setOnClickListener(this);

        tv61.setOnClickListener(this);
        tv62.setOnClickListener(this);
        tv63.setOnClickListener(this);
        tv64.setOnClickListener(this);
        tv65.setOnClickListener(this);
        tv66.setOnClickListener(this);
        tv67.setOnClickListener(this);

        tv71.setOnClickListener(this);
        tv72.setOnClickListener(this);
        tv73.setOnClickListener(this);
        tv74.setOnClickListener(this);
        tv75.setOnClickListener(this);
        tv76.setOnClickListener(this);
        tv77.setOnClickListener(this);





        //находим все кнопки и заносим их в список - конец





      // Подсвечиваем квадраты и заносим их в множество начало
int p;
for (int i=0; i<20; i++){
    p= random.nextInt(49);

    matrixSet.add(setTextView.get(p));

    setTextView.get(p).setBackgroundColor(Color.GREEN);
}
        // Подсвечиваем квадраты и заносим их в множество конец






        // Создаем переменную TextLevels
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.Lesson4Level4);



//даем время запомнить - начало

        countDownTimer= new CountDownTimer(6000, 500) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(millisUntilFinished>4000){
                    Button arrow= findViewById(R.id.image_arrow_right);
                    arrow.setBackgroundResource(R.drawable.three);
                }
                else if(millisUntilFinished<4000 && millisUntilFinished>2001){
                    Button arrow= findViewById(R.id.image_arrow_right);
                    arrow.setBackgroundResource(R.drawable.two);
                }
                else if(millisUntilFinished<3000){
                    Button arrow= findViewById(R.id.image_arrow_right);
                    arrow.setBackgroundResource(R.drawable.one);
                }
            }

            @Override
            public void onFinish() {

                Button arrow= findViewById(R.id.image_arrow_right);
                arrow.setBackgroundResource(R.drawable.arrow_right);
                for(int i=0; i<setTextView.size(); i++){
                    setTextView.get(i).setBackgroundColor(Color.WHITE);
                }
            }
        };

        //даем время запомнить - конец





        //Вызов диалоговщго окна в начале игры
        dialog1 = new Dialog(this);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
        dialog1.setContentView(R.layout.prewiewdialoglesson4);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setCancelable(false);
        dialog1.show();


        // Кнопка выход из диаловогого окна
        final TextView btnclose = (TextView) dialog1.findViewById(R.id.buttonclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level19.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }

                dialog1.dismiss();

                // закрытие диалогового окна
            }
        });

        //кнопка продолжать dialog1
        Button buttonnext = (Button) dialog1.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();
                countDownTimer.start();
            }
        });






        // Обрабатываем нажатие кнопки next - начало
        Button buttonNext=(Button) findViewById(R.id.image_arrow_right);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Проверяем результат начало

                if(matrixSet.equals(matrixSetPerson)){

                    //сохраняем прогресс игры - начало
                    SharedPreferences save=getSharedPreferences("Save", MODE_PRIVATE);
                    final  int level4=save.getInt("Level4",1);
                    if(level4>4){}
                    else{
                        SharedPreferences.Editor editor=save.edit();
                        editor.putInt("Level4", 5);
                        editor.commit();
                    }
                    //сохраняем прогресс игры - конец

                    dialog2 = new Dialog(Level19.this);
                    dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                    dialog2.setContentView(R.layout.dialog_finishround1);
                    dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog2.setCancelable(false);
                    TextView tvfinish= (TextView) dialog2.findViewById(R.id.tvfinish);

                    tvfinish.setText(R.string.tv_congratulations);
                    Button btnPlayAgain= (Button) dialog2.findViewById(R.id.buttonnext);
                    btnPlayAgain.setText(R.string.next);
                    btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level19.this, GameLevels.class);
                            startActivity(intent);
                            finish();
                        }
                    });

                    TextView btnClose= (TextView) dialog2.findViewById(R.id.buttonclose);
                    btnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level19.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });


                }
                else{
                    dialog2 = new Dialog(Level19.this);
                    dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                    dialog2.setContentView(R.layout.dialog_finishround1);
                    dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog2.setCancelable(false);
                    TextView tvfinish= (TextView) dialog2.findViewById(R.id.tvfinish);
                    // Iterator<TextView> iter = matrixSet.iterator();
                    //  while (iter.hasNext()){
                    //    tvfinish.setText(iter.toString());
                    //}

                    tvfinish.setText(R.string.tv_nice_try);

                    Button btnPlayAgain= (Button) dialog2.findViewById(R.id.buttonnext);
                    btnPlayAgain.setText(R.string.play_again);
                    btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level19.this, Level19.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    TextView btnClose= (TextView) dialog2.findViewById(R.id.buttonclose);
                    btnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level19.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                }
                //Проверяем результат конец
                dialog2.show();
            }
        });
        // Обрабатываем нажатие кнопки next - конец





    //создаем диалоговое окно для ввода строк - клнец


        //кнопка назад

        final Button btn_back = (Button) findViewById(R.id.buttonBack);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level19.this, GameLevels.class);
                startActivity(intent);
                finish();
            }
        });

    }




    // Системная кнопка назад
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Level19.this, GameLevels.class);
        startActivity(intent);
        finish();
    }

    //обрабатываем нажатие на квадрат начало
    @Override
    public void onClick(View v) {
         v.setBackgroundColor(Color.GREEN);
            matrixSetPerson.add((TextView) v);
         }
    //обрабатываем нажатие на квадрат конец
    }





