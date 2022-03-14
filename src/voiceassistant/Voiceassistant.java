/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voiceassistant;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author RR
 */
public class Voiceassistant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice =VoiceManager.getInstance().getVoice("kevin16");
        Voice []voicelist =VoiceManager.getInstance().getVoices();
        for (int i=0 ;i<voicelist.length;i++)
        {
            System.out.println("# Voice "+ voicelist[i].getName());
                    
        }
        if(voice!=null){
            voice.allocate();
            System.out.println("Voice rate "+voice.getRate());
            System.out.println(" voice pitch "+voice.getPitch());
            System.out.println("voice volume "+voice.getVolume());
            boolean status=voice.speak("hello my name is rohit i am the king of the world");
            System.out.println("status  "+status);
            voice.deallocate();
        }
        else{
            System.out.println("error in getting voice");
        }
    }
    
}
