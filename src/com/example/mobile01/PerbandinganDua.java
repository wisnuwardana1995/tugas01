package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerbandinganDua extends Activity{
	
	 
			EditText et1, et2, et3;
		    Button bt1;
		    TextView tvhasil;
			
			@Override
		    protected void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.activity_perbandingan_dua);
		        et1=(EditText)findViewById(R.id.et1);
		        et2=(EditText)findViewById(R.id.et2);
		        et3=(EditText)findViewById(R.id.et3);
		        bt1=(Button)findViewById(R.id.bt1);
		        tvhasil=(TextView)findViewById(R.id.tvhasil);
			
		        bt1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						int input1 = Integer.parseInt(et1.getText().toString());
		                int input2 = Integer.parseInt(et2.getText().toString());
		                int input3 = Integer.parseInt(et3.getText().toString());
		                
		                if (input1 > input2 && input1 > input3){
		                    tvhasil.setText("Input Pertama Lebih Besar Yaitu "+String.valueOf(input1)+ " Dari Pada Input Ke Dua "+String.valueOf(input2)+" Dan Input Yang Ke Tiga " +String.valueOf(input3));
		                }

		                else if (input2 > input1 && input2 > input3){
		                    tvhasil.setText("Input Kedua Lebih Besar Yaitu "+String.valueOf(input2)+ " Dari Pada Input Pertama "+String.valueOf(input1)+" Dan Input Yang Ke Tiga " +String.valueOf(input3));
		                }

		                else if (input3 > input1 && input3 > input2){
		                    tvhasil.setText("Input Ke Tiga Lebih Besar Yaitu "+String.valueOf(input3)+ " Dari Pada Input Pertama "+String.valueOf(input1)+" Dan Input Yang Ke Dua " +String.valueOf(input2));
		                }

		                else if (input1 == input2 && input1 > input3){
		                    tvhasil.setText("Input Pertama Sama Besar Yaitu "+String.valueOf(input1)+ " Kemudian Pada Input Dua Sama Besar "+String.valueOf(input2)+" Dan Input Yang Ke Tiga Lebih Kecil Dari Satu Dan Dua " +String.valueOf(input3));
		                }

		                else  if (input1 == input3 && input1 >  input2 ){
		                    tvhasil.setText("Input Pertama Sama Besar Yaitu "+String.valueOf(input1)+ " Kemudaian Pada Input Tiga Sama Besar "+String.valueOf(input3)+" Dan Input Yang Ke Dua Lebih Kecil Dari Satu Dan Tiga " +String.valueOf(input2));
		                }

		                else if (input2 == input1 && input2 > input3){
		                    tvhasil.setText("Input Kedua Sama Besar Yaitu "+String.valueOf(input2)+ " Kemudian Pada Input Pertama Sama Besar "+String.valueOf(input1)+" Dan Input Yang Ke Tiga Lebih Kecil Dari Dua Dan Satu " +String.valueOf(input3));
		                }

		                else if (input2 == input3 && input2 > input3){
		                    tvhasil.setText("Input Kedua Sama Besar Yaitu "+String.valueOf(input2)+ " Kemudian Pada Input Ke Tiga Sama Besar "+String.valueOf(input3)+" Dan Input Yang Pertama Lebih Kecil Dari Dua Dan Tiga " +String.valueOf(input1));
		                }

		                else if (input3 == input1 && input3 > input2){
		                    tvhasil.setText("Input Ke Tiga Sama Besar Yaitu "+String.valueOf(input3)+ " Kemudian Pada Input Pertama Sama Besar "+String.valueOf(input1)+" Dan Input Yang Ke Dua Lebih Kecil Dari Ke Tiga Dan Pertama " +String.valueOf(input2));
		                }

		                else if (input3 == input2 && input3 > input1){
		                    tvhasil.setText("Input Ke Tiga Sama Besar Yaitu "+String.valueOf(input3)+ " Kemudian Pada Input Kedua "+String.valueOf(input2)+" Dan Input Yang Ke Pertama Lebih Kecil Dari Ke Tiga Dan Dua " +String.valueOf(input1));
		                }

		                else{
		                    tvhasil.setText("Input Pertama Sama Besar Yaitu "+String.valueOf(input1)+ " Kemudian Pada Input Kedua Sama Besar "+String.valueOf(input2)+" Dan Input Yang Ke Sama Besar " +String.valueOf(input3));
		                }
					}
				});
			
			}
}



