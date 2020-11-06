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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.salvadorvdali.brainstorm.R;

import java.util.ArrayList;
import java.util.Random;

public class Level14 extends AppCompatActivity {
    Dialog dialog1;
    Random random = new Random();
    int p, count = 0;
    public static ArrayList <Integer> arrayListOriginals=new ArrayList<>();
    int[] arrayWords = new int[]{R.string.word1, R.string.word2,R.string.word3,
            R.string.word4,R.string.word5,R.string.word6,R.string.word7,
            R.string.word8,R.string.word9,R.string.word10,R.string.word11,
            R.string.word12,R.string.word13,R.string.word14,R.string.word15,
            R.string.word16,R.string.word17,R.string.word18,R.string.word19,
            R.string.word20,R.string.word21,R.string.word22,R.string.word23,
            R.string.word24,R.string.word25,R.string.word26,R.string.word27,
            R.string.word28,R.string.word29,R.string.word30,R.string.word31,
            R.string.word32,R.string.word33,R.string.word34,(R.string.word35),
            (R.string.word36),(R.string.word37),(R.string.word38),(R.string.word39),
            (R.string.word40),(R.string.word41),(R.string.word42),(R.string.word43),
            (R.string.word44),(R.string.word45),(R.string.word46),(R.string.word47),
            (R.string.word48),(R.string.word49),(R.string.word50),(R.string.word51),         (R.string.word52),(R.string.word53),(R.string.word54),(R.string.word55),
            (R.string.word56),(R.string.word57),(R.string.word58),(R.string.word59),
            (R.string.word60),(R.string.word61),(R.string.word62),(R.string.word63),
            (R.string.word64),(R.string.word65),(R.string.word66),(R.string.word67),
            (R.string.word68),(R.string.word69),(R.string.word70),(R.string.word71),
            (R.string.word72),(R.string.word73),(R.string.word74),(R.string.word75),
            (R.string.word76),(R.string.word77),(R.string.word78),(R.string.word79), (R.string.word80)

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        // Разворачиваем игру на весь экран - начало
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // Разворачиваем игру на весь экран - конец
        //Задаем переменные - начало


        //Задаем переменные - конец

        // Создаем переменную TextLevels
        TextView textLevels = findViewById(R.id.textLevels);
        textLevels.setText(R.string.Lesson3Level4);


        arrayListOriginals.clear();






        //Вызов диалоговщго окна в начале игры
        dialog1 = new Dialog(this);
        dialog1.requestWindowFeature(Window.FEATURE_NO_TITLE);// скрываем заголовок
        dialog1.setContentView(R.layout.prewiewdialoglesson3);
        dialog1.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog1.setCancelable(false);
        dialog1.show();


        // Кнопка выход из диаловогого окна
        final TextView btnclose = (TextView) dialog1.findViewById(R.id.buttonclose);
        btnclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level14.this, GameLevels.class);
                    startActivity(intent);
                    finish();

                } catch (Exception e) {
                }
                dialog1.dismiss();// закрытие диалогового окна
            }
        });

        //кнопка продолжать dialog1
        Button buttonnext = (Button) dialog1.findViewById(R.id.buttonnext);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog1.dismiss();

            }
        });


//убираем прогресс игры
        final int[] progressArray = {R.id.point1, R.id.point2, R.id.point3, R.id.point4, R.id.point5, R.id.point6,
                R.id.point7, R.id.point8, R.id.point9, R.id.point10, R.id.point11, R.id.point12,
                R.id.point13, R.id.point14, R.id.point15,};
        //

        for (int i = 0; i < 15; i++) {
            TextView tvpoint = (TextView) findViewById(progressArray[i]);
            tvpoint.setBackground(null);
        }
//убираем прогресс игры
        //кнопка назад

        final Button btn_back = (Button) findViewById(R.id.buttonBack);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Level14.this, GameLevels.class);
                startActivity(intent);
                finish();
            }
        });

        //выводим слова на экран - начал


        Button buttonNext = (Button) findViewById(R.id.image_arrow_right);
        TextView tvWords = (TextView) findViewById(R.id.l1l1);
        p = random.nextInt(80);
        tvWords.setText(arrayWords[p]);
        arrayListOriginals.add(arrayWords[p]);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count<9){
                    TextView tvWords = (TextView) findViewById(R.id.l1l1);
                    p = random.nextInt(80);
                    tvWords.setText(arrayWords[p]);
                    arrayListOriginals.add(arrayWords[p]);

                    count++;
                }
                else {

                    Intent intent= new Intent(Level14.this, Level14Array.class);
                    startActivity(intent);
                    finish();


                }
            }
        });


    }


    // Системная кнопка назад
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Level14.this, GameLevels.class);
        startActivity(intent);
        finish();
    }


}
