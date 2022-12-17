class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    
    static long count=0;
    
    public static void merge(long[] arr,int left,int mid,int right){
        
        long[] l=new long[mid-left+1];
        long[] r=new long[right-mid];
        
        
        for(int i=left,k=0;i<=mid;i++)
        l[k++]=arr[i];
        
        for(int i=mid+1,k=0;i<=right;i++)
        r[k++]=arr[i];
        
        for(int i=0,j=0;i<l.length && j<r.length;i++){
            
            while(j<r.length && l[i]>r[j]){
                count+=l.length-i;
                j++;
            }
        }
        
        int k1=0,k2=0,k=left;
        
        while(k1<l.length && k2<r.length){
            
            if(l[k1]<r[k2])
            arr[k++]=l[k1++];
            
            else
            arr[k++]=r[k2++];
        }
        
        while(k1<l.length)
        arr[k++]=l[k1++];
        
        while(k2<r.length)
        arr[k++]=r[k2++];
        
    }
    
    public static void divide(long[] arr,int left,int right){
        
        if(left>=right)return;
        
        int mid=left+(right-left)/2;
        
        divide(arr,left,mid);
        divide(arr,mid+1,right);
        merge(arr,left,mid,right);
        
    }
    
    
    
    static long inversionCount(long arr[], long n)
    {
        // Your Code Here
        divide(arr,0,(int)n-1);
        long ans=count;
        count=0;
        return ans;
        
    }
}
