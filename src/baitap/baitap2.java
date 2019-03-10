package baitap;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args){
        int N,i,n1=0,n2=1,n3;
        Scanner nhap=new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua day fibonacci");

        N=nhap.nextInt();
        System.out.println("0");
        System.out.println(n1+n2);
        for (i=2;i<N;i++){
            n3=n2+n1;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
    }


}
