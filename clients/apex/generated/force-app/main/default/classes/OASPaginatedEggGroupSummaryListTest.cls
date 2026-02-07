@isTest
private class OASPaginatedEggGroupSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = paginatedEggGroupSummaryList1;
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList3 = new OASPaginatedEggGroupSummaryList();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList4 = paginatedEggGroupSummaryList3;

        System.assert(paginatedEggGroupSummaryList1.equals(paginatedEggGroupSummaryList2));
        System.assert(paginatedEggGroupSummaryList2.equals(paginatedEggGroupSummaryList1));
        System.assert(paginatedEggGroupSummaryList1.equals(paginatedEggGroupSummaryList1));
        System.assert(paginatedEggGroupSummaryList3.equals(paginatedEggGroupSummaryList4));
        System.assert(paginatedEggGroupSummaryList4.equals(paginatedEggGroupSummaryList3));
        System.assert(paginatedEggGroupSummaryList3.equals(paginatedEggGroupSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList3 = new OASPaginatedEggGroupSummaryList();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList4 = new OASPaginatedEggGroupSummaryList();

        System.assert(paginatedEggGroupSummaryList1.equals(paginatedEggGroupSummaryList2));
        System.assert(paginatedEggGroupSummaryList2.equals(paginatedEggGroupSummaryList1));
        System.assert(paginatedEggGroupSummaryList3.equals(paginatedEggGroupSummaryList4));
        System.assert(paginatedEggGroupSummaryList4.equals(paginatedEggGroupSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = new OASPaginatedEggGroupSummaryList();

        System.assertEquals(false, paginatedEggGroupSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEggGroupSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = new OASPaginatedEggGroupSummaryList();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList3;

        System.assertEquals(false, paginatedEggGroupSummaryList1.equals(paginatedEggGroupSummaryList3));
        System.assertEquals(false, paginatedEggGroupSummaryList2.equals(paginatedEggGroupSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = new OASPaginatedEggGroupSummaryList();

        System.assertEquals(paginatedEggGroupSummaryList1.hashCode(), paginatedEggGroupSummaryList1.hashCode());
        System.assertEquals(paginatedEggGroupSummaryList2.hashCode(), paginatedEggGroupSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList1 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList2 = OASPaginatedEggGroupSummaryList.getExample();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList3 = new OASPaginatedEggGroupSummaryList();
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList4 = new OASPaginatedEggGroupSummaryList();

        System.assert(paginatedEggGroupSummaryList1.equals(paginatedEggGroupSummaryList2));
        System.assert(paginatedEggGroupSummaryList3.equals(paginatedEggGroupSummaryList4));
        System.assertEquals(paginatedEggGroupSummaryList1.hashCode(), paginatedEggGroupSummaryList2.hashCode());
        System.assertEquals(paginatedEggGroupSummaryList3.hashCode(), paginatedEggGroupSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEggGroupSummaryList paginatedEggGroupSummaryList = new OASPaginatedEggGroupSummaryList();
        System.assertEquals(new List<OASEggGroupSummary>(), paginatedEggGroupSummaryList.results);
        System.assertEquals(null, paginatedEggGroupSummaryList.count);
        System.assertEquals(null, paginatedEggGroupSummaryList.next);
        System.assertEquals(null, paginatedEggGroupSummaryList.previous);
    }
}
