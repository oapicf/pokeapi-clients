@isTest
private class OASPaginatedPokemonSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = paginatedPokemonSummaryList1;
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList3 = new OASPaginatedPokemonSummaryList();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList4 = paginatedPokemonSummaryList3;

        System.assert(paginatedPokemonSummaryList1.equals(paginatedPokemonSummaryList2));
        System.assert(paginatedPokemonSummaryList2.equals(paginatedPokemonSummaryList1));
        System.assert(paginatedPokemonSummaryList1.equals(paginatedPokemonSummaryList1));
        System.assert(paginatedPokemonSummaryList3.equals(paginatedPokemonSummaryList4));
        System.assert(paginatedPokemonSummaryList4.equals(paginatedPokemonSummaryList3));
        System.assert(paginatedPokemonSummaryList3.equals(paginatedPokemonSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList3 = new OASPaginatedPokemonSummaryList();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList4 = new OASPaginatedPokemonSummaryList();

        System.assert(paginatedPokemonSummaryList1.equals(paginatedPokemonSummaryList2));
        System.assert(paginatedPokemonSummaryList2.equals(paginatedPokemonSummaryList1));
        System.assert(paginatedPokemonSummaryList3.equals(paginatedPokemonSummaryList4));
        System.assert(paginatedPokemonSummaryList4.equals(paginatedPokemonSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = new OASPaginatedPokemonSummaryList();

        System.assertEquals(false, paginatedPokemonSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = new OASPaginatedPokemonSummaryList();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList3;

        System.assertEquals(false, paginatedPokemonSummaryList1.equals(paginatedPokemonSummaryList3));
        System.assertEquals(false, paginatedPokemonSummaryList2.equals(paginatedPokemonSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = new OASPaginatedPokemonSummaryList();

        System.assertEquals(paginatedPokemonSummaryList1.hashCode(), paginatedPokemonSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonSummaryList2.hashCode(), paginatedPokemonSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList1 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList2 = OASPaginatedPokemonSummaryList.getExample();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList3 = new OASPaginatedPokemonSummaryList();
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList4 = new OASPaginatedPokemonSummaryList();

        System.assert(paginatedPokemonSummaryList1.equals(paginatedPokemonSummaryList2));
        System.assert(paginatedPokemonSummaryList3.equals(paginatedPokemonSummaryList4));
        System.assertEquals(paginatedPokemonSummaryList1.hashCode(), paginatedPokemonSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonSummaryList3.hashCode(), paginatedPokemonSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonSummaryList paginatedPokemonSummaryList = new OASPaginatedPokemonSummaryList();
        System.assertEquals(new List<OASPokemonSummary>(), paginatedPokemonSummaryList.results);
        System.assertEquals(null, paginatedPokemonSummaryList.count);
        System.assertEquals(null, paginatedPokemonSummaryList.next);
        System.assertEquals(null, paginatedPokemonSummaryList.previous);
    }
}
