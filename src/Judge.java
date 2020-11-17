public class Judge {
    public int findJudge(int N, int [][] trust){
        int [] town = new int[N + 1];

        // increments trust score for each person that is trusted and decrements for each that trusts
        for (int[] rel : trust)
        {
            town[rel[0]]--;
            town[rel[1]]++;
        }

        for (int i=1; i<=N; i++)
        {
            // if someone is trusted by all members of the community and trusts no one else, their trust score will be
            // equal to one less than the population
            if (town[i]==N-1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] Args)
    {
        int[][] arr = {{1,3}, {2,3}, {4,3}, {2,4}};
        Judge judge = new Judge();
        System.out.println(judge.findJudge(4, arr));
    }

}

