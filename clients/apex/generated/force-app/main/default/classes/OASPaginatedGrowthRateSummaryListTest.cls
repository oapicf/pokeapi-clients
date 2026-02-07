@isTest
private class OASPaginatedGrowthRateSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = paginatedGrowthRateSummaryList1;
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList3 = new OASPaginatedGrowthRateSummaryList();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList4 = paginatedGrowthRateSummaryList3;

        System.assert(paginatedGrowthRateSummaryList1.equals(paginatedGrowthRateSummaryList2));
        System.assert(paginatedGrowthRateSummaryList2.equals(paginatedGrowthRateSummaryList1));
        System.assert(paginatedGrowthRateSummaryList1.equals(paginatedGrowthRateSummaryList1));
        System.assert(paginatedGrowthRateSummaryList3.equals(paginatedGrowthRateSummaryList4));
        System.assert(paginatedGrowthRateSummaryList4.equals(paginatedGrowthRateSummaryList3));
        System.assert(paginatedGrowthRateSummaryList3.equals(paginatedGrowthRateSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList3 = new OASPaginatedGrowthRateSummaryList();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList4 = new OASPaginatedGrowthRateSummaryList();

        System.assert(paginatedGrowthRateSummaryList1.equals(paginatedGrowthRateSummaryList2));
        System.assert(paginatedGrowthRateSummaryList2.equals(paginatedGrowthRateSummaryList1));
        System.assert(paginatedGrowthRateSummaryList3.equals(paginatedGrowthRateSummaryList4));
        System.assert(paginatedGrowthRateSummaryList4.equals(paginatedGrowthRateSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = new OASPaginatedGrowthRateSummaryList();

        System.assertEquals(false, paginatedGrowthRateSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedGrowthRateSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = new OASPaginatedGrowthRateSummaryList();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList3;

        System.assertEquals(false, paginatedGrowthRateSummaryList1.equals(paginatedGrowthRateSummaryList3));
        System.assertEquals(false, paginatedGrowthRateSummaryList2.equals(paginatedGrowthRateSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = new OASPaginatedGrowthRateSummaryList();

        System.assertEquals(paginatedGrowthRateSummaryList1.hashCode(), paginatedGrowthRateSummaryList1.hashCode());
        System.assertEquals(paginatedGrowthRateSummaryList2.hashCode(), paginatedGrowthRateSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList1 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList2 = OASPaginatedGrowthRateSummaryList.getExample();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList3 = new OASPaginatedGrowthRateSummaryList();
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList4 = new OASPaginatedGrowthRateSummaryList();

        System.assert(paginatedGrowthRateSummaryList1.equals(paginatedGrowthRateSummaryList2));
        System.assert(paginatedGrowthRateSummaryList3.equals(paginatedGrowthRateSummaryList4));
        System.assertEquals(paginatedGrowthRateSummaryList1.hashCode(), paginatedGrowthRateSummaryList2.hashCode());
        System.assertEquals(paginatedGrowthRateSummaryList3.hashCode(), paginatedGrowthRateSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedGrowthRateSummaryList paginatedGrowthRateSummaryList = new OASPaginatedGrowthRateSummaryList();
        System.assertEquals(new List<OASGrowthRateSummary>(), paginatedGrowthRateSummaryList.results);
        System.assertEquals(null, paginatedGrowthRateSummaryList.count);
        System.assertEquals(null, paginatedGrowthRateSummaryList.next);
        System.assertEquals(null, paginatedGrowthRateSummaryList.previous);
    }
}
