package be.howest.ti.yd.fitness_tracker.Filter;

import android.text.InputFilter;
import android.text.Spanned;

/**
 * Created by Yanni on 11/03/2018.
 */

public class MaxNumberFilter implements InputFilter {
    private int min;
    private int max;

    public MaxNumberFilter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        try {
            int input = Integer.parseInt(dest.subSequence(0, dstart).toString() + source + dest.subSequence(dend, dest.length()));
            if (isInRange(min, max, input))
                return null;
        } catch (NumberFormatException nfe) { }
        return "";
    }

    private boolean isInRange(int a, int b, int c) {
        return b > a ? c >= a && c <= b : c >= b && c <= a;
    }

}
