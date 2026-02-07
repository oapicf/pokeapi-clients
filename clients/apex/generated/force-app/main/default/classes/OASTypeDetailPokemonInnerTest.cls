@isTest
private class OASTypeDetailPokemonInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = typeDetailPokemonInner1;
        OASTypeDetailPokemonInner typeDetailPokemonInner3 = new OASTypeDetailPokemonInner();
        OASTypeDetailPokemonInner typeDetailPokemonInner4 = typeDetailPokemonInner3;

        System.assert(typeDetailPokemonInner1.equals(typeDetailPokemonInner2));
        System.assert(typeDetailPokemonInner2.equals(typeDetailPokemonInner1));
        System.assert(typeDetailPokemonInner1.equals(typeDetailPokemonInner1));
        System.assert(typeDetailPokemonInner3.equals(typeDetailPokemonInner4));
        System.assert(typeDetailPokemonInner4.equals(typeDetailPokemonInner3));
        System.assert(typeDetailPokemonInner3.equals(typeDetailPokemonInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner3 = new OASTypeDetailPokemonInner();
        OASTypeDetailPokemonInner typeDetailPokemonInner4 = new OASTypeDetailPokemonInner();

        System.assert(typeDetailPokemonInner1.equals(typeDetailPokemonInner2));
        System.assert(typeDetailPokemonInner2.equals(typeDetailPokemonInner1));
        System.assert(typeDetailPokemonInner3.equals(typeDetailPokemonInner4));
        System.assert(typeDetailPokemonInner4.equals(typeDetailPokemonInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = new OASTypeDetailPokemonInner();

        System.assertEquals(false, typeDetailPokemonInner1.equals('foo'));
        System.assertEquals(false, typeDetailPokemonInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = new OASTypeDetailPokemonInner();
        OASTypeDetailPokemonInner typeDetailPokemonInner3;

        System.assertEquals(false, typeDetailPokemonInner1.equals(typeDetailPokemonInner3));
        System.assertEquals(false, typeDetailPokemonInner2.equals(typeDetailPokemonInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = new OASTypeDetailPokemonInner();

        System.assertEquals(typeDetailPokemonInner1.hashCode(), typeDetailPokemonInner1.hashCode());
        System.assertEquals(typeDetailPokemonInner2.hashCode(), typeDetailPokemonInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetailPokemonInner typeDetailPokemonInner1 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner2 = OASTypeDetailPokemonInner.getExample();
        OASTypeDetailPokemonInner typeDetailPokemonInner3 = new OASTypeDetailPokemonInner();
        OASTypeDetailPokemonInner typeDetailPokemonInner4 = new OASTypeDetailPokemonInner();

        System.assert(typeDetailPokemonInner1.equals(typeDetailPokemonInner2));
        System.assert(typeDetailPokemonInner3.equals(typeDetailPokemonInner4));
        System.assertEquals(typeDetailPokemonInner1.hashCode(), typeDetailPokemonInner2.hashCode());
        System.assertEquals(typeDetailPokemonInner3.hashCode(), typeDetailPokemonInner4.hashCode());
    }
}
