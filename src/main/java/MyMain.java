public class MyMain {

    // Shuffles an array, using the perfect shuffle algorithm
    public static int[] perfectShuffle(int[] arr) { 
        int length = arr.length;
        int[] array = new int[length]; 
        int x = 0;
        int y = length/2;
        int z = 0;
        for (int i = 0; i < length/2; i++){
            array[z] = arr[x];
            array[z + 1]=arr[y];
            x++;
            y++;
            z = z + 2;
        }
        return array;
         
    }

    // Shuffles an array, using the selection shuffle algorithm
    public static int[] selectionShuffle(int[] arr) { 
        int length = arr.length;
        int[] array = new int[length];
        array = arr;
        for (int i = 0; i < length; i++){
            int random = (int)(Math.random() * length);
            int newplace = array[i];
            array[i] = array[random];
            array[random] = newplace;
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(perfectShuffle(array));
        System.out.println(selectionShuffle(array));
    }
}
