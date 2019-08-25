package ru.senko.springcourse;

public class MusicPlayer {
private Muzic muzic;
private String name;
private int valume;

//IoC patern внедряем зависимость
public MusicPlayer(Muzic muzic) {
	
	this.muzic = muzic;
}
public MusicPlayer() {
	// TODO Auto-generated constructor stub
}
public void setMuzic(Muzic muzic) {
	this.muzic = muzic;
}
public void playMusic() {
	System.out.println("Plaing: " + muzic.getSong());
}
public int getValume() {
	return valume;
}
public void setValume(int valume) {
	this.valume = valume;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
