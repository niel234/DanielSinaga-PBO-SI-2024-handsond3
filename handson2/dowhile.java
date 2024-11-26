package handson2;

public class dowhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            if ( i % 2 !=0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while ( i <= 20);
    }
}