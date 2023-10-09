public class EditorWindow {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorWindow(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        document.save();
    }
}
