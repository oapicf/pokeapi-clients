@isTest
private class OASPokeathlonStatSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = pokeathlonStatSummary1;
        OASPokeathlonStatSummary pokeathlonStatSummary3 = new OASPokeathlonStatSummary();
        OASPokeathlonStatSummary pokeathlonStatSummary4 = pokeathlonStatSummary3;

        System.assert(pokeathlonStatSummary1.equals(pokeathlonStatSummary2));
        System.assert(pokeathlonStatSummary2.equals(pokeathlonStatSummary1));
        System.assert(pokeathlonStatSummary1.equals(pokeathlonStatSummary1));
        System.assert(pokeathlonStatSummary3.equals(pokeathlonStatSummary4));
        System.assert(pokeathlonStatSummary4.equals(pokeathlonStatSummary3));
        System.assert(pokeathlonStatSummary3.equals(pokeathlonStatSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary3 = new OASPokeathlonStatSummary();
        OASPokeathlonStatSummary pokeathlonStatSummary4 = new OASPokeathlonStatSummary();

        System.assert(pokeathlonStatSummary1.equals(pokeathlonStatSummary2));
        System.assert(pokeathlonStatSummary2.equals(pokeathlonStatSummary1));
        System.assert(pokeathlonStatSummary3.equals(pokeathlonStatSummary4));
        System.assert(pokeathlonStatSummary4.equals(pokeathlonStatSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = new OASPokeathlonStatSummary();

        System.assertEquals(false, pokeathlonStatSummary1.equals('foo'));
        System.assertEquals(false, pokeathlonStatSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = new OASPokeathlonStatSummary();
        OASPokeathlonStatSummary pokeathlonStatSummary3;

        System.assertEquals(false, pokeathlonStatSummary1.equals(pokeathlonStatSummary3));
        System.assertEquals(false, pokeathlonStatSummary2.equals(pokeathlonStatSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = new OASPokeathlonStatSummary();

        System.assertEquals(pokeathlonStatSummary1.hashCode(), pokeathlonStatSummary1.hashCode());
        System.assertEquals(pokeathlonStatSummary2.hashCode(), pokeathlonStatSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatSummary pokeathlonStatSummary1 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary2 = OASPokeathlonStatSummary.getExample();
        OASPokeathlonStatSummary pokeathlonStatSummary3 = new OASPokeathlonStatSummary();
        OASPokeathlonStatSummary pokeathlonStatSummary4 = new OASPokeathlonStatSummary();

        System.assert(pokeathlonStatSummary1.equals(pokeathlonStatSummary2));
        System.assert(pokeathlonStatSummary3.equals(pokeathlonStatSummary4));
        System.assertEquals(pokeathlonStatSummary1.hashCode(), pokeathlonStatSummary2.hashCode());
        System.assertEquals(pokeathlonStatSummary3.hashCode(), pokeathlonStatSummary4.hashCode());
    }
}
