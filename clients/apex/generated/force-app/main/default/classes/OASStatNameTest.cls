@isTest
private class OASStatNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = statName1;
        OASStatName statName3 = new OASStatName();
        OASStatName statName4 = statName3;

        System.assert(statName1.equals(statName2));
        System.assert(statName2.equals(statName1));
        System.assert(statName1.equals(statName1));
        System.assert(statName3.equals(statName4));
        System.assert(statName4.equals(statName3));
        System.assert(statName3.equals(statName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = OASStatName.getExample();
        OASStatName statName3 = new OASStatName();
        OASStatName statName4 = new OASStatName();

        System.assert(statName1.equals(statName2));
        System.assert(statName2.equals(statName1));
        System.assert(statName3.equals(statName4));
        System.assert(statName4.equals(statName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = new OASStatName();

        System.assertEquals(false, statName1.equals('foo'));
        System.assertEquals(false, statName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = new OASStatName();
        OASStatName statName3;

        System.assertEquals(false, statName1.equals(statName3));
        System.assertEquals(false, statName2.equals(statName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = new OASStatName();

        System.assertEquals(statName1.hashCode(), statName1.hashCode());
        System.assertEquals(statName2.hashCode(), statName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatName statName1 = OASStatName.getExample();
        OASStatName statName2 = OASStatName.getExample();
        OASStatName statName3 = new OASStatName();
        OASStatName statName4 = new OASStatName();

        System.assert(statName1.equals(statName2));
        System.assert(statName3.equals(statName4));
        System.assertEquals(statName1.hashCode(), statName2.hashCode());
        System.assertEquals(statName3.hashCode(), statName4.hashCode());
    }
}
