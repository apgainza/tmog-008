package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@Slf4j
class SolutionTest {

    private static Stream<Arguments> provideBinarySearch() {
        return Stream.of(
                Arguments.of(new Integer[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new Integer[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91}, 23, 5),
                Arguments.of(new Integer[]{2, 3, 4, 10, 40}, 10, 3)

        );
    }

    @ParameterizedTest
    @MethodSource("provideBinarySearch")
    void testSolution(Integer[] nums, Integer target, Integer posExpected) {
        Solution solution = new Solution();

        Integer search = solution.search(nums, target);

        Assertions.assertEquals(search, posExpected);

    }

}