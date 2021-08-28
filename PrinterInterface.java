package findFile;

public interface PrinterInterface {
    abstract public void listAll(String address);
    abstract public void printFile(String address, String fileName);
}
