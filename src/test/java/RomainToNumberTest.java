import static org.fest.assertions.Assertions.*;
import org.junit.Test;



public class RomainToNumberTest {

    private RomainToNumber romainToNumber= new RomainToNumber();

    @Test
    public void test(){
        assertThat(romainToNumber.transformRomainToNumber("I")).isEqualTo(1);
        assertThat(romainToNumber.transformRomainToNumber("II")).isEqualTo(2);
        assertThat(romainToNumber.transformRomainToNumber("III")).isEqualTo(3);
        assertThat(romainToNumber.transformRomainToNumber("IV")).isEqualTo(4);
        assertThat(romainToNumber.transformRomainToNumber("V")).isEqualTo(5);
        assertThat(romainToNumber.transformRomainToNumber("VI")).isEqualTo(6);
        assertThat(romainToNumber.transformRomainToNumber("VII")).isEqualTo(7);
        assertThat(romainToNumber.transformRomainToNumber("VIII")).isEqualTo(8);
        assertThat(romainToNumber.transformRomainToNumber("IX")).isEqualTo(9);
        assertThat(romainToNumber.transformRomainToNumber("X")).isEqualTo(10);
        assertThat(romainToNumber.transformRomainToNumber("XI")).isEqualTo(11);
        assertThat(romainToNumber.transformRomainToNumber("XIV")).isEqualTo(14);
        assertThat(romainToNumber.transformRomainToNumber("CCLVI")).isEqualTo(256);
        assertThat(romainToNumber.transformRomainToNumber("MCMXC")).isEqualTo(1990);
        assertThat(romainToNumber.transformRomainToNumber("MMDCCLI")).isEqualTo(2751);
    }
}
