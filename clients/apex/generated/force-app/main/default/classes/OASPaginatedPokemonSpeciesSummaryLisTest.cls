@isTest
private class OASPaginatedPokemonSpeciesSummaryLisTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = paginatedPokemonSpeciesSummaryList1;
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList3 = new OASPaginatedPokemonSpeciesSummaryLis();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList4 = paginatedPokemonSpeciesSummaryList3;

        System.assert(paginatedPokemonSpeciesSummaryList1.equals(paginatedPokemonSpeciesSummaryList2));
        System.assert(paginatedPokemonSpeciesSummaryList2.equals(paginatedPokemonSpeciesSummaryList1));
        System.assert(paginatedPokemonSpeciesSummaryList1.equals(paginatedPokemonSpeciesSummaryList1));
        System.assert(paginatedPokemonSpeciesSummaryList3.equals(paginatedPokemonSpeciesSummaryList4));
        System.assert(paginatedPokemonSpeciesSummaryList4.equals(paginatedPokemonSpeciesSummaryList3));
        System.assert(paginatedPokemonSpeciesSummaryList3.equals(paginatedPokemonSpeciesSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList3 = new OASPaginatedPokemonSpeciesSummaryLis();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList4 = new OASPaginatedPokemonSpeciesSummaryLis();

        System.assert(paginatedPokemonSpeciesSummaryList1.equals(paginatedPokemonSpeciesSummaryList2));
        System.assert(paginatedPokemonSpeciesSummaryList2.equals(paginatedPokemonSpeciesSummaryList1));
        System.assert(paginatedPokemonSpeciesSummaryList3.equals(paginatedPokemonSpeciesSummaryList4));
        System.assert(paginatedPokemonSpeciesSummaryList4.equals(paginatedPokemonSpeciesSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = new OASPaginatedPokemonSpeciesSummaryLis();

        System.assertEquals(false, paginatedPokemonSpeciesSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonSpeciesSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = new OASPaginatedPokemonSpeciesSummaryLis();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList3;

        System.assertEquals(false, paginatedPokemonSpeciesSummaryList1.equals(paginatedPokemonSpeciesSummaryList3));
        System.assertEquals(false, paginatedPokemonSpeciesSummaryList2.equals(paginatedPokemonSpeciesSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = new OASPaginatedPokemonSpeciesSummaryLis();

        System.assertEquals(paginatedPokemonSpeciesSummaryList1.hashCode(), paginatedPokemonSpeciesSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonSpeciesSummaryList2.hashCode(), paginatedPokemonSpeciesSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList1 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList2 = OASPaginatedPokemonSpeciesSummaryLis.getExample();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList3 = new OASPaginatedPokemonSpeciesSummaryLis();
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList4 = new OASPaginatedPokemonSpeciesSummaryLis();

        System.assert(paginatedPokemonSpeciesSummaryList1.equals(paginatedPokemonSpeciesSummaryList2));
        System.assert(paginatedPokemonSpeciesSummaryList3.equals(paginatedPokemonSpeciesSummaryList4));
        System.assertEquals(paginatedPokemonSpeciesSummaryList1.hashCode(), paginatedPokemonSpeciesSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonSpeciesSummaryList3.hashCode(), paginatedPokemonSpeciesSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonSpeciesSummaryLis paginatedPokemonSpeciesSummaryList = new OASPaginatedPokemonSpeciesSummaryLis();
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), paginatedPokemonSpeciesSummaryList.results);
        System.assertEquals(null, paginatedPokemonSpeciesSummaryList.count);
        System.assertEquals(null, paginatedPokemonSpeciesSummaryList.next);
        System.assertEquals(null, paginatedPokemonSpeciesSummaryList.previous);
    }
}
