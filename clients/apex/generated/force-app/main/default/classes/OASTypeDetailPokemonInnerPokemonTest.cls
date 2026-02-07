@isTest
private class OASTypeDetailPokemonInnerPokemonTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = typeDetailPokemonInnerPokemon1;
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon3 = new OASTypeDetailPokemonInnerPokemon();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon4 = typeDetailPokemonInnerPokemon3;

        System.assert(typeDetailPokemonInnerPokemon1.equals(typeDetailPokemonInnerPokemon2));
        System.assert(typeDetailPokemonInnerPokemon2.equals(typeDetailPokemonInnerPokemon1));
        System.assert(typeDetailPokemonInnerPokemon1.equals(typeDetailPokemonInnerPokemon1));
        System.assert(typeDetailPokemonInnerPokemon3.equals(typeDetailPokemonInnerPokemon4));
        System.assert(typeDetailPokemonInnerPokemon4.equals(typeDetailPokemonInnerPokemon3));
        System.assert(typeDetailPokemonInnerPokemon3.equals(typeDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon3 = new OASTypeDetailPokemonInnerPokemon();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon4 = new OASTypeDetailPokemonInnerPokemon();

        System.assert(typeDetailPokemonInnerPokemon1.equals(typeDetailPokemonInnerPokemon2));
        System.assert(typeDetailPokemonInnerPokemon2.equals(typeDetailPokemonInnerPokemon1));
        System.assert(typeDetailPokemonInnerPokemon3.equals(typeDetailPokemonInnerPokemon4));
        System.assert(typeDetailPokemonInnerPokemon4.equals(typeDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = new OASTypeDetailPokemonInnerPokemon();

        System.assertEquals(false, typeDetailPokemonInnerPokemon1.equals('foo'));
        System.assertEquals(false, typeDetailPokemonInnerPokemon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = new OASTypeDetailPokemonInnerPokemon();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon3;

        System.assertEquals(false, typeDetailPokemonInnerPokemon1.equals(typeDetailPokemonInnerPokemon3));
        System.assertEquals(false, typeDetailPokemonInnerPokemon2.equals(typeDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = new OASTypeDetailPokemonInnerPokemon();

        System.assertEquals(typeDetailPokemonInnerPokemon1.hashCode(), typeDetailPokemonInnerPokemon1.hashCode());
        System.assertEquals(typeDetailPokemonInnerPokemon2.hashCode(), typeDetailPokemonInnerPokemon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon1 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon2 = OASTypeDetailPokemonInnerPokemon.getExample();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon3 = new OASTypeDetailPokemonInnerPokemon();
        OASTypeDetailPokemonInnerPokemon typeDetailPokemonInnerPokemon4 = new OASTypeDetailPokemonInnerPokemon();

        System.assert(typeDetailPokemonInnerPokemon1.equals(typeDetailPokemonInnerPokemon2));
        System.assert(typeDetailPokemonInnerPokemon3.equals(typeDetailPokemonInnerPokemon4));
        System.assertEquals(typeDetailPokemonInnerPokemon1.hashCode(), typeDetailPokemonInnerPokemon2.hashCode());
        System.assertEquals(typeDetailPokemonInnerPokemon3.hashCode(), typeDetailPokemonInnerPokemon4.hashCode());
    }
}
