@isTest
private class OASBerryFlavorDetailBerriesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = berryFlavorDetailBerriesInner1;
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner3 = new OASBerryFlavorDetailBerriesInner();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner4 = berryFlavorDetailBerriesInner3;

        System.assert(berryFlavorDetailBerriesInner1.equals(berryFlavorDetailBerriesInner2));
        System.assert(berryFlavorDetailBerriesInner2.equals(berryFlavorDetailBerriesInner1));
        System.assert(berryFlavorDetailBerriesInner1.equals(berryFlavorDetailBerriesInner1));
        System.assert(berryFlavorDetailBerriesInner3.equals(berryFlavorDetailBerriesInner4));
        System.assert(berryFlavorDetailBerriesInner4.equals(berryFlavorDetailBerriesInner3));
        System.assert(berryFlavorDetailBerriesInner3.equals(berryFlavorDetailBerriesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner3 = new OASBerryFlavorDetailBerriesInner();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner4 = new OASBerryFlavorDetailBerriesInner();

        System.assert(berryFlavorDetailBerriesInner1.equals(berryFlavorDetailBerriesInner2));
        System.assert(berryFlavorDetailBerriesInner2.equals(berryFlavorDetailBerriesInner1));
        System.assert(berryFlavorDetailBerriesInner3.equals(berryFlavorDetailBerriesInner4));
        System.assert(berryFlavorDetailBerriesInner4.equals(berryFlavorDetailBerriesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = new OASBerryFlavorDetailBerriesInner();

        System.assertEquals(false, berryFlavorDetailBerriesInner1.equals('foo'));
        System.assertEquals(false, berryFlavorDetailBerriesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = new OASBerryFlavorDetailBerriesInner();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner3;

        System.assertEquals(false, berryFlavorDetailBerriesInner1.equals(berryFlavorDetailBerriesInner3));
        System.assertEquals(false, berryFlavorDetailBerriesInner2.equals(berryFlavorDetailBerriesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = new OASBerryFlavorDetailBerriesInner();

        System.assertEquals(berryFlavorDetailBerriesInner1.hashCode(), berryFlavorDetailBerriesInner1.hashCode());
        System.assertEquals(berryFlavorDetailBerriesInner2.hashCode(), berryFlavorDetailBerriesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner1 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner2 = OASBerryFlavorDetailBerriesInner.getExample();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner3 = new OASBerryFlavorDetailBerriesInner();
        OASBerryFlavorDetailBerriesInner berryFlavorDetailBerriesInner4 = new OASBerryFlavorDetailBerriesInner();

        System.assert(berryFlavorDetailBerriesInner1.equals(berryFlavorDetailBerriesInner2));
        System.assert(berryFlavorDetailBerriesInner3.equals(berryFlavorDetailBerriesInner4));
        System.assertEquals(berryFlavorDetailBerriesInner1.hashCode(), berryFlavorDetailBerriesInner2.hashCode());
        System.assertEquals(berryFlavorDetailBerriesInner3.hashCode(), berryFlavorDetailBerriesInner4.hashCode());
    }
}
