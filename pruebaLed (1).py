#Desarrollador por Jefferson Rivera
#riverajeferàgmail.com
import pyrebase
import RPi.GPIO as GPIO
from time import sleep

config = {  
            "apiKey": "0",
            "authDomain": "0",
            "databaseURL": "0",
           
            "storageBucket": "0"
            
                
           }


firebase = pyrebase.initialize_app(config)


db = firebase.database()


GPIO.setmode(GPIO.BCM)
GPIO.setwarnings(False)



print ("**********   INICIO  *************")



salidaLed1 = db.child("Led1").get()
print(salidaLed1)



salidaLed2 = db.child("Led2").get()
print(salidaLed2.val())

sleep(1)

GPIO.cleanup()
