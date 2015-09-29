package dogukan.dersprgdeneme1.base.tools;

import android.content.Context;

import android.support.annotation.IdRes;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.devspark.robototextview.widget.RobotoTextView;

import dogukan.dersprgdeneme1.R;

/**
 * Created by Panch on 29.09.2015.
 */
public class Event extends LinearLayout {

    private RobotoTextView mTitle;
    private RobotoTextView mTime;

    private void initTextviews() {

        RobotoTextView title = new RobotoTextView(getContext());
        RobotoTextView time = new RobotoTextView(getContext());
        mTitle = title;
        mTime = time;
        mTitle.setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        mTitle.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
        mTime.setTextColor(getResources().getColor(android.R.color.darker_gray));
        this.setOrientation(VERTICAL);
        this.setBackgroundResource(R.drawable.selector);
        this.setPadding(8, 8, 8, 8);
        this.addView(mTitle);
        this.addView(mTime);

    }


    public Event(Context context) {
        super(context);

        this.setClickable(true);
        initTextviews();
    }

    public Event(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setClickable(true);
        initTextviews();
    }

    public Event(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.setClickable(true);
        initTextviews();
    }

    public void setTitle(CharSequence s) {

        if(s.length() >= 10)
        {
            mTitle.setText(s.subSequence(0,10) + "...");
        }
        else
        {
            mTitle.setText(s);
        }


    }

    public void setTime(CharSequence s) {
        mTime.setText(s);
    }

}
