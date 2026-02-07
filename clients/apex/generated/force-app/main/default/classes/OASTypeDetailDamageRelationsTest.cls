@isTest
private class OASTypeDetailDamageRelationsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = typeDetailDamageRelations1;
        OASTypeDetailDamageRelations typeDetailDamageRelations3 = new OASTypeDetailDamageRelations();
        OASTypeDetailDamageRelations typeDetailDamageRelations4 = typeDetailDamageRelations3;

        System.assert(typeDetailDamageRelations1.equals(typeDetailDamageRelations2));
        System.assert(typeDetailDamageRelations2.equals(typeDetailDamageRelations1));
        System.assert(typeDetailDamageRelations1.equals(typeDetailDamageRelations1));
        System.assert(typeDetailDamageRelations3.equals(typeDetailDamageRelations4));
        System.assert(typeDetailDamageRelations4.equals(typeDetailDamageRelations3));
        System.assert(typeDetailDamageRelations3.equals(typeDetailDamageRelations3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations3 = new OASTypeDetailDamageRelations();
        OASTypeDetailDamageRelations typeDetailDamageRelations4 = new OASTypeDetailDamageRelations();

        System.assert(typeDetailDamageRelations1.equals(typeDetailDamageRelations2));
        System.assert(typeDetailDamageRelations2.equals(typeDetailDamageRelations1));
        System.assert(typeDetailDamageRelations3.equals(typeDetailDamageRelations4));
        System.assert(typeDetailDamageRelations4.equals(typeDetailDamageRelations3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = new OASTypeDetailDamageRelations();

        System.assertEquals(false, typeDetailDamageRelations1.equals('foo'));
        System.assertEquals(false, typeDetailDamageRelations2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = new OASTypeDetailDamageRelations();
        OASTypeDetailDamageRelations typeDetailDamageRelations3;

        System.assertEquals(false, typeDetailDamageRelations1.equals(typeDetailDamageRelations3));
        System.assertEquals(false, typeDetailDamageRelations2.equals(typeDetailDamageRelations3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = new OASTypeDetailDamageRelations();

        System.assertEquals(typeDetailDamageRelations1.hashCode(), typeDetailDamageRelations1.hashCode());
        System.assertEquals(typeDetailDamageRelations2.hashCode(), typeDetailDamageRelations2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetailDamageRelations typeDetailDamageRelations1 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations2 = OASTypeDetailDamageRelations.getExample();
        OASTypeDetailDamageRelations typeDetailDamageRelations3 = new OASTypeDetailDamageRelations();
        OASTypeDetailDamageRelations typeDetailDamageRelations4 = new OASTypeDetailDamageRelations();

        System.assert(typeDetailDamageRelations1.equals(typeDetailDamageRelations2));
        System.assert(typeDetailDamageRelations3.equals(typeDetailDamageRelations4));
        System.assertEquals(typeDetailDamageRelations1.hashCode(), typeDetailDamageRelations2.hashCode());
        System.assertEquals(typeDetailDamageRelations3.hashCode(), typeDetailDamageRelations4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeDetailDamageRelations typeDetailDamageRelations = new OASTypeDetailDamageRelations();
        Map<String, String> x-property-mappings = typeDetailDamageRelations.getx-property-mappings();
        System.assertEquals('noDamageTo', x-property-mappings.get('no_damage_to'));
        System.assertEquals('halfDamageTo', x-property-mappings.get('half_damage_to'));
        System.assertEquals('doubleDamageTo', x-property-mappings.get('double_damage_to'));
        System.assertEquals('noDamageFrom', x-property-mappings.get('no_damage_from'));
        System.assertEquals('halfDamageFrom', x-property-mappings.get('half_damage_from'));
        System.assertEquals('doubleDamageFrom', x-property-mappings.get('double_damage_from'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTypeDetailDamageRelations typeDetailDamageRelations = new OASTypeDetailDamageRelations();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.noDamageTo);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.halfDamageTo);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.doubleDamageTo);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.noDamageFrom);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.halfDamageFrom);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), typeDetailDamageRelations.doubleDamageFrom);
    }
}
