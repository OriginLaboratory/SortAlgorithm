public class QuickSort{
	public static void quickSort(int[] ins,int start,int end) {
		if(ins.length<=0||start<0||end>ins.length)
			return;//防止越界
		if(start>=end)return;//不能改成==因为如果左边第一个最小会出现怪事
		int i=start;//双指针排序
		int j=end;
		int x=ins[i];//记录基准值
		while(i<j) {
			while(i<j&&ins[j]>=x)j--;//找到比基准值小的数则退出循环，如果大则在右边不动
				ins[i]=ins[j];//此时右边  的比基准值小，交换i值此时开始左边的操作
			while(i<j&&ins[i]<=x)i++;
				ins[j]=ins[i];
		}
		ins[i]=x;//排完后基准值归到i=j处，此时这个值必已在其他地方被记录，因为指针不动的条件是值已经传给了另一边
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
