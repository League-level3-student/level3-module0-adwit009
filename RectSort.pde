import java.util.Random;
int [] ints;
int x = 100;
int y  = 200;
void setup() {
  //2. set the size of your window
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  size(100,200);

  //3. initialize your array with the built in width variable
ints = new int [width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  Random rng = new Random(); 
    for (int i = 0; i < ints.length; i++) {
    
      ints[i] = rng.nextInt(height); 
  }  
    

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background (254, 254, 200);

  //7. set the color for your graph
fill(100,100,100);

  //8. draw a rectangle for each int in your array.
  
    for (int i = 0; i < ints.length; i++) {
  rect(i, height,1, -ints[i]);  
  }  
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method
  stepSort(ints);

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  if(mousePressed){
    Random rng = new Random(); 
    for (int i = 0; i < ints.length; i++) {
    
      ints[i] = rng.nextInt(height); }
  }
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}