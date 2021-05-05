public boolean hasBad(String str) {
    String bad = "bad";
    if (str.equals(bad)) {
        return true;
    }
    else if (str.length() <= 3) {
        return false;
    }
    else if (str.substring(0,3).equals(bad)) {
        return true;
    }
    else if (str.substring(1,4).equals(bad)) {
        return true;
    }
    else {
        return false;
    }
}
