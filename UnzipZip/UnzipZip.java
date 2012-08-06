import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


public class UnzipZip {

    public static void main(String[] args) throws Exception {
        if(args.length != 2) {
            System.out.println("USAGE: " + UnzipZip.class + " <infile> <outfile>");
            return;
        }
        String srcFname = args[0];
        String destFname = args[1];
        System.out.println("opening " + srcFname + " for reading...");
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(srcFname));
        System.out.println("opening " + destFname + " for writing...");
        ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(destFname));

        System.out.println("copying files over...");
        FileOutputStream fos;
        byte[] buff;
        int count;
        ZipEntry oldEntry, newEntry;
        while((oldEntry = zipIn.getNextEntry()) != null) {
            System.out.println("\tprocessing file " + oldEntry.getName() + 
                               "(size " + oldEntry.getSize() + ", compressed " + 
                               oldEntry.getCompressedSize() + ")");
            fos = new FileOutputStream(oldEntry.getName());
            buff = new byte[(int)oldEntry.getSize()];
            newEntry = new ZipEntry(oldEntry.getName());
            newEntry.setSize(oldEntry.getSize());
            zipOut.putNextEntry(newEntry);
            count = zipIn.read(buff);
            System.out.println("\t\tread " + count + " bytes in one shot!");
            zipOut.write(buff);
            fos.write(buff);
        }
        zipIn.close();
        zipOut.close();
    }
}
