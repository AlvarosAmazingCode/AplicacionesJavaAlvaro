void setup() {

  pinMode(8, INPUT);
  pinMode(5,OUTPUT);
  pinMode(9,OUTPUT);
  pinMode(11,OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(7, OUTPUT);

}

void loop() {
  digitalWrite(7, HIGH);
  if(digitalRead(8)== LOW || digitalRead(3) == LOW){
 tone(5, 500,900);
digitalWrite(11, HIGH);
digitalWrite(9, HIGH);
delay(900);
digitalWrite(11, HIGH);
digitalWrite(9, LOW);
delay(100);

  }else{
digitalWrite(10,LOW);
digitalWrite(9, LOW);
digitalWrite(11,LOW);
noTone(5);
  }
}
