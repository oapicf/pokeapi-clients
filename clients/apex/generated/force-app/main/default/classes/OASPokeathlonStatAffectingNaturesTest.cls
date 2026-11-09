@isTest
private class OASPokeathlonStatAffectingNaturesTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = pokeathlonStatAffectingNatures1;
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures3 = new OASPokeathlonStatAffectingNatures();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures4 = pokeathlonStatAffectingNatures3;

        System.assert(pokeathlonStatAffectingNatures1.equals(pokeathlonStatAffectingNatures2));
        System.assert(pokeathlonStatAffectingNatures2.equals(pokeathlonStatAffectingNatures1));
        System.assert(pokeathlonStatAffectingNatures1.equals(pokeathlonStatAffectingNatures1));
        System.assert(pokeathlonStatAffectingNatures3.equals(pokeathlonStatAffectingNatures4));
        System.assert(pokeathlonStatAffectingNatures4.equals(pokeathlonStatAffectingNatures3));
        System.assert(pokeathlonStatAffectingNatures3.equals(pokeathlonStatAffectingNatures3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures3 = new OASPokeathlonStatAffectingNatures();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures4 = new OASPokeathlonStatAffectingNatures();

        System.assert(pokeathlonStatAffectingNatures1.equals(pokeathlonStatAffectingNatures2));
        System.assert(pokeathlonStatAffectingNatures2.equals(pokeathlonStatAffectingNatures1));
        System.assert(pokeathlonStatAffectingNatures3.equals(pokeathlonStatAffectingNatures4));
        System.assert(pokeathlonStatAffectingNatures4.equals(pokeathlonStatAffectingNatures3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = new OASPokeathlonStatAffectingNatures();

        System.assertEquals(false, pokeathlonStatAffectingNatures1.equals('foo'));
        System.assertEquals(false, pokeathlonStatAffectingNatures2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = new OASPokeathlonStatAffectingNatures();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures3;

        System.assertEquals(false, pokeathlonStatAffectingNatures1.equals(pokeathlonStatAffectingNatures3));
        System.assertEquals(false, pokeathlonStatAffectingNatures2.equals(pokeathlonStatAffectingNatures3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = new OASPokeathlonStatAffectingNatures();

        System.assertEquals(pokeathlonStatAffectingNatures1.hashCode(), pokeathlonStatAffectingNatures1.hashCode());
        System.assertEquals(pokeathlonStatAffectingNatures2.hashCode(), pokeathlonStatAffectingNatures2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures1 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures2 = OASPokeathlonStatAffectingNatures.getExample();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures3 = new OASPokeathlonStatAffectingNatures();
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures4 = new OASPokeathlonStatAffectingNatures();

        System.assert(pokeathlonStatAffectingNatures1.equals(pokeathlonStatAffectingNatures2));
        System.assert(pokeathlonStatAffectingNatures3.equals(pokeathlonStatAffectingNatures4));
        System.assertEquals(pokeathlonStatAffectingNatures1.hashCode(), pokeathlonStatAffectingNatures2.hashCode());
        System.assertEquals(pokeathlonStatAffectingNatures3.hashCode(), pokeathlonStatAffectingNatures4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokeathlonStatAffectingNatures pokeathlonStatAffectingNatures = new OASPokeathlonStatAffectingNatures();
        System.assertEquals(new List<OASPokeathlonStatAffectingNature>(), pokeathlonStatAffectingNatures.increase);
        System.assertEquals(new List<OASPokeathlonStatAffectingNature>(), pokeathlonStatAffectingNatures.decrease);
    }
}
