@isTest
private class OASPalParkAreaDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = palParkAreaDetail1;
        OASPalParkAreaDetail palParkAreaDetail3 = new OASPalParkAreaDetail();
        OASPalParkAreaDetail palParkAreaDetail4 = palParkAreaDetail3;

        System.assert(palParkAreaDetail1.equals(palParkAreaDetail2));
        System.assert(palParkAreaDetail2.equals(palParkAreaDetail1));
        System.assert(palParkAreaDetail1.equals(palParkAreaDetail1));
        System.assert(palParkAreaDetail3.equals(palParkAreaDetail4));
        System.assert(palParkAreaDetail4.equals(palParkAreaDetail3));
        System.assert(palParkAreaDetail3.equals(palParkAreaDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail3 = new OASPalParkAreaDetail();
        OASPalParkAreaDetail palParkAreaDetail4 = new OASPalParkAreaDetail();

        System.assert(palParkAreaDetail1.equals(palParkAreaDetail2));
        System.assert(palParkAreaDetail2.equals(palParkAreaDetail1));
        System.assert(palParkAreaDetail3.equals(palParkAreaDetail4));
        System.assert(palParkAreaDetail4.equals(palParkAreaDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = new OASPalParkAreaDetail();

        System.assertEquals(false, palParkAreaDetail1.equals('foo'));
        System.assertEquals(false, palParkAreaDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = new OASPalParkAreaDetail();
        OASPalParkAreaDetail palParkAreaDetail3;

        System.assertEquals(false, palParkAreaDetail1.equals(palParkAreaDetail3));
        System.assertEquals(false, palParkAreaDetail2.equals(palParkAreaDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = new OASPalParkAreaDetail();

        System.assertEquals(palParkAreaDetail1.hashCode(), palParkAreaDetail1.hashCode());
        System.assertEquals(palParkAreaDetail2.hashCode(), palParkAreaDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPalParkAreaDetail palParkAreaDetail1 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail2 = OASPalParkAreaDetail.getExample();
        OASPalParkAreaDetail palParkAreaDetail3 = new OASPalParkAreaDetail();
        OASPalParkAreaDetail palParkAreaDetail4 = new OASPalParkAreaDetail();

        System.assert(palParkAreaDetail1.equals(palParkAreaDetail2));
        System.assert(palParkAreaDetail3.equals(palParkAreaDetail4));
        System.assertEquals(palParkAreaDetail1.hashCode(), palParkAreaDetail2.hashCode());
        System.assertEquals(palParkAreaDetail3.hashCode(), palParkAreaDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPalParkAreaDetail palParkAreaDetail = new OASPalParkAreaDetail();
        Map<String, String> x-property-mappings = palParkAreaDetail.getx-property-mappings();
        System.assertEquals('pokemonEncounters', x-property-mappings.get('pokemon_encounters'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPalParkAreaDetail palParkAreaDetail = new OASPalParkAreaDetail();
        System.assertEquals(new List<OASPalParkAreaName>(), palParkAreaDetail.names);
        System.assertEquals(new List<OASPalParkAreaDetailPokemonEncounter>(), palParkAreaDetail.pokemonEncounters);
        System.assertEquals(null, palParkAreaDetail.id);
        System.assertEquals(null, palParkAreaDetail.name);
    }
}
