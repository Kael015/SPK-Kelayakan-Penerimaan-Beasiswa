/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beasiswa;

import java.util.Scanner;

/**
 *
 * @author Yehez
 */
public class Fuzzy {
    //variable
    int semester,nilai,Prestasi;
    
    //penghitungan fuzzy
    public static double semesterKurang(double x){
        double myu;
        if(x<=2) {
            myu=1;
        }
        else if(x>=6){
            myu=0;
        }
        else{
            myu = (6-x)/4;
        }
        return myu;
        
    }

    public static double semesterCukup(double x){
        double myu = 0;
        if(x<=4) myu=0;
        else if(x>=8) myu=0;
        else if(x==6)myu=1;
        else if(x<6 && x>4){
            myu = (x-4)/2;
        }
        else if(x>6 && x<8){
            myu = (8-x)/2;
        }
        return myu;
    }
    
    public static double semesterLebih(double x){
        double myu;
        if(x<=6) myu=0;
        else if(x>=10) myu=1;
        else{
            myu = (x-6)/4;
        }
        return myu;
    }
    
    public static double NilaiSangatKurang(double x){
        double myu;
        if(x<=20) {
            myu=1;
        }
        else if(x>=60){
            myu=0;
        }
        else{
            myu = (60-x)/40;
        }
        return myu;
    }
    
    public static double NilaiKurang(double x){
        double myu = 0;
        if(x<=40) myu=0;
        else if(x>=80) myu=0;
        else if(x==60)myu=1;
        else if(x<60 && x>40){
            myu = (x-40)/20;
        }
        else if(x>60 && x<80){
            myu = (80-x)/20;
        }
        return myu;
    }
    
    public static double NilaiCukup(double x){
        double myu = 0;
        if(x<=60) myu=0;
        else if(x>=100) myu=0;
        else if(x==80)myu=1;
        else if(x<80 && x>60){
            myu = (x-60)/20;
        }
        else if(x>80 && x<100){
            myu = (100-x)/20;
        }
        return myu;
    }
    
    public static double NilaiLebih(double x){
        double myu;
        if(x<=80) myu=0;
        else if(x>=100) myu=1;
        else{
            myu = (x-80)/20;
        }
        return myu;
    }
    
    public static double PrestasiKurang(double x){
        double myu;
        if(x<=2) {
            myu=1;
        }
        else if(x>=6){
            myu=0;
        }
        else{
            myu = (6-x)/4;
        }
        return myu;
    }
    
    public static double PrestasiCukup(double x){
        double myu = 0;
        if(x<=4) myu=0;
        else if(x>=8) myu=0;
        else if(x==6)myu=1;
        else if(x<6 && x>4){
            myu = (x-4)/2;
        }
        else if(x>6 && x<8){
            myu = (8-x)/2;
        }
        return myu;
    }
    
    public static double PrestasiBagus(double x){
        double myu = 0;
        if(x<=6) myu=0;
        else if(x>=10) myu=0;
        else if(x==8)myu=1;
        else if(x<8 && x>6){
            myu = (x-6)/2;
        }
        else if(x>8 && x<10){
            myu = (10-x)/2;
        }
        return myu;
    }
    
    public static double PrestasiSangatBagus(double x){
        double myu;
        if(x<=8) myu=0;
        else if(x>=10) myu=1;
        else{
            myu = (x-8)/2;
        }
        return myu;
    }
    
    //defuzzy
    public static double BeasiswaTidakDapatDiberikan(double myu){
        double z;
        z = ((60*myu)-80)/-1;
        return z;
    }
    
    public static double BeasiswaDapatDiberikan(double myu){
        double z;
        z = (60*myu)+20;
        return z;
    }

    public static double min(double a, double b){
        double min;
        min = Math.min(a,b);
        return min;
    }

