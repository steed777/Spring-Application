package ru.senko.springcourse;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestSpring {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		"applicationContext.xml");
	
         // Muzic muzic = context.getBean("musicBean", Muzic.class);
		//  MusicPlayer musicPlayer = new MusicPlayer(muzic);
	
	Muzic muzic = context.getBean("rockMusic", Muzic.class);
	MusicPlayer rockMusic = new MusicPlayer(muzic);
	rockMusic.playMusic();
		  
		  Muzic muzic2 = context.getBean("clasicalMusic", Muzic.class);
			MusicPlayer  clasicalMusic = new MusicPlayer(muzic);
				  clasicalMusic.playMusic();
				  
				  Muzic muzic3 = context.getBean("metalMusic", Muzic.class);
					MusicPlayer metalMusic = new MusicPlayer(muzic);
					metalMusic.playMusic();
		  context.close();
}
}
