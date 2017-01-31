package Test;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageFilter;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class TestScreenShot {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		TestScreenShot ts = new TestScreenShot();
		String imgPath = "E:\\TestCaseImg\\2015_10_26_12_33_11.png";  
		BufferedImage image = ImageIO.read(new FileInputStream(imgPath));  
		BufferedImage bi = ts.cutBufferedImage(image, 0, 0, 200, 200);
		String format = "png";
		String fileName = "myFirst";
		File path = new File("E:\\TestCaseImg");
	    File file = new File(path, fileName+ "." + format);
		ImageIO.write(bi, format, file);
		System.out.println("截图完成");
		
		//获取图片长、宽
//		String imgPath = "E:\\TestCaseImg\\2015_10_26_12_33_11.png";		
//		TestScreenShot ts = new TestScreenShot();
//		ts.cutBufferedImageFromMiddlePoint(imgPath, 500, 500);
	}
	
	public void cutBufferedImageFromMiddlePoint(String filePath, int width, int height) throws FileNotFoundException, IOException {
		BufferedImage image = ImageIO.read(new FileInputStream(filePath));
		int y = image.getHeight();
		int x = image.getWidth();
		System.out.println("长：" + x + ";宽：" + y);
		int x_middle = x/2;
		int y_middle = y/2;
		System.out.println("中心坐标x：" + x_middle + ";中心坐标y：" + y_middle);
		int x_start = (x - width)/2;
		int y_start = (y - height)/2;
		BufferedImage bi = cutBufferedImage(image, x_start, y_start, width, height);
		String format = "png";
		String fileName = "myFirst";
		File path = new File("E:\\TestCaseImg");
	    File file = new File(path, fileName+ "." + format);
		ImageIO.write(bi, format, file);
		System.out.println("截图完成");
	}

	/**
	 * 指定屏幕区域截图，返回截图的BufferedImage对象
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return
	 */
	public BufferedImage getScreenShot(int x, int y, int width, int height) {
		BufferedImage bfImage = null;
		try {
			Robot robot = new Robot();
			bfImage = robot.createScreenCapture(new Rectangle(x, y, width,
					height));
		} catch (AWTException e) {
			e.printStackTrace();
		}
		return bfImage;
	}

	/**
	 * 指定屏幕区域截图，保存到指定目录
	 * 
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @param savePath
	 *            - 文件保存路径
	 * @param fileName
	 *            - 文件保存名称
	 * @param format
	 *            - 文件格式
	 */
	public void screenShotAsFile(int x, int y, int width, int height,
			String savePath, String fileName, String format) {
		try {
			Robot robot = new Robot();
			BufferedImage bfImage = robot.createScreenCapture(new Rectangle(x,
					y, width, height));
			File path = new File(savePath);
			File file = new File(path, fileName + "." + format);
			ImageIO.write(bfImage, format, file);
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * BufferedImage图片剪裁
	 * 
	 * @param srcBfImg
	 *            - 被剪裁的BufferedImage
	 * @param x
	 *            - 左上角剪裁点X坐标
	 * @param y
	 *            - 左上角剪裁点Y坐标
	 * @param width
	 *            - 剪裁出的图片的宽度
	 * @param height
	 *            - 剪裁出的图片的高度
	 * @return 剪裁得到的BufferedImage
	 */
	public BufferedImage cutBufferedImage(BufferedImage srcBfImg, int x, int y,
			int width, int height) {
		BufferedImage cutedImage = null;
		CropImageFilter cropFilter = new CropImageFilter(x, y, width, height);
		Image img = Toolkit.getDefaultToolkit().createImage(
				new FilteredImageSource(srcBfImg.getSource(), cropFilter));
		cutedImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = cutedImage.getGraphics();
		g.drawImage(img, 0, 0, null);
		g.dispose();
		return cutedImage;
	}

}
