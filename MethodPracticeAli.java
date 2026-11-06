/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodpracticeali;

/**
 *
 * @author Ax1
 */
public class MethodPracticeAli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mk=Numa(12,13);
        System.out.println(mk);
        String mk1=word(5,"ALISS");
        String mk2=word(6,"ALi");
        System.out.println(mk1);
        System.out.println(mk2);
        String mk3=word1("ALi",3,2);
        System.out.println(mk3);
        String mk4=word2("ALI","Iman",5);
        System.out.println(mk4);
        
        
    }
    public static String Numa(int a,int b){
        return a+""+b;
    }
    public static String word(int x,String a){
        String os="";
        if(x>a.length()){
             os=""+x;
        }
        else if(x<=a.length()){
             os= a.charAt(0)+" JAVA";
        }
        return os;
    
    }
    public static String word1 (String a,int x,int y){
        String sk="";
        if(x>a.length() || y>a.length() || x>y){
             sk="";
        }
        else{
            for(int i=x-1;i<y;i++){
             sk+=sk.charAt(i);
            }
        }
       return sk;
    }  
    public static String word2(String a,String b,int x){ 
       String hhc="";
        if(x>a.length()||x>b.length()){
         hhc="false"; 
        }
        else{
            hhc=a.charAt(x)+" "+b.charAt(x)+" "+"true";
            
        }
         return hhc; 

       }
}
