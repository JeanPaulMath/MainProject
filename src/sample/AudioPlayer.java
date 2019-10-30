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
        return "AudioPlayer{" +
                "audioSpecification='" + audioSpecification + '\'' +
                ", mediaType='" + mediaType + '\'' +
                '}';
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void previous() {

    }

    @Override
    public void next() {

    }

    public static void Audio(String[] args) {

    }
}
