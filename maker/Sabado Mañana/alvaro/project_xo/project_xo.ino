#include <SharpIR.h>

#define ir A0
#define model 1080
    
SharpIR SharpIR(ir, model);
int green = 7;
int blue = 6;
int red = 5;
int boton = 12;
int buzzer = 10;
int laser = 11;
int dis;
void setup() {
 pinMode(boton, INPUT);
 pinMode(red, OUTPUT);
 pinMode(green, OUTPUT);
 pinMode(blue, OUTPUT);
 pinMode(buzzer, OUTPUT);
 pinMode(laser, OUTPUT);
 Serial.begin(9600);

 digitalWrite(red, HIGH);
 tone(buzzer, 300);
 delay(900);
 digitalWrite(green, HIGH);
 tone(buzzer, 500);
 delay(900);
 tone(buzzer, 700);
 digitalWrite(blue, HIGH);
 delay(900); 
 digitalWrite(red, LOW);
 digitalWrite(green, LOW);
 digitalWrite(blue, LOW);
 noTone(buzzer);
 
 digitalWrite(laser, HIGH);

}

void loop() {
 dis=SharpIR.distance();
 if(
 
}
