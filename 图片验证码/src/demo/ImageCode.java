package src.demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
* @Author: Xinyu Wei
* @Description: 
* @Date: Created on 2023/2/28
* @Modified By: 
*/

public class ImageCode {
    static String[] strs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k",
    "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
    "2", "3", "4", "5", "6", "7", "8", "9"};

    public static void main(String[] args) throws IOException {
        int width = 150;
        int height = 50;
        int imageType = BufferedImage.TYPE_INT_RGB;
        BufferedImage image = new BufferedImage(width, height, imageType);

        Graphics g = image.getGraphics();
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.ORANGE);
        g.setFont(new Font("楷体", Font.PLAIN, 30));
        int x = 30;
        int y = 40;
        for (int i = 0; i < 4; i++) {
            int num = new Random().nextInt(strs.length);
            String str = strs[num];
            g.drawString(str, x + i * 25, y);
        }
        g.setColor(Color.GREEN);
        for (int i = 0; i < 10; i++) {
            int x1 = new Random().nextInt(30);
            int y1 = new Random().nextInt(50);

            int x2 = new Random().nextInt(30) + 120;
            int y2 = new Random().nextInt(50);

            g.drawLine(x1, y1, x2, y2);
        }


        ImageIO.write(image, "jpg", new File("D:\\Workspace\\Projects\\Java基础练习\\JavaPractice\\图片验证码\\out\\image.jpg"));
    }
}
