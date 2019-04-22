package qhy.com.unlimitedsword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import qhy.com.unlimitedswordutils.USUtils;
import qhy.com.unlimitedswordutils.UsConst;
import qhy.com.unlimitedswordutils.UsPermission;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        USUtils.getInstance().usePermission().setContext(this)
                .setPermission(UsConst.Permission.CAMERA)
                .getPermission(new UsPermission.PermissionCallBack() {
                    @Override
                    public void success() {
                        Toast.makeText(MainActivity.this, "成功", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void failed() {

                    }
                });

    }


}
