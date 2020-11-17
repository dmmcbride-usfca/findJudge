public class Judge {
    public int findJudge(int N, int [][] trust){
        int [] town = new int[N + 1];

        for (int[] rel : trust)
        {
            town[rel[0]]--;
            town[rel[1]]++;
        }

        for (int i=1; i<=N; i++)
        {
            if (town[i]==N-1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] Args)
    {
        int[][] arr = { { 1, 3 }, { 2, 3}, {4,3}, {2,4} };
        Judge judge = new Judge();
        System.out.println(judge.findJudge(4, arr));
    }

}

