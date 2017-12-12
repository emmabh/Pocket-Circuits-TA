# AppTest2
  This application was created to assist students at Boston Univeristy in their introductory circuits laboratory. It includes a tool set  
  for each lab. Some of the tools are diagrams, and others are supplemental calculators. The student simply clicks on whichever lab he or
  she is doing, and then he or she can choose the appropriate tool to use.

## Instructions for running the code
  In order to run this code, fork this repository and clone this repository to your desktop. Then, open it as a project in Android Studio
  and download it onto your preferred emulator or Android device using the "Run" option.
  
## Test Cases
### Critically damped 
  Works:
  ```
    .25, 1000
    Critically damped R = .031622777
  ```  
  Error:
  ```
    NULL, 100
    Inductance needed 
    
    1000, NULL
    Capacitance needed
    
     0, 0
    Neither L nor C can be zero 
  ```
    
### Passive filter cutoff 
  Works:
  ```
    10, 20
    W: .005, f: 7.95775 x 10^-4 Hz
  ```  
  Error:
  ```
    0, 20 
    Resistance cannot be zero 
    
    20, 0 
    Capacitance cannot be zero
    
    NULL, 0
    Two Values Needed 
    
    0, NULL
    Two Values Needed 
   ```
    
### Eq resistance 
  Works:
  ```
    2, 3 
    Parallel: 1.2
    Series: 5.0
  ```
    
  Error:
  ```
    0, 3
    Parallel: 0.0
    Series: 3.0
    
    Null, Null
    Two resistances needed
  ```

### Inverting 
  Works:
  ```
    0, 2, 4
    Gain: 2.0, Vout: 0.0V
    
    4, 2, 4
    Gain: -2.0, Vout: -8.0 V
    
    -4, 2, 4
    Gain: -2.0, Vout: 8.0 V
  ```
  Error:
  ```
    Null, 2, 4
    Gain: -2.0
    
    4, Null, 4 
   Fill both resistance values 
  ```
### Noninverting 
  Works:
  ```
    0, 2, 4
    Gain: 3.0, Vout: 0.0V
    
    4, 2, 4
    Gain: 3.0, Vout: 12.0 V
    
    -4, 2, 4
    Gain: 3.0, Vout: -12.0 V
 ```
  Error:
  ```
    Null, 2, 4
    Gain: 3.0
    
    4, Null, 4
    Two resistances needed
  ```
  
### Time constant RC
  Works:
  ```
     2000, .0001
     Time constant: 0.2 seconds
     
    2000, .000000001
    Time constant: 2.0 E-6 seconds
 ```   
  Error:
  ```
    NULL, .01
    Two values needed
    
    .01, NULL
    Two values needed
    
    NULL, NULL
    Two values needed
  ```

### Time constant RL 
  Works:
  ```
    2000, .001
    Time constant: 5.0 E-7 seconds
    
    2000, .1
    Time constant: 5.0 E-5 seconds
  ```  
  Errors:
  ```
    NULL, .01
    Two values needed
    
    .01, NULL
    Two values needed
    
    NULL, NULL
    Two values needed
```
### VIR 
```
    -2, 4, NULL
    Voltage and current must match sign
    
    2, 4, 3
    Fill 2 out of 3 elements
    
    NULL, 4, 2 
    Voltage: 8.0V
```

### Voltage Divider
  Works: 
  ```
    2.5, 2, 3.75
    1.2 Volts
    
    0, 50, 10
    50 Volts 
    
    .15, -2, .5
    Vout: -1.538… Volts 
 ```
  Errors:
  ```
    10, 10, NULL
    Resistance 2 needed 

    NULL, 10, 10
    Resistance 1 needed 

    10, NULL, 10
    Voltage Value Needed 
  ```
