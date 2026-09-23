class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
    public void merge(int[] nums, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = nums[left + i];
        }
        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = nums[mid + j + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
                k++;
            } else {
                nums[k] = rightArr[j];
                j++;
                k++;
            }
        }
        while (i < leftSize) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }
}