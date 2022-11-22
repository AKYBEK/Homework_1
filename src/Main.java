public class Main {
    public static void main(String[] args) {
        String akylAlmazbekov;
        final int NUM = 123;
        String word = "akyl";
        akylAlmazbekov = (NUM + word);
        System.out.println(akylAlmazbekov);
        if (NUM < 0){
            System.out.println(" вы сохронили отрецательное число" );
        } else if (NUM > 0) {
            System.out.println("вы сохронили положительное число");

        }else {
            System.out.printf("вы сохрлнили 0");
        }
    }
}