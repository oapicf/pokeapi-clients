@isTest
private class OASItemDetailHeldByPokemonInnerVersiTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = itemDetailHeldByPokemonInnerVersionDetailsInner1;
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner3 = new OASItemDetailHeldByPokemonInnerVersi();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner4 = itemDetailHeldByPokemonInnerVersionDetailsInner3;

        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner1.equals(itemDetailHeldByPokemonInnerVersionDetailsInner2));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner2.equals(itemDetailHeldByPokemonInnerVersionDetailsInner1));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner1.equals(itemDetailHeldByPokemonInnerVersionDetailsInner1));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner3.equals(itemDetailHeldByPokemonInnerVersionDetailsInner4));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner4.equals(itemDetailHeldByPokemonInnerVersionDetailsInner3));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner3.equals(itemDetailHeldByPokemonInnerVersionDetailsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner3 = new OASItemDetailHeldByPokemonInnerVersi();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner4 = new OASItemDetailHeldByPokemonInnerVersi();

        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner1.equals(itemDetailHeldByPokemonInnerVersionDetailsInner2));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner2.equals(itemDetailHeldByPokemonInnerVersionDetailsInner1));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner3.equals(itemDetailHeldByPokemonInnerVersionDetailsInner4));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner4.equals(itemDetailHeldByPokemonInnerVersionDetailsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = new OASItemDetailHeldByPokemonInnerVersi();

        System.assertEquals(false, itemDetailHeldByPokemonInnerVersionDetailsInner1.equals('foo'));
        System.assertEquals(false, itemDetailHeldByPokemonInnerVersionDetailsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = new OASItemDetailHeldByPokemonInnerVersi();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner3;

        System.assertEquals(false, itemDetailHeldByPokemonInnerVersionDetailsInner1.equals(itemDetailHeldByPokemonInnerVersionDetailsInner3));
        System.assertEquals(false, itemDetailHeldByPokemonInnerVersionDetailsInner2.equals(itemDetailHeldByPokemonInnerVersionDetailsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = new OASItemDetailHeldByPokemonInnerVersi();

        System.assertEquals(itemDetailHeldByPokemonInnerVersionDetailsInner1.hashCode(), itemDetailHeldByPokemonInnerVersionDetailsInner1.hashCode());
        System.assertEquals(itemDetailHeldByPokemonInnerVersionDetailsInner2.hashCode(), itemDetailHeldByPokemonInnerVersionDetailsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner1 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner2 = OASItemDetailHeldByPokemonInnerVersi.getExample();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner3 = new OASItemDetailHeldByPokemonInnerVersi();
        OASItemDetailHeldByPokemonInnerVersi itemDetailHeldByPokemonInnerVersionDetailsInner4 = new OASItemDetailHeldByPokemonInnerVersi();

        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner1.equals(itemDetailHeldByPokemonInnerVersionDetailsInner2));
        System.assert(itemDetailHeldByPokemonInnerVersionDetailsInner3.equals(itemDetailHeldByPokemonInnerVersionDetailsInner4));
        System.assertEquals(itemDetailHeldByPokemonInnerVersionDetailsInner1.hashCode(), itemDetailHeldByPokemonInnerVersionDetailsInner2.hashCode());
        System.assertEquals(itemDetailHeldByPokemonInnerVersionDetailsInner3.hashCode(), itemDetailHeldByPokemonInnerVersionDetailsInner4.hashCode());
    }
}
