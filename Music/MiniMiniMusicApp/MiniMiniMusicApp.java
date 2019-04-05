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
            Sequence seq = new Sequence(Sequence.PPQ, 4)
        }
    }
}