@isTest
private class OASEggGroupDetailPokemonSpeciesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = eggGroupDetailPokemonSpeciesInner1;
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner3 = new OASEggGroupDetailPokemonSpeciesInner();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner4 = eggGroupDetailPokemonSpeciesInner3;

        System.assert(eggGroupDetailPokemonSpeciesInner1.equals(eggGroupDetailPokemonSpeciesInner2));
        System.assert(eggGroupDetailPokemonSpeciesInner2.equals(eggGroupDetailPokemonSpeciesInner1));
        System.assert(eggGroupDetailPokemonSpeciesInner1.equals(eggGroupDetailPokemonSpeciesInner1));
        System.assert(eggGroupDetailPokemonSpeciesInner3.equals(eggGroupDetailPokemonSpeciesInner4));
        System.assert(eggGroupDetailPokemonSpeciesInner4.equals(eggGroupDetailPokemonSpeciesInner3));
        System.assert(eggGroupDetailPokemonSpeciesInner3.equals(eggGroupDetailPokemonSpeciesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner3 = new OASEggGroupDetailPokemonSpeciesInner();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner4 = new OASEggGroupDetailPokemonSpeciesInner();

        System.assert(eggGroupDetailPokemonSpeciesInner1.equals(eggGroupDetailPokemonSpeciesInner2));
        System.assert(eggGroupDetailPokemonSpeciesInner2.equals(eggGroupDetailPokemonSpeciesInner1));
        System.assert(eggGroupDetailPokemonSpeciesInner3.equals(eggGroupDetailPokemonSpeciesInner4));
        System.assert(eggGroupDetailPokemonSpeciesInner4.equals(eggGroupDetailPokemonSpeciesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = new OASEggGroupDetailPokemonSpeciesInner();

        System.assertEquals(false, eggGroupDetailPokemonSpeciesInner1.equals('foo'));
        System.assertEquals(false, eggGroupDetailPokemonSpeciesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = new OASEggGroupDetailPokemonSpeciesInner();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner3;

        System.assertEquals(false, eggGroupDetailPokemonSpeciesInner1.equals(eggGroupDetailPokemonSpeciesInner3));
        System.assertEquals(false, eggGroupDetailPokemonSpeciesInner2.equals(eggGroupDetailPokemonSpeciesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = new OASEggGroupDetailPokemonSpeciesInner();

        System.assertEquals(eggGroupDetailPokemonSpeciesInner1.hashCode(), eggGroupDetailPokemonSpeciesInner1.hashCode());
        System.assertEquals(eggGroupDetailPokemonSpeciesInner2.hashCode(), eggGroupDetailPokemonSpeciesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner1 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner2 = OASEggGroupDetailPokemonSpeciesInner.getExample();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner3 = new OASEggGroupDetailPokemonSpeciesInner();
        OASEggGroupDetailPokemonSpeciesInner eggGroupDetailPokemonSpeciesInner4 = new OASEggGroupDetailPokemonSpeciesInner();

        System.assert(eggGroupDetailPokemonSpeciesInner1.equals(eggGroupDetailPokemonSpeciesInner2));
        System.assert(eggGroupDetailPokemonSpeciesInner3.equals(eggGroupDetailPokemonSpeciesInner4));
        System.assertEquals(eggGroupDetailPokemonSpeciesInner1.hashCode(), eggGroupDetailPokemonSpeciesInner2.hashCode());
        System.assertEquals(eggGroupDetailPokemonSpeciesInner3.hashCode(), eggGroupDetailPokemonSpeciesInner4.hashCode());
    }
}
