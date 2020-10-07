public String lastChars(String a, String b) {
    if (a.equals("")) {
        a = "@";
    }
    if (b.equals("")) {
        b = "@";
    }
    String c = a.substring(0,1);
    String d = b.substring(b.length() - 1);
    return (c + d);
}
