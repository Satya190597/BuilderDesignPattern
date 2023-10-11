import arsenal.Gun;
import arsenal.GunScope;
import arsenal.GunSkin;
import arsenal.GunType;
import client.PUBG;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PUBGTest {
    @Test
    @DisplayName("Create a customized shot-gun with 8x scope without any skin.")
    public void testCustomizedGunForShotGun() {
        Map<String,Object> userRequirements = new HashMap<>();
        userRequirements.put("name","S1897");
        userRequirements.put("gunType", GunType.SHOTGUNS);
        userRequirements.put("gunScope", GunScope.SCOPE_8X);
        PUBG pubg = new PUBG();
        Gun myCustomizedGun = pubg.customizedGun(userRequirements);
        Assertions.assertEquals(myCustomizedGun.getName(),"S1897");
        Assertions.assertEquals(myCustomizedGun.getGunType(),GunType.SHOTGUNS);
        Assertions.assertEquals(myCustomizedGun.getGunScope(),GunScope.SCOPE_8X);
        Assertions.assertNull(myCustomizedGun.getGunSkin());
    }

    @Test
    @DisplayName("Create a customized sub machine gun with 6x scope, anime skin, ammo size of 500 and with suppressor.")
    public void testCustomizedGunForSmg() {
        Map<String,Object> userRequirements = new HashMap<>();
        userRequirements.put("name","Uzi");
        userRequirements.put("gunType", GunType.SUB_MACHINE_GUNS);
        userRequirements.put("gunScope", GunScope.SCOPE_6X);
        userRequirements.put("gunSkin", GunSkin.ANIME_SKIN);
        userRequirements.put("ammoSize",500.0);
        userRequirements.put("withSuppressor",true);
        PUBG pubg = new PUBG();
        Gun myCustomizedGun = pubg.customizedGun(userRequirements);
        Assertions.assertEquals(myCustomizedGun.getName(),"Uzi");
        Assertions.assertEquals(myCustomizedGun.getGunType(),GunType.SUB_MACHINE_GUNS);
        Assertions.assertEquals(myCustomizedGun.getGunScope(),GunScope.SCOPE_6X);
        Assertions.assertEquals(myCustomizedGun.getGunSkin(),GunSkin.ANIME_SKIN);
        Assertions.assertEquals(myCustomizedGun.getAmmoSize(),500.0);
        Assertions.assertTrue(myCustomizedGun.isWithSuppressor());
    }
}
