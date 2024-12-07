public class Weapon {
    //CONSTANT (DEFAULT) VARIABLES
    public static final String DEFAULT_TYPE = "None";
    public static final Double DEFAULT_LIGHT_DAMAGE = 0.0;
    public static final Double DEFAULT_MEDIUM_DAMAGE = 0.0;
    public static final Double DEFAULT_HEAVY_DAMAGE = 0.0;
    //INSTANCE VARIABLES
    String type;
    Double lightDamage;
    Double mediumDamage;
    Double heavyDamage;

    //CONSTRUCTORS
    public Weapon(String type, Double lightDamage, Double mediumDamage, Double heavyDamage) {

    }

        //DEFAULT CONSTRUCTOR
    public Weapon(){
        this(Weapon.DEFAULT_TYPE, Weapon.DEFAULT_LIGHT_DAMAGE, Weapon.DEFAULT_MEDIUM_DAMAGE, Weapon.DEFAULT_HEAVY_DAMAGE);
    }

    //MUTATORS
        //SETTERS
    public void setType(String type) {
        this.type = type;
    }

    public void setLightDamage(Double lightDamage) {
        this.lightDamage = lightDamage;
    }
    public void setMediumDamage(Double mediumDamage) {
        this.mediumDamage = mediumDamage;
    }
    public void setHeavyDamage(Double heavyDamage) {
        this.heavyDamage = heavyDamage;
    }
        //setAll Method
    public void setAll(String type, Double lightDamage, Double mediumDamage, Double heavyDamage) {
        this.setType(type);
        this.setLightDamage(lightDamage);
        this.setMediumDamage(mediumDamage);
        this.setHeavyDamage(heavyDamage);
    }

    //ACCESSORS
        //GETTERS
    public String getType() {
        return this.type;
    }
    public Double getLightDamage() {
        return this.lightDamage;
    }
    public Double getMediumDamage() {
        return this.mediumDamage;
    }
    public Double getHeavyDamage() {
        return this.heavyDamage;
    }

    //toString
    @Override
    public String toString(){
        return "Your weapon selection is: " + this.type + ". \nLight Damage: " + this.lightDamage + "\nMedium Damage: " + this.mediumDamage + "\nHeavy Damage: " + this.heavyDamage;
    }

    //equals method
    @Override
    public boolean equals(Object other){
        if (other == null || (!(other instanceof Weapon))) {
            return false;
        }
        Weapon otherWeapon = (Weapon) other;
        return this.type.equals(otherWeapon.type) && this.lightDamage.equals(otherWeapon.lightDamage) && this.mediumDamage.equals(otherWeapon.mediumDamage) && this.heavyDamage.equals(otherWeapon.heavyDamage);
    }

}
