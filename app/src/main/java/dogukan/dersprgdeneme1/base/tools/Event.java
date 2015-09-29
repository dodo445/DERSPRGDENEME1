package dogukan.dersprgdeneme1.base.tools;

import android.content.Context;

import android.support.annotation.IdRes;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.devspark.robototextview.widget.RobotoTextView;

import dogukan.dersprgdeneme1.R;

/**
 * Created by Panch on 29.09.2015.
 */
public class Event extends FrameLayout {

    private RobotoTextView mTitle;
    private RobotoTextView mTime;

    private void initTextviews() {

        RobotoTextView title = new RobotoTextView(getContext());
        RobotoTextView time = new RobotoTextView(getContext());
        mTitle = title;
        mTime = time;
        mTitle.setTextColor(getResources().getColor(R.color.md_material_blue_800));
        mTime.setTextColor(getResources().getColor(R.color.md_material_blue_600));
        this.addView(title);
        this.addView(time);

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

    public void setText(CharSequence s) {

        mTitle.setText(s);

    }

    public void setTime(CharSequence s) {
        mTitle.setText(s);
    }

}
