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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

import java.util.Random;

public class Level2 extends AppCompatActivity {
    public boolean flag=true;
    Dialog dialog1, dialog2, dialog3, dialog4;
    public int x, y, x1;
    Random random = new Random();
    public int count = 0;
    boolean f=true;
    int p;
    String[] arrayString = new String[]{"+", "-", "x"};
    EditText inputX, inputY;
    int getX, getY;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // Создаем переменную TextLevels
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.Lesson1Level2);
        // Разворачиваем игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Разворачиваем игру на весь экран - конец
        x = random.nextInt(10);  // создаем X
        y = random.nextInt(10);//создаем У
        x1=x;
        //Вызов диалоговщго окна в начале игры
        dialog1 = new Dialog(this);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
        dialog1.setContentView(R.layout.prewiewdialog);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setCancelable(false);

        // Кнопка выход из диаловогого окна
        final TextView btnclose = (TextView) dialog1.findViewById(R.id.buttonclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level2.this, GameLevels.class);
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
                dialog2 = new Dialog(Level2.this);
                dialog2.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                dialog2.setContentView(R.layout.prewiewdialognumbers1);
                dialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2.setCancelable(false);




                TextView tvX = (TextView) dialog2.findViewById(R.id.tvfinish);
                tvX.setText("X=" + x1+", Y="+y);

                TextView btnclose = (TextView) dialog2.findViewById(R.id.buttonclose);
                btnclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            Intent intent = new Intent(Level2.this, GameLevels.class);
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
                Intent intent = new Intent(Level2.this, GameLevels.class);
                startActivity(intent);
                finish();
            }
        });


        //массив для прогресса игры
        final int[] progressArray=  {R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6,
                R.id.point7, R.id.point8, R.id.point9, R.id.point10, R.id.point11, R.id.point12,
                R.id.point13, R.id.point14, R.id.point15,};
        //


        Button imgNext = (Button) findViewById(R.id.image_arrow_right);
            p = random.nextInt(10);
            int[] arrayXY = new int[]{x + p, x - p, x * p};
            int n = random.nextInt(2);
            x = arrayXY[n];
            TextView textl1l1 = (TextView) findViewById(R.id.l1l1);

            textl1l1.setText("new X = X" + arrayString[n] + p);


            imgNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                 if(count<14){
                     // Закрашиваем прогресс игры
                     TextView progressBar= (TextView) findViewById(progressArray[count]);
                     progressBar.setBackgroundResource(R.drawable.style_points_green);
                     //
                     if (count%2==0) { TextView textl1l1 = (TextView) findViewById(R.id.l1l1);
                         int n = random.nextInt(2);
                         p=random.nextInt(10);
                         int[] arrayXY = new int[]{y+p, y-p, y*p};
                         y = arrayXY[n];
                         textl1l1.setText("new Y = Y" + arrayString[n] + p );
                         count++;
                        }
                     else{
                         TextView textl1l1 = (TextView) findViewById(R.id.l1l1);

                         int n = random.nextInt(2);
                         p=random.nextInt(10);
                         int[] arrayXY = new int[]{x + p, x - p, x * p};
                         x = arrayXY[n];
                         textl1l1.setText("new X = X" + arrayString[n] + p );
                         count++;

                     }




                 }
                 else {
                     dialog3 = new Dialog(Level2.this);
                     dialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                     dialog3.setContentView(R.layout.dialog_input_number2);
                     dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                     dialog3.setCancelable(false);
                     dialog3.show();

                     TextView btnClose= (TextView) dialog3.findViewById(R.id.buttonclose);
                     btnClose.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             Intent intent = new Intent(Level2.this, MainActivity.class);
                             startActivity(intent);
                             finish();
                         }
                     });


                     Button buttonNext= (Button) dialog3.findViewById(R.id.buttonnext);

                     buttonNext.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             inputX= (EditText) dialog3.findViewById(R.id.editTextX);
                             inputY= (EditText) dialog3.findViewById(R.id.editTextY);
                             try{getX=Integer.parseInt(inputX.getText().toString());
                                 getY=Integer.parseInt(inputY.getText().toString());



                                 if(getY==y && getX==x)
                                 { dialog3.dismiss();

                                     //сохраняем прогресс игры - начало
                                     SharedPreferences save=getSharedPreferences("Save", MODE_PRIVATE);
                                     final  int level1=save.getInt("Level1",1);
                                     if(level1>2){}
                                     else{
                                         SharedPreferences.Editor editor=save.edit();
                                         editor.putInt("Level1", 3);
                                         editor.commit();
                                     }
                                     //сохраняем прогресс игры - конец

                                     dialog4 = new Dialog(Level2.this);
                                     dialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                                     dialog4.setContentView(R.layout.dialog_finishround1);
                                     dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                     dialog4.setCancelable(false);
                                     dialog4.show();
                                     TextView tvfinish= (TextView) dialog4.findViewById(R.id.tvfinish);
                                     tvfinish.setText(R.string.tv_congratulations);
                                     Button btnPlayAgain= (Button) dialog4.findViewById(R.id.buttonnext);
                                     btnPlayAgain.setText(R.string.next);
                                     btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Level2.this, GameLevels.class);
                                             startActivity(intent);
                                             finish();
                                         }
                                     });

                                     TextView btnClose= (TextView) dialog4.findViewById(R.id.buttonclose);
                                     btnClose.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Level2.this, MainActivity.class);
                                             startActivity(intent);
                                             finish();
                                         }
                                     });




                                 }
                                 else{
                                     dialog3.dismiss();
                                     dialog4 = new Dialog(Level2.this);
                                     dialog4.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
                                     dialog4.setContentView(R.layout.dialog_finishround1);
                                     dialog4.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                     dialog4.setCancelable(false);
                                     TextView tvfinish= (TextView) dialog4.findViewById(R.id.tvfinish);
                                     tvfinish.setText(getString(R.string.nice_try) + " X="+x+", Y="+y+getString(R.string.try_again) );
                                     dialog4.show();
                                     Button btnPlayAgain= (Button) dialog4.findViewById(R.id.buttonnext);
                                     btnPlayAgain.setText(R.string.play_again);
                                     btnPlayAgain.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Level2.this, Level2.class);
                                             startActivity(intent);
                                             finish();
                                         }
                                     });
                                     TextView btnClose= (TextView) dialog4.findViewById(R.id.buttonclose);
                                     btnClose.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent intent = new Intent(Level2.this, MainActivity.class);
                                             startActivity(intent);
                                             finish();
                                         }
                                     });



                                 }
                             }
                             catch(Exception e){Toast.makeText
                                     (Level2.this, R.string.enter_numbers, Toast.LENGTH_SHORT).show();}}

                     });





                 }
                }
            });




    }
//диалоговое окно конца раунда


     /*   dialog3 = new Dialog(this);
        dialog3.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
        dialog3.setContentView(R.layout.prewiewdialog);
        dialog3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog3.setCancelable(false);*/




    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Level2.this, GameLevels.class);
        startActivity(intent);
        finish();
    }
}



