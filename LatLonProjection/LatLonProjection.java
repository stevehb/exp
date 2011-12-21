

public class LatLonProjection {
    private static final double EARTH_RADIUS = 6378137.0;
    public static void main(String[] args) {
        if(args.length != 4) {
            System.out.println("USAGE: <lat1> <lon1> <distance> <bearing>");
            return;
        }

        double lat1 = Double.parseDouble(args[0]);
        double lon1 = Double.parseDouble(args[1]);
        double dist = Double.parseDouble(args[2]);
        double bearing = Double.parseDouble(args[3]);

        System.out.println("starting point: (" + lat1 + ", " + lon1 + ")");
        System.out.println("distance=" + dist + " meters, bearing=" + bearing + " degrees");
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        bearing = Math.toRadians(bearing);

        double angDist = dist / EARTH_RADIUS;
        double cosLat1 = Math.cos(lat1);
        double sinLat1 = Math.sin(lat1);
        double cosAngDist = Math.cos(angDist);
        double sinAngDist = Math.sin(angDist);
        double lat2 = Math.asin(sinLat1*cosAngDist + cosLat1*sinAngDist*Math.cos(bearing));
        double lon2 = lon1 + Math.atan2(Math.sin(bearing)*sinAngDist*cosLat1, cosAngDist - sinLat1*Math.sin(lat2));

        lat2 = Math.toDegrees(lat2);
        lon2 = Math.toDegrees(lon2);
        System.out.println("destination: (" + lat2 + ", " + lon2 + ")");
    }
}
