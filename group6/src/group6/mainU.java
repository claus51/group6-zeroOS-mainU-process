package group6;

/*
	Group 6 MainU and Process for ZeroOS
	Bradley Claus and Matthew Conner
	Status: Work in Progress
	Start date: 9/30/19
*/

public class mainU {
	
	//CenProcUnit CPU1;
	//CenProcUnit CPU2;
	//CenProcUnit CPU3;
	
	//DeviceList devices;
	
	//ifstream inFile; 
	
	int currTime = 0;
	int endTime = 0;
	
	//ofstream outFile;
	//ofstream outFile2;
	Process JobTerminal;
	Process ProcessAvailable;
	Process ProcessOnDeck;
	Process ProcessReady;
	Process ProcessWaiting;
	
	
	//Outline for MainU methods, not all int
	
	public int addReady(){
		//adds a process to the ready queue
	}
	
	public int addTerminalList(){
		//Adds a process containing multiple command to the JobTerminal queue

	}
	
	public int addWaiting(){
		//Adds a process to the waiting queue
	}
	
	public int checkCPU(){
		/* Checks the CPU regarding current state of
		processing. If the CPU is currently busy, the
		method advances the job it is currently
		processing. If the CPU is not busy, the
		method searches for a new job to send to the CPU. */

	}
	
	public int displayCPU(){
		//Provides a visual display of current CPU statistics.
	}
	
	public int getDevices(){
		//opens the specified device file and calls the readDevice() function to initialize the processes.

	}
	
	public int getPath(){
		//executes the open dialog, 'openD', to retrieve the file path to be used to open the data files.

	}
	
	public int getProcesses(){
		//opens the process file and calls the 'readProcess()' method to set the processes.

	}
	
	public int printDevice(){
		//writes an AnsiString to the Rich Edit output field, DeviceRE, and to the external data file.

	}
	
	public int printIncomplete(){
		//writes an AnsiString to the Rich Edit output field, IncompleteRE, and to the external data file.

	}
	
	public int printOnDeck(){
		//writes an AnsiString to the Rich Edit output field, OnDeckRE, and to the external data file.

	}
	
	public int printReady(){
		//writes an AnsiString to the Rich Edit output field,ReadyRE, and to the external data file.

	}
	
	public int printTerminal(){
		//writes an AnsiString to the Rich Edit output field, TerminalRE, and to the external data file.

	}
	
	public int printTerminalJob(){
		//writes an AnsiString to the Rich Edit output field,
		// TerminalRE, and to the external data file.

	}
	
	public int progDone(){
		//Displays the contents of the unfinished queues and the program status at program completion.

	}
	
	public int readDevice(){
		//Reads a device from the input file
	}
	
	public int readLine(){
		//Reads a line from an input file and converts the line to Ansistring.

	}
	
	public int readProcess(){
		//Reads a process from the input file.
	}
	
	public int readDisplay(){
		//Clears all previous data from the rich edit boxes.
	}
	
	public int sendProcess(){
		/* Sends all available processes in the 'ProcessOnDeck'
			queue to the respective device drivers and also
			displays the data being transferred in DeviceRE. */

	}
	
	public int setTerminal(){
		//Sets and displays finished jobs from the device drivers.
	}
	
	 
	

}
