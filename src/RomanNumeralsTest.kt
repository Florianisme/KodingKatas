import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RomanNumeralsTest {

    @Test
    fun toNumeral_all() {
        assertEquals(2377, toNumeral("MDDCCCLXXVII"))
    }

    @Test
    fun toNumeral_lowercase() {
        assertEquals(198, toNumeral("cxcviii"))
    }

    @Test
    fun toNumeral_variation() {
        assertEquals(796, toNumeral("DCCXCVI"))
    }

}