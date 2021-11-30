package tw.tcnr01.m0607;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M0607 extends AppCompatActivity {

    private Button b001;
    private Button b002;
    private Button b003;
    private Button b004;
    private Button b005;
    private Button b006;
    private Button b007;

    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0607);
        setupViewComponent();
    }

    private void setupViewComponent() {
        b001 = (Button) findViewById(R.id.m0607_b001);
        b002 = (Button) findViewById(R.id.m0607_b002);
        b003 = (Button) findViewById(R.id.m0607_b003);
        b004 = (Button) findViewById(R.id.m0607_b004);
        b005 = (Button) findViewById(R.id.m0607_b005);
        b006 = (Button) findViewById(R.id.m0607_b006);
        b007 = (Button) findViewById(R.id.m0607_b007);


        b001.setOnClickListener(btoast);
        b002.setOnClickListener(btoast);
        b003.setOnClickListener(btoast);
        b004.setOnClickListener(btoast);
        b005.setOnClickListener(btoast);
        b006.setOnClickListener(btoast);
        b007.setOnClickListener(btoast);
    }


    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.m0607_b001:
                    intent.putExtra("class_title",getString(R.string.m0000_b0500));
                    intent.setClass(M0607.this,M0500.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b002:
                    intent.putExtra("class_title",getString(R.string.m0000_b0501));
                    intent.setClass(M0607.this,M0501.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b003:
                    intent.putExtra("class_title",getString(R.string.m0000_b0502));
                    intent.setClass(M0607.this,M0502.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b004:
                    intent.putExtra("class_title",getString(R.string.m0000_b0504));
                    intent.setClass(M0607.this,M0504.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b005:
                    intent.putExtra("class_title",getString(R.string.m0000_b0505));
                    intent.setClass(M0607.this,M0505.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b006:
                    intent.putExtra("class_title",getString(R.string.m0000_b0606));
                    intent.setClass(M0607.this,M0604.class); //程式 從 M0607 到 M0500
                    break;
                case R.id.m0607_b007:
                    intent.putExtra("class_title",getString(R.string.m0000_b0607));
                    intent.setClass(M0607.this,M0605.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };
    
}