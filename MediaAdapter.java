public class MediaAdapter implements MediaPlayerr {

   AdvancedMediaViewer advancedimageviewer;

   public MediaAdapter(String imageType){
   
      if(imageType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new pngPlayer();			
         
      }else if (imageType.equalsIgnoreCase("mp4")){
         advancedimageviewer = new gifPlayer();
      }	
   }

   @Override
   public void play(String imageType, String fileName) {
   
      if(imageType.equalsIgnoreCase("png")){
         advancedimageviewer.playpng(fileName);
      }
      else if(imageType.equalsIgnoreCase("gif")){
         advancedimageviewwr.playgif(fileName);
      }
   }
}