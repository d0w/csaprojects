public boolean twoAsOne(int a, int b, int c) {
    if(a + b == c) {
        return true;
    }
    if(b + c == a) {
        return true;
    }
    if(c + a == b) {
        return true;
    }
    return false;
}
