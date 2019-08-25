package ru.senko.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	
         // Muzic muzic = context.getBean("musicBean", Muzic.class);
		//  MusicPlayer musicPlayer = new MusicPlayer(muzic);
	
	MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		  musicPlayer.playMusic();
		  System.out.println(musicPlayer.getName());
		  System.out.println(musicPlayer.getValume());
		  context.close();
}
}
