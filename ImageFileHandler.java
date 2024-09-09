public class ImageFileHandler implements Handler {

    private Handler nextHandler;
    private String name;

    public ImageFileHandler(String name) {
        this.name = name;
    }

    @Override
    public void process(String path) {
        if (path.contains(".img")) { // responsibility   
            System.out.println(this.name + " is processing file, " + path);
        } else if (nextHandler != null) {
            nextHandler.process(path);
        } else {
            System.out.println("File type is not supported.");
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
