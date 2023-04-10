public class main {
    public static void main(String[] args) {
        System.out.println(IpAddressValidator.validateIpv4Address("1.1.1.1"));
        System.out.println(IpAddressValidator.validateIpv4Address("300.0.1.0"));
        System.out.println(IpAddressValidator.validateIpv4Address("192.168.1.1"));

    }
}
