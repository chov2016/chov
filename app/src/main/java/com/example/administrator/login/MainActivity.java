package com.example.administrator.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ivNameYes, ivNameCancel,qqyes,qqcancel,phoneyes,phonecancel;
    NameEditDialog nameEditDialog;
    QQDialog qqdialog;
    PhoneDialog phonedialog;
    EditText edtName,edtqq,edtphone;
    private TextView tvName;
    SexPickerDialog sexPickerDialog;
    private ImageView ivMale, ivFemale, ivOther;
    FrameLayout layout,phone1,qq1,layoutSex;
TextView tvSex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//昵称
        nameEditDialog = new NameEditDialog(this, R.style.Theme_dialog);
        nameEditDialog.setCanceledOnTouchOutside(true);
        View viewName = nameEditDialog.getCustomView();
        ivNameYes = (ImageView) viewName.findViewById(R.id.btn_nickname_save);
        ivNameCancel = (ImageView) viewName.findViewById(R.id.btn_nickname_cancel);
        edtName = (EditText) viewName.findViewById(R.id.edt_nickname);


        //qq
        qqdialog = new QQDialog(this, R.style.Theme_dialog);
        qqdialog.setCanceledOnTouchOutside(true);
        View viewqq = qqdialog.getCustomView();
        qqyes = (ImageView) viewName.findViewById(R.id.btn_qq_save);
        qqcancel = (ImageView) viewName.findViewById(R.id.btn_qq_cancel);
        edtqq = (EditText) viewName.findViewById(R.id.edt_qq);

        //手机
        phonedialog = new PhoneDialog(this, R.style.Theme_dialog);
        phonedialog.setCanceledOnTouchOutside(true);
        View viewphone = phonedialog.getCustomView();
        phoneyes = (ImageView) viewName.findViewById(R.id.btn_phone_save);
        phonecancel = (ImageView) viewName.findViewById(R.id.btn_phone_cancel);
        edtphone = (EditText) viewName.findViewById(R.id.edt_phone);

//性别
        sexPickerDialog = new SexPickerDialog(this, R.style.Theme_dialog);
        View viewSex = sexPickerDialog.getCustomView();
        ivMale = (ImageView) viewSex.findViewById(R.id.btn_sex_male);
        ivFemale = (ImageView) viewSex.findViewById(R.id.btn_sex_female);
        ivOther = (ImageView) viewSex.findViewById(R.id.btn_sex_other);


        layout = (FrameLayout) findViewById(R.id.pageuser_layout_name);
        qq1 = (FrameLayout) findViewById(R.id.qq1);
        phone1 = (FrameLayout) findViewById(R.id.phone1);
        layoutSex = (FrameLayout) findViewById(R.id.pageuser_layout_sex);
        tvSex = (TextView) findViewById(R.id.pageuser_tv_sex);
        tvName = (TextView) findViewById(R.id.pageuser_tv_name);
        layout.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View arg0) {
                nameEditDialog.show();
                WindowManager windowManager = getWindowManager();
                Display display = windowManager.getDefaultDisplay();
                WindowManager.LayoutParams lp = nameEditDialog.getWindow()
                        .getAttributes();
                lp.width = (int) (display.getWidth()); // 设置宽度
                lp.height = (int) (display.getHeight());
                nameEditDialog.getWindow().setAttributes(lp);
            }
        });

        ivNameYes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String name = edtName.getText().toString().trim();
                if (!name.equals("") && name != null) {
                    tvName.setText(name);
                    nameEditDialog.dismiss();
                } else {
                    Toast.makeText(MainActivity.this, "昵称不能为空！", Toast.LENGTH_LONG).show();
                }
            }
        });
        ivNameCancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                nameEditDialog.dismiss();
            }
        });


        qq1.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View arg0) {
                qqdialog.show();
                WindowManager windowManager = getWindowManager();
                Display display = windowManager.getDefaultDisplay();
                WindowManager.LayoutParams lp = qqdialog.getWindow()
                        .getAttributes();
                lp.width = (int) (display.getWidth()); // 设置宽度
                lp.height = (int) (display.getHeight());
                nameEditDialog.getWindow().setAttributes(lp);
            }
        });


        phone1.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View arg0) {
                phonedialog.show();
                WindowManager windowManager = getWindowManager();
                Display display = windowManager.getDefaultDisplay();
                WindowManager.LayoutParams lp = phonedialog.getWindow()
                        .getAttributes();
                lp.width = (int) (display.getWidth()); // 设置宽度
                lp.height = (int) (display.getHeight());
                nameEditDialog.getWindow().setAttributes(lp);
            }
        });


        layoutSex.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View arg0) {
                sexPickerDialog.show();
                WindowManager windowManager = getWindowManager();
                Display display = windowManager.getDefaultDisplay();
                WindowManager.LayoutParams lp = sexPickerDialog.getWindow()
                        .getAttributes();
                lp.width = (int) (display.getWidth()); // 设置宽度
                lp.height = (int) (display.getHeight());
                sexPickerDialog.getWindow().setAttributes(lp);
            }
        });
        ivMale.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tvSex.setText("男");
                sexPickerDialog.dismiss();
            }
        });

        ivFemale.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tvSex.setText("女");
                sexPickerDialog.dismiss();
            }
        });

        ivOther.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                tvSex.setText("其他");
                sexPickerDialog.dismiss();
            }
        });


    }
}
