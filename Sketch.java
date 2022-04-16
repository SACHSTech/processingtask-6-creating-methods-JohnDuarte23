import processing.core.PApplet;

/**
 * Sketching using methods
 * @author JohnDuarte23
 */

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  drawHouse(100, 200, 200, 200, 255, 255, 255);

    drawRoof(200, 100, 100, 200, 300, 200, 61, 61, 61);

    drawDoor(180, 320, 40, 80, 101, 67, 33);

    drawWindows(120, 240, 50, 50, 220, 240, 50, 50, 173, 216, 230);

	  drawSun(150, 150, 50, 50, 50, 249, 215, 28);
  }

  /**
   * Draws house body, and the house body colour
   * @param fltHouse1 Starting X coordinate of house body
   * @param fltHouse2 Starting Y coordinate of house body
   * @param fltHouse3 House body width
   * @param fltHouse4 House body height
   * @param fltHouseColour1 "R" value of RGB house body colour
   * @param fltHouseColour2 "G" value of RGB house body colour
   * @param fltHouseColour3 "B" value of RGB house body colour
   */
  public void drawHouse(float fltHouse1, float fltHouse2, float fltHouse3, float fltHouse4, float fltHouseColour1, float fltHouseColour2, float fltHouseColour3)
  {
    fill(fltHouseColour1, fltHouseColour2, fltHouseColour3);
    rect(fltHouse1, fltHouse2, fltHouse3, fltHouse4);
  }

  /**
   * Draws roof of house, and roof colour
   * @param fltRoof1 X coordinate of the roof's first point
   * @param fltRoof2 Y coordinate of the roof's first point
   * @param fltRoof3 X coordinate of the roof's second point
   * @param fltRoof4 Y coordinate of the roof's second point
   * @param fltRoof5 X coordinate of the roof's third point
   * @param fltRoof6 Y coordinate of the roof's third point
   * @param fltRoofColour1 "R" value of RGB roof colour
   * @param fltRoofColour2 "G" value of RGB roof colour
   * @param fltRoofColour3 "B" value of RGB roof colour
   */
  public void drawRoof(float fltRoof1, float fltRoof2, float fltRoof3, float fltRoof4, float fltRoof5, float fltRoof6, float fltRoofColour1, float fltRoofColour2, float fltRoofColour3)
  {
    fill(fltRoofColour1, fltRoofColour2, fltRoofColour3);
    triangle(fltRoof1, fltRoof2, fltRoof3,fltRoof4, fltRoof5, fltRoof6);
  }

  /**
   * Draws door of the hosue, and door colour
   * @param fltDoor1 Starting X coordinate of door
   * @param fltDoor2 Starting Y coordinate of door
   * @param fltDoor3 Width of door
   * @param fltDoor4 Height of door
   * @param fltDoorColour1 "R" value of RGB door colour
   * @param fltDoorColour2 "G" value of RGB door colour
   * @param fltDoorColour3 "B" value of RGB door colour
   */
  public void drawDoor(float fltDoor1, float fltDoor2, float fltDoor3, float fltDoor4, float fltDoorColour1, float fltDoorColour2, float fltDoorColour3)
  {
    fill(fltDoorColour1, fltDoorColour2, fltDoorColour3);
    rect(fltDoor1, fltDoor2, fltDoor3, fltDoor4);
  }

  /**
   * Draws windows of house, and window colour
   * @param fltWindow1 Starting X coordinate of 1st window
   * @param fltWindow2 Starting Y coordinate of 1st window
   * @param fltWindow3 Width of 1st window
   * @param fltWindow4 Height of 1st window
   * @param fltWindow5 Starting X coordinate of 2nd window
   * @param fltWindow6 Starting Y coordinate of 2nd window
   * @param fltWindow7 Width of 2nd window
   * @param fltWindow8 Height of 2nd window
   * @param fltWindowColour1 "R" value of RGB window colour
   * @param fltWindowColour2 "G" value of RGB window colour
   * @param fltWindowColour3 "B" value of RGB window colour
   */
  public void drawWindows(float fltWindow1, float fltWindow2, float fltWindow3, float fltWindow4, float fltWindow5, float fltWindow6, float fltWindow7, float fltWindow8, float fltWindowColour1, float fltWindowColour2, float fltWindowColour3)
  {
    fill(fltWindowColour1, fltWindowColour2, fltWindowColour3);
    rect(fltWindow1, fltWindow2, fltWindow3, fltWindow4);

    fill(fltWindowColour1, fltWindowColour2, fltWindowColour3);
    rect(fltWindow5, fltWindow6, fltWindow7, fltWindow8);
  }

  /**
   * Draws the sun, and the sun colour
   * @param fltSun1 Contributes to the centre X coordinate of the Sun
   * @param fltSun2 Contributes to the centre X coordinate of the Sun
   * @param fltSun3 Centre Y coordinate of the Sun
   * @param fltSun4 Width of Sun
   * @param fltSun5 Height of Sun
   * @param fltSunColour1 "R" value of RGB window colour
   * @param fltSunColour2 "G" value of RGB window colour
   * @param fltSunColour3 "B" value of RGB window colour
   */
  public void drawSun(float fltSun1, float fltSun2, float fltSun3, float fltSun4, float fltSun5, float fltSunColour1, float fltSunColour2, float fltSunColour3)
  {
    float fltSunX = drawSunX(fltSun1, fltSun2);
    
    fill(fltSunColour1, fltSunColour2, fltSunColour3);
    ellipse(fltSunX, fltSun3, fltSun4, fltSun5);
  }
  
  // Adds contributing x values of the sun, returning the value of the sum
  public float drawSunX(float fltSun1, float fltSun2) {

    return fltSun1 + fltSun2;
  }
  // define other methods down here.
}