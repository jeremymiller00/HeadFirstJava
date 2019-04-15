import javax.sound.midi.*;

// Implement ControllerEvents interface to listen for controller events
public class MiniMusicPlayer2 implements ControllerEventListener {

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            // get and open a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // register for events with the sequencer
            // the event registration method takes the listener AND an int array representing the list of controller events we want
            // we only want # 127
            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            // create a sequence and a track
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i=5; i<60;i+=4) {
                track.add(makeEvent(144, 1, i, 100, i);
            }

        } catch (Exception e) {e.printStackTrace();}
    }


    
    /**
     * A helper method to simplify the making of several events
     * @param comd - the midi command number to execute
     * @param chan - the channel (instrument) on which to execute the command
     * @param one - 
     * @param two
     * @param tick
     * @return
     */
    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd, chan, one, two);
            event = new MidiEvent(a, tick)
        } catch (Exception e) {e.printStackTrace();}
        return event
    } // close makeEvent method


}