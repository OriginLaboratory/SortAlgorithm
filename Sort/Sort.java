public class Sort {
    public static int[] insertSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int insertIndex = i;//准备插入的起始点
            int insertValue =arr[i];//准备插入的值
            while(insertIndex>0&&insertValue<arr[insertIndex-1])//>0是指如果到0都没有可以插的，则说明不用动,如果插入的值比前一个小，则往后挪一位，指针往前指一位,若index=1且比零小，则0赋值给1 index指向零退出若大于等于零则在比较-1越界
            {
                arr[insertIndex]=arr[insertIndex-1];
                insertIndex--;
            }
            arr[insertIndex]=insertValue;    
        }
        return arr;
    }
    public static int[] ShellSort(int[] arr){
        for(int gap=arr.length/2;gap>0;gap/=2)//步长为arr.length/2，依次递减
            for(int i=gap;i<arr.length;i++)//同插入排序，步长增大
            {
                int insertIndex=i;
                int insertValue=arr[i];
                while(insertIndex-gap>=0&&insertValue<arr[insertIndex-gap]){
                    arr[insertIndex]=arr[insertIndex-gap];
                    insertIndex-=gap;
                }
                arr[insertIndex]=insertValue;
            }
        return arr;
    }
    public static int[] SelectSort(int[] arr){
        for(int j=0;j<arr.length;j++){
            int min=j;//不能只比较值，要交换
            for(int i=j;i<arr.length;i++){
                if(arr[i]<arr[min])min=i;
            }
            int temp=arr[min];
            arr[min]=arr[j];
            arr[j]=temp;
        }
        return arr;
    }
    public static void QSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int i=left;
        int j=right;
        while(i<j){
            while(i<j&&arr[j]>=arr[left])j--;
            while(i<j&&arr[i]<=arr[left])i++;
            if(i==j){//当i=j时一定有arr[i]<=arr[left] 可以多试试算 
                int temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                }
            else{
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        Sort.QSort(arr,left,i-1);
        Sort.QSort(arr,j+1,right);
    }
    public static int[] BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        return arr;
    }
    
     public static void main(String[] args){
        int[] a={1,2,3,4,5,5,66,345,2,451,41,234};
        int[] b=Sort.BubbleSort(a);
        for(int i=0;i<a.length;i++)System.out.println(b[i]+"\n");
    }
}
