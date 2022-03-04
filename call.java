Call.java
code
@@ -1,8 +1,12 @@
/*
*This class is an model of a call.
*
*/

//I edited this 



import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
public class Call {
     
    private Line fromLine = null;
    private Line toLine = null;
    private Random random;
    private long duration;
    private long admittedTimestamp; //timestamp when the call is connected with the linea
    private long arrivalTimestamp;
    public long getArrivalTimestamp(){
        return arrivalTimestamp;
    }
    
    public long getDuration(){
        return duration;
    }
    
    public Line getFromLine(){
        return fromLine;
