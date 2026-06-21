package array;

public class DSAPractice {
    public static boolean containDuplicate(int[] arr) {
        int dupli=arr[0];
       for (int i=1;i<=arr.length-1;i++){
           if (dupli==arr[i]){
               System.out.println("true");
           }
       }
       return  false;
    }
    public static int SumPair(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }

        return 1;
    }
    public  static void Duplicate(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if (arr[i]==arr[j]){
                    System.out.println("duplicate element is : "+arr[i]);
                }
            }
        }
    }
    public static int SumTarget(int[] arr, int target){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<=arr.length-1;j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
        return -1;
    }
    public static void MaxTable(int[] number){
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number.length;j++){
                int MaxPair=number[i]*number[j];
                System.out.print(" "+MaxPair);
            }
        }
        System.out.println();

    }
    public static void MaxPairSum(int[] arr2){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr2.length;i++){
        for (int j = i+1; j <=arr2.length-1; j++) {
            int sum=arr2[i]+arr2[j];
            if (sum>max){
                max=sum;

            }


        }}
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] nums = {2, 2, 11, 15};
        int [] arr={1, 2, 3, 1};
        int target=5;
        int x=nums[0];
        int[] number={2,3,4};
        int[] arr2 = {1, 5, 3, 9, 2};
        for (int i=0;i<nums.length;i++){

           for (int j=i+1;j<=nums.length-1;j++){
//               if (nums[i]+nums[j]==target){
//                   System.out.println(nums[i]+ " "+ nums[j]);
//               }
            }
        }
        containDuplicate(arr);
        SumPair(arr);
        SumTarget(arr,target);
        Duplicate(arr);
        MaxTable(number);
        MaxPairSum(arr2);
    }
}
