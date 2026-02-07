@isTest
private class OASBerryFlavorNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = berryFlavorName1;
        OASBerryFlavorName berryFlavorName3 = new OASBerryFlavorName();
        OASBerryFlavorName berryFlavorName4 = berryFlavorName3;

        System.assert(berryFlavorName1.equals(berryFlavorName2));
        System.assert(berryFlavorName2.equals(berryFlavorName1));
        System.assert(berryFlavorName1.equals(berryFlavorName1));
        System.assert(berryFlavorName3.equals(berryFlavorName4));
        System.assert(berryFlavorName4.equals(berryFlavorName3));
        System.assert(berryFlavorName3.equals(berryFlavorName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName3 = new OASBerryFlavorName();
        OASBerryFlavorName berryFlavorName4 = new OASBerryFlavorName();

        System.assert(berryFlavorName1.equals(berryFlavorName2));
        System.assert(berryFlavorName2.equals(berryFlavorName1));
        System.assert(berryFlavorName3.equals(berryFlavorName4));
        System.assert(berryFlavorName4.equals(berryFlavorName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = new OASBerryFlavorName();

        System.assertEquals(false, berryFlavorName1.equals('foo'));
        System.assertEquals(false, berryFlavorName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = new OASBerryFlavorName();
        OASBerryFlavorName berryFlavorName3;

        System.assertEquals(false, berryFlavorName1.equals(berryFlavorName3));
        System.assertEquals(false, berryFlavorName2.equals(berryFlavorName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = new OASBerryFlavorName();

        System.assertEquals(berryFlavorName1.hashCode(), berryFlavorName1.hashCode());
        System.assertEquals(berryFlavorName2.hashCode(), berryFlavorName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorName berryFlavorName1 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName2 = OASBerryFlavorName.getExample();
        OASBerryFlavorName berryFlavorName3 = new OASBerryFlavorName();
        OASBerryFlavorName berryFlavorName4 = new OASBerryFlavorName();

        System.assert(berryFlavorName1.equals(berryFlavorName2));
        System.assert(berryFlavorName3.equals(berryFlavorName4));
        System.assertEquals(berryFlavorName1.hashCode(), berryFlavorName2.hashCode());
        System.assertEquals(berryFlavorName3.hashCode(), berryFlavorName4.hashCode());
    }
}
