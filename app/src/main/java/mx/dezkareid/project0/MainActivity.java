package mx.dezkareid.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.spotify);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.score);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.library);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.build);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.xyz);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.capstone);
        button.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        String message = "This button will launch my ";
        switch (view.getId()){
            case R.id.spotify: {
                message += "spotify app!";
                break;
            }
            case R.id.score: {
                message += "score app!";
                break;
            }
            case R.id.library: {
                message += "library app!";
                break;
            }
            case R.id.build: {
                message += "build app!";
                break;
            }
            case R.id.xyz: {
                message += "xyz app!";
                break;
            }
            case R.id.capstone: {
                message += "capstone app!";
                break;
            }
            default:{
                message = "";
            }
        }

        if (!message.isEmpty()){
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
}
