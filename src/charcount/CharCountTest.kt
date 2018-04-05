package charcount

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CharCountTest {

    @Test
    fun count_normal() {
        assertEquals("{H=1, e=1, l=2, o=1}", count("Hello").toString())
    }

    @Test
    fun count_whitespace() {
        assertEquals("{_=5, H=1, e=1, l=2, o=1}", count("  Hello   ").toString())
    }
}