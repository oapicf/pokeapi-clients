@isTest
private class OASPokemonFormDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = pokemonFormDetail1;
        OASPokemonFormDetail pokemonFormDetail3 = new OASPokemonFormDetail();
        OASPokemonFormDetail pokemonFormDetail4 = pokemonFormDetail3;

        System.assert(pokemonFormDetail1.equals(pokemonFormDetail2));
        System.assert(pokemonFormDetail2.equals(pokemonFormDetail1));
        System.assert(pokemonFormDetail1.equals(pokemonFormDetail1));
        System.assert(pokemonFormDetail3.equals(pokemonFormDetail4));
        System.assert(pokemonFormDetail4.equals(pokemonFormDetail3));
        System.assert(pokemonFormDetail3.equals(pokemonFormDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail3 = new OASPokemonFormDetail();
        OASPokemonFormDetail pokemonFormDetail4 = new OASPokemonFormDetail();

        System.assert(pokemonFormDetail1.equals(pokemonFormDetail2));
        System.assert(pokemonFormDetail2.equals(pokemonFormDetail1));
        System.assert(pokemonFormDetail3.equals(pokemonFormDetail4));
        System.assert(pokemonFormDetail4.equals(pokemonFormDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = new OASPokemonFormDetail();

        System.assertEquals(false, pokemonFormDetail1.equals('foo'));
        System.assertEquals(false, pokemonFormDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = new OASPokemonFormDetail();
        OASPokemonFormDetail pokemonFormDetail3;

        System.assertEquals(false, pokemonFormDetail1.equals(pokemonFormDetail3));
        System.assertEquals(false, pokemonFormDetail2.equals(pokemonFormDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = new OASPokemonFormDetail();

        System.assertEquals(pokemonFormDetail1.hashCode(), pokemonFormDetail1.hashCode());
        System.assertEquals(pokemonFormDetail2.hashCode(), pokemonFormDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormDetail pokemonFormDetail1 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail2 = OASPokemonFormDetail.getExample();
        OASPokemonFormDetail pokemonFormDetail3 = new OASPokemonFormDetail();
        OASPokemonFormDetail pokemonFormDetail4 = new OASPokemonFormDetail();

        System.assert(pokemonFormDetail1.equals(pokemonFormDetail2));
        System.assert(pokemonFormDetail3.equals(pokemonFormDetail4));
        System.assertEquals(pokemonFormDetail1.hashCode(), pokemonFormDetail2.hashCode());
        System.assertEquals(pokemonFormDetail3.hashCode(), pokemonFormDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonFormDetail pokemonFormDetail = new OASPokemonFormDetail();
        Map<String, String> x-property-mappings = pokemonFormDetail.getx-property-mappings();
        System.assertEquals('formOrder', x-property-mappings.get('form_order'));
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
        System.assertEquals('isBattleOnly', x-property-mappings.get('is_battle_only'));
        System.assertEquals('isMega', x-property-mappings.get('is_mega'));
        System.assertEquals('formName', x-property-mappings.get('form_name'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
        System.assertEquals('formNames', x-property-mappings.get('form_names'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonFormDetail pokemonFormDetail = new OASPokemonFormDetail();
        System.assertEquals(new List<OASPokemonFormDetailFormNamesInner>(), pokemonFormDetail.formNames);
        System.assertEquals(new List<OASPokemonFormDetailFormNamesInner>(), pokemonFormDetail.names);
        System.assertEquals(new List<OASPokemonDetailTypesInner>(), pokemonFormDetail.types);
        System.assertEquals(null, pokemonFormDetail.id);
        System.assertEquals(null, pokemonFormDetail.name);
        System.assertEquals(null, pokemonFormDetail.order);
        System.assertEquals(null, pokemonFormDetail.formOrder);
        System.assertEquals(null, pokemonFormDetail.isDefault);
        System.assertEquals(null, pokemonFormDetail.isBattleOnly);
        System.assertEquals(null, pokemonFormDetail.isMega);
        System.assertEquals(null, pokemonFormDetail.formName);
        System.assertEquals(null, pokemonFormDetail.pokemon);
        System.assertEquals(null, pokemonFormDetail.sprites);
        System.assertEquals(null, pokemonFormDetail.versionGroup);
    }
}
