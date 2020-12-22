public class InsertSort{
	int[] insertsort(int[] a) 
	{
		int i,j;//j用来遍历，i作为排序和未排序的分界
		
		
		for(i=0;i<a.length;i++) 
		{
			int temp=a[i];
			j=i;
			 while(j>0) //找到插入点，并将之前的往前移
			 	{
				 if(temp<a[j-1]) 
				 	 {
					 a[j]=a[j-1]; //往后填充，一个存后面一个
					 }
				 else 
				 	{
					 break;	
				 	}
				 j--;
			 	}
			 a[j]=temp;
		}
	return a;
	}
	public static void main(String[] args) 
	{
		InsertSort h=new InsertSort();
		int[] b= {12,1341,5,245,24,5,124,5,12};
		int[] a=h.insertsort(b);
		for(int p :a)System.out.println(p);
	}
	
}
