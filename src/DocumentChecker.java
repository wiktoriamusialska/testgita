package src;

public class DocumentChecker {
    public static void main(String[] args) {
        //ExcelDocument document = new ExcelDocument();
        Document excelDoc = new ExcelDocument();
        Document pdfDoc = new PdfDocument();
        excelDoc.getDescription();
        pdfDoc.getDescription();

    }
}
