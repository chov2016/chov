package com.example.administrator.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Administrator on 2016/6/14.
 */
public class SexPickerDialog extends Dialog
{
    private Context context;
    private View customView;

    private String sex;

    public SexPickerDialog(Context context, int theme)
    {
        super(context, theme);
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        customView = inflater.inflate(R.layout.dialog_sex_picker, null);
    }

    public SexPickerDialog(Context context, int theme, int layout)
    {
        super(context, theme);
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        customView = inflater.inflate(layout, null);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(customView);
    }

    @Override
    public View findViewById(int id)
    {
        return super.findViewById(id);
    }

    public View getCustomView()
    {
        return customView;
    }

    public String getSex()
    {
        return sex;
    }
}
