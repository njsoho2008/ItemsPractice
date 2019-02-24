package zhangzf.scs.edu.niit.cn.itemspractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private RadioGroup rgp_01;
    private RadioButton rb01,rb02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        rgp_01=(RadioGroup)findViewById(R.id.rgp_01);
        rgp_01.setOnCheckedChangeListener(new RadioLister());
    }

    class RadioLister implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
           Toast.makeText(MainActivity.this,"您选择了："+checkedId,Toast.LENGTH_LONG).show();
            if (checkedId==R.id.rb01){
                click_rb01();
            }else if(checkedId==R.id.rb02) {
                click_rb02();
            }

        }
    }

    private String click_rb02() {
        System.out.println("本人未婚....");
        return "未婚";
    }

    private String click_rb01() {
        System.out.println("本人已婚....");
        return "已婚";
    }
}

