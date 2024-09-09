public class Main {
    public static void main(String[] args) {
        // Define file paths
        String path1 = "/home/myfile.text";
        String path2 = "/home/myfile.doc";
        String path3 = "/home/myfile.img";
        String path4 = "/home/myfile.data";

        // Create the handlers
        Handler textHandler = new TextFileHandler("Text file");
        Handler docHandler = new DocFileHandler("Doc file");
        Handler imageHandler = new ImageFileHandler("Image file");

        // Set up the chain of responsibility
        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(imageHandler);

        // Start processing files
        textHandler.process(path1);  
        textHandler.process(path2); 
        textHandler.process(path3);  
        textHandler.process(path4);  
    }
}
