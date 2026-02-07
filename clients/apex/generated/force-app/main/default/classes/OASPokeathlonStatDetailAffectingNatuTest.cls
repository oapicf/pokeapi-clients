@isTest
private class OASPokeathlonStatDetailAffectingNatuTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = pokeathlonStatDetailAffectingNatures1;
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures3 = new OASPokeathlonStatDetailAffectingNatu();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures4 = pokeathlonStatDetailAffectingNatures3;

        System.assert(pokeathlonStatDetailAffectingNatures1.equals(pokeathlonStatDetailAffectingNatures2));
        System.assert(pokeathlonStatDetailAffectingNatures2.equals(pokeathlonStatDetailAffectingNatures1));
        System.assert(pokeathlonStatDetailAffectingNatures1.equals(pokeathlonStatDetailAffectingNatures1));
        System.assert(pokeathlonStatDetailAffectingNatures3.equals(pokeathlonStatDetailAffectingNatures4));
        System.assert(pokeathlonStatDetailAffectingNatures4.equals(pokeathlonStatDetailAffectingNatures3));
        System.assert(pokeathlonStatDetailAffectingNatures3.equals(pokeathlonStatDetailAffectingNatures3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures3 = new OASPokeathlonStatDetailAffectingNatu();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures4 = new OASPokeathlonStatDetailAffectingNatu();

        System.assert(pokeathlonStatDetailAffectingNatures1.equals(pokeathlonStatDetailAffectingNatures2));
        System.assert(pokeathlonStatDetailAffectingNatures2.equals(pokeathlonStatDetailAffectingNatures1));
        System.assert(pokeathlonStatDetailAffectingNatures3.equals(pokeathlonStatDetailAffectingNatures4));
        System.assert(pokeathlonStatDetailAffectingNatures4.equals(pokeathlonStatDetailAffectingNatures3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = new OASPokeathlonStatDetailAffectingNatu();

        System.assertEquals(false, pokeathlonStatDetailAffectingNatures1.equals('foo'));
        System.assertEquals(false, pokeathlonStatDetailAffectingNatures2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = new OASPokeathlonStatDetailAffectingNatu();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures3;

        System.assertEquals(false, pokeathlonStatDetailAffectingNatures1.equals(pokeathlonStatDetailAffectingNatures3));
        System.assertEquals(false, pokeathlonStatDetailAffectingNatures2.equals(pokeathlonStatDetailAffectingNatures3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = new OASPokeathlonStatDetailAffectingNatu();

        System.assertEquals(pokeathlonStatDetailAffectingNatures1.hashCode(), pokeathlonStatDetailAffectingNatures1.hashCode());
        System.assertEquals(pokeathlonStatDetailAffectingNatures2.hashCode(), pokeathlonStatDetailAffectingNatures2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures1 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures2 = OASPokeathlonStatDetailAffectingNatu.getExample();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures3 = new OASPokeathlonStatDetailAffectingNatu();
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures4 = new OASPokeathlonStatDetailAffectingNatu();

        System.assert(pokeathlonStatDetailAffectingNatures1.equals(pokeathlonStatDetailAffectingNatures2));
        System.assert(pokeathlonStatDetailAffectingNatures3.equals(pokeathlonStatDetailAffectingNatures4));
        System.assertEquals(pokeathlonStatDetailAffectingNatures1.hashCode(), pokeathlonStatDetailAffectingNatures2.hashCode());
        System.assertEquals(pokeathlonStatDetailAffectingNatures3.hashCode(), pokeathlonStatDetailAffectingNatures4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokeathlonStatDetailAffectingNatu pokeathlonStatDetailAffectingNatures = new OASPokeathlonStatDetailAffectingNatu();
        System.assertEquals(new List<OASPokeathlonStatDetailAffectingNatu>(), pokeathlonStatDetailAffectingNatures.decrease);
        System.assertEquals(new List<OASPokeathlonStatDetailAffectingNatu>(), pokeathlonStatDetailAffectingNatures.increase);
    }
}
