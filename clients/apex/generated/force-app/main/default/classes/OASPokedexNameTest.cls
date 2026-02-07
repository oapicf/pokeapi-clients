@isTest
private class OASPokedexNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = pokedexName1;
        OASPokedexName pokedexName3 = new OASPokedexName();
        OASPokedexName pokedexName4 = pokedexName3;

        System.assert(pokedexName1.equals(pokedexName2));
        System.assert(pokedexName2.equals(pokedexName1));
        System.assert(pokedexName1.equals(pokedexName1));
        System.assert(pokedexName3.equals(pokedexName4));
        System.assert(pokedexName4.equals(pokedexName3));
        System.assert(pokedexName3.equals(pokedexName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = OASPokedexName.getExample();
        OASPokedexName pokedexName3 = new OASPokedexName();
        OASPokedexName pokedexName4 = new OASPokedexName();

        System.assert(pokedexName1.equals(pokedexName2));
        System.assert(pokedexName2.equals(pokedexName1));
        System.assert(pokedexName3.equals(pokedexName4));
        System.assert(pokedexName4.equals(pokedexName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = new OASPokedexName();

        System.assertEquals(false, pokedexName1.equals('foo'));
        System.assertEquals(false, pokedexName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = new OASPokedexName();
        OASPokedexName pokedexName3;

        System.assertEquals(false, pokedexName1.equals(pokedexName3));
        System.assertEquals(false, pokedexName2.equals(pokedexName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = new OASPokedexName();

        System.assertEquals(pokedexName1.hashCode(), pokedexName1.hashCode());
        System.assertEquals(pokedexName2.hashCode(), pokedexName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokedexName pokedexName1 = OASPokedexName.getExample();
        OASPokedexName pokedexName2 = OASPokedexName.getExample();
        OASPokedexName pokedexName3 = new OASPokedexName();
        OASPokedexName pokedexName4 = new OASPokedexName();

        System.assert(pokedexName1.equals(pokedexName2));
        System.assert(pokedexName3.equals(pokedexName4));
        System.assertEquals(pokedexName1.hashCode(), pokedexName2.hashCode());
        System.assertEquals(pokedexName3.hashCode(), pokedexName4.hashCode());
    }
}
