import processing.core.PApplet;

class Main {
	public static void main(String[] args){
		String[] processingArgs = {"BubbleSortVisualizer"};
		BubbleSortVisualizer visualizer = new BubbleSortVisualizer();
		PApplet.runSketch(processingArgs, visualizer);
	}
}