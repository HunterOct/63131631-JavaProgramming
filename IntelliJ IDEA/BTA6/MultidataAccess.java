package BTA6;

import java.util.Dictionary;
import java.util.Hashtable;

public class MultidataAccess
{
    private static final Dictionary<String,MultidataAccess> instances = new Hashtable<>();

    public static MultidataAccess getInstance(String tag){
        if (instances.get(tag) == null){
            var md = new MultidataAccess();
            instances.put(tag,md);
        }
        return instances.get(tag);
    }
}

