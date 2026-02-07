@isTest
private class OASBerryDetailFlavorsInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = berryDetailFlavorsInner1;
        OASBerryDetailFlavorsInner berryDetailFlavorsInner3 = new OASBerryDetailFlavorsInner();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner4 = berryDetailFlavorsInner3;

        System.assert(berryDetailFlavorsInner1.equals(berryDetailFlavorsInner2));
        System.assert(berryDetailFlavorsInner2.equals(berryDetailFlavorsInner1));
        System.assert(berryDetailFlavorsInner1.equals(berryDetailFlavorsInner1));
        System.assert(berryDetailFlavorsInner3.equals(berryDetailFlavorsInner4));
        System.assert(berryDetailFlavorsInner4.equals(berryDetailFlavorsInner3));
        System.assert(berryDetailFlavorsInner3.equals(berryDetailFlavorsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner3 = new OASBerryDetailFlavorsInner();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner4 = new OASBerryDetailFlavorsInner();

        System.assert(berryDetailFlavorsInner1.equals(berryDetailFlavorsInner2));
        System.assert(berryDetailFlavorsInner2.equals(berryDetailFlavorsInner1));
        System.assert(berryDetailFlavorsInner3.equals(berryDetailFlavorsInner4));
        System.assert(berryDetailFlavorsInner4.equals(berryDetailFlavorsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = new OASBerryDetailFlavorsInner();

        System.assertEquals(false, berryDetailFlavorsInner1.equals('foo'));
        System.assertEquals(false, berryDetailFlavorsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = new OASBerryDetailFlavorsInner();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner3;

        System.assertEquals(false, berryDetailFlavorsInner1.equals(berryDetailFlavorsInner3));
        System.assertEquals(false, berryDetailFlavorsInner2.equals(berryDetailFlavorsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = new OASBerryDetailFlavorsInner();

        System.assertEquals(berryDetailFlavorsInner1.hashCode(), berryDetailFlavorsInner1.hashCode());
        System.assertEquals(berryDetailFlavorsInner2.hashCode(), berryDetailFlavorsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryDetailFlavorsInner berryDetailFlavorsInner1 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner2 = OASBerryDetailFlavorsInner.getExample();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner3 = new OASBerryDetailFlavorsInner();
        OASBerryDetailFlavorsInner berryDetailFlavorsInner4 = new OASBerryDetailFlavorsInner();

        System.assert(berryDetailFlavorsInner1.equals(berryDetailFlavorsInner2));
        System.assert(berryDetailFlavorsInner3.equals(berryDetailFlavorsInner4));
        System.assertEquals(berryDetailFlavorsInner1.hashCode(), berryDetailFlavorsInner2.hashCode());
        System.assertEquals(berryDetailFlavorsInner3.hashCode(), berryDetailFlavorsInner4.hashCode());
    }
}
