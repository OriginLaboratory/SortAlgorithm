public class InsertSort{
	int[] insertsort(int[] a) 
	{
		int i,j;//j����������i��Ϊ�����δ����ķֽ�
		
		
		for(i=0;i<a.length;i++) 
		{
			int temp=a[i];
			j=i;
			 while(j>0) //�ҵ�����㣬����֮ǰ����ǰ��
			 	{
				 if(temp<a[j-1]) 
				 	 {
					 a[j]=a[j-1]; //������䣬һ�������һ��
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
