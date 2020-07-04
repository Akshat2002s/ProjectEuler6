import java.util.*;
public class Natural {

	public static void main(String[] args) {
		int sum=0;
		int sumsq=0;
		int sumsq2=0;
		int finl=0;
		for(int i=0; i<101; i++) {
			sum= sum+i;
		}
		sumsq=sum*sum;
		System.out.println(sumsq);
		
		for(int j=0; j<101;j++) {
			sumsq2+= j*j;
		}
		System.out.println(sumsq2);
		finl= sumsq-sumsq2;
		System.out.println(finl);

	}

}
