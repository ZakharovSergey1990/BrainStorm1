package ru.salvadorvdali.brainstorm;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

import java.util.Random;

public class Level10 extends AppCompatActivity {
    public boolean flag = true;
    Dialog dialog1, dialog2, dialog3, dialog4;
   int letter1, letter2, letter3, letter4, letter5;
    Random random = new Random();
    TextView tvWords;
    int countLetter = 0;
    int countLetter2 = 0;
    int countLetter3=0;
    int countLetter4=0;
    int countLetter5=0;
    int p, count;
    int[] arrayString = new int[]{R.string.a,  R.string.b,  R.string.c,  R.string.d,  R.string.e,
            R.string.f,  R.string.g,  R.string.h,  R.string.i,  R.string.j, R.string.k,
            R.string.l,  R.string.m,  R.string.n,  R.string.o,  R.string.p,  R.string.q,
            R.string.r,  R.string.s,  R.string.t,  R.string.u,  R.string.v,  R.string.w,
            R.string.x,  R.string.y,  R.string.z};

    int[] arrayWords = new int[]{(R.string.proverb1), (R.string.proverb2), (R.string.proverb3),
            (R.string.proverb4), (R.string.proverb4),(R.string.proverb6),(R.string.proverb7),
            (R.string.proverb8),(R.string.proverb9),(R.string.proverb10),(R.string.proverb11),
            (R.string.proverb12),(R.string.proverb13),(R.string.proverb14),(R.string.proverb15),
            (R.string.proverb16),(R.string.proverb17),(R.string.proverb18),(R.string.proverb19),
            (R.string.proverb20),(R.string.proverb21),(R.string.proverb22),(R.string.proverb23),
            (R.string.proverb24),(R.string.proverb25),(R.string.proverb26),(R.string.proverb27),
            (R.string.proverb28),(R.string.proverb29),(R.string.proverb30),(R.string.proverb31),
            (R.string.proverb32),(R.string.proverb33),(R.string.proverb34),(R.string.proverb35),
            (R.string.proverb36),(R.string.proverb37),(R.string.proverb38),(R.string.proverb39),
            (R.string.proverb40)    };


    EditText inputLetter1;
    int getLetter1, getLetter2, getLetter3, getLetter4, getLetter5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // Разворачиваем игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Разворачиваем игру на весь экран - конец
        //Задаем переменные - начало
        int x = random.nextInt(22);
        letter1 = arrayString[x];
        int y = random.nextInt(23);
        if(x==y){y=22;}
        letter2 = arrayString[y];
        int z = random.nextInt(24);
        if(z==y| z==x){z=23;}
        letter3 = arrayString[z];
        int q = random.nextInt(25);
        if(q==y| q==x | q==z){q=24;}
        letter4 = arrayString[q];
        int t = random.nextInt(26);
        if(t==y| t==x | t==z | t==q){t=25;}
        letter5 = arrayString[z];


        //Задаем переменные - конец

        // Создаем переменную TextLevels
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.Lesson2Level5);

        //Вызов диалоговщго окна в начале игры
        dialog1 = new Dialog(this);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
        dialog1.setContentView(R.layout.prewiewdialoglesson2);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setCancelable(false);


        // Кнопка выход из диаловогого окна
        final TextView btnclose = (TextView) dialog1.findViewById(R.id.buttonclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level10.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }
                dialog1.dismiss();// закрытие диалогового окна
            }
        });

        //кнопка продолжать

        Button btnContinue = (Button) dialog1.findViewById(R.id.buttonnext);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();// выходим из первого диалогового окна

