import java.util.Arrays;

public static int encontrarMayor(int[] numeros) {
    return Arrays.stream(numeros).max().getAsInt();
}
