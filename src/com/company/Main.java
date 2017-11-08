package com.company;



public class Main {

    public static void main(String[] args) {
        // write your code here
        MiniMuzaAplkWrsPlc mini = new MiniMuzaAplkWrsPlc();
        //if(args.length <2){
        //    System.out.println("NIe zapomnij podać argumentów określających instryment i nutę");

        //}else{
       // int instrument = Integer.parseInt(args[0]);
        //int nuta = Integer.parseInt(args[1]);
        //mini.graj(instrument, nuta);
        mini.graj(44,44);

    }
}
