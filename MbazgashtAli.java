/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mbazgashtali;

/**
 *
 * @author Ax1
 */
public class MbazgashtAli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        noz(10);
        tavan(2,3);
        fibo(13);
        String fv=binary(15);
        System.out.println();
        System.out.print(fv);
        System.out.println();
        int[] opse={1,2,3,5,5,6};
        int[] result=delt(opse);
        for(int i=0;i<opse.length;i++){
            System.out.print(i+" ");
        }
        
    }
    public static void noz(int n){
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
    public static void fibo(int n){
      
        int first=0;
        int secound=1;
        int c;
        System.out.print(first+" "+secound);
        for(int i=1;i<n;i++){
            c=first+secound;
            first=secound;
            secound=c;
            System.out.print("  "+first+" ");            
        }    
    }
    public static int[] delt(int[] num){
        int[] temp=new int[num.length-1];
        int ct=0;
        
        
        for(int i=0;i<=num.length-1;i++){
            int j;
                for( j=0;j<ct;j++){
                    if(num[i]==temp[j]){
                        break;
                    }
                }
                if(j==ct){
                    temp[ct]=num[i];
                    ct++;
                }
            
        
        }
    int[]  result=new int[ct];
    for(int i=0;i<ct;i++){
        result[i]=temp[i];
    
    }
    return result;
    }
    public static String binary(int n){
        String result="";
        if(n>=256){
            n=n-256;
             result=result+"1";
        }
        else{
            result=result+"0";
        }
        
        if(n>=128){
            n=n-128;
            result=result+"1";
            
        }
        else{
            result=result+"0";
        }
        if(n>=64){
            n=n-64;
            result=result+"1";
        }
        else{
            result=result+"0";
        }
        if(n>=32){
            n=n-32;
            result=result+"1";
        }
        else{
            result=result+"0";
        }
        if(n>=16){
            n=n-16;
            result=result+"1";
        }
        else{
            result=result+"0";
        }
        if(n>=8){
            n=n-8;
            result=result+"1";
        }
        else{
            result=result+"0";
        }
        if(n>=4){
            n=n-4;
           result=result+"1"; 
        }
        else{
            result=result+"0";
        }
        if(n>=2){
            n=n-2;
           result=result+"1"; 
        }
        else{
            result=result+"0";
        }
        if(n>=1){
            n=n-1;
            result=result+"1";
        }
        else{
            result=result+"0";
        }
        return result;
    }
    public static void tavan(int base,int tavan){
        int result=1;
        for(int i=1;i<=tavan;i++){
        result=result*base;
                
        }
    System.out.println(result);
    }
}
