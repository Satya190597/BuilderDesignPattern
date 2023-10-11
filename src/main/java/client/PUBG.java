package client;

import arsenal.Gun;
import arsenal.GunScope;
import arsenal.GunSkin;
import arsenal.GunType;

import java.util.Map;

public class PUBG {
    public Gun customizedGun(Map<String,Object> userInput) {
        Gun.GunBuilder gunBuilder = new Gun.GunBuilder();
        setGunName(userInput,gunBuilder);
        setGunType(userInput,gunBuilder);
        setGunScope(userInput,gunBuilder);
        setWithSuppressor(userInput,gunBuilder);
        setWithGrip(userInput,gunBuilder);
        setWithStock(userInput,gunBuilder);
        setWithExtendedMagazine(userInput,gunBuilder);
        setGunSkin(userInput,gunBuilder);
        setAmmoSize(userInput,gunBuilder);
        setNumberOfAmmo(userInput,gunBuilder);
        return gunBuilder.build();
    }

    private void setGunName(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("name"))
            return;
        builder.setName(userInput.get("name").toString());
    }

    private void setGunType(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("gunType"))
            return;
        builder.setGunType((GunType) userInput.get("gunType"));
    }

    private void setGunScope(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("gunScope"))
            return;
        builder.setGunScope((GunScope) userInput.get("gunScope"));
    }
    private void setWithSuppressor(Map<String,Object> userInput, Gun.GunBuilder builder){
        if(!userInput.containsKey("withSuppressor"))
            return;
        builder.setWithSuppressor((boolean) userInput.get("withSuppressor"));
    }

    private void setWithGrip(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("withGrip"))
            return;
        builder.setWithGrip((boolean) userInput.get("withGrip"));
    }

    private void setWithStock(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("withStock"))
            return;
        builder.setWithStock((boolean) userInput.get("withStock"));
    }

    private void setWithExtendedMagazine(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("withExtendedMagazine"))
            return;
        builder.setWithExtendedMagazine((boolean) userInput.get("withExtendedMagazine"));
    }
    private void setGunSkin(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("gunSkin"))
            return;
        builder.setGunSkin((GunSkin) userInput.get("gunSkin"));
    }
    private void setAmmoSize(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("ammoSize"))
            return;
        builder.setAmmoSize((double) userInput.get("ammoSize"));
    }
    private void setNumberOfAmmo(Map<String,Object> userInput, Gun.GunBuilder builder) {
        if(!userInput.containsKey("numberOfAmmo"))
            return;
        builder.setNumberOfAmmo((int) userInput.get("numberOfAmmo"));
    }
}