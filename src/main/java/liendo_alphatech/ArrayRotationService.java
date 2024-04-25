package liendo_alphatech;

import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
public class ArrayRotationService {

    public Long[] rotateArray(Long[] initialNumberArray, Integer d) {
        Integer n = initialNumberArray.length;

        if (Objects.equals(d, n)) {
            return initialNumberArray.clone();
        }


        Long[] finalArray = new Long[n];

        // fill the final Array from 0 to (N-D-1)
        if (n - d - 1 >= 0)
            System.arraycopy(initialNumberArray, d, finalArray, 0, n - d);

        // fill the final array from (N-D) to (N-1)
        if (n - 1 - (n - d) >= 0)
            System.arraycopy(initialNumberArray, n - d - (n - d), finalArray, n - d, n - (n - d));

        return finalArray;
    }
}
