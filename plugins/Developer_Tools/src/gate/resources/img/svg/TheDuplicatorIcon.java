package gate.resources.img.svg;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * This class has been automatically generated using <a
 * href="http://englishjavadrinker.blogspot.com/search/label/SVGRoundTrip">SVGRoundTrip</a>.
 */
@SuppressWarnings("unused")
public class TheDuplicatorIcon implements
		javax.swing.Icon {
	/**
	 * Paints the transcoded SVG image on the specified graphics context. You
	 * can install a custom transformation on the graphics context to scale the
	 * image.
	 * 
	 * @param g
	 *            Graphics context.
	 */
	public static void paint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Area clip = null;
         
        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    Shape clip_ = g.getClip();
AffineTransform defaultTransform_ = g.getTransform();
//  is CompositeGraphicsNode
float alpha__0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0 = g.getClip();
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
clip = new Area(g.getClip());
clip.intersect(new Area(new Rectangle2D.Double(0.0,0.0,48.0,48.0)));
g.setClip(clip);
// _0 is CompositeGraphicsNode
float alpha__0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0 = g.getClip();
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0 is CompositeGraphicsNode
float alpha__0_0_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0015079975128174f, 0.0f, 0.0f, 1.0006159543991089f, -0.050022050738334656f, -0.06304895132780075f));
// _0_0_0 is CompositeGraphicsNode
float alpha__0_0_0_0 = origAlpha;
origAlpha = origAlpha * 0.17045452f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_0 = g.getClip();
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0 is ShapeNode
paint = new Color(0, 0, 0, 255);
shape = new Rectangle2D.Double(20.161836624145508, 34.03341293334961, 13.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_0;
g.setTransform(defaultTransform__0_0_0_0);
g.setClip(clip__0_0_0_0);
float alpha__0_0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(22.308330535888672, 18.99213981628418), new Point2D.Double(35.78529357910156, 39.49823760986328), new float[] {0.0f,0.59928656f,0.82758623f,1.0f}, new Color[] {new Color(240, 239, 241, 255),new Color(232, 230, 234, 255),new Color(255, 255, 255, 255),new Color(214, 211, 218, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0656980276107788f, 0.0f, 0.0f, 0.9875950217247009f, -8.548319816589355f, -4.8917131423950195f));
shape = new RoundRectangle2D.Double(1.5484408140182495, 1.5629303455352783, 30.95155906677246, 35.976688385009766, 1.131310224533081, 1.1323192119598389);
g.setPaint(paint);
g.fill(shape);
paint = new Color(139, 125, 149, 255);
stroke = new BasicStroke(0.9989392f,0,0,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(1.5484408140182495, 1.5629303455352783, 30.95155906677246, 35.976688385009766, 1.131310224533081, 1.1323192119598389);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_0_1;
g.setTransform(defaultTransform__0_0_0_1);
g.setClip(clip__0_0_0_1);
float alpha__0_0_0_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_2 = g.getClip();
AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(26.076091766357422, 26.69667625427246), new Point2D.Double(30.811172485351562, 42.00735092163086), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9985039830207825f, 0.0f, 0.0f, 0.9982460141181946f, -6.970390796661377f, -4.8929009437561035f));
stroke = new BasicStroke(0.99893963f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(2.532512903213501, 2.5605955123901367, 28.970741271972656, 33.981056213378906);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_0_2;
g.setTransform(defaultTransform__0_0_0_2);
g.setClip(clip__0_0_0_2);
float alpha__0_0_0_3 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_3 = g.getClip();
AffineTransform defaultTransform__0_0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_3 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(7.016119003295898, 10.033413887023926, 21.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_3;
g.setTransform(defaultTransform__0_0_0_3);
g.setClip(clip__0_0_0_3);
float alpha__0_0_0_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_4 = g.getClip();
AffineTransform defaultTransform__0_0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_4 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(7.016119003295898, 14.033413887023926, 20.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_4;
g.setTransform(defaultTransform__0_0_0_4);
g.setClip(clip__0_0_0_4);
float alpha__0_0_0_5 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_5 = g.getClip();
AffineTransform defaultTransform__0_0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_5 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(7.016119003295898, 18.033414840698242, 18.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_5;
g.setTransform(defaultTransform__0_0_0_5);
g.setClip(clip__0_0_0_5);
float alpha__0_0_0_6 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_6 = g.getClip();
AffineTransform defaultTransform__0_0_0_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_6 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(7.016119003295898, 22.033414840698242, 21.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_6;
g.setTransform(defaultTransform__0_0_0_6);
g.setClip(clip__0_0_0_6);
float alpha__0_0_0_7 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_0_7 = g.getClip();
AffineTransform defaultTransform__0_0_0_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_7 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(7.016119003295898, 26.03341293334961, 13.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_0_7;
g.setTransform(defaultTransform__0_0_0_7);
g.setClip(clip__0_0_0_7);
origAlpha = alpha__0_0_0;
g.setTransform(defaultTransform__0_0_0);
g.setClip(clip__0_0_0);
float alpha__0_0_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1 = g.getClip();
AffineTransform defaultTransform__0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.7461140155792236f, -0.015543710440397263f));
// _0_0_1 is CompositeGraphicsNode
float alpha__0_0_1_0 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_0 = g.getClip();
AffineTransform defaultTransform__0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_0 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(22.308330535888672, 18.99213981628418), new Point2D.Double(35.78529357910156, 39.49823760986328), new float[] {0.0f,0.59928656f,0.82758623f,1.0f}, new Color[] {new Color(240, 239, 241, 255),new Color(232, 230, 234, 255),new Color(255, 255, 255, 255),new Color(214, 211, 218, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0672359466552734f, 0.0f, 0.0f, 0.9892759919166565f, 4.391684055328369f, 4.035226821899414f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.072946, 10.500852);
((GeneralPath)shape).lineTo(44.929333, 10.500852);
((GeneralPath)shape).curveTo(45.24507, 10.500852, 45.499256, 10.753945, 45.499256, 11.068324);
((GeneralPath)shape).lineTo(45.499256, 38.235687);
((GeneralPath)shape).curveTo(45.499256, 40.71214, 38.619446, 46.538773, 36.231323, 46.538773);
((GeneralPath)shape).lineTo(15.072946, 46.538773);
((GeneralPath)shape).curveTo(14.757206, 46.538773, 14.50302, 46.285683, 14.50302, 45.9713);
((GeneralPath)shape).lineTo(14.50302, 11.068324);
((GeneralPath)shape).curveTo(14.50302, 10.753945, 14.757206, 10.500852, 15.072946, 10.500852);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(139, 125, 149, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.072946, 10.500852);
((GeneralPath)shape).lineTo(44.929333, 10.500852);
((GeneralPath)shape).curveTo(45.24507, 10.500852, 45.499256, 10.753945, 45.499256, 11.068324);
((GeneralPath)shape).lineTo(45.499256, 38.235687);
((GeneralPath)shape).curveTo(45.499256, 40.71214, 38.619446, 46.538773, 36.231323, 46.538773);
((GeneralPath)shape).lineTo(15.072946, 46.538773);
((GeneralPath)shape).curveTo(14.757206, 46.538773, 14.50302, 46.285683, 14.50302, 45.9713);
((GeneralPath)shape).lineTo(14.50302, 11.068324);
((GeneralPath)shape).curveTo(14.50302, 10.753945, 14.757206, 10.500852, 15.072946, 10.500852);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1_0;
g.setTransform(defaultTransform__0_0_1_0);
g.setClip(clip__0_0_1_0);
float alpha__0_0_1_1 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_1 = g.getClip();
AffineTransform defaultTransform__0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_1 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(26.076091766357422, 26.69667625427246), new Point2D.Double(30.811172485351562, 42.00735092163086), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9994210004806519f, 0.0f, 0.0f, 1.0f, 5.991319179534912f, 4.033411026000977f));
stroke = new BasicStroke(1.0000008f,0,0,4.0f,null,0.0f);
shape = new Rectangle2D.Double(15.502950668334961, 11.5, 28.99734878540039, 34.04076385498047);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1_1;
g.setTransform(defaultTransform__0_0_1_1);
g.setClip(clip__0_0_1_1);
float alpha__0_0_1_2 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_2 = g.getClip();
AffineTransform defaultTransform__0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_2 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(35.99658203125, 40.458221435546875), new Point2D.Double(33.664920806884766, 37.770721435546875), new float[] {0.0f,1.0f}, new Color[] {new Color(122, 113, 135, 255),new Color(183, 178, 190, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.16183614730835f, 4.033411026000977f));
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.220917, 46.536964);
((GeneralPath)shape).curveTo(38.251335, 46.866863, 45.80971, 42.00704, 45.50533, 38.039124);
((GeneralPath)shape).curveTo(43.942066, 40.46222, 40.746807, 39.32586, 36.63805, 39.48487);
((GeneralPath)shape).curveTo(36.63805, 39.48487, 37.033417, 46.036964, 36.220917, 46.536964);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.fill(shape);
paint = new Color(139, 125, 149, 255);
stroke = new BasicStroke(1.0000002f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(36.220917, 46.536964);
((GeneralPath)shape).curveTo(38.251335, 46.866863, 45.80971, 42.00704, 45.50533, 38.039124);
((GeneralPath)shape).curveTo(43.942066, 40.46222, 40.746807, 39.32586, 36.63805, 39.48487);
((GeneralPath)shape).curveTo(36.63805, 39.48487, 37.033417, 46.036964, 36.220917, 46.536964);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1_2;
g.setTransform(defaultTransform__0_0_1_2);
g.setClip(clip__0_0_1_2);
float alpha__0_0_1_3 = origAlpha;
origAlpha = origAlpha * 0.36931816f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_3 = g.getClip();
AffineTransform defaultTransform__0_0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_3 is ShapeNode
paint = new LinearGradientPaint(new Point2D.Double(33.39600372314453, 36.92133331298828), new Point2D.Double(34.170047760009766, 38.07038116455078), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 6.16183614730835f, 3.6584110260009766f));
stroke = new BasicStroke(0.9999998f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(37.671356, 44.345463);
((GeneralPath)shape).curveTo(39.041134, 43.661636, 42.099606, 42.198997, 43.398987, 40.317993);
((GeneralPath)shape).curveTo(41.80289, 40.99805, 40.451176, 40.527493, 37.69665, 40.5084);
((GeneralPath)shape).curveTo(37.69665, 40.5084, 37.858974, 43.570496, 37.671356, 44.345463);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
origAlpha = alpha__0_0_1_3;
g.setTransform(defaultTransform__0_0_1_3);
g.setClip(clip__0_0_1_3);
float alpha__0_0_1_4 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_4 = g.getClip();
AffineTransform defaultTransform__0_0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_4 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(20.0, 19.033414840698242, 21.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_4;
g.setTransform(defaultTransform__0_0_1_4);
g.setClip(clip__0_0_1_4);
float alpha__0_0_1_5 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_5 = g.getClip();
AffineTransform defaultTransform__0_0_1_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_5 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(20.0, 23.033414840698242, 19.992233276367188, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_5;
g.setTransform(defaultTransform__0_0_1_5);
g.setClip(clip__0_0_1_5);
float alpha__0_0_1_6 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_6 = g.getClip();
AffineTransform defaultTransform__0_0_1_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_6 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(20.0, 27.033414840698242, 17.976701736450195, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_6;
g.setTransform(defaultTransform__0_0_1_6);
g.setClip(clip__0_0_1_6);
float alpha__0_0_1_7 = origAlpha;
origAlpha = origAlpha * 1.0f;
g.setComposite(AlphaComposite.getInstance(3, origAlpha));
Shape clip__0_0_1_7 = g.getClip();
AffineTransform defaultTransform__0_0_1_7 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_1_7 is ShapeNode
paint = new Color(173, 167, 183, 255);
shape = new Rectangle2D.Double(20.0, 31.033414840698242, 21.0, 2.0);
g.setPaint(paint);
g.fill(shape);
origAlpha = alpha__0_0_1_7;
g.setTransform(defaultTransform__0_0_1_7);
g.setClip(clip__0_0_1_7);
origAlpha = alpha__0_0_1;
g.setTransform(defaultTransform__0_0_1);
g.setClip(clip__0_0_1);
origAlpha = alpha__0_0;
g.setTransform(defaultTransform__0_0);
g.setClip(clip__0_0);
origAlpha = alpha__0;
g.setTransform(defaultTransform__0);
g.setClip(clip__0);
g.setTransform(defaultTransform_);
g.setClip(clip_);

	}
	
	public Image getImage() {
		BufferedImage image =
            new BufferedImage(getIconWidth(), getIconHeight(),
                    BufferedImage.TYPE_INT_ARGB);
    	Graphics2D g = image.createGraphics();
    	paintIcon(null, g, 0, 0);
    	g.dispose();
    	return image;
	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static int getOrigX() {
        return 2;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static int getOrigY() {
        return 2;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static int getOrigWidth() {
		return 48;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static int getOrigHeight() {
		return 48;
	}

	/**
	 * The current width of this resizable icon.
	 */
	int width;

	/**
	 * The current height of this resizable icon.
	 */
	int height;

	/**
	 * Creates a new transcoded SVG image.
	 */
	public TheDuplicatorIcon() {
        this.width = getOrigWidth();
        this.height = getOrigHeight();
	}
	
	/**
	 * Creates a new transcoded SVG image with the given dimensions.
	 *
	 * @param size the dimensions of the icon
	 */
	public TheDuplicatorIcon(Dimension size) {
	this.width = size.width;
	this.height = size.width;
	}

	public TheDuplicatorIcon(int width, int height) {
	this.width = width;
	this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconHeight()
	 */
    @Override
	public int getIconHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#getIconWidth()
	 */
    @Override
	public int getIconWidth() {
		return width;
	}

	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.swing.Icon#paintIcon(java.awt.Component, java.awt.Graphics,
	 * int, int)
	 */
    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.translate(x, y);
						
		Area clip = new Area(new Rectangle(0, 0, this.width, this.height));		
		if (g2d.getClip() != null) clip.intersect(new Area(g2d.getClip()));		
		g2d.setClip(clip);

		double coef1 = (double) this.width / (double) getOrigWidth();
		double coef2 = (double) this.height / (double) getOrigHeight();
		double coef = Math.min(coef1, coef2);
		g2d.scale(coef, coef);
		paint(g2d);
		g2d.dispose();
	}
}

