@isTest
private class OASPokemonSpeciesDetailVarietiesInneTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = pokemonSpeciesDetailVarietiesInner1;
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner3 = new OASPokemonSpeciesDetailVarietiesInne();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner4 = pokemonSpeciesDetailVarietiesInner3;

        System.assert(pokemonSpeciesDetailVarietiesInner1.equals(pokemonSpeciesDetailVarietiesInner2));
        System.assert(pokemonSpeciesDetailVarietiesInner2.equals(pokemonSpeciesDetailVarietiesInner1));
        System.assert(pokemonSpeciesDetailVarietiesInner1.equals(pokemonSpeciesDetailVarietiesInner1));
        System.assert(pokemonSpeciesDetailVarietiesInner3.equals(pokemonSpeciesDetailVarietiesInner4));
        System.assert(pokemonSpeciesDetailVarietiesInner4.equals(pokemonSpeciesDetailVarietiesInner3));
        System.assert(pokemonSpeciesDetailVarietiesInner3.equals(pokemonSpeciesDetailVarietiesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner3 = new OASPokemonSpeciesDetailVarietiesInne();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner4 = new OASPokemonSpeciesDetailVarietiesInne();

        System.assert(pokemonSpeciesDetailVarietiesInner1.equals(pokemonSpeciesDetailVarietiesInner2));
        System.assert(pokemonSpeciesDetailVarietiesInner2.equals(pokemonSpeciesDetailVarietiesInner1));
        System.assert(pokemonSpeciesDetailVarietiesInner3.equals(pokemonSpeciesDetailVarietiesInner4));
        System.assert(pokemonSpeciesDetailVarietiesInner4.equals(pokemonSpeciesDetailVarietiesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = new OASPokemonSpeciesDetailVarietiesInne();

        System.assertEquals(false, pokemonSpeciesDetailVarietiesInner1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesDetailVarietiesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = new OASPokemonSpeciesDetailVarietiesInne();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner3;

        System.assertEquals(false, pokemonSpeciesDetailVarietiesInner1.equals(pokemonSpeciesDetailVarietiesInner3));
        System.assertEquals(false, pokemonSpeciesDetailVarietiesInner2.equals(pokemonSpeciesDetailVarietiesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = new OASPokemonSpeciesDetailVarietiesInne();

        System.assertEquals(pokemonSpeciesDetailVarietiesInner1.hashCode(), pokemonSpeciesDetailVarietiesInner1.hashCode());
        System.assertEquals(pokemonSpeciesDetailVarietiesInner2.hashCode(), pokemonSpeciesDetailVarietiesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner1 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner2 = OASPokemonSpeciesDetailVarietiesInne.getExample();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner3 = new OASPokemonSpeciesDetailVarietiesInne();
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner4 = new OASPokemonSpeciesDetailVarietiesInne();

        System.assert(pokemonSpeciesDetailVarietiesInner1.equals(pokemonSpeciesDetailVarietiesInner2));
        System.assert(pokemonSpeciesDetailVarietiesInner3.equals(pokemonSpeciesDetailVarietiesInner4));
        System.assertEquals(pokemonSpeciesDetailVarietiesInner1.hashCode(), pokemonSpeciesDetailVarietiesInner2.hashCode());
        System.assertEquals(pokemonSpeciesDetailVarietiesInner3.hashCode(), pokemonSpeciesDetailVarietiesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesDetailVarietiesInne pokemonSpeciesDetailVarietiesInner = new OASPokemonSpeciesDetailVarietiesInne();
        Map<String, String> x-property-mappings = pokemonSpeciesDetailVarietiesInner.getx-property-mappings();
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
    }
}
