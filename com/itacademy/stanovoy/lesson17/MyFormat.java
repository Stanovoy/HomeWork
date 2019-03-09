package com.itacademy.stanovoy.lesson17;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyFormat {

    public MyFileReader myFileReader = new MyFileReader();
    public String[] schedule;
    public String[] timeActivity;

    public MyFormat() throws IOException {
        Pattern pattern = Pattern.compile("([А-Яа-я]*) ?(\\d+:\\d+)");
        Matcher matcher = pattern.matcher(myFileReader.stringBuffer);
        StringBuffer stringBuffer1 = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer1, "$2-$1, $2");
        }
        stringBuffer1.delete(0, 7);
        matcher.appendTail(stringBuffer1);
        schedule = String.valueOf(stringBuffer1).split(",");

        Pattern pattern1 = Pattern.compile("(?<hour>\\d+):(?<minutes>\\d+)"
                + ".(?<hourNext>\\d+):(?<minutesNext>\\d+)\\W?(?<activity>[А-Яа-я]*),");
        Matcher matcher1 = pattern1.matcher(stringBuffer1);
        StringBuffer stringBuffer2 = new StringBuffer();

        final int PROCENT = 100;
        final int TIME_SCHOOL_DAY = 490;

        while (matcher1.find()) {
            matcher1.appendReplacement(stringBuffer2,
                    matcher1.group("activity")
                            + ": "
                            + time(matcher1)
                            + " минут" + " "
                            + (PROCENT * time(matcher1)
                            / TIME_SCHOOL_DAY + " %,")
            );
        }
        timeActivity = String.valueOf(stringBuffer2).split(",");
    }

    private static int time(Matcher matcher) {
        final int MINUTES = 60;

        return (Math.abs(
                ((Math.abs(Integer.parseInt(matcher.group("hour"))
                        - Integer.parseInt(matcher.group("hourNext")))) * MINUTES)
                        - Math.abs(Integer.parseInt(matcher.group("minutesNext"))
                        - Integer.parseInt(matcher.group("minutes"))))
        );
    }
}