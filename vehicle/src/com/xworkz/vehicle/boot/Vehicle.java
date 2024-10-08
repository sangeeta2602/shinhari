package com.xworkz.vehicle.boot;

public abstract class Vehicle {
	public abstract void engine();
	public abstract void parkingSensors();
	public abstract void antiLockBreks();
	public abstract void navigation();
	public abstract void cameraSystem();
	public abstract void tyePressure();
	public abstract void breaking();
	public abstract void centralLocking();
	
	public void keyLessEntry() {
		System.out.println("keyless entry method");
	}
	public void powerWindows() {
		System.out.println();
	}
   public void ergonomicSeats() {
	   System.out.println();
   }
   public void BackupCamera() {
	   System.out.println();
   }
}
