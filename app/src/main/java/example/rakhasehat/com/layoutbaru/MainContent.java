package example.rakhasehat.com.layoutbaru;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainContent extends AppCompatActivity {

    EditText user, pass;
    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_content);

        user = (EditText) findViewById(R.id.editUser);
        pass = (EditText) findViewById(R.id.editPass);
        go = (Button) findViewById(R.id.btnGo);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();

                if(username.equals("Rakha") && password.equals("sehat")){
                    Toast.makeText(getApplicationContext(), "Sukses", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainContent.this, Dashboard.class);
                    startActivity(i);
                    finish();
                }
                else{
                    //jika login gagal
                    AlertDialog.Builder b = new AlertDialog.Builder(MainContent.this);
                    b.setMessage("Username atau Password salah!").setNegativeButton("Retry", null).create().show();
                }
            }
        });
    }
}
