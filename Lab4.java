import java.util.Scanner;



public class Lab4 {
	public static Lab4Intake drv =new Lab4Intake();
	public static int count;
	
    public Lab4() {
        main();
    }
    static Scanner input = new Scanner(System.in);
    
    public static void main() {
      drv.main();
      math();
    }
    
    public static void math() {
    	for(int i=0;i!=4;i++) {
    		for (int j=0;j!=4;j++) {
    			if(drv.matrix[i][j] > drv.m2[i][j]) {
    				count++;
    			}
    		}
     	}
    	System.out.println("");
    	if(count<8) {
    		System.out.print("Matrix 2 would cover");
    	}else {
    		System.out.print("Matrix 1 would cover");
    	}
    for(int i=0;i!=4;i++) {
		for (int j=0;j!=4;j++) {
			if(drv.m3[i][j] > drv.m4[i][j]) {
				count++;
			}
		}
 	}
    System.out.println("");
	if(count<8) {
		System.out.print("Matrix 4 would cover");
	}else {
		System.out.print("Matrix 3 would cover");
	}
}

    
    public static void main(String[] args) {
        new Lab4();
    }

}
