@isTest
private class OASStatDetailAffectingNaturesTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = statDetailAffectingNatures1;
        OASStatDetailAffectingNatures statDetailAffectingNatures3 = new OASStatDetailAffectingNatures();
        OASStatDetailAffectingNatures statDetailAffectingNatures4 = statDetailAffectingNatures3;

        System.assert(statDetailAffectingNatures1.equals(statDetailAffectingNatures2));
        System.assert(statDetailAffectingNatures2.equals(statDetailAffectingNatures1));
        System.assert(statDetailAffectingNatures1.equals(statDetailAffectingNatures1));
        System.assert(statDetailAffectingNatures3.equals(statDetailAffectingNatures4));
        System.assert(statDetailAffectingNatures4.equals(statDetailAffectingNatures3));
        System.assert(statDetailAffectingNatures3.equals(statDetailAffectingNatures3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures3 = new OASStatDetailAffectingNatures();
        OASStatDetailAffectingNatures statDetailAffectingNatures4 = new OASStatDetailAffectingNatures();

        System.assert(statDetailAffectingNatures1.equals(statDetailAffectingNatures2));
        System.assert(statDetailAffectingNatures2.equals(statDetailAffectingNatures1));
        System.assert(statDetailAffectingNatures3.equals(statDetailAffectingNatures4));
        System.assert(statDetailAffectingNatures4.equals(statDetailAffectingNatures3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = new OASStatDetailAffectingNatures();

        System.assertEquals(false, statDetailAffectingNatures1.equals('foo'));
        System.assertEquals(false, statDetailAffectingNatures2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = new OASStatDetailAffectingNatures();
        OASStatDetailAffectingNatures statDetailAffectingNatures3;

        System.assertEquals(false, statDetailAffectingNatures1.equals(statDetailAffectingNatures3));
        System.assertEquals(false, statDetailAffectingNatures2.equals(statDetailAffectingNatures3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = new OASStatDetailAffectingNatures();

        System.assertEquals(statDetailAffectingNatures1.hashCode(), statDetailAffectingNatures1.hashCode());
        System.assertEquals(statDetailAffectingNatures2.hashCode(), statDetailAffectingNatures2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatDetailAffectingNatures statDetailAffectingNatures1 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures2 = OASStatDetailAffectingNatures.getExample();
        OASStatDetailAffectingNatures statDetailAffectingNatures3 = new OASStatDetailAffectingNatures();
        OASStatDetailAffectingNatures statDetailAffectingNatures4 = new OASStatDetailAffectingNatures();

        System.assert(statDetailAffectingNatures1.equals(statDetailAffectingNatures2));
        System.assert(statDetailAffectingNatures3.equals(statDetailAffectingNatures4));
        System.assertEquals(statDetailAffectingNatures1.hashCode(), statDetailAffectingNatures2.hashCode());
        System.assertEquals(statDetailAffectingNatures3.hashCode(), statDetailAffectingNatures4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASStatDetailAffectingNatures statDetailAffectingNatures = new OASStatDetailAffectingNatures();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), statDetailAffectingNatures.increase);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), statDetailAffectingNatures.decrease);
    }
}
