package ML1;

import java.io.Serializable;
import java.util.Hashtable;

public class Tuple implements Serializable{
    private Hashtable<String, Object> values;
    private Object primaryKey;

    public Tuple(Hashtable values, Object primaryKey){
        this.values = values;
        this.primaryKey = primaryKey;
    }

    public void setValues(Hashtable<String, Object> values) {
        this.values = values;
    }

    public Object getPrimaryKey() {
        return primaryKey;
    }

    public Hashtable<String, Object> getValues() {
        return values;
    }
}
