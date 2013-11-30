package com.rocky.jenosystem.home.pi.serial;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialDataListener;
import com.pi4j.io.serial.SerialFactory;
import com.pi4j.io.serial.SerialPortException;

/**
 * @author Tolis
 *
 */
public class SerialConnector {
	
	@Value("${env.raspberry.pi.serial.arduino.port}")
	private final Serial serial;
	
	private String port;	//port
	
	@Value("${env.raspberry.pi.serial.arduino.baudrate}")
	private String baudRate;	//9800
    
    public SerialConnector() throws InterruptedException {
                
        System.out.println("<--Pi4J--> Serial Communication Example ... started.");
        System.out.println(" ... connect using settings: 9800, N, 8, 1.");
        System.out.println(" ... data received on serial port should be displayed below.");
        
        // create an instance of the serial communications class
        serial = SerialFactory.createInstance();

        // create and register the serial data listener
        serial.addListener(new SerialDataListener() {
            @Override
            public void dataReceived(SerialDataEvent event) {
                System.out.print(event.getData());
            }            
        });
    }
    
    public void write(){
    	try {
    		// open the default serial port provided on the GPIO header
    		serial.open(port, Integer.valueOf(baudRate) );

    		try {
    			// write a formatted string to the serial transmit buffer
    			serial.write("CURRENT TIME: %s", new Date().toString());

    			// write a individual bytes to the serial transmit buffer
    			serial.write((byte) 13);
    			serial.write((byte) 10);

    			// write a simple string to the serial transmit buffer
    			serial.write("Second Line");

    			// write a individual characters to the serial transmit buffer
    			serial.write('\r');
    			serial.write('\n');

    			// write a string terminating with CR+LF to the serial transmit buffer
    			serial.writeln("Third Line");
    		}
    		catch(IllegalStateException ex){
    			ex.printStackTrace();                    
    		}

    	}
    	catch(SerialPortException ex) {
    		System.out.println(" ==>> SERIAL SETUP FAILED : " + ex.getMessage());
    		return;
    	}    	
    }

	/**
	 * @return
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return
	 */
	public String getBaudRate() {
		return baudRate;
	}

	/**
	 * @param baudRate
	 */
	public void setBaudRate(String baudRate) {
		this.baudRate = baudRate;
	}
}