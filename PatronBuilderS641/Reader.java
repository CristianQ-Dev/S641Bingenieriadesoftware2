public class Reader {

    // Atributos
    private String element;
    private converter converter;

    // Constructor
    public Reader(String element, converter converter) {
        this.element = element;
        this.converter = converter;

    }

    // Métodos
    public void parseInput() {
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PRAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.markeTable();
                break;

            default:
                break;
        }
    }

}
