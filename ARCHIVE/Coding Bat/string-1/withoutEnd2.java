public String withouEnd2(String str) {
    if (str.length() < 2) {
        return "";
    }
    if (str.length() == 0) {
        return "";
    }
    str = str.substring(1, str.length() - 1);
    return str;
}
