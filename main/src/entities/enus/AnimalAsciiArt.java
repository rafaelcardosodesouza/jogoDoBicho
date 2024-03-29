package entities.enus;

public enum AnimalAsciiArt {
    AVESTRUZ("##############\n" +
            "## AVESTRUZ ##\n" +
            "##############"),

    AGUIA("##############\n" +
            "##   AGUIA  ##\n" +
            "##############"),

    BURRO("##############\n" +
            "##  BURRO   ##\n" +
            "##############"),

    BORBOLETA("#################\n" +
              "##  BORBOLETA  ##\n" +
              "#################"),

    CACHORRO("##############\n" +
            "## CACHORRO ##\n" +
            "##############"),

    CABRA("##############\n" +
            "##   CABRA  ##\n" +
            "##############"),

    CARNEIRO("##############\n" +
            "## CARNEIRO ##\n" +
            "##############"),

    CAMELO("##############\n" +
            "##  CAMELO  ##\n" +
            "##############"),

    COBRA("##############\n" +
            "##  COBRA   ##\n" +
            "##############"),

    COELHO("##############\n" +
            "## COELHO   ##\n" +
            "##############"),

    CAVALO("##############\n" +
            "##  CAVALO  ##\n" +
            "##############"),

    ELEFANTE("##############\n" +
            "## ELEFANTE ##\n" +
            "##############"),

    GALO("##############\n" +
            "##   GALO   ##\n" +
            "##############"),

    GATO("##############\n" +
            "##   GATO   ##\n" +
            "##############"),

    JACARE("##############\n" +
            "## JACARE   ##\n" +
            "##############"),

    LEAO("##############\n" +
            "##   LEAO   ##\n" +
            "##############"),

    MACACO("##############\n" +
            "##  MACACO  ##\n" +
            "##############"),

    PORCO("##############\n" +
            "##  PORCO   ##\n" +
            "##############"),

    PAVAO("##############\n" +
            "##  PAVAO   ##\n" +
            "##############"),

    PERU("##############\n" +
            "##   PERU   ##\n" +
            "##############"),

    TOURO("##############\n" +
            "##  TOURO   ##\n" +
            "##############"),

    TIGRE("##############\n" +
            "##  TIGRE   ##\n" +
            "##############"),

    URSO("##############\n" +
            "##   URSO   ##\n" +
            "##############"),

    VEADO("##############\n" +
            "##  VEADO   ##\n" +
            "##############"),

    VACA("##############\n" +
            "##   VACA   ##\n" +
            "##############");


    private final String asciiArt;

    AnimalAsciiArt(String asciiArt) {
        this.asciiArt = asciiArt;
    }

    public String getAsciiArt() {
        return asciiArt;
    }
}
