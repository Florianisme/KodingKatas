package csvparser

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CSVParserTest {

    @Test
    fun parse_test() {
        assertEquals("[[Name, Strasse, Ort, Alter], " +
                "[Peter Pan, Am Hang 5, 12345 Einsam, 42], " +
                "[Maria Schmitz, Kölner Straße 45, 50123 Köln, 43], " +
                "[Paul Meier, Münchener Weg 1, 87654 München, 65]]",
                parse("Name;Strasse;Ort;Alter\n" +
                        "Peter Pan;Am Hang 5;12345 Einsam;42\n" +
                        "Maria Schmitz;Kölner Straße 45;50123 Köln;43\n" +
                        "Paul Meier;Münchener Weg 1;87654 München;65").toString())
    }

    @Test
    fun parse_print() {
        assertEquals("", printList(parse("Name;Strasse;Ort;Alter\n" +
                "Peter Pan;Am Hang 5;12345 Einsam;42\n" +
                "Maria Schmitz;Kölner Straße 45;50123 Köln;43\n" +
                "Paul Meier;Münchener Weg 1;87654 München;65")))
    }
}