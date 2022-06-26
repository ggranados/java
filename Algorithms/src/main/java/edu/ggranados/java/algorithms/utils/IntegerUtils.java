package edu.ggranados.java.algorithms.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public final class IntegerUtils {

    private static final Logger logger = LogManager.getLogger(IntegerUtils.class);

    private IntegerUtils() {}

    public static List<Integer> getIntegerList(){
        Random random;
        try {
            random = SecureRandom.getInstanceStrong();
            IntStream randStream = random.ints(5);
            return randStream.boxed().toList();
        } catch (NoSuchAlgorithmException e) {
            logger.warn("Could not create secure random");
            return Arrays.asList(1,5,2,3,4,6,7,5,2);
        }

    }

    public static boolean isEqualOrGreaterThan(Integer next, Integer prev) {
        return (next >= prev);
    }
}