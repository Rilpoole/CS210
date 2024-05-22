public class SymbolTableEntry {

    public SymbolTableEntry(int start, int end, String value, String type) {
        this.start = start;
        this.end = end;
        this.value = value;
        this.type = type;
    }

    public int start = 0;
    public int end = 0;
    public String value = "";
    public String type = "";
}
