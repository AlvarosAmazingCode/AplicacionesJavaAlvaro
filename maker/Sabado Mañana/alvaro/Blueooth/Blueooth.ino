#include <Adafruit_NeoPixel.h>

#ifdef __AVR__
  #include <avr/power.h>
#endif

#define PIN 1
#define NUMPIXELS 8

Adafruit_NeoPixel pixels = Adafruit_NeoPixel(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);

int delayval = 500;
int b = 9;
int g = 11;
int r = 10;
void setup() {
  pixels.begin(); 
  pinMode(b, OUTPUT);
  pinMode(r, OUTPUT);
  pinMode(g, OUTPUT);
  Serial.begin(19200);
}

void loop() {
  if (Serial.available() > 0) {
    
    int vr = Serial.parseInt();
    int vg = Serial.parseInt();
    int vb = Serial.parseInt();

    analogWrite(r, vr);
    analogWrite(g, vg);
    analogWrite(b, vb);

  
   


  }

  
}

}
