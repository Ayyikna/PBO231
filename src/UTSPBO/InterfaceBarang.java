package UTSPBO;
import java.io.*;
public interface InterfaceBarang {
    int stokUpdate();
    void entriData(Barang b) throws IOException;
    void entriData() throws IOException;
    void struk();
}
