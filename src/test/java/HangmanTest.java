import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {

    Hangman hangman = new Hangman("Most na rzece kwai");

    @Test
    public void shouldReturnPositionOfCharInString() {
        //given
        List<Integer> positions;
        //when
        positions = hangman.positionsOfCharsInWord(' ');
        //then
        assertEquals(3, positions.size());
        assertArrayEquals(Arrays.asList(4, 7, 13).toArray(), positions.toArray());
    }

    @Test
    public void doesItFindTheWord() {
        //given
        char c = 'o';
        //when
        Boolean aBoolean = hangman.doesWordContainsChar(c);
        //then
        assertEquals(true, aBoolean);
    }

}