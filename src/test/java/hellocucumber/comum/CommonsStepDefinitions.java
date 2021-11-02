package hellocucumber.comum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonsStepDefinitions {
    private String today;
    private String actualAnswer;

    public void today_is_Sunday() {
        today = "Sunday";
    }

    public void today_is_Friday() {
        today = "Friday";
    }

    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}