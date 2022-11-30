package giaiThuat.baitapthem;

public class giaiThuat2 {
    public static void main(String[] args) {

        for (int c = 1; c < 6; c++) {
            for (int d = 5; d >0; d--) {
                System.out.print(" ");
            }
            System.out.print(c+""+c);
        }
        for (int e = 5; e >0; e--) {
            for (int f = 0; f <= 5 - e; f++) {
                System.out.print(e+" ");
            }
            System.out.print("\n");
        }
    }
}
