package ru.senko.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
private List<Muzic>muzics = new ArrayList<Muzic>();
private String name;
private int valume;


public void playMusic() {
for (Muzic muzic : muzics) {
	System.out.println("Plaing: " + muzic.getSong());
	}
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
public void setMuzics(List<Muzic> muzics) {
	this.muzics = muzics;
}
}
