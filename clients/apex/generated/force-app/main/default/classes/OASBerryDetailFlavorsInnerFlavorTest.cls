@isTest
private class OASBerryDetailFlavorsInnerFlavorTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = berryDetailFlavorsInnerFlavor1;
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor3 = new OASBerryDetailFlavorsInnerFlavor();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor4 = berryDetailFlavorsInnerFlavor3;

        System.assert(berryDetailFlavorsInnerFlavor1.equals(berryDetailFlavorsInnerFlavor2));
        System.assert(berryDetailFlavorsInnerFlavor2.equals(berryDetailFlavorsInnerFlavor1));
        System.assert(berryDetailFlavorsInnerFlavor1.equals(berryDetailFlavorsInnerFlavor1));
        System.assert(berryDetailFlavorsInnerFlavor3.equals(berryDetailFlavorsInnerFlavor4));
        System.assert(berryDetailFlavorsInnerFlavor4.equals(berryDetailFlavorsInnerFlavor3));
        System.assert(berryDetailFlavorsInnerFlavor3.equals(berryDetailFlavorsInnerFlavor3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor3 = new OASBerryDetailFlavorsInnerFlavor();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor4 = new OASBerryDetailFlavorsInnerFlavor();

        System.assert(berryDetailFlavorsInnerFlavor1.equals(berryDetailFlavorsInnerFlavor2));
        System.assert(berryDetailFlavorsInnerFlavor2.equals(berryDetailFlavorsInnerFlavor1));
        System.assert(berryDetailFlavorsInnerFlavor3.equals(berryDetailFlavorsInnerFlavor4));
        System.assert(berryDetailFlavorsInnerFlavor4.equals(berryDetailFlavorsInnerFlavor3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = new OASBerryDetailFlavorsInnerFlavor();

        System.assertEquals(false, berryDetailFlavorsInnerFlavor1.equals('foo'));
        System.assertEquals(false, berryDetailFlavorsInnerFlavor2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = new OASBerryDetailFlavorsInnerFlavor();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor3;

        System.assertEquals(false, berryDetailFlavorsInnerFlavor1.equals(berryDetailFlavorsInnerFlavor3));
        System.assertEquals(false, berryDetailFlavorsInnerFlavor2.equals(berryDetailFlavorsInnerFlavor3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = new OASBerryDetailFlavorsInnerFlavor();

        System.assertEquals(berryDetailFlavorsInnerFlavor1.hashCode(), berryDetailFlavorsInnerFlavor1.hashCode());
        System.assertEquals(berryDetailFlavorsInnerFlavor2.hashCode(), berryDetailFlavorsInnerFlavor2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor1 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor2 = OASBerryDetailFlavorsInnerFlavor.getExample();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor3 = new OASBerryDetailFlavorsInnerFlavor();
        OASBerryDetailFlavorsInnerFlavor berryDetailFlavorsInnerFlavor4 = new OASBerryDetailFlavorsInnerFlavor();

        System.assert(berryDetailFlavorsInnerFlavor1.equals(berryDetailFlavorsInnerFlavor2));
        System.assert(berryDetailFlavorsInnerFlavor3.equals(berryDetailFlavorsInnerFlavor4));
        System.assertEquals(berryDetailFlavorsInnerFlavor1.hashCode(), berryDetailFlavorsInnerFlavor2.hashCode());
        System.assertEquals(berryDetailFlavorsInnerFlavor3.hashCode(), berryDetailFlavorsInnerFlavor4.hashCode());
    }
}
