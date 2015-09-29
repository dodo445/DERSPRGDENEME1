package dogukan.dersprgdeneme1.pages.mainpage.view;

import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.OnClick;
import dogukan.dersprgdeneme1.R;
import dogukan.dersprgdeneme1.base.tools.Event;
import dogukan.dersprgdeneme1.base.view.BaseActivity;

/**
 * Created by Panch on 29.09.2015.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.content_pazartesi)
    LinearLayout content_pazartesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);



    }

    @OnClick(R.id.btn_pazartesi)
     void addEvent()
    {

        Event event = new Event(getApplicationContext());
        event.setText("CE 220");
        event.setTime("10:00 - 11:00");
        event.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        content_pazartesi.addView(event);
    }
}
