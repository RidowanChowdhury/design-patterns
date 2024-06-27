package prototypePattern;

public class DocumentCloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Document originalDoc = new Document("My Document", "This is some content");

        // Clone the Document object
        Document clonedDoc = (Document) originalDoc.clone();

        // Print original and cloned document content
        System.out.println("Original Document:");
        System.out.println("Title: " + originalDoc.getTitle());
        System.out.println("Content: " + originalDoc.getContent());

        System.out.println("\nCloned Document:");
        System.out.println("Title: " + clonedDoc.getTitle());
        System.out.println("Content: " + clonedDoc.getContent());
    }
}
