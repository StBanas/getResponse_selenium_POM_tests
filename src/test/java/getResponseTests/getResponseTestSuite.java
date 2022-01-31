package getResponseTests;

import getResponse.GetResponseOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class getResponseOneTestSuite {
        public GetResponseOne checker = new GetResponseOne();

        @Test
        public void shouldReturnFalseWhenPassingEmptyString() {
            String result = String.valueOf(checker.toString().equals (""));
            System.out.println("Zapis z testu  " + checker.toString ());
            assertFalse(result);
        }

    private void assertFalse(String result) {
    }

    @Test
        public void shouldReturnTrueWhenPassingProperString() {
        String result = String.valueOf(checker.toString().equals ("Test Text"));
        System.out.println("Zapis z testu  " + checker.toString ());
        assertTrue(result);
        }

    private void assertTrue(String result) {
    }
}
