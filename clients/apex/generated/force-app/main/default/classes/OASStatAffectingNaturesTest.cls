@isTest
private class OASStatAffectingNaturesTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = statAffectingNatures1;
        OASStatAffectingNatures statAffectingNatures3 = new OASStatAffectingNatures();
        OASStatAffectingNatures statAffectingNatures4 = statAffectingNatures3;

        System.assert(statAffectingNatures1.equals(statAffectingNatures2));
        System.assert(statAffectingNatures2.equals(statAffectingNatures1));
        System.assert(statAffectingNatures1.equals(statAffectingNatures1));
        System.assert(statAffectingNatures3.equals(statAffectingNatures4));
        System.assert(statAffectingNatures4.equals(statAffectingNatures3));
        System.assert(statAffectingNatures3.equals(statAffectingNatures3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures3 = new OASStatAffectingNatures();
        OASStatAffectingNatures statAffectingNatures4 = new OASStatAffectingNatures();

        System.assert(statAffectingNatures1.equals(statAffectingNatures2));
        System.assert(statAffectingNatures2.equals(statAffectingNatures1));
        System.assert(statAffectingNatures3.equals(statAffectingNatures4));
        System.assert(statAffectingNatures4.equals(statAffectingNatures3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = new OASStatAffectingNatures();

        System.assertEquals(false, statAffectingNatures1.equals('foo'));
        System.assertEquals(false, statAffectingNatures2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = new OASStatAffectingNatures();
        OASStatAffectingNatures statAffectingNatures3;

        System.assertEquals(false, statAffectingNatures1.equals(statAffectingNatures3));
        System.assertEquals(false, statAffectingNatures2.equals(statAffectingNatures3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = new OASStatAffectingNatures();

        System.assertEquals(statAffectingNatures1.hashCode(), statAffectingNatures1.hashCode());
        System.assertEquals(statAffectingNatures2.hashCode(), statAffectingNatures2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatAffectingNatures statAffectingNatures1 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures2 = OASStatAffectingNatures.getExample();
        OASStatAffectingNatures statAffectingNatures3 = new OASStatAffectingNatures();
        OASStatAffectingNatures statAffectingNatures4 = new OASStatAffectingNatures();

        System.assert(statAffectingNatures1.equals(statAffectingNatures2));
        System.assert(statAffectingNatures3.equals(statAffectingNatures4));
        System.assertEquals(statAffectingNatures1.hashCode(), statAffectingNatures2.hashCode());
        System.assertEquals(statAffectingNatures3.hashCode(), statAffectingNatures4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASStatAffectingNatures statAffectingNatures = new OASStatAffectingNatures();
        System.assertEquals(new List<OASNatureSummary>(), statAffectingNatures.increase);
        System.assertEquals(new List<OASNatureSummary>(), statAffectingNatures.decrease);
    }
}
