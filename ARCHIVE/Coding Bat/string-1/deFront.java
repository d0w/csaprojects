public String deFront(String str) {    
    if (str.indexOf('a') == 0) {
        if (str.indexOf('b') == 1) {
            return str;
        }
        return str.substring(0, 1) + str.substring(2);
    }

    if (str.charAt(1) == 'b') {
        return str.substring(1);
    }
    return str.substring(2);
}
