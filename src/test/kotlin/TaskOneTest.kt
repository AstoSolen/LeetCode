import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

/**
 * Created by LOW SORT WIZARD on 11.09.2021
 */
internal class TaskOneTest {

    private val testCases = mapOf(
        mapOf(intArrayOf(2, 7, 5, 11) to 9) to intArrayOf(0, 1),
        mapOf(intArrayOf(3, 2, 4) to 6) to intArrayOf(1, 2),
        mapOf(intArrayOf(3, 3) to 6) to intArrayOf(0, 1)
    )

    private val solution = Solution()

    @Test
    fun twoSum() {
        var result: IntArray

        for ((input, output) in testCases) {
            for ((nums, target) in input) {
                result = solution.twoSum(nums, target)
                Assertions.assertArrayEquals(output, result)
            }
        }
    }

    @Test
    fun twoSumHashMap() {
        var result: IntArray

        for ((input, output) in testCases) {
            for ((nums, target) in input) {
                result = solution.twoSumHashMap(nums, target)
                Assertions.assertArrayEquals(output, result)
            }
        }
    }
}