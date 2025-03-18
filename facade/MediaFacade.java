package facade;

public class MediaFacade {
    private final AudioSystem audioSystem;
    private final SubtitleManager subtitleManager;
    private final VideoDecoder videoDecoder;

    public MediaFacade(){
        this.audioSystem = new AudioSystem();
        this.subtitleManager = new SubtitleManager();
        this.videoDecoder = new VideoDecoder();
    }

    public void play(String name){
        videoDecoder.decode(name);
        audioSystem.audio();
        subtitleManager.subtitle();
        System.out.println("Воспроизведение:" + name);
    }
}
