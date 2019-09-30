package group6;

/*
Group 6 Process for ZeroOS
Bradley Claus and Matthew Conner
Status: Work in Progress
Start date: 9/30/19
Last Edit: 9/30/19
*/

public class Process {
	
	//Outline for Process methods, not all int 

	Process(){
		//constructor, sets the process pointer to NULL
	}
	
	public int Initialize(){
		//sets up a new PCB for one process.  This PCB is added to the linked list of processes.  The PCB is inserted by release time, with first process to be executed at head of list.
	}
	
	public int initializeList(){
		//this initializes a PCB, which contains a list of multiple sub processes.  This inserts the process into the list according to its release time.  
	}
	
	public int decrement(){
		// this reduces the characters left to be processed according to the processSpeed.  In addition, it increments the cycles that the process has completed.
	}
	
	public int deleteNode(){
		//deletes a PCB node from the list of processes after it has been processed.
	}
	
	public int printReady(){
		//prints the information of processes (PCB’s) that are in the ready queue.

	}
	
	public int printOnDeck(){
		//prints the information of processes that are “on deck” or in the waiting queue.
	}
	
	public int printDevice(){
		//prints the list of processes that have been sent to devices (running)

	}
	
	public int printTerminal(){
		//prints the linked list of processes that are finished processes.
	}
	
	public int printIncomplete(){
		//prints the linked list of processes(PCB’s) that are incomplete
	}
	
	public int checkTime(){
		//moves the various processes (PCB’s) from one queue to another depending on the time of the process.  
	}
	
	public int getProcess(){
		//returns the first process (PCB) from a process list (without removing it).
	}
	
	public int getFileLen(){
		//returns the length of the file of the first process in a process list or –1 if list is empty.
	}
	
	public int sendTerminal(){
		//deletes a process from the list after it has been processed.  Sends this process to the terminal queue of the main program.
	}
	
	public int addProcess(){
		// Adds a process to the device queue.  
	}
	
	public int activate(){
		//activate	Activates a list of subcommands for the first usage.  It sets the status of a process (PBC) to busy and sends the job.  This is done based on the PCB’s release time.  
	}
	
	public int nextJob(){
		//either changes a processes’ status from waiting to ready or if process status is ready, it sends the job, deletes it from the list, and goes to the next process.
	}
	
	public int deleteList(){
		//deletes a given job and all of its sub commands.   It prints the info from the given process to the finished processes area of the screen.  In deleting from the list, it does not lose the remainder of the links.
	}
	
}
