@isTest
private class OASItemDetailHeldByPokemonInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = itemDetailHeldByPokemonInner1;
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner3 = new OASItemDetailHeldByPokemonInner();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner4 = itemDetailHeldByPokemonInner3;

        System.assert(itemDetailHeldByPokemonInner1.equals(itemDetailHeldByPokemonInner2));
        System.assert(itemDetailHeldByPokemonInner2.equals(itemDetailHeldByPokemonInner1));
        System.assert(itemDetailHeldByPokemonInner1.equals(itemDetailHeldByPokemonInner1));
        System.assert(itemDetailHeldByPokemonInner3.equals(itemDetailHeldByPokemonInner4));
        System.assert(itemDetailHeldByPokemonInner4.equals(itemDetailHeldByPokemonInner3));
        System.assert(itemDetailHeldByPokemonInner3.equals(itemDetailHeldByPokemonInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner3 = new OASItemDetailHeldByPokemonInner();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner4 = new OASItemDetailHeldByPokemonInner();

        System.assert(itemDetailHeldByPokemonInner1.equals(itemDetailHeldByPokemonInner2));
        System.assert(itemDetailHeldByPokemonInner2.equals(itemDetailHeldByPokemonInner1));
        System.assert(itemDetailHeldByPokemonInner3.equals(itemDetailHeldByPokemonInner4));
        System.assert(itemDetailHeldByPokemonInner4.equals(itemDetailHeldByPokemonInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = new OASItemDetailHeldByPokemonInner();

        System.assertEquals(false, itemDetailHeldByPokemonInner1.equals('foo'));
        System.assertEquals(false, itemDetailHeldByPokemonInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = new OASItemDetailHeldByPokemonInner();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner3;

        System.assertEquals(false, itemDetailHeldByPokemonInner1.equals(itemDetailHeldByPokemonInner3));
        System.assertEquals(false, itemDetailHeldByPokemonInner2.equals(itemDetailHeldByPokemonInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = new OASItemDetailHeldByPokemonInner();

        System.assertEquals(itemDetailHeldByPokemonInner1.hashCode(), itemDetailHeldByPokemonInner1.hashCode());
        System.assertEquals(itemDetailHeldByPokemonInner2.hashCode(), itemDetailHeldByPokemonInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner1 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner2 = OASItemDetailHeldByPokemonInner.getExample();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner3 = new OASItemDetailHeldByPokemonInner();
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner4 = new OASItemDetailHeldByPokemonInner();

        System.assert(itemDetailHeldByPokemonInner1.equals(itemDetailHeldByPokemonInner2));
        System.assert(itemDetailHeldByPokemonInner3.equals(itemDetailHeldByPokemonInner4));
        System.assertEquals(itemDetailHeldByPokemonInner1.hashCode(), itemDetailHeldByPokemonInner2.hashCode());
        System.assertEquals(itemDetailHeldByPokemonInner3.hashCode(), itemDetailHeldByPokemonInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner = new OASItemDetailHeldByPokemonInner();
        Map<String, String> x-property-mappings = itemDetailHeldByPokemonInner.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version-details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemDetailHeldByPokemonInner itemDetailHeldByPokemonInner = new OASItemDetailHeldByPokemonInner();
        System.assertEquals(new List<OASItemDetailHeldByPokemonInnerVersi>(), itemDetailHeldByPokemonInner.versionDetails);
        System.assertEquals(null, itemDetailHeldByPokemonInner.pokemon);
    }
}
