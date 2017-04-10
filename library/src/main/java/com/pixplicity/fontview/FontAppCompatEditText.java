package com.pixplicity.fontview;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

import com.pixplicity.fontview.utils.FontUtil;

public class FontAppCompatEditText extends AppCompatEditText {

    public FontAppCompatEditText(Context context) {
        super(context);
    }

    public FontAppCompatEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomTypeface(attrs, R.attr.editTextStyle);
    }

    public FontAppCompatEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomTypeface(attrs, defStyle);
    }
    public void setCustomTypeface(String font) {
        final Typeface tf = FontUtil.getTypeface(getContext(), font);
        setCustomTypeface(tf);
    }

    private void setCustomTypeface(AttributeSet attrs, int defStyle) {
        final Typeface tf = FontUtil.getTypeface(getContext(), attrs, defStyle);
        setCustomTypeface(tf);
    }

    private void setCustomTypeface(Typeface tf) {
        setPaintFlags(getPaintFlags() | Paint.SUBPIXEL_TEXT_FLAG | Paint.ANTI_ALIAS_FLAG);
        setTypeface(tf);
    }

}
