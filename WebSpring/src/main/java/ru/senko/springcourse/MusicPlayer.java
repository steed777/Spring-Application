package ru.senko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
private Muzic muzic;

public MusicPlayer( Muzic muzic) {
	this.muzic = muzic;
}
@Autowired
public void setMuzic(Muzic muzic) {
	this.muzic = muzic;
}
public void playMusic() {
	System.out.println("Plaing: " + muzic.getSong());
}
}
