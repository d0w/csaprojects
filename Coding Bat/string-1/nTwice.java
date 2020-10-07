public String nTwice(String str, int n) {
    String a = str.substring(0, n);
    String b = str.substring(str.length() - n);
    return (a + b);
}
