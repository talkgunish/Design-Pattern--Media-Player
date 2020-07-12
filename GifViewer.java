public class GifViewer implements AdvancedMediaViewer{

   @Override
   public void playgif(String fileName) {
      //do nothing
   }

   @Override
   public void playpng(String fileName) {
      System.out.println("gif: "+ fileName);		
   }
}