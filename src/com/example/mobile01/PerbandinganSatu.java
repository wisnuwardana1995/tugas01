package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PerbandinganSatu extends Activity {
	
	
	Button bt1;
	EditText et1, et2;
	TextView tvhasil;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perbandingan_pertama);
        
        bt1=(Button)findViewById(R.id.bt1);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tvhasil=(TextView)findViewById(R.id.tvhasil);
        
        bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int A = Integer.parseInt(et1.getText().toString());
				int B = Integer.parseInt(et2.getText().toString());
					if (A > B){
						tvhasil.setText("Anda Membandingkan dengan Input Pertama Lebih Besar Yaitu "+String.valueOf(A)+" Besar Dari Pada Input Kedua");
	            }
					else{
		                tvhasil.setText("Anda Membandingkan dengan Input Kedua Lebih Besar Yaitu "+String.valueOf(B)+" Besar Dari Pada Input Pertama");
		            }
			}
		});
        
    }

}



