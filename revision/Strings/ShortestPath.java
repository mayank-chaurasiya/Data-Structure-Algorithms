package revision.strings;

public class ShortestPath {
    public static double getShortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else {
                y--;
            }
        }

        double shortestPath = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        return shortestPath;
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        System.out.println(getShortestPath(str));
    }
}
