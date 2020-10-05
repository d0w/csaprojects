/*given an array of ints, return true if 6 apperas as either the first or last element in the array. 
The array will be length 1 or more
*/
public boolean firstLast6(int[] nums) {
    int i = nums.length;
    if (nums[0] == 6 || nums[i - 1] == 6) {
        return true;
    }
    return false;

    /* Can also do this way
    int i = nums.length;
    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
        return true;
    }
    return f
    */
}
