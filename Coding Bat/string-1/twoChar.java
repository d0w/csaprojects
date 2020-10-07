public String twoChar(String str, int index) {
    if (str.length() < 3) {
        return str.substring(0,2);
    }
    else if (index > str.length() - 2 || index < 0) {
        return str.substring(0,2);
    }
    else {
        String a = str.substring(index, index + 2);
        return a;
    }
}
