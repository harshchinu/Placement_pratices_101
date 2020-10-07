package Pratices.Arrays;

public class Array {

    int arr[];
    Array(int size) {
        this.arr=new int[size];

    }
    public static void main(String[] args) {
        Array array = new Array(6);
        /*array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);*/
        array.add(10);
        array.add(100);
        array.add(50);
        array.add(1100);
        array.add(101);
        array.add(100);

        //array.insert(5,7);
        //array.delete(7);
        //array.deleteshift(2);
        //array.search(2);
        /*array.get(2);
        array.set(2,4);*/
      //  array.max();
        //array.min();
       // array.reverse();
       //array.binarySearch(0,array.arr.length-1,4);
        array.isSorted();
        array.bubbleSort();
        array.isSorted();
        array.display();

    }

    private void bubbleSort() {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    private void isSorted() {
        boolean flag= true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) {
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }

    }

    private void binarySearch(int low, int high, int value) {
        int mid=(low+high)/2;

        if(value==arr[mid]){
            System.out.println("found at:"+mid);
            return;
        }else if(value<arr[mid]){
            binarySearch(low,mid-1,value);
        }else if(value>arr[mid]){
            binarySearch(mid+1,high,value);
        }
    }

    private void reverse() {
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    private void min() {
        Integer Min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
        System.out.println(Min);
    }

    private void max() {
        Integer Max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                Max=arr[i];
            }
        }
        System.out.println(Max);
    }

    private void set(int i, int i1) {
        if(i<arr.length){
            arr[i]=i1;
        }
    }

    private void get(int index) {
        if(index<arr.length){
            System.out.println(arr[index]);
        }
    }

    private void search(int value) {
        boolean f=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
              System.out.println("found at index:"+i);
              f=false;
              break;
            }

        }
        if(f){
            System.out.println("Not found");

        }
    }

    private void deleteshift(int value) {
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] == value) {

                arr[i]=arr[i+1];
                value=arr[i];
            }
        }
    }

    private void delete(int v) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==v){
                arr[i]=0;
            }
        }
    }

    private void insert(int i, int i1) {
        if(i<arr.length){
            arr[i]=i1;
        }
    }

    private void add(int value) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr[i]=value;
                break;
            }
        }
    }

    private void display() {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