//создаем второе диалоговое окно с цифрой
                dialog2 = new Dialog(Level10.this);
                dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                dialog2.setContentView(R.layout.prewiewdialogwords);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.setCancelable(false);


                TextView tvX = (TextView) dialog2.findViewById(R.id.tvfinish);
                tvX.setText(getString(letter1)+", "+ getString(letter2)+", "+ getString(letter3)
                        +", "+ getString(letter4)+", "+ getString(letter5));


                TextView btnclose = (TextView) dialog2.findViewById(R.id.buttonclose);
                btnclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            Intent intent = new Intent(Level10.this, GameLevels.class);
                            startActivity(intent);
                            finish();

                        } catch (Exception e) {
                        }
                        dialog2.dismiss();// закрытие диалогового окна
                    }
                });
                Button btnContinue = (Button) dialog2.findViewById(R.id.buttonnext);
                btnContinue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });
                dialog2.show();


            }

        });
        dialog1.show();

        //кнопка назад

        final Button btn_back = (Button) findViewById(R.id.buttonBack);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level10.this, GameLevels.class);
                startActivity(intent);
                finish();
            }
        });


        //массив для прогресса игры
        final int[] progressArray = {R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6,
                R.id.point7, R.id.point8, R.id.point9, R.id.point10, R.id.point11, R.id.point12,
                R.id.point13, R.id.point14, R.id.point15,};
        //


        Button imgNext = (Button) findViewById(R.id.image_arrow_right);
        tvWords = (TextView) findViewById(R.id.l1l1);
        p = random.nextInt(35);
        tvWords.setTextSize(30);
        tvWords.setText(arrayWords[p]);
        char[] chars = getString(arrayWords[p]).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == getString(letter1).charAt(0)){
                countLetter++;}

        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == getString(letter2).charAt(0))
                countLetter2++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == getString(letter3).charAt(0))
                countLetter3++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == getString(letter4).charAt(0))
                countLetter4++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == getString(letter5).charAt(0))
                countLetter5++;
        }

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<14){
                    // Закрашиваем прогресс игры
                    TextView progressBar= (TextView) findViewById(progressArray[count]);
                    progressBar.setBackgroundResource(R.drawable.style_points_green);
                    //
                p = random.nextInt(40);
                tvWords.setText(arrayWords[p]);
                    char[] chars = getString(arrayWords[p]).toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == getString(letter1).charAt(0)){
                        countLetter++;}

                }
                    for (int i = 0; i < chars.length; i++) {
                        if (chars[i] == getString(letter2).charAt(0))
                            countLetter2++;
                    }
                    for (int i = 0; i < chars.length; i++) {
                        if (chars[i] == getString(letter3).charAt(0))
                            countLetter3++;
                    }
                    for (int i = 0; i < chars.length; i++) {
                        if (chars[i] == getString(letter4).charAt(0))
                            countLetter4++;
                    }
                    for (int i = 0; i < chars.length; i++) {
                        if (chars[i] == getString(letter5).charAt(0))
                            countLetter5++;
                    }

                    count++;
            }
                else{
                    dialog3 = new Dialog(Level10.this);
                    dialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                    dialog3.setContentView(R.layout.dialog_input_letters5);
                    dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog3.setCancelable(false);

                    //показ переменных на экране и считывание с экрана
                    TextView tvLetter1=(TextView) dialog3.findViewById(R.id.tvletter1);
                    tvLetter1.setText(getString(letter1)+"-");
                    TextView tvLetter2=(TextView) dialog3.findViewById(R.id.tvletter2);
                    tvLetter2.setText(getString(letter2)+"-");
                    TextView tvLetter3=(TextView) dialog3.findViewById(R.id.tvletter3);
                    tvLetter3.setText(getString(letter3)+"-");
                    TextView tvLetter4=(TextView) dialog3.findViewById(R.id.tvletter4);
                    tvLetter4.setText(getString(letter4)+"-");
                    TextView tvLetter5=(TextView) dialog3.findViewById(R.id.tvletter5);
                    tvLetter5.setText(getString(letter5)+"-");





                    //обрабатываем нажатие кнопки продолжить - начало
                    Button buttonNext= (Button) dialog3.findViewById(R.id.buttonnext);
                    buttonNext.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            try{
                                EditText etLetter1=(EditText) dialog3.findViewById(R.id.editText1);
                                getLetter1=Integer.parseInt(etLetter1.getText().toString());
                                EditText etLetter2=(EditText) dialog3.findViewById(R.id.editText2);
                                getLetter2=Integer.parseInt(etLetter2.getText().toString());
                                EditText etLetter3=(EditText) dialog3.findViewById(R.id.editText3);
                                getLetter3=Integer.parseInt(etLetter3.getText().toString());
                                EditText etLetter4=(EditText) dialog3.findViewById(R.id.editText4);
                                getLetter4=Integer.parseInt(etLetter4.getText().toString());
                                EditText etLetter5=(EditText) dialog3.findViewById(R.id.editText5);
                                getLetter5=Integer.parseInt(etLetter5.getText().toString());

                                if(getLetter1==countLetter && getLetter2==countLetter2 &&
                                        getLetter3==countLetter3 && getLetter4==countLetter4 && getLetter5==countLetter5){
                                     dialog3.dismiss();
                                        dialog4 = new Dialog(Level10.this);
                                        dialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                                        dialog4.setContentView(R.layout.dialog_finishround1);
                                        dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                        dialog4.setCancelable(false);
                                        dialog4.show();
                                        TextView tvfinish= (TextView) dialog4.findViewById(R.id.tvfinish);
                                        tvfinish.setText(R.string.tv_congratulations_finish);
                                        Button btnPlayAgain= (Button) dialog4.findViewById(R.id.buttonnext);
                                        btnPlayAgain.setText(R.string.next);
                                        btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent = new Intent(Level10.this, GameLevels.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                        });

                                        TextView btnClose= (TextView) dialog4.findViewById(R.id.buttonclose);
                                        btnClose.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent intent = new Intent(Level10.this, MainActivity.class);
                                                startActivity(intent);
                                                finish();
                                            }
                                        });




                                    }
                                else {
                                    dialog3.dismiss();
                                    dialog4 = new Dialog(Level10.this);
                                    dialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                                    dialog4.setContentView(R.layout.dialog_finishround1);
                                    dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                    dialog4.setCancelable(false);
                                    TextView tvfinish= (TextView) dialog4.findViewById(R.id.tvfinish);
                                    tvfinish.setText(getString(R.string.nice_try)+
                                            getString(letter1)+"- "+countLetter+", "+getString(letter2)+"- "+
                                            countLetter2+", "+getString(letter3)+"- "+
                                            countLetter3+", "+getString(letter4)+"- "+
                                            countLetter4+", "+getString(letter5)+"- "+
                                            countLetter5+getString(R.string.try_again));
                                    dialog4.show();
                                    Button btnPlayAgain= (Button) dialog4.findViewById(R.id.buttonnext);
                                    btnPlayAgain.setText(R.string.play_again);
                                    btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(Level10.this, Level10.class);
                                            startActivity(intent);
                                            finish();
                                        }
                                    });
                                    TextView btnClose= (TextView) dialog4.findViewById(R.id.buttonclose);
                                    btnClose.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(Level10.this, MainActivity.class);
                                            startActivity(intent);
                                            finish();
                                        }
                                    });


                                }
                                }



                            catch(Exception e){
                                Toast.makeText(Level10.this, R.string.enter_numbers, Toast.LENGTH_SHORT).show();
                            }

                        }
                    });

                    //обрабатываем нажатие кнопки продолжить - конец

                    //показ переменных на экране и считывание с экрана - конец

                    dialog3.show();

                   //кнопка выхода
                    TextView btnClose= (TextView) dialog3.findViewById(R.id.buttonclose);
                    btnClose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(Level10.this, MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
                    //кнопка выхода


                }

            }
        });


    }


    // Системная кнопка назад
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Level10.this, GameLevels.class);
        startActivity(intent);
        finish();
    }
}



