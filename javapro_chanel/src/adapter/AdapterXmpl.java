package adapter;

public class AdapterXmpl {
//	public static void main(String[] args) {
//		VectorGraphicsInterface g1 = new VectorAdapterFromRaster();
//		g1.drawLine();
//		g1.drawSquare();
//		
//		VectorGraphicsInterface g2 = new VectorAdapterFromRaster2();
//		g2.drawLine();
//		g2.drawSquare();
//	}
}

interface VectorGraphicsInterface{ void drawLine();	void drawSquare();}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraphicsInterface{
	public void drawLine(){	drawRasterLine();}
	public void drawSquare(){ drawRasterSquare();}
}

class VectorAdapterFromRaster2 implements VectorGraphicsInterface{
	public void drawLine() { new RasterGraphics().drawRasterLine();}
	public void drawSquare() { new RasterGraphics().drawRasterSquare();}
}

class RasterGraphics{
	void drawRasterLine(){ System.out.println("Draw Raster Line");}
	void drawRasterSquare(){ System.out.println("Draw Raster Square");}
}