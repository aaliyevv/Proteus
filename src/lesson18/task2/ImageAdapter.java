package lesson18.task2;

 public class ImageAdapter implements Image{
    private LegacyImageViewer legacyImageViewer;

     public ImageAdapter(LegacyImageViewer legacyImageViewer) {
         this.legacyImageViewer = legacyImageViewer;
     }

     @Override
     public void displayImage(String fileName) {
        legacyImageViewer.show(fileName);
    }
}
