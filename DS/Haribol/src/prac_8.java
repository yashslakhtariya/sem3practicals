import java.util.Arrays;

class prac_8
{
    static int srch(int[] arr, int x, int n)
    {
        for (int i = 0; i < n; i++)
            if (arr[i] == x)
                return i;
        return -1;
    }

    static void post(int[] inordr,int[] preordr, int n)
    {
        int root = srch(inordr, preordr[0], n);

        if (root != 0)
            post(inordr, Arrays.copyOfRange(preordr, 1, n), root);

        if (root != n - 1)
            post(Arrays.copyOfRange(inordr, root+1, n), Arrays.copyOfRange(preordr, 1+root, n), n - root - 1);

        System.out.print( preordr[0] + " ");
    }

    public static void main(String[] args)
    {
        int n=6;
        int[] preordr = {4,2,1,3,5,6};
        int[] inordr = {1,2,3,4,5,6};
        post(inordr, preordr, n);
    }
}