@isTest
private class OASPaginatedPokemonColorSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = paginatedPokemonColorSummaryList1;
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList3 = new OASPaginatedPokemonColorSummaryList();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList4 = paginatedPokemonColorSummaryList3;

        System.assert(paginatedPokemonColorSummaryList1.equals(paginatedPokemonColorSummaryList2));
        System.assert(paginatedPokemonColorSummaryList2.equals(paginatedPokemonColorSummaryList1));
        System.assert(paginatedPokemonColorSummaryList1.equals(paginatedPokemonColorSummaryList1));
        System.assert(paginatedPokemonColorSummaryList3.equals(paginatedPokemonColorSummaryList4));
        System.assert(paginatedPokemonColorSummaryList4.equals(paginatedPokemonColorSummaryList3));
        System.assert(paginatedPokemonColorSummaryList3.equals(paginatedPokemonColorSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList3 = new OASPaginatedPokemonColorSummaryList();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList4 = new OASPaginatedPokemonColorSummaryList();

        System.assert(paginatedPokemonColorSummaryList1.equals(paginatedPokemonColorSummaryList2));
        System.assert(paginatedPokemonColorSummaryList2.equals(paginatedPokemonColorSummaryList1));
        System.assert(paginatedPokemonColorSummaryList3.equals(paginatedPokemonColorSummaryList4));
        System.assert(paginatedPokemonColorSummaryList4.equals(paginatedPokemonColorSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = new OASPaginatedPokemonColorSummaryList();

        System.assertEquals(false, paginatedPokemonColorSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonColorSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = new OASPaginatedPokemonColorSummaryList();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList3;

        System.assertEquals(false, paginatedPokemonColorSummaryList1.equals(paginatedPokemonColorSummaryList3));
        System.assertEquals(false, paginatedPokemonColorSummaryList2.equals(paginatedPokemonColorSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = new OASPaginatedPokemonColorSummaryList();

        System.assertEquals(paginatedPokemonColorSummaryList1.hashCode(), paginatedPokemonColorSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonColorSummaryList2.hashCode(), paginatedPokemonColorSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList1 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList2 = OASPaginatedPokemonColorSummaryList.getExample();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList3 = new OASPaginatedPokemonColorSummaryList();
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList4 = new OASPaginatedPokemonColorSummaryList();

        System.assert(paginatedPokemonColorSummaryList1.equals(paginatedPokemonColorSummaryList2));
        System.assert(paginatedPokemonColorSummaryList3.equals(paginatedPokemonColorSummaryList4));
        System.assertEquals(paginatedPokemonColorSummaryList1.hashCode(), paginatedPokemonColorSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonColorSummaryList3.hashCode(), paginatedPokemonColorSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonColorSummaryList paginatedPokemonColorSummaryList = new OASPaginatedPokemonColorSummaryList();
        System.assertEquals(new List<OASPokemonColorSummary>(), paginatedPokemonColorSummaryList.results);
        System.assertEquals(null, paginatedPokemonColorSummaryList.count);
        System.assertEquals(null, paginatedPokemonColorSummaryList.next);
        System.assertEquals(null, paginatedPokemonColorSummaryList.previous);
    }
}
