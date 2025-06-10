import java.util.Date;
import java.security.MessageDigest;

public class Block {

    public String hash;
    public String previousHash;
    private String data; //data as a simple message
    private long timeStamp; //as number of milliseconds since 1/1/1970

    public Block (String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
    }

}

