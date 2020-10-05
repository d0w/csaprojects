public boolean nearTen(int num) {
    num = num % 10;
    if(num <= 2 || num >= 8 && num <= 10) {
        return true;
    }
    return false;
}
