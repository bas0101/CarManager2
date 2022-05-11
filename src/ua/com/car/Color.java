package ua.com.car;

public enum Color {
    WHITE, GREEN, BLACK, BLUE;

    @
    Override
    public String toString() {
        String lowercase = name().toLowerCase(java.util.Locale.US);
        return lowercase;
    }


}
