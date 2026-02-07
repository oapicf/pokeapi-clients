@isTest
private class OASAbilityDetailPokemonInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = abilityDetailPokemonInner1;
        OASAbilityDetailPokemonInner abilityDetailPokemonInner3 = new OASAbilityDetailPokemonInner();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner4 = abilityDetailPokemonInner3;

        System.assert(abilityDetailPokemonInner1.equals(abilityDetailPokemonInner2));
        System.assert(abilityDetailPokemonInner2.equals(abilityDetailPokemonInner1));
        System.assert(abilityDetailPokemonInner1.equals(abilityDetailPokemonInner1));
        System.assert(abilityDetailPokemonInner3.equals(abilityDetailPokemonInner4));
        System.assert(abilityDetailPokemonInner4.equals(abilityDetailPokemonInner3));
        System.assert(abilityDetailPokemonInner3.equals(abilityDetailPokemonInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner3 = new OASAbilityDetailPokemonInner();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner4 = new OASAbilityDetailPokemonInner();

        System.assert(abilityDetailPokemonInner1.equals(abilityDetailPokemonInner2));
        System.assert(abilityDetailPokemonInner2.equals(abilityDetailPokemonInner1));
        System.assert(abilityDetailPokemonInner3.equals(abilityDetailPokemonInner4));
        System.assert(abilityDetailPokemonInner4.equals(abilityDetailPokemonInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = new OASAbilityDetailPokemonInner();

        System.assertEquals(false, abilityDetailPokemonInner1.equals('foo'));
        System.assertEquals(false, abilityDetailPokemonInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = new OASAbilityDetailPokemonInner();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner3;

        System.assertEquals(false, abilityDetailPokemonInner1.equals(abilityDetailPokemonInner3));
        System.assertEquals(false, abilityDetailPokemonInner2.equals(abilityDetailPokemonInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = new OASAbilityDetailPokemonInner();

        System.assertEquals(abilityDetailPokemonInner1.hashCode(), abilityDetailPokemonInner1.hashCode());
        System.assertEquals(abilityDetailPokemonInner2.hashCode(), abilityDetailPokemonInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner1 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner2 = OASAbilityDetailPokemonInner.getExample();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner3 = new OASAbilityDetailPokemonInner();
        OASAbilityDetailPokemonInner abilityDetailPokemonInner4 = new OASAbilityDetailPokemonInner();

        System.assert(abilityDetailPokemonInner1.equals(abilityDetailPokemonInner2));
        System.assert(abilityDetailPokemonInner3.equals(abilityDetailPokemonInner4));
        System.assertEquals(abilityDetailPokemonInner1.hashCode(), abilityDetailPokemonInner2.hashCode());
        System.assertEquals(abilityDetailPokemonInner3.hashCode(), abilityDetailPokemonInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityDetailPokemonInner abilityDetailPokemonInner = new OASAbilityDetailPokemonInner();
        Map<String, String> x-property-mappings = abilityDetailPokemonInner.getx-property-mappings();
        System.assertEquals('isHidden', x-property-mappings.get('is_hidden'));
    }
}
