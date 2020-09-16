public boolean lastDigit(int a, int b, int c) {
    a = a % 10;
    b = b % 10;
    c = c % 10;
    if(a == b || b == c || c == a) {
        return true;
    }
    return false;
}
