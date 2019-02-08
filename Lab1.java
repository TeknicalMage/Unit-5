//Julian Jordan Unit 5 Lab1
import java.util.Scanner;

public class Lab1 {
	public Lab1() {
		test();
	}
	
	public static void test() {
		System.out.print("Type 10 values. Then Press A for overall Average or B for top 2 Average");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		double g = input.nextDouble();
		double h = input.nextDouble();
		double i = input.nextDouble();
		double j = input.nextDouble();
		
		double set[]= {a,b,c,d,e,f,g,h,i,j};
		
		System.out.println("Seperator");
		Scanner input1 = new Scanner(System.in);
		String ift = input1.nextLine();
		if(ift.equals("A")) {
			int l =set.length;
			int k = 0;
			
			for(int m=0;m!=l;m++) {
				h += set[m];	
			}
			double average = h/l;
			System.out.println(average);
		}else if(ift.equals("B")) {
			double max = 0;
			double smax = 0;
			int l =set.length;
			for(int t = 0;t!=l;t++) {
				if(set[t] > max) {
					if(max < set[t]) {
					max = set[t];
					}
				}
				
			}
			for(int t = 0;t!=l;t++) {
				if(set[t] > smax && set[t] < max ) {	
					if(smax < set[t]) {
					smax = set[t];
					}
				}
				
			}
			System.out.println("The first largest number is " + max);
			System.out.println("The second largest number is " + smax);
			System.out.println("The average of the two numbers are " + (max+smax)/2);
		}else {
			test();
		}
		
	
		
		
		
	}
	
	public static void averages() {
		
	}

	public static void main(String[] args) {
		new Lab1();
	}

}
