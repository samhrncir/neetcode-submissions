class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int[] solution = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            solution[i] = greatest;
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return solution;
    }
}