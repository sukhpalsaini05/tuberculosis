package mdimembrane.tuberculosis.NewAccount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import mdimembrane.tuberculosis.main.R;

public class NewAccountOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG).show();
    }

}