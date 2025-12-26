package interfaces;

@FunctionalInterface
public interface Area {
	double calCircleArea(int radius);

}
/*
 * 
 * class AreaImpl implements Area{
 * 
 * @Override 
 * public double calCircleArea(int radius) { 
 * // TODO Auto-generated
 * return 3.14*radius*radius;
 * 
 * }
 * 
 * radius -> 3.14*radius*radius;
 * 
 * AreaImpl area = new AreaImpl();
 * double result = area.calCircleArea(5);
 * 
 */