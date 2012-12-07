import java.util.zip.InflaterInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

class SwfDecompressor {
    public static void main(String[] args) {
        if(args.length == 0) { 
            System.out.println("Specify a file");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(args[0]);
            byte[] header = new byte[8];
            fis.read(header);
            
            for(int i = 0; i < header.length; i++) {
                System.out.println("byte " + i + ": " + Integer.toHexString((int)(header[i])));
            }
            
            ArrayList<Byte> data = new ArrayList<Byte>();
            InflaterInputStream iis = new InflaterInputStream(fis);
            int datum = iis.read();
            while(datum > -1) {
                data.add((byte)(datum));
                datum = iis.read();
            }
            System.out.println("\tread " + data.size() + " uncompressed bytes");
            iis.close();
            fis.close();

            FileOutputStream fos = new FileOutputStream("decomp_" + args[0]);
            header[0] = 'F';
            fos.write(header);
            for(Byte b : data) {
                fos.write(b);
            }
            fos.close();
            System.out.println("wrote " + (header.length + data.size()) + 
                               " bytes to decomp_" + args[0]);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
