package revision.Recursion;

public class TilingProblem {
    public static int waysToTile(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // int verticalTiles = waysToTile(n - 1), horizontalTiles = waysToTile(n - 2);
        return waysToTile(n - 1) + waysToTile(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(waysToTile(3));
    }
}
