@isTest
private class OASPaginatedPokemonHabitatSummaryLisTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = paginatedPokemonHabitatSummaryList1;
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList3 = new OASPaginatedPokemonHabitatSummaryLis();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList4 = paginatedPokemonHabitatSummaryList3;

        System.assert(paginatedPokemonHabitatSummaryList1.equals(paginatedPokemonHabitatSummaryList2));
        System.assert(paginatedPokemonHabitatSummaryList2.equals(paginatedPokemonHabitatSummaryList1));
        System.assert(paginatedPokemonHabitatSummaryList1.equals(paginatedPokemonHabitatSummaryList1));
        System.assert(paginatedPokemonHabitatSummaryList3.equals(paginatedPokemonHabitatSummaryList4));
        System.assert(paginatedPokemonHabitatSummaryList4.equals(paginatedPokemonHabitatSummaryList3));
        System.assert(paginatedPokemonHabitatSummaryList3.equals(paginatedPokemonHabitatSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList3 = new OASPaginatedPokemonHabitatSummaryLis();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList4 = new OASPaginatedPokemonHabitatSummaryLis();

        System.assert(paginatedPokemonHabitatSummaryList1.equals(paginatedPokemonHabitatSummaryList2));
        System.assert(paginatedPokemonHabitatSummaryList2.equals(paginatedPokemonHabitatSummaryList1));
        System.assert(paginatedPokemonHabitatSummaryList3.equals(paginatedPokemonHabitatSummaryList4));
        System.assert(paginatedPokemonHabitatSummaryList4.equals(paginatedPokemonHabitatSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = new OASPaginatedPokemonHabitatSummaryLis();

        System.assertEquals(false, paginatedPokemonHabitatSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonHabitatSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = new OASPaginatedPokemonHabitatSummaryLis();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList3;

        System.assertEquals(false, paginatedPokemonHabitatSummaryList1.equals(paginatedPokemonHabitatSummaryList3));
        System.assertEquals(false, paginatedPokemonHabitatSummaryList2.equals(paginatedPokemonHabitatSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = new OASPaginatedPokemonHabitatSummaryLis();

        System.assertEquals(paginatedPokemonHabitatSummaryList1.hashCode(), paginatedPokemonHabitatSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonHabitatSummaryList2.hashCode(), paginatedPokemonHabitatSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList1 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList2 = OASPaginatedPokemonHabitatSummaryLis.getExample();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList3 = new OASPaginatedPokemonHabitatSummaryLis();
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList4 = new OASPaginatedPokemonHabitatSummaryLis();

        System.assert(paginatedPokemonHabitatSummaryList1.equals(paginatedPokemonHabitatSummaryList2));
        System.assert(paginatedPokemonHabitatSummaryList3.equals(paginatedPokemonHabitatSummaryList4));
        System.assertEquals(paginatedPokemonHabitatSummaryList1.hashCode(), paginatedPokemonHabitatSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonHabitatSummaryList3.hashCode(), paginatedPokemonHabitatSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonHabitatSummaryLis paginatedPokemonHabitatSummaryList = new OASPaginatedPokemonHabitatSummaryLis();
        System.assertEquals(new List<OASPokemonHabitatSummary>(), paginatedPokemonHabitatSummaryList.results);
        System.assertEquals(null, paginatedPokemonHabitatSummaryList.count);
        System.assertEquals(null, paginatedPokemonHabitatSummaryList.next);
        System.assertEquals(null, paginatedPokemonHabitatSummaryList.previous);
    }
}
