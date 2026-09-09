package org.example.invoice;

import java.io.FileWriter; import java.io.IOException;
public class FileInvoiceWriter implements InvoiceWriter {
    private final String fileName;
    public FileInvoiceWriter(String fileName){this.fileName=fileName;}
    public void write(String invoice){
        try(FileWriter writer=new FileWriter(fileName)){writer.write(invoice);}
        catch(IOException e){throw new RuntimeException("Unable to write invoice",e);}
    }
}
