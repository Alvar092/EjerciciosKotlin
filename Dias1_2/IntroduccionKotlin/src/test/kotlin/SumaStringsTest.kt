import io.keepcoding.sumaStrings
import org.junit.jupiter.api.Assertions
import kotlin.test.Test


class SumaStringsTest {

    @Test
    fun SumaStringsTest1() {
        Assertions.assertEquals(
            2.0,
            sumaStrings("1", "1")
        )
    }

    @Test
    fun SumaStringsTest2() {
        Assertions.assertEquals(
            3.0,
            sumaStrings("1", "2")
        )
    }
}