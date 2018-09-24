package com.markjohnson.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeOfDayMessage extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);

        if (hour < 12)
            out.println("Good Morning!");
        else if (hour < 17 && !(hour == 12))
            out.println("Good Afternoon!");
        else if (hour == 12)
            out.println("Good Noon!");
        else
            out.println("What are you doing staying up so late?");
    }

}
