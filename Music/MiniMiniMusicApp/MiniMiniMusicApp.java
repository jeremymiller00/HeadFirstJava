import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            // get a sequencer and open it
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            // create a sequence
            Sequence seq = new Sequence(Sequence.PPQ, 4);

            // get a track from the sequence
            Track track = seq.createTrack();

            // put some midi events into the track
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            // give the sequence to the sequencer
            player.setSequence(seq);

            // push play
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}