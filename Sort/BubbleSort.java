
public class BubbleSort{
	 public static double[] bubbleSort(double[] array) {
		 int i=0;
		 int len=array.length;
		 double temp;
		 for(;i<len-1;i++)//冒泡排序共需要排len-1次，因为最后一个自动排好
			 for(int j=0;j<len-1-i;j++) {
				 if(array[j]>array[j+1])//前一个与后一个比较，如果前一个大于后一个则交换，像泡泡一样每次把排序列里最大的放到最右端
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
