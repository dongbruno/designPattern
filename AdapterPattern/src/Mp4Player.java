public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing vlc file. Name in Mp4Player: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name in Mp4Player: "+ fileName);
    }


}
