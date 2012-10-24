

public class LevDist {

    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("USAGE: java LevDist <word1> <word2>");
            return;
        }

        int result = calcLevensteinDistance(args[0], args[1]);
        System.out.println("word 1: " + args[0]);
        System.out.println("word 2: " + args[1]);
        System.out.println("dist  : " + result);
    }

    private static int calcLevensteinDistance(String word1, String word2) {
        // calculate the Damerau–Levenshtein edit distance
        // more: http://en.wikipedia.org/wiki/Damerau-Levenshtein_distance
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int[][] d = new int[w1.length+1][w2.length+1];
        for(int i = 0; i <= w1.length; i++) {
            d[i][0] = i;
        }
        for(int j = 0; j <= w2.length; j++) {
            d[0][j] = j;
        }
        int cost = 0;
        for(int i = 1; i <= w1.length; i++) {
            for(int j = 1; j <= w2.length; j++) {
                cost = (w1[i-1] == w2[j-1]) ? 0 : 1;
                // System.out.println("i=" + i + ", j=" + j + ": base cost between '" + w1[i-1] + "' and '" + w2[j-1] + "': " + cost);

                // handle deletion/insertion/substitution
                d[i][j] = Math.min(d[i-1][j] + 1, Math.min(d[i][j-1] + 1, d[i-1][j-1] + cost));

                // handle transposition
                if(i > 1 && j > 1 && w1[i-1] == w2[j-2] && w1[i-2] == w2[j-1]) {
                    d[i][j] = Math.min(d[i][j], d[i-2][j-2] + cost);
                }
            }
        }
        return d[w1.length][w2.length];
    }
}
