package OOP;

public class IntegerChecksum implements Checksum <Integer>{

    @Override
    public int checksum(Integer n) {
        int sum = 0;
        int x;
        while (n > 0){
            x = n % 10;
            sum = sum + x;
            n = n / 10;
        }
        return sum;
    }


}
