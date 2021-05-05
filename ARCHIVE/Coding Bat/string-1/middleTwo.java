public String middleTwo(String str) {
    str = str.substring(str.length()/2 - 1, str.length()/2) + str.substring(str.length()/2, str.length()/2 + 1);
    return str; 
}