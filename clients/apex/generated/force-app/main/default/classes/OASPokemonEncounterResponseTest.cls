@isTest
private class OASPokemonEncounterResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = pokemonEncounterResponse1;
        OASPokemonEncounterResponse pokemonEncounterResponse3 = new OASPokemonEncounterResponse();
        OASPokemonEncounterResponse pokemonEncounterResponse4 = pokemonEncounterResponse3;

        System.assert(pokemonEncounterResponse1.equals(pokemonEncounterResponse2));
        System.assert(pokemonEncounterResponse2.equals(pokemonEncounterResponse1));
        System.assert(pokemonEncounterResponse1.equals(pokemonEncounterResponse1));
        System.assert(pokemonEncounterResponse3.equals(pokemonEncounterResponse4));
        System.assert(pokemonEncounterResponse4.equals(pokemonEncounterResponse3));
        System.assert(pokemonEncounterResponse3.equals(pokemonEncounterResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse3 = new OASPokemonEncounterResponse();
        OASPokemonEncounterResponse pokemonEncounterResponse4 = new OASPokemonEncounterResponse();

        System.assert(pokemonEncounterResponse1.equals(pokemonEncounterResponse2));
        System.assert(pokemonEncounterResponse2.equals(pokemonEncounterResponse1));
        System.assert(pokemonEncounterResponse3.equals(pokemonEncounterResponse4));
        System.assert(pokemonEncounterResponse4.equals(pokemonEncounterResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = new OASPokemonEncounterResponse();

        System.assertEquals(false, pokemonEncounterResponse1.equals('foo'));
        System.assertEquals(false, pokemonEncounterResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = new OASPokemonEncounterResponse();
        OASPokemonEncounterResponse pokemonEncounterResponse3;

        System.assertEquals(false, pokemonEncounterResponse1.equals(pokemonEncounterResponse3));
        System.assertEquals(false, pokemonEncounterResponse2.equals(pokemonEncounterResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = new OASPokemonEncounterResponse();

        System.assertEquals(pokemonEncounterResponse1.hashCode(), pokemonEncounterResponse1.hashCode());
        System.assertEquals(pokemonEncounterResponse2.hashCode(), pokemonEncounterResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEncounterResponse pokemonEncounterResponse1 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse2 = OASPokemonEncounterResponse.getExample();
        OASPokemonEncounterResponse pokemonEncounterResponse3 = new OASPokemonEncounterResponse();
        OASPokemonEncounterResponse pokemonEncounterResponse4 = new OASPokemonEncounterResponse();

        System.assert(pokemonEncounterResponse1.equals(pokemonEncounterResponse2));
        System.assert(pokemonEncounterResponse3.equals(pokemonEncounterResponse4));
        System.assertEquals(pokemonEncounterResponse1.hashCode(), pokemonEncounterResponse2.hashCode());
        System.assertEquals(pokemonEncounterResponse3.hashCode(), pokemonEncounterResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonEncounterResponse pokemonEncounterResponse = new OASPokemonEncounterResponse();
        Map<String, String> x-property-mappings = pokemonEncounterResponse.getx-property-mappings();
        System.assertEquals('locationArea', x-property-mappings.get('location_area'));
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonEncounterResponse pokemonEncounterResponse = new OASPokemonEncounterResponse();
        System.assertEquals(new List<OASPokemonEncounterVersionDetailResp>(), pokemonEncounterResponse.versionDetails);
        System.assertEquals(null, pokemonEncounterResponse.locationArea);
    }
}
