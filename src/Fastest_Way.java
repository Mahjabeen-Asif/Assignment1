import java.io.*;


public class Fastest_Way {

	public int fastest_way(int a1[],int a2[],int t1[],int t2[],int e1, int e2, int x1, int x2, int n){

	int f1[]=new int [n];
	int f2[]=new int [n];
	
	int i1[]=new int [n];
	int i2[]=new int [n];
	
	int i=0;
	int f=0;
	f1[0]= e1 +a1[0];
	f2[0]= e2 +a2[0];
		
		for(int j=1;j<n;j++){
			if((f1[j-1] + a1[j]) <= (f2[j-1] + t2[j-1] + a1[j])){
				f1[j]=f1[j-1]+a1[j];
				i1[j]=1;
				/*System.out.println("shortest time at stations of assembly line f1 are:");
				System.out.println("f1[j]"+f1[j]);
				System.out.println("\n");
				System.out.println("shortest path at assembly line l1 is:");
				System.out.println(i1[j]);*/
			}
			else{
				f1[j] = f2[j-1] + t2[j-1] + a1[j];
				i1[j]=2;
				/*System.out.println("shortest time at stations of assembly line f1 are:");
				System.out.println("f1[j]"+f1[j]);
				System.out.println("\n");
				System.out.println("shortest path at assembly line l1 is:");
				System.out.println(i1[j]);*/
			}
			if(f2[j-1] + a2[j] <= f1[j-1] + t1[j-1] + a2[j]){
				f2[j]=f2[j-1]+a2[j];
				i2[j]=2;
				/*System.out.println("if wala f2[j]"+f2[j]);
				System.out.println("\n");
				System.out.println("shortest path at assembly line l2 is:");
				System.out.println(i2[j]);*/
			}
			else{
				f2[j] = f1[j-1] + t1[j-1] + a2[j];
				i1[j]=1;
				/*System.out.println("else wala f2[j]"+f2[j]);
				System.out.println("\n");
				System.out.println("shortest path at assembly line l1 is:");
				System.out.println(i1[j]);*/
			}
			
		
		
		//for(j=2;j<n;j++){
			if((f1[n-1]+x1)<=(f2[n-1]+x2)){
				f=f1[n-1]+x1;
				i=1;
				System.out.println("shortest distance: "+f);
			}
			else{
				f=f2[n]+x2;
				i=2;
				System.out.println("shortest distance is "+f);
			}
			
			for(int k=1;k<n;k++){
				
				if(i==1){
					System.out.println("station "+k+ " at line "+i1[k]+"\n");
				}
				else
					System.out.println("station "+k+ " at line \n"+i2[k]+"\n");
			}
			
		}
		return f;

}
}

