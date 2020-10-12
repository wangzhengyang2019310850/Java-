package pack1;

public class Test {

	public static void main(String args[]){
		  
		  CPU cpu =new CPU();
		  
		  cpu.setSpeed(3000);
		  
		  HardDisk disk=new HardDisk();
		  
		  disk.setAmount(1234568);
		  
		  PC pc=new PC();
		  pc.setCPU(cpu);
		  pc.setHardDisk(disk);
		pc.show();
		  
		 }

		}