package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    Denem[] usrData;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        TextView textName = (TextView) findViewById(R.id.textViewName);

        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        text4 = (TextView) findViewById(R.id.textView4);
        text5 = (TextView) findViewById(R.id.textView5);
        Button button = (Button) findViewById(R.id.removebtn);
        EditText edit1 = (EditText) findViewById(R.id.edittext1);
        UserData usr=(UserData) this.getApplication();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edit1.getText().toString().length()!=0) {


                    usrData = usr.removeIndex(Integer.parseInt(edit1.getText().toString()));
                    index = usr.getIndex();
                    System.out.println(index);
                    System.out.println(usrData);
                    reset();
                    setText();
                }
            }
        });

        index = ((UserData) this.getApplication()).getIndex();
        usrData=((UserData) this.getApplication()).getList();
        textName.setText("Welcome!");
        setText();
    }
    public void reset(){
        text1.setText("");
        text2.setText("");
        text3.setText("");
        text4.setText("");
        text5.setText("");
    }
    public void setText(){
        if(index==0){
            text3.setText("No Appointments!");
        } else{
            if(index>0){
                text1.setText("1. "+usrData[0].getId()+" "+ usrData[0].getName()+ " "+usrData[0].getDay()+"/"+usrData[0].getMonth()+"/"+usrData[0].getYear()+"");
                if(index>1){
                    text2.setText("2. "+usrData[1].getName()+ " "+usrData[1].getDay()+"/"+usrData[1].getMonth()+"/"+usrData[1].getYear()+"");
                    if(index>2){
                        text3.setText("3. "+usrData[2].getName()+ " "+usrData[2].getDay()+"/"+usrData[2].getMonth()+"/"+usrData[2].getYear()+"");
                        if(index>3){
                            text4.setText("4. "+usrData[3].getName()+ " "+usrData[3].getDay()+"/"+usrData[3].getMonth()+"/"+usrData[3].getYear()+"");
                            if(index>4){
                                text5.setText("5. "+usrData[4].getName()+ " "+usrData[4].getDay()+"/"+usrData[4].getMonth()+"/"+usrData[4].getYear()+"");
                            }
                        }
                    }
                }
            }
        }
    }

}