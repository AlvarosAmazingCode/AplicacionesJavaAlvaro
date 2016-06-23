#include <Adafruit_NeoPixel.h>
#ifdef __AVR__//IF this is a AVR microcontroller it uses this library
#include <avr/power.h>//<-
#endif//Ends if

// Which pin on the Arduino is connected to the NeoPixels?
#define PIN            1

// How many NeoPixels are attached to the Arduino?
#define NUMPIXELS      8

// When we setup the NeoPixel library, we tell it how many pixels, and which pin to use to send signals.
// Note that for older NeoPixel strips you might need to change the third parameter--see the strandtest
// example for more information on possible values.
Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);

int delayval = 500; // delay for half a second

void setup() {
  pixels.begin(); // This initializes the NeoPixel library.
  Serial.begin(19200);

     pixels.setPixelColor(0, pixels.Color(100, 200, 0)); // Moderately bright green color.

    pixels.show();

}

void loop() {
  if (Serial.available() > 0) {
    int vr = Serial.parseInt();
    int vg = Serial.parseInt();
    int vb = Serial.parseInt();

    light(vr, vg, vb);
  }
}


void light(int _red, int _green, int _blue) {
  for (int i = 0; i < NUMPIXELS; i++) {

    // pixels.Color takes RGB values, from 0,0,0 up to 255,255,255
    pixels.setPixelColor(i, pixels.Color(_red, _green, _blue)); // Moderately bright green color.

    pixels.show();

    delay(delayval);

  }
}
