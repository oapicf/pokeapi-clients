@isTest
private class OASPokemonEncountersRetrieve200RespoTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = pokemonEncountersRetrieve200ResponseInner1;
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner3 = new OASPokemonEncountersRetrieve200Respo();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner4 = pokemonEncountersRetrieve200ResponseInner3;

        System.assert(pokemonEncountersRetrieve200ResponseInner1.equals(pokemonEncountersRetrieve200ResponseInner2));
        System.assert(pokemonEncountersRetrieve200ResponseInner2.equals(pokemonEncountersRetrieve200ResponseInner1));
        System.assert(pokemonEncountersRetrieve200ResponseInner1.equals(pokemonEncountersRetrieve200ResponseInner1));
        System.assert(pokemonEncountersRetrieve200ResponseInner3.equals(pokemonEncountersRetrieve200ResponseInner4));
        System.assert(pokemonEncountersRetrieve200ResponseInner4.equals(pokemonEncountersRetrieve200ResponseInner3));
        System.assert(pokemonEncountersRetrieve200ResponseInner3.equals(pokemonEncountersRetrieve200ResponseInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner3 = new OASPokemonEncountersRetrieve200Respo();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner4 = new OASPokemonEncountersRetrieve200Respo();

        System.assert(pokemonEncountersRetrieve200ResponseInner1.equals(pokemonEncountersRetrieve200ResponseInner2));
        System.assert(pokemonEncountersRetrieve200ResponseInner2.equals(pokemonEncountersRetrieve200ResponseInner1));
        System.assert(pokemonEncountersRetrieve200ResponseInner3.equals(pokemonEncountersRetrieve200ResponseInner4));
        System.assert(pokemonEncountersRetrieve200ResponseInner4.equals(pokemonEncountersRetrieve200ResponseInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = new OASPokemonEncountersRetrieve200Respo();

        System.assertEquals(false, pokemonEncountersRetrieve200ResponseInner1.equals('foo'));
        System.assertEquals(false, pokemonEncountersRetrieve200ResponseInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = new OASPokemonEncountersRetrieve200Respo();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner3;

        System.assertEquals(false, pokemonEncountersRetrieve200ResponseInner1.equals(pokemonEncountersRetrieve200ResponseInner3));
        System.assertEquals(false, pokemonEncountersRetrieve200ResponseInner2.equals(pokemonEncountersRetrieve200ResponseInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = new OASPokemonEncountersRetrieve200Respo();

        System.assertEquals(pokemonEncountersRetrieve200ResponseInner1.hashCode(), pokemonEncountersRetrieve200ResponseInner1.hashCode());
        System.assertEquals(pokemonEncountersRetrieve200ResponseInner2.hashCode(), pokemonEncountersRetrieve200ResponseInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner1 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner2 = OASPokemonEncountersRetrieve200Respo.getExample();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner3 = new OASPokemonEncountersRetrieve200Respo();
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner4 = new OASPokemonEncountersRetrieve200Respo();

        System.assert(pokemonEncountersRetrieve200ResponseInner1.equals(pokemonEncountersRetrieve200ResponseInner2));
        System.assert(pokemonEncountersRetrieve200ResponseInner3.equals(pokemonEncountersRetrieve200ResponseInner4));
        System.assertEquals(pokemonEncountersRetrieve200ResponseInner1.hashCode(), pokemonEncountersRetrieve200ResponseInner2.hashCode());
        System.assertEquals(pokemonEncountersRetrieve200ResponseInner3.hashCode(), pokemonEncountersRetrieve200ResponseInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner = new OASPokemonEncountersRetrieve200Respo();
        Map<String, String> x-property-mappings = pokemonEncountersRetrieve200ResponseInner.getx-property-mappings();
        System.assertEquals('locationArea', x-property-mappings.get('location_area'));
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonEncountersRetrieve200Respo pokemonEncountersRetrieve200ResponseInner = new OASPokemonEncountersRetrieve200Respo();
        System.assertEquals(new List<OASPokemonEncountersRetrieve200Respo>(), pokemonEncountersRetrieve200ResponseInner.versionDetails);
        System.assertEquals(null, pokemonEncountersRetrieve200ResponseInner.locationArea);
    }
}
