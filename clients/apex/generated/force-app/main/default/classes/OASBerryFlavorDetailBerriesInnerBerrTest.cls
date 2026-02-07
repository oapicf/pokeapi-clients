@isTest
private class OASBerryFlavorDetailBerriesInnerBerrTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = berryFlavorDetailBerriesInnerBerry1;
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry3 = new OASBerryFlavorDetailBerriesInnerBerr();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry4 = berryFlavorDetailBerriesInnerBerry3;

        System.assert(berryFlavorDetailBerriesInnerBerry1.equals(berryFlavorDetailBerriesInnerBerry2));
        System.assert(berryFlavorDetailBerriesInnerBerry2.equals(berryFlavorDetailBerriesInnerBerry1));
        System.assert(berryFlavorDetailBerriesInnerBerry1.equals(berryFlavorDetailBerriesInnerBerry1));
        System.assert(berryFlavorDetailBerriesInnerBerry3.equals(berryFlavorDetailBerriesInnerBerry4));
        System.assert(berryFlavorDetailBerriesInnerBerry4.equals(berryFlavorDetailBerriesInnerBerry3));
        System.assert(berryFlavorDetailBerriesInnerBerry3.equals(berryFlavorDetailBerriesInnerBerry3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry3 = new OASBerryFlavorDetailBerriesInnerBerr();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry4 = new OASBerryFlavorDetailBerriesInnerBerr();

        System.assert(berryFlavorDetailBerriesInnerBerry1.equals(berryFlavorDetailBerriesInnerBerry2));
        System.assert(berryFlavorDetailBerriesInnerBerry2.equals(berryFlavorDetailBerriesInnerBerry1));
        System.assert(berryFlavorDetailBerriesInnerBerry3.equals(berryFlavorDetailBerriesInnerBerry4));
        System.assert(berryFlavorDetailBerriesInnerBerry4.equals(berryFlavorDetailBerriesInnerBerry3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = new OASBerryFlavorDetailBerriesInnerBerr();

        System.assertEquals(false, berryFlavorDetailBerriesInnerBerry1.equals('foo'));
        System.assertEquals(false, berryFlavorDetailBerriesInnerBerry2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = new OASBerryFlavorDetailBerriesInnerBerr();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry3;

        System.assertEquals(false, berryFlavorDetailBerriesInnerBerry1.equals(berryFlavorDetailBerriesInnerBerry3));
        System.assertEquals(false, berryFlavorDetailBerriesInnerBerry2.equals(berryFlavorDetailBerriesInnerBerry3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = new OASBerryFlavorDetailBerriesInnerBerr();

        System.assertEquals(berryFlavorDetailBerriesInnerBerry1.hashCode(), berryFlavorDetailBerriesInnerBerry1.hashCode());
        System.assertEquals(berryFlavorDetailBerriesInnerBerry2.hashCode(), berryFlavorDetailBerriesInnerBerry2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry1 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry2 = OASBerryFlavorDetailBerriesInnerBerr.getExample();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry3 = new OASBerryFlavorDetailBerriesInnerBerr();
        OASBerryFlavorDetailBerriesInnerBerr berryFlavorDetailBerriesInnerBerry4 = new OASBerryFlavorDetailBerriesInnerBerr();

        System.assert(berryFlavorDetailBerriesInnerBerry1.equals(berryFlavorDetailBerriesInnerBerry2));
        System.assert(berryFlavorDetailBerriesInnerBerry3.equals(berryFlavorDetailBerriesInnerBerry4));
        System.assertEquals(berryFlavorDetailBerriesInnerBerry1.hashCode(), berryFlavorDetailBerriesInnerBerry2.hashCode());
        System.assertEquals(berryFlavorDetailBerriesInnerBerry3.hashCode(), berryFlavorDetailBerriesInnerBerry4.hashCode());
    }
}
