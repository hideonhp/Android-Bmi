package com.apple.chisobmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ChieuCao, CanNang;
    Button Calculator;
    TextView KetQua, ThongBao, SoSad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioButton nam = (RadioButton)findViewById(R.id.nam);
        final RadioButton nu = (RadioButton)findViewById(R.id.nu);

        ChieuCao = findViewById(R.id.chieuCao);
        CanNang = findViewById(R.id.canNang);

        KetQua = findViewById(R.id.ketQua);
        ThongBao = findViewById(R.id.thongBao);
        SoSad = findViewById(R.id.sosad);

        Calculator = findViewById(R.id.calc);

        Calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double cc = Double.parseDouble(ChieuCao.getText().toString());
                double cn = Double.parseDouble(CanNang.getText().toString());
                double bmi = cn/((cc/100)*(cc/100));
                bmi = Math.round(bmi*10)/10.0;
                if (nam.isChecked()== true){
                    if (bmi<=18.5){
                        SoSad.setText("Chia Buồn !!!");
                        ThongBao.setText("Bạn có 1 cân nặng thấp gầy !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=18.5&&bmi<=24.9){
                        SoSad.setText("Chán Quá !!!");
                        ThongBao.setText("Bạn có 1 cân nặng bình thường !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi==25){
                        SoSad.setText("Cảnh Báo, Bạn đang bị thừa cân  !!!");
                        ThongBao.setText("Nên vận động nhiều hơn !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>25&&bmi<=29.9) {
                        SoSad.setText("Cảnh Báo, Bạn đang hơi bị béo  !!!");
                        ThongBao.setText("Béo mức độ nhẹ !!");
                        String stringdouble = Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=30&&bmi<=34.9){
                        SoSad.setText("Cảnh Báo, Bạn đang bị béo  !!!");
                        ThongBao.setText("Béo mức độ 1 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=35&&bmi<=39.9){
                        SoSad.setText("Cảnh Báo, Bạn béo quá  !!!");
                        ThongBao.setText("Béo mức độ 2 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }
                    else if (bmi>=40){
                        SoSad.setText("Cảnh Báo, Bạn béo vãi cả nồi  !!!");
                        ThongBao.setText("Béo mức độ 3 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }
                }else if(nu.isChecked()== true){
                    if (bmi<=18.5){
                        SoSad.setText("Chia Buồn !!!");
                        ThongBao.setText("Bạn có 1 cân nặng thấp gầy !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=18.5&&bmi<=22.9){
                        SoSad.setText("Chán Quá !!!");
                        ThongBao.setText("Bạn có 1 cân nặng bình thường !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi==23){
                        SoSad.setText("Cảnh Báo, Bạn đang bị thừa cân  !!!");
                        ThongBao.setText("Nên vận động nhiều hơn !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>23&&bmi<=24.9) {
                        SoSad.setText("Cảnh Báo, Bạn đang hơi bị béo  !!!");
                        ThongBao.setText("Béo mức độ nhẹ !!");
                        String stringdouble = Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=25&&bmi<=29.9){
                        SoSad.setText("Cảnh Báo, Bạn đang bị béo  !!!");
                        ThongBao.setText("Béo mức độ 1 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }else if (bmi>=30&&bmi<=39.9){
                        SoSad.setText("Cảnh Báo, Bạn béo quá  !!!");
                        ThongBao.setText("Béo mức độ 2 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }
                    else if (bmi>=40){
                        SoSad.setText("Cảnh Báo, Bạn béo vãi cả nồi  !!!");
                        ThongBao.setText("Béo mức độ 3 !!");
                        String stringdouble= Double.toString(bmi);
                        KetQua.setText(stringdouble);
                    }
                }
            }
        });
    }
}
