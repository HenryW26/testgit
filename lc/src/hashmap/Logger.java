package hashmap;

import java.util.Map;
import java.util.HashMap;
public class Logger {
    private HashMap<String,Integer> Msg;

    /** Initialize your data structure here. */
    public Logger() {
        this.Msg = new HashMap<String, Integer>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!this.Msg.containsKey(message)) {
            this.Msg.put(message, timestamp);
            return true;
        }
        Integer oldTimeStamp = this.Msg.get(message);
        if (timestamp-oldTimeStamp >= 10){
            this.Msg.put(message, timestamp);
            return true;
        }
        else{
            return false;
        }
    }
}


