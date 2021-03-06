package util;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeechSynthesizer {
	private final static String VOICES = "com.sun.speech.freetts.en.us.cmu_time_awb.AlanVoiceDirectory" + "," + "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory";
	private final static String VNAME = "kevin16";

	private static Voice voice = null;

	public static void init() {
		System.setProperty("freetts.voices", VOICES);
		
		
		VoiceManager voiceManager = VoiceManager.getInstance();
		try {
			voice = voiceManager.getVoice(VNAME);
		} catch (Exception e){
			// Just do nothing - voice is null after this
		}
		
		if (voice == null) {
            System.err.println("Cannot find a voice named " + VNAME + ".");
            Voice[] list = voiceManager.getVoices();
            if (list.length > 0) {
            	voice = list[0];
            } else {
            	System.err.println("No Voices installed");
            }
        } 
		
		if (voice != null) {
        	voice.allocate();
        }
	}
	
	public static void speak(String txt) {
		if (voice != null) {
			voice.speak(txt);
		} else {
			System.err.println("Could not synthesize \"" + txt + "\", voice is null");
		}
	}

	public static void destroy() {
		if (voice != null) {
			voice.deallocate();
		}
	}
}