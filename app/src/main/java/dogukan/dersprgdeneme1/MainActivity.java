package dogukan.dersprgdeneme1;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public Button button;
    private TextView resultText;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    String text_saved_lessons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = preferences.edit();
        SetTextViewsId();


    }


    public void onClick(View v) {
        TextView LESSONTEXT;
        switch (v.getId()) {
            case R.id.section_monday_9:
                DialogFunc(R.id.section_monday_9);
                saveData("section_monday_9",text_saved_lessons);
                break;
            case R.id.section_monday_10:
                DialogFunc(R.id.section_monday_10);
                saveData("section_monday_10", text_saved_lessons);
                break;
            case R.id.section_monday_11:
                DialogFunc(R.id.section_monday_11);
                saveData("section_monday_11", text_saved_lessons);
                break;

        }
    }

    public void DialogFunc(final int lessons_id) {


        // get prompts.xml view
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View promptView = layoutInflater.inflate(R.layout.input_dialog, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setView(promptView);

        final EditText editText = (EditText) promptView.findViewById(R.id.edittext);
        // setup a dialog window
        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        TextView necati = (TextView) findViewById(lessons_id);
                        necati.setText(editText.getText());
                        text_saved_lessons=editText.getText().toString();
                    }
                })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        // create an alert dialog
        AlertDialog alert = alertDialogBuilder.create();
        alert.show();

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

    public void SetTextViewsId() {
        findViewById(R.id.section_monday_9).setOnClickListener(this);
        findViewById(R.id.section_monday_10).setOnClickListener(this);
        findViewById(R.id.section_monday_11).setOnClickListener(this);
        findViewById(R.id.section_monday_12).setOnClickListener(this);
        findViewById(R.id.section_monday_13).setOnClickListener(this);
        findViewById(R.id.section_monday_14).setOnClickListener(this);
        findViewById(R.id.section_monday_15).setOnClickListener(this);
        findViewById(R.id.section_monday_16).setOnClickListener(this);
        findViewById(R.id.section_monday_17).setOnClickListener(this);
        findViewById(R.id.section_monday_18).setOnClickListener(this);

        findViewById(R.id.section_tuesday_9).setOnClickListener(this);
        findViewById(R.id.section_tuesday_10).setOnClickListener(this);
        findViewById(R.id.section_tuesday_11).setOnClickListener(this);
        findViewById(R.id.section_tuesday_12).setOnClickListener(this);
        findViewById(R.id.section_tuesday_13).setOnClickListener(this);
        findViewById(R.id.section_tuesday_14).setOnClickListener(this);
        findViewById(R.id.section_tuesday_15).setOnClickListener(this);
        findViewById(R.id.section_tuesday_16).setOnClickListener(this);
        findViewById(R.id.section_tuesday_17).setOnClickListener(this);
        findViewById(R.id.section_tuesday_18).setOnClickListener(this);

        findViewById(R.id.section_wednesday_9).setOnClickListener(this);
        findViewById(R.id.section_wednesday_10).setOnClickListener(this);
        findViewById(R.id.section_wednesday_11).setOnClickListener(this);
        findViewById(R.id.section_wednesday_12).setOnClickListener(this);
        findViewById(R.id.section_wednesday_13).setOnClickListener(this);
        findViewById(R.id.section_wednesday_14).setOnClickListener(this);
        findViewById(R.id.section_wednesday_15).setOnClickListener(this);
        findViewById(R.id.section_wednesday_16).setOnClickListener(this);
        findViewById(R.id.section_wednesday_17).setOnClickListener(this);
        findViewById(R.id.section_wednesday_18).setOnClickListener(this);

        findViewById(R.id.section_tuesday_9).setOnClickListener(this);
        findViewById(R.id.section_tuesday_10).setOnClickListener(this);
        findViewById(R.id.section_tuesday_11).setOnClickListener(this);
        findViewById(R.id.section_tuesday_12).setOnClickListener(this);
        findViewById(R.id.section_tuesday_13).setOnClickListener(this);
        findViewById(R.id.section_tuesday_14).setOnClickListener(this);
        findViewById(R.id.section_tuesday_15).setOnClickListener(this);
        findViewById(R.id.section_tuesday_16).setOnClickListener(this);
        findViewById(R.id.section_tuesday_17).setOnClickListener(this);
        findViewById(R.id.section_tuesday_18).setOnClickListener(this);

        findViewById(R.id.section_friday_9).setOnClickListener(this);
        findViewById(R.id.section_friday_10).setOnClickListener(this);
        findViewById(R.id.section_friday_11).setOnClickListener(this);
        findViewById(R.id.section_friday_12).setOnClickListener(this);
        findViewById(R.id.section_friday_13).setOnClickListener(this);
        findViewById(R.id.section_friday_14).setOnClickListener(this);
        findViewById(R.id.section_friday_15).setOnClickListener(this);
        findViewById(R.id.section_friday_16).setOnClickListener(this);
        findViewById(R.id.section_friday_17).setOnClickListener(this);
        findViewById(R.id.section_friday_18).setOnClickListener(this);

        getData("section_monday_9", R.id.section_monday_9);
        getData("section_monday_9",R.id.section_monday_10);
        getData("section_monday_9",R.id.section_monday_11);

    }

    public void saveData(String key,String lesson)
    {

        editor.putString(key,lesson);
        editor.commit();



    }

    public void getData(String key , int lessons_id)

    {
        TextView Lesson  = (TextView) findViewById(lessons_id);
        Lesson.setText(preferences.getString(key, "LSN"));




    }




    /// ONCLICK SECTION


    /// ONCLICK SECTION


}
