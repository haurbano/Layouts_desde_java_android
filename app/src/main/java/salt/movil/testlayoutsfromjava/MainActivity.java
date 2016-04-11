package salt.movil.testlayoutsfromjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout linearLayout;
    List<EditText> edits;
    List<TextView> txts;

    Button btnRecuperar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.layout_parent);
        edits = new ArrayList<>();
        txts = new ArrayList<>();

        btnRecuperar = (Button) findViewById(R.id.btn_recuperar);
        btnRecuperar.setOnClickListener(this);

        CargarLayout();
    }

    private void CargarLayout(){
        for (int i=0; i<5; i++){
            EditText editText = new EditText(this);
            editText.setHint("Edit "+i);
            edits.add(editText);
            linearLayout.addView(editText);
        }

        for (int i=0; i<5; i++){
            TextView textView = new TextView(this);
            linearLayout.addView(textView);
            txts.add(textView);
        }
    }

    @Override
    public void onClick(View v) {
        RecuperarViews();
    }

    private void RecuperarViews() {
        for (int i=0; i<5;i++){
            String txt = edits.get(i).getText().toString();
            txts.get(i).setText(txt);
        }
    }
}
