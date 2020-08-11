package Data_Structures.sorting;

public class Sorting
{
    private int arr[];

    Sorting(int arr[])
    {
        this.arr = arr;
    }

    private void swap(int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    void selectionsort()
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    void bubblesort()
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1);
                }
            }
        }
    }

    void mergesort(int l,int r)
    {
        if(l<r)
        {
            int m = (l+r)/2;
            mergesort(l,m);
            mergesort(m+1,r);
            merge(l,m,r);
        }
    }

    void merge(int l,int m,int r)
    {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++)
        {
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++)
        {
            R[j] = arr[m+1+j];
        }

        int i=0;
        int j=0;

        int k=l;
        while(i<n1 && j<n2)
        {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
