package com.company;

 import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MiniMuzaAplkWrsPlc mini = new MiniMuzaAplkWrsPlc();
        //if(args.length <2){
        //    System.out.println("NIe zapomnij podać argumentów określających instryment i nutę");
        //}else{
        Scanner sc = new Scanner(System.in);


        int instrument = sc.nextInt();
        int nuta = sc.nextInt();

        mini.graj(instrument, nuta);
    //}
    }
}
