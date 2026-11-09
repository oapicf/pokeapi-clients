@isTest
private class OASPokemonEncounterDetailResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = pokemonEncounterDetailResponse1;
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse3 = new OASPokemonEncounterDetailResponse();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse4 = pokemonEncounterDetailResponse3;

        System.assert(pokemonEncounterDetailResponse1.equals(pokemonEncounterDetailResponse2));
        System.assert(pokemonEncounterDetailResponse2.equals(pokemonEncounterDetailResponse1));
        System.assert(pokemonEncounterDetailResponse1.equals(pokemonEncounterDetailResponse1));
        System.assert(pokemonEncounterDetailResponse3.equals(pokemonEncounterDetailResponse4));
        System.assert(pokemonEncounterDetailResponse4.equals(pokemonEncounterDetailResponse3));
        System.assert(pokemonEncounterDetailResponse3.equals(pokemonEncounterDetailResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse3 = new OASPokemonEncounterDetailResponse();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse4 = new OASPokemonEncounterDetailResponse();

        System.assert(pokemonEncounterDetailResponse1.equals(pokemonEncounterDetailResponse2));
        System.assert(pokemonEncounterDetailResponse2.equals(pokemonEncounterDetailResponse1));
        System.assert(pokemonEncounterDetailResponse3.equals(pokemonEncounterDetailResponse4));
        System.assert(pokemonEncounterDetailResponse4.equals(pokemonEncounterDetailResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = new OASPokemonEncounterDetailResponse();

        System.assertEquals(false, pokemonEncounterDetailResponse1.equals('foo'));
        System.assertEquals(false, pokemonEncounterDetailResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = new OASPokemonEncounterDetailResponse();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse3;

        System.assertEquals(false, pokemonEncounterDetailResponse1.equals(pokemonEncounterDetailResponse3));
        System.assertEquals(false, pokemonEncounterDetailResponse2.equals(pokemonEncounterDetailResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = new OASPokemonEncounterDetailResponse();

        System.assertEquals(pokemonEncounterDetailResponse1.hashCode(), pokemonEncounterDetailResponse1.hashCode());
        System.assertEquals(pokemonEncounterDetailResponse2.hashCode(), pokemonEncounterDetailResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse1 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse2 = OASPokemonEncounterDetailResponse.getExample();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse3 = new OASPokemonEncounterDetailResponse();
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse4 = new OASPokemonEncounterDetailResponse();

        System.assert(pokemonEncounterDetailResponse1.equals(pokemonEncounterDetailResponse2));
        System.assert(pokemonEncounterDetailResponse3.equals(pokemonEncounterDetailResponse4));
        System.assertEquals(pokemonEncounterDetailResponse1.hashCode(), pokemonEncounterDetailResponse2.hashCode());
        System.assertEquals(pokemonEncounterDetailResponse3.hashCode(), pokemonEncounterDetailResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse = new OASPokemonEncounterDetailResponse();
        Map<String, String> x-property-mappings = pokemonEncounterDetailResponse.getx-property-mappings();
        System.assertEquals('conditionValues', x-property-mappings.get('condition_values'));
        System.assertEquals('maxLevel', x-property-mappings.get('max_level'));
        System.assertEquals('minLevel', x-property-mappings.get('min_level'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonEncounterDetailResponse pokemonEncounterDetailResponse = new OASPokemonEncounterDetailResponse();
        System.assertEquals(new List<OASEncounterConditionValueSummary>(), pokemonEncounterDetailResponse.conditionValues);
        System.assertEquals(null, pokemonEncounterDetailResponse.chance);
        System.assertEquals(null, pokemonEncounterDetailResponse.maxLevel);
        System.assertEquals(null, pokemonEncounterDetailResponse.method);
        System.assertEquals(null, pokemonEncounterDetailResponse.minLevel);
    }
}
