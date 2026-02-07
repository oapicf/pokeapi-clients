@isTest
private class OASPokedexSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = pokedexSummary1;
        OASPokedexSummary pokedexSummary3 = new OASPokedexSummary();
        OASPokedexSummary pokedexSummary4 = pokedexSummary3;

        System.assert(pokedexSummary1.equals(pokedexSummary2));
        System.assert(pokedexSummary2.equals(pokedexSummary1));
        System.assert(pokedexSummary1.equals(pokedexSummary1));
        System.assert(pokedexSummary3.equals(pokedexSummary4));
        System.assert(pokedexSummary4.equals(pokedexSummary3));
        System.assert(pokedexSummary3.equals(pokedexSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary3 = new OASPokedexSummary();
        OASPokedexSummary pokedexSummary4 = new OASPokedexSummary();

        System.assert(pokedexSummary1.equals(pokedexSummary2));
        System.assert(pokedexSummary2.equals(pokedexSummary1));
        System.assert(pokedexSummary3.equals(pokedexSummary4));
        System.assert(pokedexSummary4.equals(pokedexSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = new OASPokedexSummary();

        System.assertEquals(false, pokedexSummary1.equals('foo'));
        System.assertEquals(false, pokedexSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = new OASPokedexSummary();
        OASPokedexSummary pokedexSummary3;

        System.assertEquals(false, pokedexSummary1.equals(pokedexSummary3));
        System.assertEquals(false, pokedexSummary2.equals(pokedexSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = new OASPokedexSummary();

        System.assertEquals(pokedexSummary1.hashCode(), pokedexSummary1.hashCode());
        System.assertEquals(pokedexSummary2.hashCode(), pokedexSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokedexSummary pokedexSummary1 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary2 = OASPokedexSummary.getExample();
        OASPokedexSummary pokedexSummary3 = new OASPokedexSummary();
        OASPokedexSummary pokedexSummary4 = new OASPokedexSummary();

        System.assert(pokedexSummary1.equals(pokedexSummary2));
        System.assert(pokedexSummary3.equals(pokedexSummary4));
        System.assertEquals(pokedexSummary1.hashCode(), pokedexSummary2.hashCode());
        System.assertEquals(pokedexSummary3.hashCode(), pokedexSummary4.hashCode());
    }
}
