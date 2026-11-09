@isTest
private class OASPokemonSpritesOtherOfficialArtworTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = pokemonSpritesOtherOfficialArtwork1;
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork3 = new OASPokemonSpritesOtherOfficialArtwor();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork4 = pokemonSpritesOtherOfficialArtwork3;

        System.assert(pokemonSpritesOtherOfficialArtwork1.equals(pokemonSpritesOtherOfficialArtwork2));
        System.assert(pokemonSpritesOtherOfficialArtwork2.equals(pokemonSpritesOtherOfficialArtwork1));
        System.assert(pokemonSpritesOtherOfficialArtwork1.equals(pokemonSpritesOtherOfficialArtwork1));
        System.assert(pokemonSpritesOtherOfficialArtwork3.equals(pokemonSpritesOtherOfficialArtwork4));
        System.assert(pokemonSpritesOtherOfficialArtwork4.equals(pokemonSpritesOtherOfficialArtwork3));
        System.assert(pokemonSpritesOtherOfficialArtwork3.equals(pokemonSpritesOtherOfficialArtwork3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork3 = new OASPokemonSpritesOtherOfficialArtwor();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork4 = new OASPokemonSpritesOtherOfficialArtwor();

        System.assert(pokemonSpritesOtherOfficialArtwork1.equals(pokemonSpritesOtherOfficialArtwork2));
        System.assert(pokemonSpritesOtherOfficialArtwork2.equals(pokemonSpritesOtherOfficialArtwork1));
        System.assert(pokemonSpritesOtherOfficialArtwork3.equals(pokemonSpritesOtherOfficialArtwork4));
        System.assert(pokemonSpritesOtherOfficialArtwork4.equals(pokemonSpritesOtherOfficialArtwork3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = new OASPokemonSpritesOtherOfficialArtwor();

        System.assertEquals(false, pokemonSpritesOtherOfficialArtwork1.equals('foo'));
        System.assertEquals(false, pokemonSpritesOtherOfficialArtwork2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = new OASPokemonSpritesOtherOfficialArtwor();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork3;

        System.assertEquals(false, pokemonSpritesOtherOfficialArtwork1.equals(pokemonSpritesOtherOfficialArtwork3));
        System.assertEquals(false, pokemonSpritesOtherOfficialArtwork2.equals(pokemonSpritesOtherOfficialArtwork3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = new OASPokemonSpritesOtherOfficialArtwor();

        System.assertEquals(pokemonSpritesOtherOfficialArtwork1.hashCode(), pokemonSpritesOtherOfficialArtwork1.hashCode());
        System.assertEquals(pokemonSpritesOtherOfficialArtwork2.hashCode(), pokemonSpritesOtherOfficialArtwork2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork1 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork2 = OASPokemonSpritesOtherOfficialArtwor.getExample();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork3 = new OASPokemonSpritesOtherOfficialArtwor();
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork4 = new OASPokemonSpritesOtherOfficialArtwor();

        System.assert(pokemonSpritesOtherOfficialArtwork1.equals(pokemonSpritesOtherOfficialArtwork2));
        System.assert(pokemonSpritesOtherOfficialArtwork3.equals(pokemonSpritesOtherOfficialArtwork4));
        System.assertEquals(pokemonSpritesOtherOfficialArtwork1.hashCode(), pokemonSpritesOtherOfficialArtwork2.hashCode());
        System.assertEquals(pokemonSpritesOtherOfficialArtwork3.hashCode(), pokemonSpritesOtherOfficialArtwork4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork = new OASPokemonSpritesOtherOfficialArtwor();
        Map<String, String> x-property-mappings = pokemonSpritesOtherOfficialArtwork.getx-property-mappings();
        System.assertEquals('frontDefault', x-property-mappings.get('front_default'));
        System.assertEquals('frontShiny', x-property-mappings.get('front_shiny'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonSpritesOtherOfficialArtwor pokemonSpritesOtherOfficialArtwork = new OASPokemonSpritesOtherOfficialArtwor();
        System.assertEquals(new Map<String, Map<String, oas_any_type_not_mapped>>(), pokemonSpritesOtherOfficialArtwork.versions);
        System.assertEquals(null, pokemonSpritesOtherOfficialArtwork.frontDefault);
        System.assertEquals(null, pokemonSpritesOtherOfficialArtwork.frontShiny);
    }
}
