@isTest
private class OASAbilityPokemonDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = abilityPokemonDetail1;
        OASAbilityPokemonDetail abilityPokemonDetail3 = new OASAbilityPokemonDetail();
        OASAbilityPokemonDetail abilityPokemonDetail4 = abilityPokemonDetail3;

        System.assert(abilityPokemonDetail1.equals(abilityPokemonDetail2));
        System.assert(abilityPokemonDetail2.equals(abilityPokemonDetail1));
        System.assert(abilityPokemonDetail1.equals(abilityPokemonDetail1));
        System.assert(abilityPokemonDetail3.equals(abilityPokemonDetail4));
        System.assert(abilityPokemonDetail4.equals(abilityPokemonDetail3));
        System.assert(abilityPokemonDetail3.equals(abilityPokemonDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail3 = new OASAbilityPokemonDetail();
        OASAbilityPokemonDetail abilityPokemonDetail4 = new OASAbilityPokemonDetail();

        System.assert(abilityPokemonDetail1.equals(abilityPokemonDetail2));
        System.assert(abilityPokemonDetail2.equals(abilityPokemonDetail1));
        System.assert(abilityPokemonDetail3.equals(abilityPokemonDetail4));
        System.assert(abilityPokemonDetail4.equals(abilityPokemonDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = new OASAbilityPokemonDetail();

        System.assertEquals(false, abilityPokemonDetail1.equals('foo'));
        System.assertEquals(false, abilityPokemonDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = new OASAbilityPokemonDetail();
        OASAbilityPokemonDetail abilityPokemonDetail3;

        System.assertEquals(false, abilityPokemonDetail1.equals(abilityPokemonDetail3));
        System.assertEquals(false, abilityPokemonDetail2.equals(abilityPokemonDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = new OASAbilityPokemonDetail();

        System.assertEquals(abilityPokemonDetail1.hashCode(), abilityPokemonDetail1.hashCode());
        System.assertEquals(abilityPokemonDetail2.hashCode(), abilityPokemonDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityPokemonDetail abilityPokemonDetail1 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail2 = OASAbilityPokemonDetail.getExample();
        OASAbilityPokemonDetail abilityPokemonDetail3 = new OASAbilityPokemonDetail();
        OASAbilityPokemonDetail abilityPokemonDetail4 = new OASAbilityPokemonDetail();

        System.assert(abilityPokemonDetail1.equals(abilityPokemonDetail2));
        System.assert(abilityPokemonDetail3.equals(abilityPokemonDetail4));
        System.assertEquals(abilityPokemonDetail1.hashCode(), abilityPokemonDetail2.hashCode());
        System.assertEquals(abilityPokemonDetail3.hashCode(), abilityPokemonDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityPokemonDetail abilityPokemonDetail = new OASAbilityPokemonDetail();
        Map<String, String> x-property-mappings = abilityPokemonDetail.getx-property-mappings();
        System.assertEquals('isHidden', x-property-mappings.get('is_hidden'));
    }
}
