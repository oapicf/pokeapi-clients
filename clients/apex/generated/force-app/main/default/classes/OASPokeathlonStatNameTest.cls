@isTest
private class OASPokeathlonStatNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = pokeathlonStatName1;
        OASPokeathlonStatName pokeathlonStatName3 = new OASPokeathlonStatName();
        OASPokeathlonStatName pokeathlonStatName4 = pokeathlonStatName3;

        System.assert(pokeathlonStatName1.equals(pokeathlonStatName2));
        System.assert(pokeathlonStatName2.equals(pokeathlonStatName1));
        System.assert(pokeathlonStatName1.equals(pokeathlonStatName1));
        System.assert(pokeathlonStatName3.equals(pokeathlonStatName4));
        System.assert(pokeathlonStatName4.equals(pokeathlonStatName3));
        System.assert(pokeathlonStatName3.equals(pokeathlonStatName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName3 = new OASPokeathlonStatName();
        OASPokeathlonStatName pokeathlonStatName4 = new OASPokeathlonStatName();

        System.assert(pokeathlonStatName1.equals(pokeathlonStatName2));
        System.assert(pokeathlonStatName2.equals(pokeathlonStatName1));
        System.assert(pokeathlonStatName3.equals(pokeathlonStatName4));
        System.assert(pokeathlonStatName4.equals(pokeathlonStatName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = new OASPokeathlonStatName();

        System.assertEquals(false, pokeathlonStatName1.equals('foo'));
        System.assertEquals(false, pokeathlonStatName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = new OASPokeathlonStatName();
        OASPokeathlonStatName pokeathlonStatName3;

        System.assertEquals(false, pokeathlonStatName1.equals(pokeathlonStatName3));
        System.assertEquals(false, pokeathlonStatName2.equals(pokeathlonStatName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = new OASPokeathlonStatName();

        System.assertEquals(pokeathlonStatName1.hashCode(), pokeathlonStatName1.hashCode());
        System.assertEquals(pokeathlonStatName2.hashCode(), pokeathlonStatName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatName pokeathlonStatName1 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName2 = OASPokeathlonStatName.getExample();
        OASPokeathlonStatName pokeathlonStatName3 = new OASPokeathlonStatName();
        OASPokeathlonStatName pokeathlonStatName4 = new OASPokeathlonStatName();

        System.assert(pokeathlonStatName1.equals(pokeathlonStatName2));
        System.assert(pokeathlonStatName3.equals(pokeathlonStatName4));
        System.assertEquals(pokeathlonStatName1.hashCode(), pokeathlonStatName2.hashCode());
        System.assertEquals(pokeathlonStatName3.hashCode(), pokeathlonStatName4.hashCode());
    }
}
