@isTest
private class OASVersionGroupSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = versionGroupSummary1;
        OASVersionGroupSummary versionGroupSummary3 = new OASVersionGroupSummary();
        OASVersionGroupSummary versionGroupSummary4 = versionGroupSummary3;

        System.assert(versionGroupSummary1.equals(versionGroupSummary2));
        System.assert(versionGroupSummary2.equals(versionGroupSummary1));
        System.assert(versionGroupSummary1.equals(versionGroupSummary1));
        System.assert(versionGroupSummary3.equals(versionGroupSummary4));
        System.assert(versionGroupSummary4.equals(versionGroupSummary3));
        System.assert(versionGroupSummary3.equals(versionGroupSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary3 = new OASVersionGroupSummary();
        OASVersionGroupSummary versionGroupSummary4 = new OASVersionGroupSummary();

        System.assert(versionGroupSummary1.equals(versionGroupSummary2));
        System.assert(versionGroupSummary2.equals(versionGroupSummary1));
        System.assert(versionGroupSummary3.equals(versionGroupSummary4));
        System.assert(versionGroupSummary4.equals(versionGroupSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = new OASVersionGroupSummary();

        System.assertEquals(false, versionGroupSummary1.equals('foo'));
        System.assertEquals(false, versionGroupSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = new OASVersionGroupSummary();
        OASVersionGroupSummary versionGroupSummary3;

        System.assertEquals(false, versionGroupSummary1.equals(versionGroupSummary3));
        System.assertEquals(false, versionGroupSummary2.equals(versionGroupSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = new OASVersionGroupSummary();

        System.assertEquals(versionGroupSummary1.hashCode(), versionGroupSummary1.hashCode());
        System.assertEquals(versionGroupSummary2.hashCode(), versionGroupSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionGroupSummary versionGroupSummary1 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary2 = OASVersionGroupSummary.getExample();
        OASVersionGroupSummary versionGroupSummary3 = new OASVersionGroupSummary();
        OASVersionGroupSummary versionGroupSummary4 = new OASVersionGroupSummary();

        System.assert(versionGroupSummary1.equals(versionGroupSummary2));
        System.assert(versionGroupSummary3.equals(versionGroupSummary4));
        System.assertEquals(versionGroupSummary1.hashCode(), versionGroupSummary2.hashCode());
        System.assertEquals(versionGroupSummary3.hashCode(), versionGroupSummary4.hashCode());
    }
}
