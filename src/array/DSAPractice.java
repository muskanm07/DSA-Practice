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
    public static void main(String[] args) {
        int[] nums = {2, 2, 11, 15};
        int [] arr={1, 2, 3, 1};
        int target=4;
        int x=nums[0];
        for (int i=0;i<nums.length;i++){

           for (int j=i+1;j<=nums.length-1;j++){
               if (nums[i]+nums[j]==target){
                   System.out.println(nums[i]+ " "+ nums[j]);
               }
            }
        }
        containDuplicate(arr);
    }
}
