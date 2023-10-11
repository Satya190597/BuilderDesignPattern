package arsenal;

public class Gun {
    private Gun(GunBuilder gunBuilder) {
        this.name = gunBuilder.name;
        this.gunType = gunBuilder.gunType;
        this.gunScope = gunBuilder.gunScope;
        this.withSuppressor = gunBuilder.withSuppressor;
        this.withGrip = gunBuilder.withGrip;
        this.withStock = gunBuilder.withStock;
        this.withExtendedMagazine = gunBuilder.withExtendedMagazine;
        this.gunSkin = gunBuilder.gunSkin;
        this.ammoSize = gunBuilder.ammoSize;
        this.numberOfAmmo = gunBuilder.numberOfAmmo;
    }
    private String name;
    private GunType gunType;
    private GunScope gunScope;
    private boolean withSuppressor;
    private boolean withGrip;
    private boolean withStock;
    private boolean withExtendedMagazine;
    private GunSkin gunSkin;
    private double ammoSize;
    private int numberOfAmmo;

    public String getName() {
        return name;
    }

    public GunType getGunType() {
        return gunType;
    }

    public GunScope getGunScope() {
        return gunScope;
    }

    public boolean isWithSuppressor() {
        return withSuppressor;
    }

    public boolean isWithGrip() {
        return withGrip;
    }

    public boolean isWithStock() {
        return withStock;
    }

    public boolean isWithExtendedMagazine() {
        return withExtendedMagazine;
    }

    public GunSkin getGunSkin() {
        return gunSkin;
    }

    public double getAmmoSize() {
        return ammoSize;
    }

    public int getNumberOfAmmo() {
        return numberOfAmmo;
    }

    public static class GunBuilder {
        private String name;
        private GunType gunType;
        private GunScope gunScope;
        private boolean withSuppressor;
        private boolean withGrip;
        private boolean withStock;
        private boolean withExtendedMagazine;
        private GunSkin gunSkin;
        private double ammoSize;
        private int numberOfAmmo;
        public GunBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public GunBuilder setGunType(GunType gunType) {
            this.gunType = gunType;
            return this;
        }

        public GunBuilder setGunScope(GunScope gunScope) {
            this.gunScope = gunScope;
            return this;
        }

        public GunBuilder setWithSuppressor(boolean withSuppressor) {
            this.withSuppressor = withSuppressor;
            return this;
        }

        public GunBuilder setWithGrip(boolean withGrip) {
            this.withGrip = withGrip;
            return this;
        }

        public GunBuilder setWithStock(boolean withStock) {
            this.withStock = withStock;
            return this;
        }

        public GunBuilder setWithExtendedMagazine(boolean withExtendedMagazine) {
            this.withExtendedMagazine = withExtendedMagazine;
            return this;
        }

        public GunBuilder setGunSkin(GunSkin gunSkin) {
            this.gunSkin = gunSkin;
            return this;
        }

        public GunBuilder setAmmoSize(double ammoSize) {
            this.ammoSize = ammoSize;
            return this;
        }

        public GunBuilder setNumberOfAmmo(int numberOfAmmo) {
            this.numberOfAmmo = numberOfAmmo;
            return this;
        }
        public Gun build() {
            return new Gun(this);
        }
    }
}
