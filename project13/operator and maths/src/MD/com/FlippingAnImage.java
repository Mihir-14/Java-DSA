package MD.com;

public class FlippingAnImage {
//    lc 832
    public static void main(String[] args) {

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row :image) {
//            reverse
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
//                Swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }
}
