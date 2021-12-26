class BinarySearch
{
    int BinarySearch(int arr[], int x)
    {
        int l=0; int r=arr.length-1;
        while(r>=l)
        {
            int mid= l+(r-l)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
}