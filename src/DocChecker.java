package src;

public class DocChecker {
    public static void main(String[] args) {
        Documents pdfDoc = new PDFDoc();
        Documents excelDoc = new ExcelDoc();
        pdfDoc.getDescription();
        excelDoc.getDescription();
    }
}
