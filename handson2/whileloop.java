package handson2;

public class whileloop {
    public static void main(String[] args) {
        int i = 1;

        while ( i <= 20){
            if ( i % 2 != 0){
                i++;
                continue;

            }
            System.out.println(i);
            i++;
        }
    }
}