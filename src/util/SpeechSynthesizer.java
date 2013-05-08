package util;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeechSynthesizer {
	private final static String VNAME = "kevin16";

	private static VoiceManager voiceManager;
	private static Voice voice;

	public static void init() {
		voiceManager = VoiceManager.getInstance();
		voice = voiceManager.getVoice(VNAME);
		
		if (voice == null) {
            System.err.println("Cannot find a voice named " + VNAME + ".");
            System.exit(-2);
        }
		
		voice.allocate();
	}
	
	public static void speak(String txt) {
		voice.speak(txt);
	}

	public static void destroy() {
		voice.deallocate();
	}
}
