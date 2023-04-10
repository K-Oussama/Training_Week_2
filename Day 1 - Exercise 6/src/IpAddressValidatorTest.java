import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IpAddressValidatorTest {

    @Test
    public void testValidIpAddress() {
        assertTrue(IpAddressValidator.validateIpv4Address("1.1.1.1"));
        assertTrue(IpAddressValidator.validateIpv4Address("192.168.1.1"));
        assertTrue(IpAddressValidator.validateIpv4Address("10.0.0.1"));
        assertTrue(IpAddressValidator.validateIpv4Address("127.0.0.1"));
    }

    @Test
    public void testInvalidIpAddress() {
        assertFalse(IpAddressValidator.validateIpv4Address("0.0.0.0"));
        assertFalse(IpAddressValidator.validateIpv4Address("255.255.255.255"));
        assertFalse(IpAddressValidator.validateIpv4Address("1.1.1.0"));
        assertFalse(IpAddressValidator.validateIpv4Address("10.0.1"));
    }
}
