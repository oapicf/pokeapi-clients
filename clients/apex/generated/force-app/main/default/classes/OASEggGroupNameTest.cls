@isTest
private class OASEggGroupNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = eggGroupName1;
        OASEggGroupName eggGroupName3 = new OASEggGroupName();
        OASEggGroupName eggGroupName4 = eggGroupName3;

        System.assert(eggGroupName1.equals(eggGroupName2));
        System.assert(eggGroupName2.equals(eggGroupName1));
        System.assert(eggGroupName1.equals(eggGroupName1));
        System.assert(eggGroupName3.equals(eggGroupName4));
        System.assert(eggGroupName4.equals(eggGroupName3));
        System.assert(eggGroupName3.equals(eggGroupName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName3 = new OASEggGroupName();
        OASEggGroupName eggGroupName4 = new OASEggGroupName();

        System.assert(eggGroupName1.equals(eggGroupName2));
        System.assert(eggGroupName2.equals(eggGroupName1));
        System.assert(eggGroupName3.equals(eggGroupName4));
        System.assert(eggGroupName4.equals(eggGroupName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = new OASEggGroupName();

        System.assertEquals(false, eggGroupName1.equals('foo'));
        System.assertEquals(false, eggGroupName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = new OASEggGroupName();
        OASEggGroupName eggGroupName3;

        System.assertEquals(false, eggGroupName1.equals(eggGroupName3));
        System.assertEquals(false, eggGroupName2.equals(eggGroupName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = new OASEggGroupName();

        System.assertEquals(eggGroupName1.hashCode(), eggGroupName1.hashCode());
        System.assertEquals(eggGroupName2.hashCode(), eggGroupName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEggGroupName eggGroupName1 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName2 = OASEggGroupName.getExample();
        OASEggGroupName eggGroupName3 = new OASEggGroupName();
        OASEggGroupName eggGroupName4 = new OASEggGroupName();

        System.assert(eggGroupName1.equals(eggGroupName2));
        System.assert(eggGroupName3.equals(eggGroupName4));
        System.assertEquals(eggGroupName1.hashCode(), eggGroupName2.hashCode());
        System.assertEquals(eggGroupName3.hashCode(), eggGroupName4.hashCode());
    }
}
