package managers;
import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javazoom.spi.PropertiesContainer;
public class MusicManager
{
	private Clip clip;

	public void playMusic(String filename)
	{
		try
		{
			if(clip != null)
				clip.stop();
			AudioInputStream stream = AudioSystem.getAudioInputStream(new File("resources/sounds/music/" + filename + ".ogg"));
			AudioFormat format = stream.getFormat();
			AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED,
					format.getSampleRate(), 16, format.getChannels(),
					format.getChannels() * 2, format.getSampleRate(), false);
			AudioInputStream decodedAudioInputStream = AudioSystem.getAudioInputStream(decodedFormat,
					stream);
			if (!(decodedAudioInputStream instanceof PropertiesContainer)) {
				throw new Exception("Wrong PropertiesContainer instance");
			}
			DataLine.Info info = new DataLine.Info(Clip.class, decodedFormat);
			clip = (Clip)AudioSystem.getLine(info);
			clip.open(decodedAudioInputStream);
			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);
		}catch (Exception e)
		{
			System.out.println("Music " + filename + " didn't work.");
			e.printStackTrace();
		}
	}

	public void stopMusic()
	{
		clip.stop();
		clip.flush();
	}
}
