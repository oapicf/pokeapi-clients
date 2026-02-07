@isTest
private class OASVersionSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = versionSummary1;
        OASVersionSummary versionSummary3 = new OASVersionSummary();
        OASVersionSummary versionSummary4 = versionSummary3;

        System.assert(versionSummary1.equals(versionSummary2));
        System.assert(versionSummary2.equals(versionSummary1));
        System.assert(versionSummary1.equals(versionSummary1));
        System.assert(versionSummary3.equals(versionSummary4));
        System.assert(versionSummary4.equals(versionSummary3));
        System.assert(versionSummary3.equals(versionSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary3 = new OASVersionSummary();
        OASVersionSummary versionSummary4 = new OASVersionSummary();

        System.assert(versionSummary1.equals(versionSummary2));
        System.assert(versionSummary2.equals(versionSummary1));
        System.assert(versionSummary3.equals(versionSummary4));
        System.assert(versionSummary4.equals(versionSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = new OASVersionSummary();

        System.assertEquals(false, versionSummary1.equals('foo'));
        System.assertEquals(false, versionSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = new OASVersionSummary();
        OASVersionSummary versionSummary3;

        System.assertEquals(false, versionSummary1.equals(versionSummary3));
        System.assertEquals(false, versionSummary2.equals(versionSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = new OASVersionSummary();

        System.assertEquals(versionSummary1.hashCode(), versionSummary1.hashCode());
        System.assertEquals(versionSummary2.hashCode(), versionSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionSummary versionSummary1 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary2 = OASVersionSummary.getExample();
        OASVersionSummary versionSummary3 = new OASVersionSummary();
        OASVersionSummary versionSummary4 = new OASVersionSummary();

        System.assert(versionSummary1.equals(versionSummary2));
        System.assert(versionSummary3.equals(versionSummary4));
        System.assertEquals(versionSummary1.hashCode(), versionSummary2.hashCode());
        System.assertEquals(versionSummary3.hashCode(), versionSummary4.hashCode());
    }
}
