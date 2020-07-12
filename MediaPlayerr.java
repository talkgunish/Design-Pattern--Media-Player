public class MediaPlayerr implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void play(String imageType, String fileName) {		

      
      if(imageType.equalsIgnoreCase("gif")){
         System.out.println("Playing gif file. Name: " + fileName);			
      } 
      
      
      else if(imageType.equalsIgnoreCase("png") || imageType.equalsIgnoreCase("gif")){
         mediaAdapter = new MediaAdapter(imageType);
         mediaAdapter.play(imageType, fileName);
      }
      
      else{
         System.out.println("Invalid media. " + imageType + " format not supported");
      }
   }   
}