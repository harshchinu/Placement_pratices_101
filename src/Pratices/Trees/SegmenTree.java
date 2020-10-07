package Pratices.Trees;

public class SegmenTree {
    public static void main(String[] args) {
        int arr[]={-1,2,4,0};

        int segment[] = new int[(int) (Math.pow(2,arr.length-1)-1)];

        System.out.println(segment.length);

        constructSegmentTree(arr,segment,0,arr.length-1,0);
        int min=queryonSegmentTree(segment,2,3,0,arr.length,0);
        System.out.println(min);
    }

    private static int queryonSegmentTree(int[] segment, int qlow, int qhigh, int low, int high, int pos) {

        if(qlow<=low && qhigh>=high){
            return segment[pos];
        }

        if(qlow>high || qhigh<low){
            return Integer.MAX_VALUE;
        }
        int mid = (low+high)/2;
        return Math.min(queryonSegmentTree(segment,qlow,qhigh,low,mid,pos*2+1),queryonSegmentTree(segment,qlow,qhigh,mid+1,high,pos*2+2));


    }

    private static void constructSegmentTree(int[] arr, int[] segment, int low, int high, int pos) {

        if(low==high){
            segment[pos]=arr[low];
            return;
        }

        int mid=(high+low)/2;

        constructSegmentTree(arr,segment,low,mid,2*pos+1);
        constructSegmentTree(arr,segment,mid+1,high,2*pos+2);
        segment[pos]=Math.min(segment[2*pos+1],segment[2*pos+2]);
    }
}
