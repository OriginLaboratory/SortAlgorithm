public class SelectSort
{
	public static double[] selectSort(double[] array) 
	{
		for(int i=0;i<array.length;i++)
			{
				int minindex=i,j;
				for( j=i;j<array.length;j++) 
				{
					if(array[j]<array[minindex]) //遍历该组找到最小的数
					minindex=j;
				}//完成未排序的一轮后minindex变成了未排序数中最小的一个的下标值
				double temp=array[i];
				array[i]=array[minindex];
				array[minindex]=temp;//将排好的换到已排序的那一组。i为分界点
			}
		return array;
	}
	public static void main(String[] args) 
	{
		double[] a= {1,2,3,45,6,6,7,8};
		SelectSort b= new SelectSort();
		double[] c=b.selectSort(a);
		for(int i=0;i<a.length;i++)System.out.print(c[i]+"\t");
	}
}
