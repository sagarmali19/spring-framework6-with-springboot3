public class Array {
    public static void main(String[] args) {
        int num[] = {2,5,6,7};
        System.out.println(num[0]);

        int arr1[] = new int[4];
        arr1[0] = 5;
        for(int i = 0; i < 4; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // multi dimentional array
        int nums[][] = new int[3][4];
        nums[0][0] = 1;
        nums[0][1] = 2;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        //enhanced for loop
        for(int n[] : nums)
        {
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        //jagged array
        int nums1[][] = new int[3][];
        nums1[0] = new int[3];
        nums1[1] = new int[4];
        nums1[2] = new int[2];
    }
}
