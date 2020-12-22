
public class BubbleSort{
	 public static double[] bubbleSort(double[] array) {
		 int i=0;
		 int len=array.length;
		 double temp;
		 for(;i<len;i++)
			 for(int j=0;j<len-1-i;j++) {
				 if(array[j]>array[j+1])
				 {				
					 temp=array[j];
					 array[j]=array[j+1];
					array[j+1]=temp;		 
				 }
			 }
		 
		 return array;
	 }
	 public static void  main(String[] args) {
			double[] a=new double[]{5,4,3,2,1};
			BubbleSort h=new BubbleSort();
			double[] b=h.bubbleSort(a);
			int c=a.length;
			for(int i=0;i<c;i++)System.out.print(b[i]+"\t");
		}
}
