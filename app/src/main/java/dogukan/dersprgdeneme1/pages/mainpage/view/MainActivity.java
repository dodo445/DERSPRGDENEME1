package dogukan.dersprgdeneme1.pages.mainpage.view;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
import dogukan.dersprgdeneme1.R;
import dogukan.dersprgdeneme1.base.tools.Event;
import dogukan.dersprgdeneme1.base.view.BaseActivity;
import dogukan.dersprgdeneme1.pages.mainpage.model.EventModel;

/**
 * Created by Panch on 29.09.2015.
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.content_pazartesi)
    LinearLayout content_pazartesi;

    @Bind(R.id.content_sali)
    LinearLayout content_sali;

    @Bind(R.id.content_carsamba)
    LinearLayout content_carsamba;

    @Bind(R.id.content_persembe)
    LinearLayout content_persembe;

    @Bind(R.id.content_cuma)
    LinearLayout content_cuma;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);
     //

        List<EventModel> pazartesi = new ArrayList<>();
        List<EventModel> sali = new ArrayList<>();
        List<EventModel> carsamba = new ArrayList<>();
        List<EventModel> persembe = new ArrayList<>();
        List<EventModel> cuma = new ArrayList<>();

        EventModel a = new EventModel();
        a.setEndTime("20:00");
        a.setStartTime("19:00");
        a.setTitle("CE 225");

        pazartesi.add(a);

        EventModel b = new EventModel();
        b.setEndTime("14:00");
        b.setStartTime("12:00");
        b.setTitle("CE 511");

        sali.add(b);

        initialize(pazartesi,sali,carsamba,persembe,cuma);


    }

    @OnClick(R.id.btn_pazartesi)
     void addEvent_1()
    {

    }
    @OnClick(R.id.btn_sali)
    void addEvent_2()
    {

    }
    @OnClick(R.id.btn_carsamba)
    void addEvent_3()
    {

    }
    @OnClick(R.id.btn_persembe)
    void addEvent_4()
    {

    }
    @OnClick(R.id.btn_cuma)
    void addEvent_5()
    {

    }



    private void initialize(List<EventModel> pazartesi,List<EventModel> sali,List<EventModel> carsamba,List<EventModel> persembe,List<EventModel> cuma)
    {
        for(int i = 0;i<pazartesi.size();i++)
        {
            EventModel ths = pazartesi.get(i);
            Event event = new Event(getApplicationContext());
            event.setTitle(ths.getTitle());
            event.setTime(ths.getStartTime() + " - " + ths.getEndTime());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,12,0,0);
            event.setLayoutParams(params);
            content_pazartesi.addView(event);
        }

        for(int i = 0;i<sali.size();i++)
        {
            EventModel ths = sali.get(i);
            Event event = new Event(getApplicationContext());
            event.setTitle(ths.getTitle());
            event.setTime(ths.getStartTime() + " - " + ths.getEndTime());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,12,0,0);
            event.setLayoutParams(params);
            content_sali.addView(event);
        }

        for(int i = 0;i<carsamba.size();i++)
        {
            EventModel ths = carsamba.get(i);
            Event event = new Event(getApplicationContext());
            event.setTitle(ths.getTitle());
            event.setTime(ths.getStartTime() + " - " + ths.getEndTime());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,12,0,0);
            event.setLayoutParams(params);
            content_carsamba.addView(event);
        }

        for(int i = 0;i<persembe.size();i++)
        {
            EventModel ths = persembe.get(i);
            Event event = new Event(getApplicationContext());
            event.setTitle(ths.getTitle());
            event.setTime(ths.getStartTime() + " - " + ths.getEndTime());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,12,0,0);
            event.setLayoutParams(params);
            content_persembe.addView(event);
        }

        for(int i = 0;i<cuma.size();i++)
        {
            EventModel ths = cuma.get(i);
            Event event = new Event(getApplicationContext());
            event.setTitle(ths.getTitle());
            event.setTime(ths.getStartTime() + " - " + ths.getEndTime());
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(0,12,0,0);
            event.setLayoutParams(params);
            content_cuma.addView(event);
        }

    }


}
