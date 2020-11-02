package HW101720;

public class Methods1<Public> {

    public static void main(String [] args){
        int cubevolume= calcula(10, 10, 10);
        int trianglearea= calcula(5, 8);

        System.out.println(cubevolume);
        System.out.println(trianglearea);



    }

    public static int calcula(int x, int y, int z) {
        return x * y * z; }

    public static int calcula(int a, int b) {
        return a * b / 2; }




}
