//package array;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//public class arrayPractice {
//
//    public static int LargestNum(int[] arr1) {
//        int max = arr1[0];
//        for (int i = 1; i < arr1.length; i++) {
//            if (max<arr1[i]) {
//               max=arr1[i];
//            }
//        }
//        System.out.println(max);
//
//        return max;
//    }
//
//    public static int Reverse(int[] arr){
//
//        for (int i=arr.length-1;i>=0;i--){
//
//            System.out.print(arr[i]+" ");
//        }
//
//        return 1 ;
//    }
//    public static void ContainNum(int[] arr1, int target){
//        boolean found=false;
//        for (int i=0;i<=arr1.length-1;i++){
//            if(arr1[i]==target){
//                found=true;
//            }
//
//        }
//        if (found){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }
//
//
//    }
//    public static void SecondLargest(int[] arr1){
//        int secondMax=arr1[0];
//        int max=arr1[0];
//        for (int i=1;i<=arr1.length-1;i++){
//            if(max<arr1[i]){
//                secondMax=max;
//                max=arr1[i];
//            }else if (arr1[i]>secondMax && arr1[i]!=max ) {
//                secondMax=arr1[i];
//            }
//
//
//        }
//        System.out.print("second largest is: "+secondMax);
//
//    }
//    public static void Duplicates(int[] arr2){
//
//        Arrays.sort(arr2);
//        System.out.print(arr2[0]+" ");
//        for (int i=1;i<=arr2.length-1;i++){
//
//            if(arr2[i]!=arr2[i-1]){
//                System.out.print(arr2[i]+" ");  //int[] arr2 = {10, 10, 10, 20, 20,30};
//
//            }
//
//
//        }
//
//
//
//    }
//    public static void main(String[] args){
//
//            int sum = 0;
//            int[] arr = {10, 20, 30, 40, 50};
//            int[] arr1 = {10, 45, 20, 89, 33};
//            int target = 20;
//            int[] arr2 = {5,1,2,5};
//            int target1 = 5;
//        int count=0;
//            for (int i=0;i<=arr2.length-1;i++){
//                if(arr2[i]==target1){
//                    count=count+1;
//                }
//            }
//
//        System.out.println(count);
//            for (int i = 0; i < arr.length; i++) {
//                sum = sum + arr[i];
//
//            }
//
//(arr2);
//       }
//    }
//
