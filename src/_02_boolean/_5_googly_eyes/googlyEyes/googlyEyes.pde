  static final int WIDTH = 800;
  static final int HEIGHT = 600;

  PImage puppy;
int x = 330;
int y = 340;
  public void settings() {
    size(WIDTH, HEIGHT);
  }

  public void setup() {
    puppy = loadImage("PuppyEyes.jpg");
    size(800,600);
    puppy.resize(800, 600);
  }

  public void draw() {
    background(puppy);
    fill(255, 255, 255);
    ellipse(330,340,100,100);
    ellipse(570,280,100,100);
    fill(0,0,0);
    if (mouseX < 380 && mouseX > 280 && mouseY < 390 && mouseY > 290){
    x = mouseX;
    y = mouseY;
    }
    ellipse(x,y,50,50);
    ellipse(x + 240 ,y - 60,50,50);
  }
