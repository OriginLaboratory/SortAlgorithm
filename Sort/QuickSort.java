public class QuickSort{
	public static void quickSort(int[] ins,int start,int end) {
		if(ins.length<=0||start<0||end>ins.length)
			return;//��ֹԽ��
		if(start>=end)return;//���ܸĳ�==��Ϊ�����ߵ�һ����С����ֹ���
		int i=start;//˫ָ������
		int j=end;
		int x=ins[i];//��¼��׼ֵ
		while(i<j) {
			while(i<j&&ins[j]>=x)j--;//�ҵ��Ȼ�׼ֵС�������˳�ѭ��������������ұ߲���
				ins[i]=ins[j];//��ʱ�ұ�  �ıȻ�׼ֵС������iֵ��ʱ��ʼ��ߵĲ���
			while(i<j&&ins[i]<=x)i++;
				ins[j]=ins[i];
		}
		ins[i]=x;//������׼ֵ�鵽i=j������ʱ���ֵ�����������ط�����¼����Ϊָ�벻����������ֵ�Ѿ���������һ��
		quickSort(ins,start,i-1);
		quickSort(ins,j+1,end);
		return;
	}
	static int[] a= {1,23,1234,123,23,657,7,8,68,9,6,89,6,789,6,789,6,7,8,45,6,73,5};
	public static void main(String[] args) {
		QuickSort b=new QuickSort();
		b.quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)System.out.println(a[i]+"\n");}
}
