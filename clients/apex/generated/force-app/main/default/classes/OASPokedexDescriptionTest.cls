@isTest
private class OASPokedexDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = pokedexDescription1;
        OASPokedexDescription pokedexDescription3 = new OASPokedexDescription();
        OASPokedexDescription pokedexDescription4 = pokedexDescription3;

        System.assert(pokedexDescription1.equals(pokedexDescription2));
        System.assert(pokedexDescription2.equals(pokedexDescription1));
        System.assert(pokedexDescription1.equals(pokedexDescription1));
        System.assert(pokedexDescription3.equals(pokedexDescription4));
        System.assert(pokedexDescription4.equals(pokedexDescription3));
        System.assert(pokedexDescription3.equals(pokedexDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription3 = new OASPokedexDescription();
        OASPokedexDescription pokedexDescription4 = new OASPokedexDescription();

        System.assert(pokedexDescription1.equals(pokedexDescription2));
        System.assert(pokedexDescription2.equals(pokedexDescription1));
        System.assert(pokedexDescription3.equals(pokedexDescription4));
        System.assert(pokedexDescription4.equals(pokedexDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = new OASPokedexDescription();

        System.assertEquals(false, pokedexDescription1.equals('foo'));
        System.assertEquals(false, pokedexDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = new OASPokedexDescription();
        OASPokedexDescription pokedexDescription3;

        System.assertEquals(false, pokedexDescription1.equals(pokedexDescription3));
        System.assertEquals(false, pokedexDescription2.equals(pokedexDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = new OASPokedexDescription();

        System.assertEquals(pokedexDescription1.hashCode(), pokedexDescription1.hashCode());
        System.assertEquals(pokedexDescription2.hashCode(), pokedexDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokedexDescription pokedexDescription1 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription2 = OASPokedexDescription.getExample();
        OASPokedexDescription pokedexDescription3 = new OASPokedexDescription();
        OASPokedexDescription pokedexDescription4 = new OASPokedexDescription();

        System.assert(pokedexDescription1.equals(pokedexDescription2));
        System.assert(pokedexDescription3.equals(pokedexDescription4));
        System.assertEquals(pokedexDescription1.hashCode(), pokedexDescription2.hashCode());
        System.assertEquals(pokedexDescription3.hashCode(), pokedexDescription4.hashCode());
    }
}
