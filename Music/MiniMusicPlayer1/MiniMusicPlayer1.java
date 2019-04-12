import javax.sound.midi.*;

public class MiniMusicPlayer1 {

    public static void main(String[] args) {

        try {
            // make and open a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // make a sequence and a track
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track =seq.createTrack();

            // create a series of events to make the notes keep going up
            for (int i=5; i<61; i+=4) {

                track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(128,1,i,100,i+2));
                
            }

            // start sequencer
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception e) {e.printStackTrace();}
    } // close main

    /**
     * Generic event method to simplify code in main
     * @param comd start / stop note (or other command)
     * @param chan instrument
     * @param one start byte
     * @param two end byte
     * @param tick timestamp
     * @return event
     */
    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;

        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) { }
        return event;
    }
}