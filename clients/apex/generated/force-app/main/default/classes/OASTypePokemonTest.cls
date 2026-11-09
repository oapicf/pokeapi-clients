@isTest
private class OASTypePokemonTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = typePokemon1;
        OASTypePokemon typePokemon3 = new OASTypePokemon();
        OASTypePokemon typePokemon4 = typePokemon3;

        System.assert(typePokemon1.equals(typePokemon2));
        System.assert(typePokemon2.equals(typePokemon1));
        System.assert(typePokemon1.equals(typePokemon1));
        System.assert(typePokemon3.equals(typePokemon4));
        System.assert(typePokemon4.equals(typePokemon3));
        System.assert(typePokemon3.equals(typePokemon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon3 = new OASTypePokemon();
        OASTypePokemon typePokemon4 = new OASTypePokemon();

        System.assert(typePokemon1.equals(typePokemon2));
        System.assert(typePokemon2.equals(typePokemon1));
        System.assert(typePokemon3.equals(typePokemon4));
        System.assert(typePokemon4.equals(typePokemon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = new OASTypePokemon();

        System.assertEquals(false, typePokemon1.equals('foo'));
        System.assertEquals(false, typePokemon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = new OASTypePokemon();
        OASTypePokemon typePokemon3;

        System.assertEquals(false, typePokemon1.equals(typePokemon3));
        System.assertEquals(false, typePokemon2.equals(typePokemon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = new OASTypePokemon();

        System.assertEquals(typePokemon1.hashCode(), typePokemon1.hashCode());
        System.assertEquals(typePokemon2.hashCode(), typePokemon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypePokemon typePokemon1 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon2 = OASTypePokemon.getExample();
        OASTypePokemon typePokemon3 = new OASTypePokemon();
        OASTypePokemon typePokemon4 = new OASTypePokemon();

        System.assert(typePokemon1.equals(typePokemon2));
        System.assert(typePokemon3.equals(typePokemon4));
        System.assertEquals(typePokemon1.hashCode(), typePokemon2.hashCode());
        System.assertEquals(typePokemon3.hashCode(), typePokemon4.hashCode());
    }
}
