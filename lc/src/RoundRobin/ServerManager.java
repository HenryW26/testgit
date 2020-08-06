package RoundRobin;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ServerManager {
    public static Map<String,Integer> serverMap = new LinkedHashMap<>();
    static {
        serverMap.put("192.168.1.1", 1);
        serverMap.put("192.168.1.2", 2);
        serverMap.put("192.168.1.3", 3);
        serverMap.put("192.168.1.4", 4);
    }
}
