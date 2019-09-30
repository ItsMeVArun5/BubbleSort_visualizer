import processing.core.PApplet;

class BubbleSortVisualizer extends PApplet{
    
    float bars[];
    float temp;
    int i = 0; int j = 0;
    int size = (int) random(10,40);
    
	public void settings(){
        size(800, 800);
        bars = new float[size];
        
        for (int i=0; i<size; i++){
            bars[i] = random (100, height);
        }
	}
	
	public void draw(){
        frameRate(7);
        background(255);
        createBars();
        

        if (bars[j] > bars[j+1]){
            temp = bars[j];
            bars[j] = bars[j+1];
            createBars();
            drawBars(bars[j], 50+j*15, 0, 255, 0);
            bars[j+1] = temp;
            drawBars(bars[j+1], 50+(j+1)*15, 255, 0, 0);
        }
        else{
            drawBars(bars[j], 50+j*15, 251, 0, 0);
            drawBars(bars[j+1], 50+(j+1)*15, 0, 250, 0);   
        }

        j++;
     
        if (i<size){
            if (j>=size-i-1){
                i++;
                j = 0;
            }
        }
        else{
            noLoop();
        }
                
    }

    public void createBars(){
        background(255);
        for (int i=0; i<size; i++){
            drawBars(bars[i], 50+i*15, 51, 0, 0);
        }
    }
    
    public void drawBars(float barSize, int shiftX, int R, int G, int B){
        strokeWeight(10);
        stroke(R, G, B);
        strokeCap(SQUARE);
        line(shiftX+50, 100, shiftX+50, barSize);
    }
}
   
