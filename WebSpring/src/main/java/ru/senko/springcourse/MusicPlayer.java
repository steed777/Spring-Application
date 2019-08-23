package ru.senko.springcourse;

public class MusicPlayer {
private Muzic muzic;

//IoC patern внедряем зависимость
public MusicPlayer(Muzic muzic) {
	
	this.muzic = muzic;
}
public void playMusic() {
	System.out.println("Plaing: " + muzic.getSong());
}
}
