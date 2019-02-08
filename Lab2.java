//Julian Jordan
// 1|19|18 LAB 2

import java.util.Scanner;

public class Lab2 {
    public Lab2() {
        main();
    }
//Varibles for Stirng input + public array     
    private static String s_inpt;
    private static String s_inpt2;
    private int i_inpt;
    static Scanner input = new Scanner(System.in);
    public static String[] firstnumber;
    public static int[] publicintarray;
    public static void main() {
        display();
        //System.out.println(s_inpt); - For testing
        //System.out.println(s_inpt.length()); - For testing
        math();
         
    }
    //Main text drop down
    public static void display(){
        System.out.println("Type in your first number");
        s_inpt = input.nextLine();
        
    }
    //Second Text Drop
    public static void display2() {
    	System.out.println("Type your second number");
    	s_inpt2 = input.nextLine();
    }
    //First Arra
    public static void math() {
    	int firstintarray[] = new int[s_inpt.length()];
        firstnumber = s_inpt.split("");        
        for(int i=0;i<s_inpt.length();i++) {            
            Integer x = Integer.parseInt(firstnumber[i]);	
            firstintarray[i] = x;
            System.out.println("|" + x + "|");
            
        }
        display2();
        int secondintarray[] = new int[s_inpt2.length()];
        firstnumber = s_inpt2.split("");        
        for(int i=0;i<s_inpt2.length();i++) {            
            Integer y = Integer.parseInt(firstnumber[i]);	
            secondintarray[i] = y;
            System.out.println("|" +y + "|");
        
            }
        if(firstintarray.length >= secondintarray.length) {
        	int difference = (firstintarray.length - secondintarray.length);
        	System.out.println(difference + " is the differnece");
        	
        	int sum = (difference + secondintarray.length);
            int balancearray[] = new int[sum];
            int total[] = new int[sum];
        	
        	System.out.println(sum + " is the sum");
            System.out.println("------------------");
                  	
        	
        	 for(int l=0; l!=difference; l++) {
        		 balancearray[l] = 0;
        		 System.out.println(balancearray[l]);
            }
            for(int i=difference,j = 0; i!=sum; i++,j++){
                balancearray[i] = secondintarray[j]; 
                System.out.println(balancearray[i]);

            }
            System.out.println("--------------");

            for(int k=0; k!=sum; k++){
            total[k] = firstintarray[k] + balancearray[k]; 
            System.out.println(total[k]);
            }   
            
                
        }else if(firstintarray.length <= secondintarray.length){
            int difference = (secondintarray.length - firstintarray.length);
        	System.out.println(difference + " is the differnece");
        	
        	int sum = (difference + firstintarray.length);
            int balancearray[] = new int[sum];
            int total[] = new int[sum];
        	
        	System.out.println(sum + " is the sum");
            System.out.println("------------------");
                  	
        	
        	 for(int l=0; l!=difference; l++) {
        		 balancearray[l] = 0;
        		 System.out.println(balancearray[l]);
            }
            for(int i=difference,j = 0; i!=sum; i++,j++){
                balancearray[i] = firstintarray[j]; 
                System.out.println(balancearray[i]);

            }
            System.out.println("--------------");

            for(int k=0; k!=sum; k++){
            int m;
            int n;
            total[k] = secondintarray[k] + balancearray[k];
            m = total[k];
            if(m >9) {
                n = (9%m);
                System.out.println(n);
            }else{
                System.out.println(total[k]);
            }
           ;
            }


        }

      
                       
        
            
    }

    
    
    public static void main(String[] args) {
        new Lab2();
    }

}
