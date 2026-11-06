/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoverloadingali;

/**
 *
 * @author Ax1
 */
public class JavaoverloadingAli {
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       masahatmoslas(12,5);
       masahatdayere(4);
       masahatmostatil(4,5);
       int[] numj={1,3,2,5};
       Sort(numj);
       for(int i=0;i<=numj.length-1;i++){
           System.out.println(numj[i]);
       }
    
    
    
    
    
    
    }
    public static void Sort(int[] num){
        
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j]>num[j+1]){
                    int nj=num[j];
                    num[j]=num[j+1];
                    num[j+1]=nj;
                }
            }
        }
    }
    public static void masahatmostatil(int n,int s){
        int result=n*s;
        System.out.println(result);
    }
    public static void masahatdayere(int s){
        double result=(s*s)*3.14;
        System.out.println(result);
    }
    public static void masahatmoslas(double b,double h){
        double result=(b*h)/2;
        System.out.println(result);
    }
}
