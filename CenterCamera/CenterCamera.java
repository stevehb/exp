public class CenterCamera {
    static float screenWidth, screenHeight,
        stageWidth, stageHeight,
        centerX, centerY, 
        toDeviceSpace, toStageSpace;

    static void log(String msg) {
        System.out.println("log: " + msg);
    }

    public static void main(String[] args) throws Exception {
        if(args.length < 4) {
            log("need at least 4 args: screenWidth screenHeight stageWidth stageHeight");
            return;
        }

        screenWidth = Float.parseFloat(args[0]);
        screenHeight = Float.parseFloat(args[1]);
        float targetWidth = Float.parseFloat(args[2]);
        float targetHeight = Float.parseFloat(args[3]);

        setViewport(targetWidth, targetHeight);

        log("toDeviceSpace=" + toDeviceSpace);
        log("toStageSpace=" + toStageSpace);
        log("stageWidth=" + stageWidth);
        log("stageHeight=" + stageHeight);
        log("centerX=" + centerX);
        log("centerY=" + centerY);
        log("centerScreenX=" + centerX * toDeviceSpace);
        log("centerScreenY=" + centerY * toDeviceSpace);
    }

    static void setViewport(float width, float height) {
        if(width > height && width / screenWidth <= height / screenHeight) {
            toDeviceSpace = screenHeight / height;
            toStageSpace = height / screenHeight;

            float deviceWidth = width * toDeviceSpace;
            stageWidth = width + (screenWidth - deviceWidth) * toStageSpace;
            stageHeight = height;
        } else {
            toDeviceSpace = screenWidth / width;
            toStageSpace = width / screenWidth;

            float deviceHeight = height * toDeviceSpace;
            stageHeight = height + (screenHeight - deviceHeight) * toStageSpace;
            stageWidth = width;
        }
        centerX = stageWidth / 2;
        centerY = stageHeight / 2;
    }
}
