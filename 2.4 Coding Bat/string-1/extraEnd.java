public String extraEnd(String str) {
    String lastTwo = str.substring(str.length() - 2, str.length());
    return (lastTwo + lastTwo + lastTwo);
}
