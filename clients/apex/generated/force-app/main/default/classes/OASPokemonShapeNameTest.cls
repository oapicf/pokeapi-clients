@isTest
private class OASPokemonShapeNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = pokemonShapeName1;
        OASPokemonShapeName pokemonShapeName3 = new OASPokemonShapeName();
        OASPokemonShapeName pokemonShapeName4 = pokemonShapeName3;

        System.assert(pokemonShapeName1.equals(pokemonShapeName2));
        System.assert(pokemonShapeName2.equals(pokemonShapeName1));
        System.assert(pokemonShapeName1.equals(pokemonShapeName1));
        System.assert(pokemonShapeName3.equals(pokemonShapeName4));
        System.assert(pokemonShapeName4.equals(pokemonShapeName3));
        System.assert(pokemonShapeName3.equals(pokemonShapeName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName3 = new OASPokemonShapeName();
        OASPokemonShapeName pokemonShapeName4 = new OASPokemonShapeName();

        System.assert(pokemonShapeName1.equals(pokemonShapeName2));
        System.assert(pokemonShapeName2.equals(pokemonShapeName1));
        System.assert(pokemonShapeName3.equals(pokemonShapeName4));
        System.assert(pokemonShapeName4.equals(pokemonShapeName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = new OASPokemonShapeName();

        System.assertEquals(false, pokemonShapeName1.equals('foo'));
        System.assertEquals(false, pokemonShapeName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = new OASPokemonShapeName();
        OASPokemonShapeName pokemonShapeName3;

        System.assertEquals(false, pokemonShapeName1.equals(pokemonShapeName3));
        System.assertEquals(false, pokemonShapeName2.equals(pokemonShapeName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = new OASPokemonShapeName();

        System.assertEquals(pokemonShapeName1.hashCode(), pokemonShapeName1.hashCode());
        System.assertEquals(pokemonShapeName2.hashCode(), pokemonShapeName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeName pokemonShapeName1 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName2 = OASPokemonShapeName.getExample();
        OASPokemonShapeName pokemonShapeName3 = new OASPokemonShapeName();
        OASPokemonShapeName pokemonShapeName4 = new OASPokemonShapeName();

        System.assert(pokemonShapeName1.equals(pokemonShapeName2));
        System.assert(pokemonShapeName3.equals(pokemonShapeName4));
        System.assertEquals(pokemonShapeName1.hashCode(), pokemonShapeName2.hashCode());
        System.assertEquals(pokemonShapeName3.hashCode(), pokemonShapeName4.hashCode());
    }
}
