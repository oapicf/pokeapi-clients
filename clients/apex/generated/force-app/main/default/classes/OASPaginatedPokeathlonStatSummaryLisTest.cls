@isTest
private class OASPaginatedPokeathlonStatSummaryLisTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = paginatedPokeathlonStatSummaryList1;
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList3 = new OASPaginatedPokeathlonStatSummaryLis();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList4 = paginatedPokeathlonStatSummaryList3;

        System.assert(paginatedPokeathlonStatSummaryList1.equals(paginatedPokeathlonStatSummaryList2));
        System.assert(paginatedPokeathlonStatSummaryList2.equals(paginatedPokeathlonStatSummaryList1));
        System.assert(paginatedPokeathlonStatSummaryList1.equals(paginatedPokeathlonStatSummaryList1));
        System.assert(paginatedPokeathlonStatSummaryList3.equals(paginatedPokeathlonStatSummaryList4));
        System.assert(paginatedPokeathlonStatSummaryList4.equals(paginatedPokeathlonStatSummaryList3));
        System.assert(paginatedPokeathlonStatSummaryList3.equals(paginatedPokeathlonStatSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList3 = new OASPaginatedPokeathlonStatSummaryLis();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList4 = new OASPaginatedPokeathlonStatSummaryLis();

        System.assert(paginatedPokeathlonStatSummaryList1.equals(paginatedPokeathlonStatSummaryList2));
        System.assert(paginatedPokeathlonStatSummaryList2.equals(paginatedPokeathlonStatSummaryList1));
        System.assert(paginatedPokeathlonStatSummaryList3.equals(paginatedPokeathlonStatSummaryList4));
        System.assert(paginatedPokeathlonStatSummaryList4.equals(paginatedPokeathlonStatSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = new OASPaginatedPokeathlonStatSummaryLis();

        System.assertEquals(false, paginatedPokeathlonStatSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokeathlonStatSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = new OASPaginatedPokeathlonStatSummaryLis();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList3;

        System.assertEquals(false, paginatedPokeathlonStatSummaryList1.equals(paginatedPokeathlonStatSummaryList3));
        System.assertEquals(false, paginatedPokeathlonStatSummaryList2.equals(paginatedPokeathlonStatSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = new OASPaginatedPokeathlonStatSummaryLis();

        System.assertEquals(paginatedPokeathlonStatSummaryList1.hashCode(), paginatedPokeathlonStatSummaryList1.hashCode());
        System.assertEquals(paginatedPokeathlonStatSummaryList2.hashCode(), paginatedPokeathlonStatSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList1 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList2 = OASPaginatedPokeathlonStatSummaryLis.getExample();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList3 = new OASPaginatedPokeathlonStatSummaryLis();
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList4 = new OASPaginatedPokeathlonStatSummaryLis();

        System.assert(paginatedPokeathlonStatSummaryList1.equals(paginatedPokeathlonStatSummaryList2));
        System.assert(paginatedPokeathlonStatSummaryList3.equals(paginatedPokeathlonStatSummaryList4));
        System.assertEquals(paginatedPokeathlonStatSummaryList1.hashCode(), paginatedPokeathlonStatSummaryList2.hashCode());
        System.assertEquals(paginatedPokeathlonStatSummaryList3.hashCode(), paginatedPokeathlonStatSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokeathlonStatSummaryLis paginatedPokeathlonStatSummaryList = new OASPaginatedPokeathlonStatSummaryLis();
        System.assertEquals(new List<OASPokeathlonStatSummary>(), paginatedPokeathlonStatSummaryList.results);
        System.assertEquals(null, paginatedPokeathlonStatSummaryList.count);
        System.assertEquals(null, paginatedPokeathlonStatSummaryList.next);
        System.assertEquals(null, paginatedPokeathlonStatSummaryList.previous);
    }
}
