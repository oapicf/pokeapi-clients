@isTest
private class OASAbilityDetailPokemonInnerPokemonTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = abilityDetailPokemonInnerPokemon1;
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon3 = new OASAbilityDetailPokemonInnerPokemon();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon4 = abilityDetailPokemonInnerPokemon3;

        System.assert(abilityDetailPokemonInnerPokemon1.equals(abilityDetailPokemonInnerPokemon2));
        System.assert(abilityDetailPokemonInnerPokemon2.equals(abilityDetailPokemonInnerPokemon1));
        System.assert(abilityDetailPokemonInnerPokemon1.equals(abilityDetailPokemonInnerPokemon1));
        System.assert(abilityDetailPokemonInnerPokemon3.equals(abilityDetailPokemonInnerPokemon4));
        System.assert(abilityDetailPokemonInnerPokemon4.equals(abilityDetailPokemonInnerPokemon3));
        System.assert(abilityDetailPokemonInnerPokemon3.equals(abilityDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon3 = new OASAbilityDetailPokemonInnerPokemon();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon4 = new OASAbilityDetailPokemonInnerPokemon();

        System.assert(abilityDetailPokemonInnerPokemon1.equals(abilityDetailPokemonInnerPokemon2));
        System.assert(abilityDetailPokemonInnerPokemon2.equals(abilityDetailPokemonInnerPokemon1));
        System.assert(abilityDetailPokemonInnerPokemon3.equals(abilityDetailPokemonInnerPokemon4));
        System.assert(abilityDetailPokemonInnerPokemon4.equals(abilityDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = new OASAbilityDetailPokemonInnerPokemon();

        System.assertEquals(false, abilityDetailPokemonInnerPokemon1.equals('foo'));
        System.assertEquals(false, abilityDetailPokemonInnerPokemon2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = new OASAbilityDetailPokemonInnerPokemon();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon3;

        System.assertEquals(false, abilityDetailPokemonInnerPokemon1.equals(abilityDetailPokemonInnerPokemon3));
        System.assertEquals(false, abilityDetailPokemonInnerPokemon2.equals(abilityDetailPokemonInnerPokemon3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = new OASAbilityDetailPokemonInnerPokemon();

        System.assertEquals(abilityDetailPokemonInnerPokemon1.hashCode(), abilityDetailPokemonInnerPokemon1.hashCode());
        System.assertEquals(abilityDetailPokemonInnerPokemon2.hashCode(), abilityDetailPokemonInnerPokemon2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon1 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon2 = OASAbilityDetailPokemonInnerPokemon.getExample();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon3 = new OASAbilityDetailPokemonInnerPokemon();
        OASAbilityDetailPokemonInnerPokemon abilityDetailPokemonInnerPokemon4 = new OASAbilityDetailPokemonInnerPokemon();

        System.assert(abilityDetailPokemonInnerPokemon1.equals(abilityDetailPokemonInnerPokemon2));
        System.assert(abilityDetailPokemonInnerPokemon3.equals(abilityDetailPokemonInnerPokemon4));
        System.assertEquals(abilityDetailPokemonInnerPokemon1.hashCode(), abilityDetailPokemonInnerPokemon2.hashCode());
        System.assertEquals(abilityDetailPokemonInnerPokemon3.hashCode(), abilityDetailPokemonInnerPokemon4.hashCode());
    }
}
