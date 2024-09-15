package Q2;

class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}


class Printer {
    public void printDocument(Document document) { // Printer phụ thuộc vào Document
        System.out.println("Printing document content: " + document.getContent());
    }
}


public class Dependencies {
    public static void main(String[] args) {
        Document document = new Document("Sample document content...");
        Printer printer = new Printer();
        printer.printDocument(document);

    }
}
