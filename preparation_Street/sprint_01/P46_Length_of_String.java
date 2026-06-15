package preparation_street.sprint_01;

public class P46_Length_of_String {
    public static int stringLength(String str) {
        int count = 0;
        str = str.replaceAll("\\s+", "");

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("Length is : " + stringLength("hello world"));
    }
}
