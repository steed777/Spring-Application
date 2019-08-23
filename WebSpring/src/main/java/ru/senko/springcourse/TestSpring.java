package ru.senko.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	
          Muzic muzic = context.getBean("musicBean", Muzic.class);
		  MusicPlayer musicPlayer = new MusicPlayer(muzic);
		  musicPlayer.playMusic();
		  
		   context.close();
}
}
