package com.example.administrator.login;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

/**
 * Created by Administrator on 2016/6/14.
 */
public class NameEditDialog extends Dialog {
    private Context context;
    private View customView;
    private EditText edtName;

    private String nickName;

    public NameEditDialog(Context context, int theme)
    {
        super(context, theme);
        this.context = context;
        LayoutInflater inflater = LayoutInflater.from(context);
        customView = inflater.inflate(R.layout.dialog_nickname_picker, null);
    }

    public NameEditDialog(Context context, int theme, int layout)
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
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        edtName = (EditText) findViewById(R.id.edt_nickname);
    }

    @Override
    public void dismiss()
    {
        super.dismiss();
        edtName.setText("");
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

    public String getNickName()
    {
        return nickName;
    }
}
