import java.util.Arrays;
class prac_9
{
    public static void main(String[] args)
    {
        int[] ysl = {10,30,15,20,5};
        for(int i=0; i < ysl.length; i++)
        {
            for(int j=0; j < ysl.length; j++)
            {
                if(ysl[i] < ysl[j])
                {
                    ysl[i] = ysl[i] + ysl[j];
                    ysl[j] = ysl[i] - ysl[j];
                    ysl[i] = ysl[i] - ysl[j];
                }
            }
        }
        String yash = Arrays.toString(ysl).replace(",","").replace("[","").replace("]","");
        System.out.println(yash);
    }
}