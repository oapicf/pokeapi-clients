@isTest
private class OASPalParkAreaSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = palParkAreaSummary1;
        OASPalParkAreaSummary palParkAreaSummary3 = new OASPalParkAreaSummary();
        OASPalParkAreaSummary palParkAreaSummary4 = palParkAreaSummary3;

        System.assert(palParkAreaSummary1.equals(palParkAreaSummary2));
        System.assert(palParkAreaSummary2.equals(palParkAreaSummary1));
        System.assert(palParkAreaSummary1.equals(palParkAreaSummary1));
        System.assert(palParkAreaSummary3.equals(palParkAreaSummary4));
        System.assert(palParkAreaSummary4.equals(palParkAreaSummary3));
        System.assert(palParkAreaSummary3.equals(palParkAreaSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary3 = new OASPalParkAreaSummary();
        OASPalParkAreaSummary palParkAreaSummary4 = new OASPalParkAreaSummary();

        System.assert(palParkAreaSummary1.equals(palParkAreaSummary2));
        System.assert(palParkAreaSummary2.equals(palParkAreaSummary1));
        System.assert(palParkAreaSummary3.equals(palParkAreaSummary4));
        System.assert(palParkAreaSummary4.equals(palParkAreaSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = new OASPalParkAreaSummary();

        System.assertEquals(false, palParkAreaSummary1.equals('foo'));
        System.assertEquals(false, palParkAreaSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = new OASPalParkAreaSummary();
        OASPalParkAreaSummary palParkAreaSummary3;

        System.assertEquals(false, palParkAreaSummary1.equals(palParkAreaSummary3));
        System.assertEquals(false, palParkAreaSummary2.equals(palParkAreaSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = new OASPalParkAreaSummary();

        System.assertEquals(palParkAreaSummary1.hashCode(), palParkAreaSummary1.hashCode());
        System.assertEquals(palParkAreaSummary2.hashCode(), palParkAreaSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalParkAreaSummary palParkAreaSummary1 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary2 = OASPalParkAreaSummary.getExample();
        OASPalParkAreaSummary palParkAreaSummary3 = new OASPalParkAreaSummary();
        OASPalParkAreaSummary palParkAreaSummary4 = new OASPalParkAreaSummary();

        System.assert(palParkAreaSummary1.equals(palParkAreaSummary2));
        System.assert(palParkAreaSummary3.equals(palParkAreaSummary4));
        System.assertEquals(palParkAreaSummary1.hashCode(), palParkAreaSummary2.hashCode());
        System.assertEquals(palParkAreaSummary3.hashCode(), palParkAreaSummary4.hashCode());
    }
}
