package com.example.myapplication;

import android.app.Application;

public class UserData extends Application {

    public Denem[] appList=new Denem[5];
    public int index=0;
    public Denem[] getList() {
        return appList;
    }
    public void putList(Denem data) {
        if(index==4)
            return;
        appList[index]=data;
        index++;
    }
    public int getIndex(){
        return index;
    }
    public Denem[] removeIndex(int ind){
        ind--;
        if(ind<=index) {
            Denem[] temp = new Denem[5];
            int val = 0;
            for (int i = 0; i < index; i++) {
                if (ind != i) {
                    temp[val] = appList[i];
                    val++;
                }
            }
            index=val;
            return temp;
        }
        return null;
    }
}
