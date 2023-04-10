public class IpAddressValidator {
    public static boolean validateIpv4Address(String ipAddress) {
        String[] blocks = ipAddress.split("\\.");
        if (blocks.length != 4) {
            return false;
        }
        for (String block : blocks) {
            try {
                int value = Integer.parseInt(block);
                if (value < 0 || value > 255) {
                    return false;
                }
                if (value == 0 || value == 255) {
                    return false;
                }
                if (value == 0 && !block.equals("0")) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}