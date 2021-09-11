/**
 * Created by LOW SORT WIZARD on 11.09.2021
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 */
class Solution {

    // My solution
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.size) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

        return intArrayOf()
    }

    // Better solution
    fun twoSumHashMap(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, value ->
            val desiredValue = map[target - value]
            if (desiredValue != null) {
                return intArrayOf(desiredValue, index)
            }

            map[value] = index
        }

        return intArrayOf()
    }
}