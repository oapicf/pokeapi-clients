@isTest
private class OASPalParkAreaNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = palParkAreaName1;
        OASPalParkAreaName palParkAreaName3 = new OASPalParkAreaName();
        OASPalParkAreaName palParkAreaName4 = palParkAreaName3;

        System.assert(palParkAreaName1.equals(palParkAreaName2));
        System.assert(palParkAreaName2.equals(palParkAreaName1));
        System.assert(palParkAreaName1.equals(palParkAreaName1));
        System.assert(palParkAreaName3.equals(palParkAreaName4));
        System.assert(palParkAreaName4.equals(palParkAreaName3));
        System.assert(palParkAreaName3.equals(palParkAreaName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName3 = new OASPalParkAreaName();
        OASPalParkAreaName palParkAreaName4 = new OASPalParkAreaName();

        System.assert(palParkAreaName1.equals(palParkAreaName2));
        System.assert(palParkAreaName2.equals(palParkAreaName1));
        System.assert(palParkAreaName3.equals(palParkAreaName4));
        System.assert(palParkAreaName4.equals(palParkAreaName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = new OASPalParkAreaName();

        System.assertEquals(false, palParkAreaName1.equals('foo'));
        System.assertEquals(false, palParkAreaName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = new OASPalParkAreaName();
        OASPalParkAreaName palParkAreaName3;

        System.assertEquals(false, palParkAreaName1.equals(palParkAreaName3));
        System.assertEquals(false, palParkAreaName2.equals(palParkAreaName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = new OASPalParkAreaName();

        System.assertEquals(palParkAreaName1.hashCode(), palParkAreaName1.hashCode());
        System.assertEquals(palParkAreaName2.hashCode(), palParkAreaName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalParkAreaName palParkAreaName1 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName2 = OASPalParkAreaName.getExample();
        OASPalParkAreaName palParkAreaName3 = new OASPalParkAreaName();
        OASPalParkAreaName palParkAreaName4 = new OASPalParkAreaName();

        System.assert(palParkAreaName1.equals(palParkAreaName2));
        System.assert(palParkAreaName3.equals(palParkAreaName4));
        System.assertEquals(palParkAreaName1.hashCode(), palParkAreaName2.hashCode());
        System.assertEquals(palParkAreaName3.hashCode(), palParkAreaName4.hashCode());
    }
}
