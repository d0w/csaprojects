public int teaParty(int tea, int candy) {
    if(tea >= 5 && candy >= 5) {
        if(tea >= candy*2 || candy >= tea*2) {
            return 2;
        }
        return 1;
    }
    else if(tea < 5 && candy < 5) {
        return 0;
    }
    return 0;
}
