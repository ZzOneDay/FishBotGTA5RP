package home.developer;

import java.awt.*;
import java.io.IOException;

public class StartApplication {
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
//        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//        RunningProcess runningProcess = context.getBean(RunningProcess.class);
//        runningProcess.run();
        StartCore startCore = new StartCore();
        startCore.run();;





//        while (true) {
//            MouseService mouseService = context.getBean(MouseService.class);
//            Robot robot = context.getBean(Robot.class);
//            System.out.println(robot.getPixelColor(mouseService.getCurrentPosition().x, mouseService.getCurrentPosition().y));
//            System.out.println(mouseService.getCurrentPosition());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


//        process.needStopping.point.valueX=1843
//        process.needStopping.point.valueY=1069
//        MouseService mouseService = context.getBean(MouseService.class);
//        Robot robot = context.getBean(Robot.class);
//        Thread.sleep(10000);
//
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Rectangle screenRectangle = new Rectangle(screenSize);
//        BufferedImage image = robot.createScreenCapture(screenRectangle);
//        Point point = context.getBean("startingYellowPoint", Point.class);
//        Color checkColor = context.getBean("startingYellowColor", Color.class);
//        Color currentColor = new Color(image.getRGB(point.x, point.y));
//        Color color = Color.GREEN;
//        for (int i = -20; i < 20; i++) {
//            image.setRGB((int) point.getX() + i, (int) point.getY(), color.getRGB());
//        }
//
//        for (int i = -20; i < 20; i++) {
//            image.setRGB((int) point.getX(), (int) point.getY() + i, color.getRGB());
//        }
//        boolean isCloseColor = isCloseColor(checkColor, currentColor);
//        System.out.println("123");
    }
}
