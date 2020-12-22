public class CountSort{
	public static int[] countSort(int[] a)
	{
		int max=a[0];//找出数组最大值
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)max=a[i];
		}
		int[] counts=new int[max+1];//建立计数的数组
		for(int i=0;i<a.length;i++)counts[a[i]]++;//计数数组索引就是a[i]的值，对应数据就是a[i]出现次数
		//返回结果数组
		int index=0;
		int[] result=new int[a.length];
		for(int i=0;i<counts.length;i++)//每个重新输入
			for(int j=0;j<counts[i];j++)//一个一个打，索引是数，索引对应数据是出现次数，从小到大
				result[index++]=i;//i和j一样 内层循环是次数，外层是！遍历到j
		return result;}
		static int[] a= {1,4,2,5,6,4,6,4};
	public static void main(String[] args) 
	{
			
			int[] result=CountSort.countSort(a);
			for(int i=0;i<a.length;i++)System.out.println(result[i]+"\n");
	}
	
}

