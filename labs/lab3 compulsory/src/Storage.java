/**
 * interface for storage
 */
public interface Storage {
    public void getStorage();

    /**
     * function to convert from GB to MB/KB/BYTES
     * @param changeTo
     * @param value
     * @return
     */
    default long convertGbTo(String changeTo, int value){
        if (changeTo.equals("MB")) {
            return value*1000L;
        }
        if (changeTo.equals("KB")) {
            return value*1000000L;
        }
        if (changeTo.equals("B")) {
            return value*10000000000L;
        }
        System.out.println("string not accepted(must be MB, KB or B");
        return -1;
    }
}
