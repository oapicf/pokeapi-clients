@isTest
private class OASPaginatedGenderSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = paginatedGenderSummaryList1;
        OASPaginatedGenderSummaryList paginatedGenderSummaryList3 = new OASPaginatedGenderSummaryList();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList4 = paginatedGenderSummaryList3;

        System.assert(paginatedGenderSummaryList1.equals(paginatedGenderSummaryList2));
        System.assert(paginatedGenderSummaryList2.equals(paginatedGenderSummaryList1));
        System.assert(paginatedGenderSummaryList1.equals(paginatedGenderSummaryList1));
        System.assert(paginatedGenderSummaryList3.equals(paginatedGenderSummaryList4));
        System.assert(paginatedGenderSummaryList4.equals(paginatedGenderSummaryList3));
        System.assert(paginatedGenderSummaryList3.equals(paginatedGenderSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList3 = new OASPaginatedGenderSummaryList();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList4 = new OASPaginatedGenderSummaryList();

        System.assert(paginatedGenderSummaryList1.equals(paginatedGenderSummaryList2));
        System.assert(paginatedGenderSummaryList2.equals(paginatedGenderSummaryList1));
        System.assert(paginatedGenderSummaryList3.equals(paginatedGenderSummaryList4));
        System.assert(paginatedGenderSummaryList4.equals(paginatedGenderSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = new OASPaginatedGenderSummaryList();

        System.assertEquals(false, paginatedGenderSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedGenderSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = new OASPaginatedGenderSummaryList();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList3;

        System.assertEquals(false, paginatedGenderSummaryList1.equals(paginatedGenderSummaryList3));
        System.assertEquals(false, paginatedGenderSummaryList2.equals(paginatedGenderSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = new OASPaginatedGenderSummaryList();

        System.assertEquals(paginatedGenderSummaryList1.hashCode(), paginatedGenderSummaryList1.hashCode());
        System.assertEquals(paginatedGenderSummaryList2.hashCode(), paginatedGenderSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList1 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList2 = OASPaginatedGenderSummaryList.getExample();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList3 = new OASPaginatedGenderSummaryList();
        OASPaginatedGenderSummaryList paginatedGenderSummaryList4 = new OASPaginatedGenderSummaryList();

        System.assert(paginatedGenderSummaryList1.equals(paginatedGenderSummaryList2));
        System.assert(paginatedGenderSummaryList3.equals(paginatedGenderSummaryList4));
        System.assertEquals(paginatedGenderSummaryList1.hashCode(), paginatedGenderSummaryList2.hashCode());
        System.assertEquals(paginatedGenderSummaryList3.hashCode(), paginatedGenderSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedGenderSummaryList paginatedGenderSummaryList = new OASPaginatedGenderSummaryList();
        System.assertEquals(new List<OASGenderSummary>(), paginatedGenderSummaryList.results);
        System.assertEquals(null, paginatedGenderSummaryList.count);
        System.assertEquals(null, paginatedGenderSummaryList.next);
        System.assertEquals(null, paginatedGenderSummaryList.previous);
    }
}