    public static void main(String[] args) {
        
    }
       //penampung hasil fuzzy
        public double hitunghasil (double semester, double nilai, double Prestasi){
        double myusemesterKurang, myusemesterCukup, myusemesterLebih,
                myunilaiSangatKurang, myunilaiKurang, myunilaiCukup,
                myunilaiLebih, myuPrestasiKurang, myuPrestasiCukup,
                myuPrestasiBagus, myuPrestasiSangatBagus, myuBeasiswaTidakDapatDiberikan, myuBeasiswaDapatDiberikan;    
        
        myusemesterKurang = semesterKurang(semester);
        myusemesterCukup = semesterCukup(semester);
        myusemesterLebih = semesterLebih(semester);
        myunilaiSangatKurang = NilaiSangatKurang(nilai);
        myunilaiKurang = NilaiKurang(nilai);
        myunilaiCukup = NilaiCukup(nilai);
        myunilaiLebih = NilaiLebih(nilai);
        myuPrestasiKurang = PrestasiKurang(Prestasi);
        myuPrestasiCukup = PrestasiCukup(Prestasi);
        myuPrestasiBagus = PrestasiBagus(Prestasi);
        myuPrestasiSangatBagus = PrestasiSangatBagus(Prestasi);
        
        //rule
        double apred1 = min(myusemesterKurang,myunilaiLebih);
        System.out.println("apred 1 = "+apred1);
        double apred2 = min(myusemesterKurang,myunilaiCukup);
        System.out.println("apred 2 = "+apred2);
        double apred3 = min(myusemesterKurang,myunilaiKurang);
        System.out.println("apred 3 = "+apred3);
        double apred4 = min(myusemesterKurang,myunilaiSangatKurang);
        System.out.println("apred 4 = "+apred4);
        double apred5 = min(myusemesterCukup,myunilaiLebih);
        System.out.println("apred 5 = "+apred5);
        double apred6 = min(myusemesterCukup,myunilaiCukup);
        System.out.println("apred 6 = "+apred6);
        double apred7 = min(myusemesterCukup,myunilaiKurang);
        System.out.println("apred 7 = "+apred7);
        double apred8 = min(myusemesterCukup,myunilaiSangatKurang);
        System.out.println("apred 8 = "+apred8);
        double apred9 = min(myusemesterLebih,myunilaiLebih);
        System.out.println("apred 9 = "+apred9);
        double apred10 = min(myusemesterLebih,myunilaiCukup);
        System.out.println("apred 10 = "+apred10);
        double apred11 = min(myusemesterLebih,myunilaiKurang);
        System.out.println("apred 11 = "+apred11);
        double apred12 = min(myusemesterLebih,myunilaiSangatKurang);
        System.out.println("apred 12 = "+apred12);
        double apred13 = min(myusemesterKurang,myuPrestasiSangatBagus);
        System.out.println("apred 13 = "+apred13);
        double apred14 = min(myusemesterKurang,myuPrestasiBagus);
        System.out.println("apred 14 = "+apred14);
        double apred15 = min(myusemesterKurang,myuPrestasiCukup);
        System.out.println("apred 15 = "+apred15);
        double apred16 = min(myusemesterKurang,myuPrestasiKurang);
        System.out.println("apred 16 = "+apred16);
        double apred17 = min(myusemesterCukup,myuPrestasiSangatBagus);
        System.out.println("apred 17 = "+apred17);
        double apred18 = min(myusemesterCukup,myuPrestasiBagus);
        System.out.println("apred 18 = "+apred18);
        double apred19 = min(myusemesterCukup,myuPrestasiCukup);
        System.out.println("apred 19 = "+apred19);
        double apred20 = min(myusemesterCukup,myuPrestasiKurang);
        System.out.println("apred 20 = "+apred20);
        double apred21 = min(myusemesterLebih,myuPrestasiSangatBagus);
        System.out.println("apred 21 = "+apred21);
        double apred22 = min(myusemesterLebih,myuPrestasiBagus);
        System.out.println("apred 22 = "+apred22);
        double apred23 = min(myusemesterLebih,myuPrestasiCukup);
        System.out.println("apred 23 = "+apred23);
        double apred24 = min(myusemesterLebih,myuPrestasiKurang);
        System.out.println("apred 24 = "+apred24);
        double apred25 = min(myuPrestasiSangatBagus,myunilaiLebih);
        System.out.println("apred 25 = "+apred25);
        double apred26 = min(myuPrestasiSangatBagus,myunilaiCukup);
        System.out.println("apred 26 = "+apred26);
        double apred27 = min(myuPrestasiSangatBagus,myunilaiKurang);
        System.out.println("apred 27 = "+apred27);
        double apred28 = min(myuPrestasiSangatBagus,myunilaiSangatKurang);
        System.out.println("apred 28 = "+apred28);
        double apred29 = min(myuPrestasiBagus,myunilaiLebih);
        System.out.println("apred 29 = "+apred29);
        double apred30 = min(myuPrestasiBagus,myunilaiCukup);
        System.out.println("apred 30 = "+apred30);
        double apred31 = min(myuPrestasiBagus,myunilaiKurang);
        System.out.println("apred 31 = "+apred31);
        double apred32 = min(myuPrestasiBagus,myunilaiSangatKurang);
        System.out.println("apred 32 = "+apred32);
        System.out.println("\n");
        double z1 = BeasiswaDapatDiberikan(apred1);System.out.println("Z1 = "+z1);
        double z2 = BeasiswaDapatDiberikan(apred2);System.out.println("Z2 = "+z2);
        double z3 = BeasiswaTidakDapatDiberikan(apred3);System.out.println("Z3 = "+z3);
        double z4 = BeasiswaTidakDapatDiberikan(apred4);System.out.println("Z4 = "+z4);
        double z5 = BeasiswaDapatDiberikan(apred5);System.out.println("Z5 = "+z5);
        double z6 = BeasiswaDapatDiberikan(apred6);System.out.println("Z6 = "+z6);
        double z7 = BeasiswaTidakDapatDiberikan(apred7);System.out.println("Z7 = "+z7);
        double z8 = BeasiswaTidakDapatDiberikan(apred8);System.out.println("Z8 = "+z8);
        double z9 = BeasiswaDapatDiberikan(apred9);System.out.println("Z9 = "+z9);
        double z10 = BeasiswaDapatDiberikan(apred10);System.out.println("Z10 = "+z10);
        double z11 = BeasiswaDapatDiberikan(apred11);System.out.println("Z11 = "+z11);
        double z12 = BeasiswaTidakDapatDiberikan(apred12);System.out.println("Z12 = "+z12);
        double z13 = BeasiswaDapatDiberikan(apred13);System.out.println("Z13 = "+z13);
        double z14 = BeasiswaDapatDiberikan(apred14);System.out.println("Z14 = "+z14);
        double z15 = BeasiswaDapatDiberikan(apred15);System.out.println("Z15 = "+z15);
        double z16 = BeasiswaTidakDapatDiberikan(apred16);System.out.println("Z16 = "+z16);
        double z17 = BeasiswaDapatDiberikan(apred17);System.out.println("Z17 = "+z17);
        double z18 = BeasiswaDapatDiberikan(apred18);System.out.println("Z18 = "+z18);
        double z19 = BeasiswaDapatDiberikan(apred19);System.out.println("Z19 = "+z19);
        double z20 = BeasiswaTidakDapatDiberikan(apred20);System.out.println("Z20 = "+z20);
        double z21 = BeasiswaDapatDiberikan(apred21);System.out.println("Z21 = "+z21);
        double z22 = BeasiswaDapatDiberikan(apred22);System.out.println("Z22 = "+z22);
        double z23 = BeasiswaDapatDiberikan(apred23);System.out.println("Z23 = "+z23);
        double z24 = BeasiswaTidakDapatDiberikan(apred24);System.out.println("Z24 = "+z24);
        double z25 = BeasiswaDapatDiberikan(apred25);System.out.println("Z25 = "+z25);
        double z26 = BeasiswaDapatDiberikan(apred26);System.out.println("Z26 = "+z26);
        double z27 = BeasiswaTidakDapatDiberikan(apred27);System.out.println("Z27 = "+z27);
        double z28 = BeasiswaTidakDapatDiberikan(apred28);System.out.println("Z28 = "+z28);
        double z29 = BeasiswaDapatDiberikan(apred29);System.out.println("Z29 = "+z29);
        double z30 = BeasiswaDapatDiberikan(apred30);System.out.println("Z30 = "+z30);
        double z31 = BeasiswaDapatDiberikan(apred31);System.out.println("Z31 = "+z31);
        double z32 = BeasiswaDapatDiberikan(apred32);System.out.println("Z32 = "+z32);
        System.out.println("\n");
        
        //penghitungan hasil defuzzy
        double zTot = ((apred1*z1)+(apred2*z2)+(apred3*z3)+(apred4*z4)
                +(apred5*z5)+(apred6*z6)+(apred7*z7)+(apred8*z8)+(apred9*z9)
                +(apred10*z10)+(apred11*z11)+(apred12*z12)+(apred13*z13)+(apred14*z14)
                +(apred15*z15)+(apred16*z16)+(apred17*z17)+(apred18*z18)+(apred19*z19)
                +(apred20*z20)+(apred21*z21)+(apred22*z22)+(apred23*z23)+(apred24*z24)
                +(apred25*z25)+(apred26*z26)+(apred27*z27)+(apred28*z28)+(apred29*z29)
                +(apred30*z30)+(apred31*z31)+(apred32*z32))/(apred1+apred2+apred3+apred4
                +apred5+apred6+apred7+apred8+apred9+apred10+apred11+apred12
                +apred13+apred14+apred15+apred16+apred17+apred18+apred19+apred20
                +apred21+apred22+apred23+apred24+apred25+apred26+apred27+apred28
                +apred29+apred30+apred31+apred32);System.out.println("Z Total = "+zTot);
        
            
        return zTot;  
    } 
}
