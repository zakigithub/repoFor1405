import java.util.Random;

public class Draw
{
    public static void main(String[] args)
    {
        Random rand  = new Random();
        int    index = 1 + rand.nextInt(13);
        System.out.println("Next student will be: " + index);
    }
}