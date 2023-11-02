public class Covid19Data {

    private int regionskode;
    private String region;
    private String aldersgruppe;
    private int tilfældeIAlt;
    private int døde;
    private int indlagte;

    public Covid19Data(int regionskode, String region, String aldersgruppe, int tilfældeIAlt, int døde, int indlagte) {
        this.regionskode = regionskode;
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.tilfældeIAlt = tilfældeIAlt;
        this.døde = døde;
        this.indlagte = indlagte;
    }

    public String getRegion() {
        {
            return region;
        }

    }

    public String getAldersgruppe(){
        {
            return aldersgruppe;

        }
}


        @Override
        public String toString() {
            return "Covid19Data{" +
                    "regionskode=" + regionskode +
                    ", region='" + region + '\'' +
                    ", aldersgruppe='" + aldersgruppe + '\'' +
                    ", tilfældeIAlt=" + tilfældeIAlt +
                    ", døde=" + døde +
                    ", indlagte=" + indlagte +
                    '}';
        }
    }
