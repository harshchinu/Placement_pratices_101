public class Diet_Plan {

    static class Item {
        int protien, carbo, fats;
        int max;

        public Item(int protien, int carbo, int fats) {
            this.protien = protien;
            this.carbo = carbo;
            this.fats = fats;
            max = Math.max(protien,Math.max(carbo,fats));
            //  this.maxsum=maxsum;
           // System.out.println(max);
        }
    }

    public static void main(String[] args) {

        //  100P 130C 130F
        // 10P 20C 30F|20P 30C 20F

        //20 0 30
        /*     Item t[][] = new Item[2][361];*/

        Item MainItem = new Item(100, 130, 130);

        Item arr[] = new Item[2];

        arr[0] = new Item(10, 20, 30);
        arr[1] = new Item(20, 20, 30);

        Item t[][]=new Item[arr.length+1][130];

            for(int i=0;i<t.length;i++){
                for(int j=0;j<t[0].length;j++){

                    if(i==0){
                        t[i][j]= new Item(0,0,0);
                    }


                    if(j==0){
                        t[i][j]=new Item(1,1,1);
                    }

                }
            }

            t[0][0]=new Item(1,1,1);


            for(int i=1;i<t.length;i++){
                for(int j=1;j<t[0].length;j++){
                    Item currentcount=arr[i-1];
                  //  int Max=Math.max(currentcount.protien,Math.max(currentcount.carbo,currentcount.fats));

                    int min = Math.min(currentcount.protien,Math.min(currentcount.fats,currentcount.carbo));
                    if(min<=j){


                       Item a= t[i][j-min];
                       Item b= t[i-1][j];
                       if(a.max>=b.max){
                           Item aa = new Item(currentcount.protien+a.protien,
                                   currentcount.carbo+a.carbo,
                                   currentcount.fats+a.fats);
                           t[i][j]=aa;
                       }else {
                           t[i][j]=b;
                       }

                    }else {
                       t[i][j]=t[i-1][j];
                    }

                }
            }

            System.out.println(t[t.length-1][t[0].length-1].protien);
        System.out.println(t[t.length-1][t[0].length-1].carbo);
        System.out.println(t[t.length-1][t[0].length-1].fats);


            //return t[t.length-1][t[0].length-1];
            //    System.out.println(t[t.length-1][t[0].length-1].max);
        }


       /* Item a = proteitwal(arr, arr.length-1, MainItem, new Item(0,0,0));
        System.out.println(a.protien);*/
    }



 /*   private static Item proteitwal(Item[] arr, int length, Item mainItem,Item local) {

        if(length==0){
            return null;
        }

        if(arr[length].protien<=mainItem.protien && arr[length].fats<=mainItem.fats && arr[length].carbo<=mainItem.carbo ){
            if()

        }else {
            return proteitwal(arr,length-1,arr[length].carbo,arr[length].fats,arr[length].protien,mainItem);
        }
    }*/


