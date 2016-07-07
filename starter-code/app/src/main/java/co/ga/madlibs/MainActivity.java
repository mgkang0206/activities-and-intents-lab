package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText adj1 = (EditText) this.findViewById(R.id.editText);
        final EditText adj2 = (EditText) this.findViewById(R.id.editText2);
        final EditText noun1 = (EditText) this.findViewById(R.id.editText3);
        final EditText noun2 = (EditText) this.findViewById(R.id.editText4);
        final EditText animal = (EditText) this.findViewById(R.id.editText5);
        final EditText game = (EditText) this.findViewById(R.id.editText6);
               Button button = (Button) this.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // create an intent
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                // put extra information in the intent
                String adj1Txt = adj1.getText().toString();
                String adj2Txt = adj2.getText().toString();
                String noun1Txt = noun1.getText().toString();
                String noun2Txt = noun2.getText().toString();
                String animalTxt = animal.getText().toString();
                String gameTxt = game.getText().toString();
                intent.putExtra(ResultActivity.ADJECTIVE1, adj1Txt);
                intent.putExtra(ResultActivity.ADJECTIVE2, adj2Txt);
                intent.putExtra(ResultActivity.NOUN1, noun1Txt);
                intent.putExtra(ResultActivity.NOUN2, noun2Txt);
                intent.putExtra(ResultActivity.ANIMALS, animalTxt);
                intent.putExtra(ResultActivity.GAME, gameTxt);

                // start the other activity with the intent
                startActivity(intent);
            }
        });
    }
}
