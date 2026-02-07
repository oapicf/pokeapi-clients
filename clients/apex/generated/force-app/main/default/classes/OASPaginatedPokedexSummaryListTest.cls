@isTest
private class OASPaginatedPokedexSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = paginatedPokedexSummaryList1;
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList3 = new OASPaginatedPokedexSummaryList();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList4 = paginatedPokedexSummaryList3;

        System.assert(paginatedPokedexSummaryList1.equals(paginatedPokedexSummaryList2));
        System.assert(paginatedPokedexSummaryList2.equals(paginatedPokedexSummaryList1));
        System.assert(paginatedPokedexSummaryList1.equals(paginatedPokedexSummaryList1));
        System.assert(paginatedPokedexSummaryList3.equals(paginatedPokedexSummaryList4));
        System.assert(paginatedPokedexSummaryList4.equals(paginatedPokedexSummaryList3));
        System.assert(paginatedPokedexSummaryList3.equals(paginatedPokedexSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList3 = new OASPaginatedPokedexSummaryList();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList4 = new OASPaginatedPokedexSummaryList();

        System.assert(paginatedPokedexSummaryList1.equals(paginatedPokedexSummaryList2));
        System.assert(paginatedPokedexSummaryList2.equals(paginatedPokedexSummaryList1));
        System.assert(paginatedPokedexSummaryList3.equals(paginatedPokedexSummaryList4));
        System.assert(paginatedPokedexSummaryList4.equals(paginatedPokedexSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = new OASPaginatedPokedexSummaryList();

        System.assertEquals(false, paginatedPokedexSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokedexSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = new OASPaginatedPokedexSummaryList();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList3;

        System.assertEquals(false, paginatedPokedexSummaryList1.equals(paginatedPokedexSummaryList3));
        System.assertEquals(false, paginatedPokedexSummaryList2.equals(paginatedPokedexSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = new OASPaginatedPokedexSummaryList();

        System.assertEquals(paginatedPokedexSummaryList1.hashCode(), paginatedPokedexSummaryList1.hashCode());
        System.assertEquals(paginatedPokedexSummaryList2.hashCode(), paginatedPokedexSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList1 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList2 = OASPaginatedPokedexSummaryList.getExample();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList3 = new OASPaginatedPokedexSummaryList();
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList4 = new OASPaginatedPokedexSummaryList();

        System.assert(paginatedPokedexSummaryList1.equals(paginatedPokedexSummaryList2));
        System.assert(paginatedPokedexSummaryList3.equals(paginatedPokedexSummaryList4));
        System.assertEquals(paginatedPokedexSummaryList1.hashCode(), paginatedPokedexSummaryList2.hashCode());
        System.assertEquals(paginatedPokedexSummaryList3.hashCode(), paginatedPokedexSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokedexSummaryList paginatedPokedexSummaryList = new OASPaginatedPokedexSummaryList();
        System.assertEquals(new List<OASPokedexSummary>(), paginatedPokedexSummaryList.results);
        System.assertEquals(null, paginatedPokedexSummaryList.count);
        System.assertEquals(null, paginatedPokedexSummaryList.next);
        System.assertEquals(null, paginatedPokedexSummaryList.previous);
    }
}
