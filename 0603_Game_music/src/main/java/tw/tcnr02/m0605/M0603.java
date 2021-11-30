package tw.tcnr02.m0605;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class M0603 extends AppCompatActivity {

    private ImageView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private ImageButton btnScissors;
    private ImageButton btnStone;
    private ImageButton btnNet;
    private String user_select;
    private String ff;
    private MediaPlayer startmusic;
    private MediaPlayer mediaWin;
    private MediaPlayer mediaLose;
    private MediaPlayer mediaDraw;
    private MediaPlayer mediaNight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0603);
        setupViewComponent();
    }
    private void setupViewComponent(){

        txtComPlay=(ImageView)findViewById(R.id.m0603_c001);
        txtSelect=(TextView)findViewById(R.id.m0603_s001);
        txtResult=(TextView) findViewById(R.id.m0603_f000);
        btnScissors=(ImageButton)findViewById(R.id.m0603_b001);
        btnStone=(ImageButton)findViewById(R.id.m0603_b002);
        btnNet=(ImageButton)findViewById(R.id.m0603_b003);
//        startmusic = MediaPlayer.create(getApplication(), R.raw.guess);
//        startmusic.start();
        startmusic= MediaPlayer.create(getApplicationContext(),R.raw.guess);
        startmusic.start();

        mediaWin= MediaPlayer.create(getApplicationContext(),R.raw.vctory);
        mediaLose= MediaPlayer.create(getApplicationContext(),R.raw.lose);
        mediaDraw= MediaPlayer.create(getApplicationContext(),R.raw.haha);
        mediaNight= MediaPlayer.create(getApplicationContext(),R.raw.night);


        btnScissors.setOnClickListener(btn01On);
        btnStone.setOnClickListener(btn01On);
        btnNet.setOnClickListener(btn01On);
}



    private View.OnClickListener btn01On=new Button.OnClickListener(){

        public  void  onClick(View v){
            int iComPlay=(int)(Math.random()*3+1);
            switch (v.getId()){  //玩家出拳
                case R.id.m0603_b001: //玩家選擇剪刀
                    user_select = getString(R.string.m0603_s001) + "  "+getString(R.string.m0603_b001);
                    switch (iComPlay){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors); //電腦選剪刀
//                            ff = getString(R.string.m0603_f000) + "  " + getString(R.string.m0603_f001); //ff為變數 是猜拳結果
//                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));
                            music(2);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone); //電腦選石頭
//                            ff= getString(R.string.m0603_f000)+"   "+getString(R.string.m0603_f002);
//                            txtResult.setTextColor(getResources().getColor(R.color.Red));
                            music(3);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net); //電腦選布
//                            ff=getString(R.string.m0603_f000)+"  "+getString(R.string.m0603_f003);
//                            txtResult.setTextColor(getResources().getColor(R.color.Lime));
                            music(1);
                            break;
                    }
                break;

                case R.id.m0603_b002: //選擇石頭
                    user_select = getString(R.string.m0603_s001) + "  "+
                            getString(R.string.m0603_b002);
                    switch (iComPlay){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
//                            ff = getString(R.string.m0603_f000) + "  " + getString(R.string.m0603_f003);
//                            txtResult.setTextColor(getResources().getColor(R.color.Lime));
                            music(1);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
//                            ff= getString(R.string.m0603_f000)+"   "+getString(R.string.m0603_f001);
//                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));
                            music(2);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
//                            ff=getString(R.string.m0603_f000)+"  "+getString(R.string.m0603_f002);
//                            txtResult.setTextColor(getResources().getColor(R.color.Red));
                            music(3);
                            break;
                    }
                    break;
                case R.id.m0603_b003: //玩家選擇布
                    user_select = getString(R.string.m0603_s001) + "  "+
                            getString(R.string.m0603_b003);
                    switch (iComPlay){
                        case 1:
                            txtComPlay.setImageResource(R.drawable.scissors);
//                            ff = getString(R.string.m0603_f000) + "  " + getString(R.string.m0603_f002);
//                            txtResult.setTextColor(getResources().getColor(R.color.Red));
                            music(3);
                            break;
                        case 2:
                            txtComPlay.setImageResource(R.drawable.stone);
//                            ff= getString(R.string.m0603_f000)+"   "+getString(R.string.m0603_f003);
//                            txtResult.setTextColor(getResources().getColor(R.color.Lime));
                            music(1);
                            break;
                        case 3:
                            txtComPlay.setImageResource(R.drawable.net);
//                            ff=getString(R.string.m0603_f000)+"  "+getString(R.string.m0603_f001);
//                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));
                            music(2);
                            break;
                    }
                    break;

            }
            txtSelect.setText(user_select);
            txtResult.setText(ff);



        }



        };

    private void music(int i) {
        if(startmusic.isPlaying()) startmusic.stop();
        if(mediaWin.isPlaying()) mediaWin.pause();
        if(mediaLose.isPlaying()) mediaLose.pause();
        if(mediaDraw.isPlaying()) mediaDraw.pause();




        //i=1 代表營
        switch(i){
            case 1://贏
                mediaWin.start();

                ff = getString(R.string.m0603_f000) + "  " + getString(R.string.m0603_f003);
                txtResult.setTextColor(getResources().getColor(R.color.Lime));


                break;
            case 2://平手
                mediaDraw.start();

                ff= getString(R.string.m0603_f000)+"   "+getString(R.string.m0603_f001);
                txtResult.setTextColor(getResources().getColor(R.color.Yellow));


                break;
            case 3://輸
                mediaLose.start();

                ff=getString(R.string.m0603_f000)+"  "+getString(R.string.m0603_f002);
                txtResult.setTextColor(getResources().getColor(R.color.Red));


                break;
            case 4://輸
                mediaNight.start();
//



                break;

        }



    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(startmusic.isPlaying()) startmusic.stop();
        music(4);
        this.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(startmusic.isPlaying()) startmusic.stop();
        music(4);

    }
}