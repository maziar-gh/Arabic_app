package com.arabic.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static java.lang.String.format;

import com.arabic.app.Network.AppController;
import com.arabic.app.R;
import com.arabic.app.Tamrin_Class.Hashtm.tarjome_sazi_1.Tarmrin_8_class_1;
import com.joanzapata.pdfview.PDFView;
import com.joanzapata.pdfview.listener.OnPageChangeListener;

import java.io.File;

public class ShowPdfActivity extends AppCompatActivity implements OnPageChangeListener {

    PDFView pdfView;
    Integer pageNumber = 1;
    String pdfName = "";

    private Button btn_showpdf_testSchool , btn_showpdf_testhome , btn_showpdf_teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_pdf);

        findView();

        btn_showpdf_testSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Tarmrin_8_class_1.class);
                startActivity(intent);
            }
        });

        btn_showpdf_testhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ShowPdfActivity.this, "تمرین در خانه", Toast.LENGTH_SHORT).show();
            }
        });

        btn_showpdf_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ShowPdfActivity.this, "بزودی ارتباط با استاد قرار میگیرد", Toast.LENGTH_SHORT).show();
            }
        });


        Bundle ex = getIntent().getExtras();
        if (ex != null) {
            switch (ex.getString("file")) {
                case "1":
                    pdfName = AppController.DARS_P7_8.substring(AppController.DARS_P7_8.lastIndexOf('/') + 1, AppController.DARS_P7_8.length());
                    displayFromUri(new File
                            (Environment.getExternalStorageDirectory() + "/.arabi/" + pdfName));

                    break;
                case "2":
                    pdfName = AppController.DARS_P7_9.substring(AppController.DARS_P7_9.lastIndexOf('/') + 1, AppController.DARS_P7_9.length());
                    displayFromUri(new File
                            (Environment.getExternalStorageDirectory() + "/.arabi/" + pdfName));
                    break;
            }
        } else finish();


    }


    private void findView(){
        pdfView = (PDFView) findViewById(R.id.pdfview);
        btn_showpdf_testSchool = (Button)findViewById(R.id.btn_showpdf_testSchool);
        btn_showpdf_testhome = (Button)findViewById(R.id.btn_showpdf_testhome);
        btn_showpdf_teacher = (Button)findViewById(R.id.btn_showpdf_teacher);
    }

    private void displayFromUri(File file) {
        pdfView.fromFile(file)
                .defaultPage(0)
                .onPageChange(this)
                .load();
    }


    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(format("%s %s / %s", pdfName, page, pageCount));
    }
}
