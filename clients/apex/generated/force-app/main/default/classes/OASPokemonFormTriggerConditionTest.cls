@isTest
private class OASPokemonFormTriggerConditionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = pokemonFormTriggerCondition1;
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition3 = new OASPokemonFormTriggerCondition();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition4 = pokemonFormTriggerCondition3;

        System.assert(pokemonFormTriggerCondition1.equals(pokemonFormTriggerCondition2));
        System.assert(pokemonFormTriggerCondition2.equals(pokemonFormTriggerCondition1));
        System.assert(pokemonFormTriggerCondition1.equals(pokemonFormTriggerCondition1));
        System.assert(pokemonFormTriggerCondition3.equals(pokemonFormTriggerCondition4));
        System.assert(pokemonFormTriggerCondition4.equals(pokemonFormTriggerCondition3));
        System.assert(pokemonFormTriggerCondition3.equals(pokemonFormTriggerCondition3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition3 = new OASPokemonFormTriggerCondition();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition4 = new OASPokemonFormTriggerCondition();

        System.assert(pokemonFormTriggerCondition1.equals(pokemonFormTriggerCondition2));
        System.assert(pokemonFormTriggerCondition2.equals(pokemonFormTriggerCondition1));
        System.assert(pokemonFormTriggerCondition3.equals(pokemonFormTriggerCondition4));
        System.assert(pokemonFormTriggerCondition4.equals(pokemonFormTriggerCondition3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = new OASPokemonFormTriggerCondition();

        System.assertEquals(false, pokemonFormTriggerCondition1.equals('foo'));
        System.assertEquals(false, pokemonFormTriggerCondition2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = new OASPokemonFormTriggerCondition();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition3;

        System.assertEquals(false, pokemonFormTriggerCondition1.equals(pokemonFormTriggerCondition3));
        System.assertEquals(false, pokemonFormTriggerCondition2.equals(pokemonFormTriggerCondition3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = new OASPokemonFormTriggerCondition();

        System.assertEquals(pokemonFormTriggerCondition1.hashCode(), pokemonFormTriggerCondition1.hashCode());
        System.assertEquals(pokemonFormTriggerCondition2.hashCode(), pokemonFormTriggerCondition2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition1 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition2 = OASPokemonFormTriggerCondition.getExample();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition3 = new OASPokemonFormTriggerCondition();
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition4 = new OASPokemonFormTriggerCondition();

        System.assert(pokemonFormTriggerCondition1.equals(pokemonFormTriggerCondition2));
        System.assert(pokemonFormTriggerCondition3.equals(pokemonFormTriggerCondition4));
        System.assertEquals(pokemonFormTriggerCondition1.hashCode(), pokemonFormTriggerCondition2.hashCode());
        System.assertEquals(pokemonFormTriggerCondition3.hashCode(), pokemonFormTriggerCondition4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonFormTriggerCondition pokemonFormTriggerCondition = new OASPokemonFormTriggerCondition();
        Map<String, String> x-property-mappings = pokemonFormTriggerCondition.getx-property-mappings();
        System.assertEquals('r_trigger', x-property-mappings.get('trigger'));
        System.assertEquals('baseForm', x-property-mappings.get('base_form'));
    }
}
