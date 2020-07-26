package com.demo.mavendemo.util;

public class AdditionProgram {
    public int sum(int... a){
        int sum=1;                      //right logic, sum=0;
        if(a.length==1){
            return a[0];
        }else if (a.length>1){
            for(int i=0;i<a.length;i++){
                sum=sum*a[i];           //right logic, sum=sum+a[i];
            }
            return sum;
        }
        else
        {
            return sum;
        }
    }
}
