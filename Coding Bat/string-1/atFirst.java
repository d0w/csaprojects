public String atFirst(String str) {
    if (str.length() < 2 && str.length() > 0) {
        return (str + "@");
    }
    if (str.length() == 0) {
        return ("@@");
    }
    String a = str.substring(0,2);
    return a;
}
