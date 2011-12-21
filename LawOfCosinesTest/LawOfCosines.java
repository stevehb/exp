

public class LawOfCosines {

    private static double EARTH_RADIUS = 6371000;

    public static void main(String[] args) {
        if(args.length < 4) {
            System.out.println("Need <lat1> <lon1> <lat2> <lon2>");
            return;
        }

        double lat1 = Double.parseDouble(args[0]);
        double lon1 = Double.parseDouble(args[1]);
        double lat2 = Double.parseDouble(args[2]);
        double lon2 = Double.parseDouble(args[3]);

        System.out.println("distance = " + getDistance(lat1, lon1, lat2, lon2));
    }

    public static double getDistance(double lat1, double lon1, double lat2, double lon2) {
        double latA = Math.toRadians(lat1);
        double lonA = Math.toRadians(lon1);
        double latB = Math.toRadians(lat2);
        double lonB = Math.toRadians(lon2);
        double cosAng = (Math.cos(latA) * Math.cos(latB) * Math.cos(lonB-lonA)) +
            (Math.sin(latA) * Math.sin(latB));
        double ang = Math.acos(cosAng);
        double dist = ang * EARTH_RADIUS;
        return dist;
    }
}
