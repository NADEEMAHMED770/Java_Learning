public class P6_2Matrix_Subtract {
     public static void main(String[] args) {
        int[][] arr1 = new int[][]{
            {10, 2, 3},
            {4, 5, 60},
            {7, 80, 9}
        };

        int[][] arr2 = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] sub = new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                sub[i][j] = arr1[i][j]-arr2[i][j];
            }
        }


        System.out.println("Array 1");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr1[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Array 2");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(arr2[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("Subtraction of Array 1 and Array 2");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                System.out.print(sub[i][j]+"  ");
            }
            System.out.println();
        }



    }
}
