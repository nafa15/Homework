package hw110120;

public class Loops {
    // write an application which will print selenium 5 times
    //  for each selenium , it will print java 3 times
    //  when java is getting printed for second and third time, print "i hate java" instead of "java"
    //  and for the 3rd and 5th time of selenium print, instead of "selenium", print "i love selenium"
    // if selenium get printed for third time and java get printed for second time print your name


    public static void main(String[] args) {

//        for (int x=1; x<6; x++){
//            if (x==3 || x==5){
//                System.out.println("I love Selenium " + x);
//            }else {
//                System.out.println("Selenium " + x);
//            }
//            for (int y=1; y<4; y++){
//                if (x==3 && y==2){
//                    System.out.println("Nafa "+x+"/"+y);
//                }
//                else if (y==2 || y==3){
//                    System.out.println("I hate Java "+ y);
//                } else {
//                    System.out.println("Java " + y);
//                }
//
//            }
//
//        }
        int[] numbers = {3, 1, 10, 2, 5, 3, 100};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {

                    int tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;

                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

    }
}
