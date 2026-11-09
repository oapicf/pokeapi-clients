@isTest
private class OASPokemonEncounterVersionDetailRespTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = pokemonEncounterVersionDetailResponse1;
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse3 = new OASPokemonEncounterVersionDetailResp();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse4 = pokemonEncounterVersionDetailResponse3;

        System.assert(pokemonEncounterVersionDetailResponse1.equals(pokemonEncounterVersionDetailResponse2));
        System.assert(pokemonEncounterVersionDetailResponse2.equals(pokemonEncounterVersionDetailResponse1));
        System.assert(pokemonEncounterVersionDetailResponse1.equals(pokemonEncounterVersionDetailResponse1));
        System.assert(pokemonEncounterVersionDetailResponse3.equals(pokemonEncounterVersionDetailResponse4));
        System.assert(pokemonEncounterVersionDetailResponse4.equals(pokemonEncounterVersionDetailResponse3));
        System.assert(pokemonEncounterVersionDetailResponse3.equals(pokemonEncounterVersionDetailResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse3 = new OASPokemonEncounterVersionDetailResp();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse4 = new OASPokemonEncounterVersionDetailResp();

        System.assert(pokemonEncounterVersionDetailResponse1.equals(pokemonEncounterVersionDetailResponse2));
        System.assert(pokemonEncounterVersionDetailResponse2.equals(pokemonEncounterVersionDetailResponse1));
        System.assert(pokemonEncounterVersionDetailResponse3.equals(pokemonEncounterVersionDetailResponse4));
        System.assert(pokemonEncounterVersionDetailResponse4.equals(pokemonEncounterVersionDetailResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = new OASPokemonEncounterVersionDetailResp();

        System.assertEquals(false, pokemonEncounterVersionDetailResponse1.equals('foo'));
        System.assertEquals(false, pokemonEncounterVersionDetailResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = new OASPokemonEncounterVersionDetailResp();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse3;

        System.assertEquals(false, pokemonEncounterVersionDetailResponse1.equals(pokemonEncounterVersionDetailResponse3));
        System.assertEquals(false, pokemonEncounterVersionDetailResponse2.equals(pokemonEncounterVersionDetailResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = new OASPokemonEncounterVersionDetailResp();

        System.assertEquals(pokemonEncounterVersionDetailResponse1.hashCode(), pokemonEncounterVersionDetailResponse1.hashCode());
        System.assertEquals(pokemonEncounterVersionDetailResponse2.hashCode(), pokemonEncounterVersionDetailResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse1 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse2 = OASPokemonEncounterVersionDetailResp.getExample();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse3 = new OASPokemonEncounterVersionDetailResp();
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse4 = new OASPokemonEncounterVersionDetailResp();

        System.assert(pokemonEncounterVersionDetailResponse1.equals(pokemonEncounterVersionDetailResponse2));
        System.assert(pokemonEncounterVersionDetailResponse3.equals(pokemonEncounterVersionDetailResponse4));
        System.assertEquals(pokemonEncounterVersionDetailResponse1.hashCode(), pokemonEncounterVersionDetailResponse2.hashCode());
        System.assertEquals(pokemonEncounterVersionDetailResponse3.hashCode(), pokemonEncounterVersionDetailResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse = new OASPokemonEncounterVersionDetailResp();
        Map<String, String> x-property-mappings = pokemonEncounterVersionDetailResponse.getx-property-mappings();
        System.assertEquals('maxChance', x-property-mappings.get('max_chance'));
        System.assertEquals('encounterDetails', x-property-mappings.get('encounter_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonEncounterVersionDetailResp pokemonEncounterVersionDetailResponse = new OASPokemonEncounterVersionDetailResp();
        System.assertEquals(new List<OASPokemonEncounterDetailResponse>(), pokemonEncounterVersionDetailResponse.encounterDetails);
        System.assertEquals(null, pokemonEncounterVersionDetailResponse.version);
        System.assertEquals(null, pokemonEncounterVersionDetailResponse.maxChance);
    }
}
