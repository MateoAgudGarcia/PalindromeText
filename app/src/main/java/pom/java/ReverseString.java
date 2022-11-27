package pom.java;

public class ReverseString implements ReversedString {

    private String value;

    public ReverseString(String value) {
        this.value = value;
    }

    public String reversedString() {
        return this.reversedBufferedString(this.value).toString();
    }

    private StringBuffer reversedBufferedString(String normalString) {
        return this.bufferedProcess(normalString).reverse();
    }

    private StringBuffer bufferedProcess(String unprocessed) {
        return new StringBuffer(unprocessed);
    }
}
