public class CountSort{
	public static int[] countSort(int[] a)
	{
		int max=a[0];//�ҳ��������ֵ
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)max=a[i];
		}
		int[] counts=new int[max+1];//��������������
		for(int i=0;i<a.length;i++)counts[a[i]]++;//����������������a[i]��ֵ����Ӧ���ݾ���a[i]���ִ���
		//���ؽ������
		int index=0;
		int[] result=new int[a.length];
		for(int i=0;i<counts.length;i++)//ÿ����������
			for(int j=0;j<counts[i];j++)//һ��һ��������������������Ӧ�����ǳ��ִ�������С����
				result[index++]=i;//i��jһ�� �ڲ�ѭ���Ǵ���������ǣ�������j
		return result;}
		static int[] a= {1,4,2,5,6,4,6,4};
	public static void main(String[] args) 
	{
			
			int[] result=CountSort.countSort(a);
			for(int i=0;i<a.length;i++)System.out.println(result[i]+"\n");
	}
	
}

