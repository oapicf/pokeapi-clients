@isTest
private class OASPokeathlonStatAffectingNatureTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = pokeathlonStatAffectingNature1;
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature3 = new OASPokeathlonStatAffectingNature();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature4 = pokeathlonStatAffectingNature3;

        System.assert(pokeathlonStatAffectingNature1.equals(pokeathlonStatAffectingNature2));
        System.assert(pokeathlonStatAffectingNature2.equals(pokeathlonStatAffectingNature1));
        System.assert(pokeathlonStatAffectingNature1.equals(pokeathlonStatAffectingNature1));
        System.assert(pokeathlonStatAffectingNature3.equals(pokeathlonStatAffectingNature4));
        System.assert(pokeathlonStatAffectingNature4.equals(pokeathlonStatAffectingNature3));
        System.assert(pokeathlonStatAffectingNature3.equals(pokeathlonStatAffectingNature3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature3 = new OASPokeathlonStatAffectingNature();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature4 = new OASPokeathlonStatAffectingNature();

        System.assert(pokeathlonStatAffectingNature1.equals(pokeathlonStatAffectingNature2));
        System.assert(pokeathlonStatAffectingNature2.equals(pokeathlonStatAffectingNature1));
        System.assert(pokeathlonStatAffectingNature3.equals(pokeathlonStatAffectingNature4));
        System.assert(pokeathlonStatAffectingNature4.equals(pokeathlonStatAffectingNature3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = new OASPokeathlonStatAffectingNature();

        System.assertEquals(false, pokeathlonStatAffectingNature1.equals('foo'));
        System.assertEquals(false, pokeathlonStatAffectingNature2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = new OASPokeathlonStatAffectingNature();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature3;

        System.assertEquals(false, pokeathlonStatAffectingNature1.equals(pokeathlonStatAffectingNature3));
        System.assertEquals(false, pokeathlonStatAffectingNature2.equals(pokeathlonStatAffectingNature3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = new OASPokeathlonStatAffectingNature();

        System.assertEquals(pokeathlonStatAffectingNature1.hashCode(), pokeathlonStatAffectingNature1.hashCode());
        System.assertEquals(pokeathlonStatAffectingNature2.hashCode(), pokeathlonStatAffectingNature2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature1 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature2 = OASPokeathlonStatAffectingNature.getExample();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature3 = new OASPokeathlonStatAffectingNature();
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature4 = new OASPokeathlonStatAffectingNature();

        System.assert(pokeathlonStatAffectingNature1.equals(pokeathlonStatAffectingNature2));
        System.assert(pokeathlonStatAffectingNature3.equals(pokeathlonStatAffectingNature4));
        System.assertEquals(pokeathlonStatAffectingNature1.hashCode(), pokeathlonStatAffectingNature2.hashCode());
        System.assertEquals(pokeathlonStatAffectingNature3.hashCode(), pokeathlonStatAffectingNature4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokeathlonStatAffectingNature pokeathlonStatAffectingNature = new OASPokeathlonStatAffectingNature();
        Map<String, String> x-property-mappings = pokeathlonStatAffectingNature.getx-property-mappings();
        System.assertEquals('maxChange', x-property-mappings.get('max_change'));
    }
}
