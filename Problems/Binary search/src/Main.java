
class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        int m;
        m = java.util.Arrays.binarySearch(nums, key);
        return m;
    }
}