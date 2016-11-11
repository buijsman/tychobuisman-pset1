package tycho.tychobuisman_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // defining
    private CheckBox checkboxArms, checkboxEars, checkboxEyebrows, checkboxEyes, checkboxGlasses, checkboxHat, checkboxMouth, checkboxMustache, checkboxNose, checkboxShoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defingin functions
        addListenerOncheckboxArms();
        addListenerOncheckboxEars();
        addListenerOncheckboxEyebrows();
        addListenerOncheckboxEyes();
        addListenerOncheckboxGlasses();
        addListenerOncheckboxHat();
        addListenerOncheckboxMouth();
        addListenerOncheckboxMustache();
        addListenerOncheckboxNose();
        addListenerOncheckboxShoes();
    }

    // for each checkbox the function is the same
    public void addListenerOncheckboxArms() {

        // get the id of the checkbox
        checkboxArms = (CheckBox) findViewById(R.id.checkboxArms);

        checkboxArms.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // when checkbox is clicked, get the image of the image that belongs to it
                ImageView imgView = (ImageView)findViewById(R.id.arms);

                // make image visible if it is checked, and invisible when it is not
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxEars() {
        checkboxEars = (CheckBox) findViewById(R.id.checkboxEars);

        checkboxEars.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.ears);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxEyebrows() {
        checkboxEyebrows = (CheckBox) findViewById(R.id.checkboxEyebrows);

        checkboxEyebrows.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.eyebrows);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxEyes() {
        checkboxEyes = (CheckBox) findViewById(R.id.checkboxEyes);

        checkboxEyes.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.eyes);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxGlasses() {
        checkboxGlasses = (CheckBox) findViewById(R.id.checkboxGlasses);

        checkboxGlasses.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.glasses);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxHat() {
        checkboxHat = (CheckBox) findViewById(R.id.checkboxHat);

        checkboxHat.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.hat);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxMouth() {
        checkboxMouth = (CheckBox) findViewById(R.id.checkboxMouth);

        checkboxMouth.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.mouth);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxMustache() {
        checkboxMustache = (CheckBox) findViewById(R.id.checkboxMustache);

        checkboxMustache.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.mustache);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxNose() {
        checkboxNose = (CheckBox) findViewById(R.id.checkboxNose);

        checkboxNose.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.nose);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}

    public void addListenerOncheckboxShoes() {
        checkboxShoes = (CheckBox) findViewById(R.id.checkboxShoes);

        checkboxShoes.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                ImageView imgView = (ImageView)findViewById(R.id.shoes);
                if(((CheckBox) v).isChecked()) {
                    imgView .setVisibility(View.VISIBLE);
                }
                else {
                    imgView .setVisibility(View.INVISIBLE);
                }
            }
        })
        ;}
}
