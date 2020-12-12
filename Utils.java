public class Utils {

    public int suma(int param1, int param2) {
        return param1 + param2;
    }

    public int diferenta(int param1, int param2) {
        return param1 - param2;
    }

    public double impartire(int numarator, int numitor) {
        if (numitor == 0) {
            throw new IllegalArgumentException();
        }
        return numarator / numitor;
    }

    public double inmultire(int param1, int param2) {
        return param1 * param2;
    }

    public static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int findMin(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i])
                max = arr[i];
        }
        return max;
    }

    public static int cube(int n) {
        return n * n * n;
    }

    public static int square(int n) {
        return n * n;
    }

    public static String reverse(String text) {
        byte[] strAsByteArray = text.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }

    public static boolean TrueOrFalse(int param1){
        if(param1 < 10) {
            return true;
        } else
            return false;
    }

    public static String getFirst3Characters(String text) {
        return text.substring(0, 3);
    }

    public static int ordineaOperatiilor(int param1, int param2, int param3) {
        return param1 + param2 + (param3 + param1) * param1;
    }
}
