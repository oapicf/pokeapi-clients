@isTest
private class OASPaginatedItemCategorySummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = paginatedItemCategorySummaryList1;
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList3 = new OASPaginatedItemCategorySummaryList();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList4 = paginatedItemCategorySummaryList3;

        System.assert(paginatedItemCategorySummaryList1.equals(paginatedItemCategorySummaryList2));
        System.assert(paginatedItemCategorySummaryList2.equals(paginatedItemCategorySummaryList1));
        System.assert(paginatedItemCategorySummaryList1.equals(paginatedItemCategorySummaryList1));
        System.assert(paginatedItemCategorySummaryList3.equals(paginatedItemCategorySummaryList4));
        System.assert(paginatedItemCategorySummaryList4.equals(paginatedItemCategorySummaryList3));
        System.assert(paginatedItemCategorySummaryList3.equals(paginatedItemCategorySummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList3 = new OASPaginatedItemCategorySummaryList();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList4 = new OASPaginatedItemCategorySummaryList();

        System.assert(paginatedItemCategorySummaryList1.equals(paginatedItemCategorySummaryList2));
        System.assert(paginatedItemCategorySummaryList2.equals(paginatedItemCategorySummaryList1));
        System.assert(paginatedItemCategorySummaryList3.equals(paginatedItemCategorySummaryList4));
        System.assert(paginatedItemCategorySummaryList4.equals(paginatedItemCategorySummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = new OASPaginatedItemCategorySummaryList();

        System.assertEquals(false, paginatedItemCategorySummaryList1.equals('foo'));
        System.assertEquals(false, paginatedItemCategorySummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = new OASPaginatedItemCategorySummaryList();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList3;

        System.assertEquals(false, paginatedItemCategorySummaryList1.equals(paginatedItemCategorySummaryList3));
        System.assertEquals(false, paginatedItemCategorySummaryList2.equals(paginatedItemCategorySummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = new OASPaginatedItemCategorySummaryList();

        System.assertEquals(paginatedItemCategorySummaryList1.hashCode(), paginatedItemCategorySummaryList1.hashCode());
        System.assertEquals(paginatedItemCategorySummaryList2.hashCode(), paginatedItemCategorySummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList1 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList2 = OASPaginatedItemCategorySummaryList.getExample();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList3 = new OASPaginatedItemCategorySummaryList();
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList4 = new OASPaginatedItemCategorySummaryList();

        System.assert(paginatedItemCategorySummaryList1.equals(paginatedItemCategorySummaryList2));
        System.assert(paginatedItemCategorySummaryList3.equals(paginatedItemCategorySummaryList4));
        System.assertEquals(paginatedItemCategorySummaryList1.hashCode(), paginatedItemCategorySummaryList2.hashCode());
        System.assertEquals(paginatedItemCategorySummaryList3.hashCode(), paginatedItemCategorySummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedItemCategorySummaryList paginatedItemCategorySummaryList = new OASPaginatedItemCategorySummaryList();
        System.assertEquals(new List<OASItemCategorySummary>(), paginatedItemCategorySummaryList.results);
        System.assertEquals(null, paginatedItemCategorySummaryList.count);
        System.assertEquals(null, paginatedItemCategorySummaryList.next);
        System.assertEquals(null, paginatedItemCategorySummaryList.previous);
    }
}
