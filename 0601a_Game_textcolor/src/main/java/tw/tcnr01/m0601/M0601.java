package tw.tcnr01.m0601;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M0601 extends AppCompatActivity {

    private TextView txtComPlay;
    private TextView txtSelect;
    private TextView txtResult;
    private Button btnScissors;
    private Button btnStone;
    private Button btnNet;
    private  String ans;
    private  String ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0601);
        setupViewComponent();
    }
    private void setupViewComponent() {
        // ---取得R.java 配置碼---

        txtComPlay = (TextView) findViewById(R.id.m0601_c001); // 電腦選擇
        txtSelect = (TextView) findViewById(R.id.m0601_s001); // 選擇結果
        txtResult = (TextView) findViewById(R.id.m0601_f001); // 輸贏判斷
        btnScissors = (Button) findViewById(R.id.m0601_b001); // 剪刀
        btnStone = (Button) findViewById(R.id.m0601_b002); // 石頭
        btnNet = (Button) findViewById(R.id.m0601_b003); // 布

        // ---啟動監聽事件----
        btnScissors.setOnClickListener(btn01On);
        btnStone.setOnClickListener(btn01On);
        btnNet.setOnClickListener(btn01On);
    }

    private View.OnClickListener btn01On = new View.OnClickListener(){


        @Override
        public void onClick(View view) {
            int computerSelect=(int)(Math.random()*3+1);
            //
//            switch (computerSelect){
//                case 1:
//                    txtComPlay.setText(R.string.m0601_b001);
//                    switch (view.getId()){
//                        case R.id.m0601_b001:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b002:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b003:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f003);
//                            txtSelect.setText(ans);
//                            break;
//
//                    }
//                    break;
//                case 2:
//                    txtComPlay.setText(R.string.m0601_b002);
//                    switch (view.getId()){
//                        case R.id.m0601_b001:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f003);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b002:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b003:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
//                            txtSelect.setText(ans);
//                            break;
//
//                    }
//
//                    break;
//                case 3:
//                    txtComPlay.setText(R.string.m0601_b003);
//                    switch (view.getId()){
//                        case R.id.m0601_b001:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b002:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
//                            txtSelect.setText(ans);
//                            break;
//                        case R.id.m0601_b003:
//                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
//                            txtSelect.setText(ans);
//                            break;
//
//                    }
//                    break;
//
//            }

//....
            switch(view.getId()){
                case R.id.m0601_b001: //玩家選擇 剪刀
                    ans =getString(R.string.m0601s001)+getString(R.string.m0601_b001);

                    switch(computerSelect){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));

                            break;

                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f003);
                            txtResult.setTextColor(getResources().getColor(R.color.Red));

                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
                            txtResult.setTextColor(getResources().getColor(R.color.Lime));

                            break;
                    }



                    break;
                case R.id.m0601_b002: //玩家選擇 石頭
                    ans =getString(R.string.m0601s001)+getString(R.string.m0601_b002);

                    switch(computerSelect){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
                            txtResult.setTextColor(getResources().getColor(R.color.Lime));

                            break;

                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));

                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f003);
                            txtResult.setTextColor(getResources().getColor(R.color.Red));


                            break;
                    }

                    break;
                case R.id.m0601_b003: //玩家選擇 布
                    ans =getString(R.string.m0601s001)+getString(R.string.m0601_b003);

                    switch(computerSelect){
                        case 1:
                            txtComPlay.setText(R.string.m0601_b001);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f003);
                            txtResult.setTextColor(getResources().getColor(R.color.Red));

                            break;

                        case 2:
                            txtComPlay.setText(R.string.m0601_b002);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f004);
                            txtResult.setTextColor(getResources().getColor(R.color.Lime));

                            break;
                        case 3:
                            txtComPlay.setText(R.string.m0601_b003);
                            ff=getString(R.string.m0601_f001)+" "+getString(R.string.m0601_f002);
                            txtResult.setTextColor(getResources().getColor(R.color.Yellow));

                            break;
                    }

                    break;



            }


            txtSelect.setText(ans);
            txtResult.setText(ff);

        }
    };


}