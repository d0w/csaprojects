
// Return the number of even ints in the given array. 
// Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.



public int countEvens(int[] nums) {
    int i = 0;
    int numberEvens = 0;
    while(i < nums.length) {
        if (nums[i] % 2 == 0) {
            numberEvens++;
        }
        i++;
    }
    return numberEvens;
}
