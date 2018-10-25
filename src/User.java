public class User {
    int thunderClan;
    int riverClan;
    int skyClan;
    int windClan;
    int shadowClan;
    int Pers06;
    int Pers07;
    int Pers08;
    int kittyPet;



    public void incrThunderClan(){
        thunderClan++;
    }

    public void incrRiverClan(){
        riverClan++;
    }

    public void incrWindClan(){
        windClan++;
    }

    public void incrShadowClan(){
        shadowClan++;
    }


    public void incrKittyPet(){
        kittyPet++;
    }

    public void incrPers06(){
        Pers06++;
    }





    public void incrSkyClan(){
        skyClan++;
    }



    public int getKittyPet() {
        return kittyPet;
    }

    public void setKittyPet(int kittyPet) {
        this.kittyPet = kittyPet;
    }


    public int getThunderClan() {
        return thunderClan;
    }

    public void setThunderClan(int thunderClan) {
        this.thunderClan = thunderClan;
    }

    public int getRiverClan() {
        return riverClan;
    }

    public void setRiverClan(int riverClan) {
        this.riverClan = riverClan;
    }

    public int getSkyClan() {
        return skyClan;
    }

    public void setSkyClan(int skyClan) {
        this.skyClan = skyClan;
    }

    public int getWindClan() {
        return windClan;
    }

    public void setWindClan(int windClan) {
        this.windClan = windClan;
    }

    public int getShadowClan() {
        return shadowClan;
    }

    public void setShadowClan(int shadowClan) {
        this.shadowClan = shadowClan;
    }

    public int getPers06() {
        return Pers06;
    }

    public void setPers06(int pers06) {
        Pers06 = pers06;
    }

    public int getPers07() {
        return Pers07;
    }

    public void setPers07(int pers07) {
        Pers07 = pers07;
    }


    @Override
    public String toString() {
        return "User{" +
                "thunderClan=" + thunderClan +
                ", riverClan=" + riverClan +
                ", skyClan=" + skyClan +
                ", windClan=" + windClan +
                ", shadowClan=" + shadowClan +
                ", Pers06=" + Pers06 +
                ", Pers07=" + Pers07 +
                ", kittyPet=" + kittyPet +
                '}';
    }
}
