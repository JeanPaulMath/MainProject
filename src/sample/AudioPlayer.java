package sample;

public class AudioPlayer extends Product implements MultimediaControl {

    private String audioSpecification;
    private String mediaType;

    public AudioPlayer(String prodName, String manufacture, String audiospecs) {
        super(prodName);
        super.setManufacturer(manufacture);
        audioSpecification = audiospecs;

    }

    @Override
     public String toString() {
        return "audioSpecification:'" + audioSpecification + '\'' + " mediaType:'" + mediaType;
    }

    @Override
    public void play() {
        System.out.println("Audio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Audio has been stopped.");
    }

    @Override
    public void previous() {
        System.out.println("Previous track is being played.");
    }

    @Override
    public void next() {
        System.out.println("Playing next track.");
    }

    public static void Audio(String[] args) {

    }
}
