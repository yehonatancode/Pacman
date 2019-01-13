package Map;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import geom.Point3D;

public class MapOptimizer {
	public Point3D LeftUpCorner;
	public Point3D RighttUpCorner;
	public Point3D LeftDownCorner;
	public Point3D RighttDownCorner;
	public BufferedImage myImage;
	
	public MapOptimizer() throws Exception {
		this.myImage = ImageIO.read(new File("C:\\Users\\User\\Desktop\\Ex4_OOP\\GIS_Ex2-Ex4\\Ariel1.png"));
		this.LeftUpCorner = new geom.Point3D(32.105258, 35.202667,0 );
		this.RighttUpCorner = new geom.Point3D(32.105258, 35.212405,0);
		this.LeftDownCorner = new geom.Point3D(32.101858, 35.202667,0);
		this.RighttDownCorner = new geom.Point3D(32.101858, 35.212405,0);
		
		//32.105258, 35.202667
	}
	
	public void SetCorners(Point3D ul, Point3D ur,Point3D dr,Point3D dl) {
		this.LeftDownCorner = dl;
		this.RighttDownCorner = dr;
		this.LeftUpCorner = ul;
		this.RighttUpCorner = ur;
	}
	
	public double getWidth() {
		return this.myImage.getWidth();
	}
	
	public double getHight() {
		return this.myImage.getHeight();
	}
	
	public double Range() {
		double pro =this.myImage.getWidth() /(this.RighttUpCorner.x() - this.LeftUpCorner.x());
		return pro;
	}
	


}