class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] newArray = new int[(length * 2)];
        int j = 0;
        for (int i : nums) {
            newArray[j] = i;
            j++;
        }
        for (int i : nums) {
            newArray[j] = i;
            j++;
        }
        return newArray;
    }
}