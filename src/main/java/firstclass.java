public class firstclass {
public static void main (String[] args) {
int[] arr = {1,0,1,0,0,1};
for (int i = 0; i < args.length; i ++) {
    arr[i] = arr[i] == 1 ? 0 : 1;
    System.out.println(arr[i] + " ");
}
}


public static void fillArray () {
    int[] arr = new int[8];
    for (int i = 1, j = 0; i < arr.length; i++) {
        arr[i] = j += 3;
        for (int x : arr) ;
        System.out.println(arr[i] + " ");
    }


}

public static void FillArray () {
    int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 6) arr[i] *= 2;
        System.out.println(arr[i] + " ");

    }

}

    public static void fillDiagonal () {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");

            }
        }
}


public static void minMax () {
    int[] arr = {1,2,3,4,5,6,7,8};
    int min = arr[0], max = arr [0], indMax =0, indMin = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
            indMax = i;
        }
   if (arr[i] < min) {
       min = arr [i];
       indMin = i;
   }
    }
    System.out.println("Максимальный элемент находится в массиве" + indMax + "со значением =" + max);
    System.out.println("Минимальный элемент находится в массиве" + indMin + "со значением =" + min);
}}