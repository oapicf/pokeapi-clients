@isTest
private class OASPaginatedGenerationSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = paginatedGenerationSummaryList1;
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList3 = new OASPaginatedGenerationSummaryList();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList4 = paginatedGenerationSummaryList3;

        System.assert(paginatedGenerationSummaryList1.equals(paginatedGenerationSummaryList2));
        System.assert(paginatedGenerationSummaryList2.equals(paginatedGenerationSummaryList1));
        System.assert(paginatedGenerationSummaryList1.equals(paginatedGenerationSummaryList1));
        System.assert(paginatedGenerationSummaryList3.equals(paginatedGenerationSummaryList4));
        System.assert(paginatedGenerationSummaryList4.equals(paginatedGenerationSummaryList3));
        System.assert(paginatedGenerationSummaryList3.equals(paginatedGenerationSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList3 = new OASPaginatedGenerationSummaryList();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList4 = new OASPaginatedGenerationSummaryList();

        System.assert(paginatedGenerationSummaryList1.equals(paginatedGenerationSummaryList2));
        System.assert(paginatedGenerationSummaryList2.equals(paginatedGenerationSummaryList1));
        System.assert(paginatedGenerationSummaryList3.equals(paginatedGenerationSummaryList4));
        System.assert(paginatedGenerationSummaryList4.equals(paginatedGenerationSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = new OASPaginatedGenerationSummaryList();

        System.assertEquals(false, paginatedGenerationSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedGenerationSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = new OASPaginatedGenerationSummaryList();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList3;

        System.assertEquals(false, paginatedGenerationSummaryList1.equals(paginatedGenerationSummaryList3));
        System.assertEquals(false, paginatedGenerationSummaryList2.equals(paginatedGenerationSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = new OASPaginatedGenerationSummaryList();

        System.assertEquals(paginatedGenerationSummaryList1.hashCode(), paginatedGenerationSummaryList1.hashCode());
        System.assertEquals(paginatedGenerationSummaryList2.hashCode(), paginatedGenerationSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList1 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList2 = OASPaginatedGenerationSummaryList.getExample();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList3 = new OASPaginatedGenerationSummaryList();
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList4 = new OASPaginatedGenerationSummaryList();

        System.assert(paginatedGenerationSummaryList1.equals(paginatedGenerationSummaryList2));
        System.assert(paginatedGenerationSummaryList3.equals(paginatedGenerationSummaryList4));
        System.assertEquals(paginatedGenerationSummaryList1.hashCode(), paginatedGenerationSummaryList2.hashCode());
        System.assertEquals(paginatedGenerationSummaryList3.hashCode(), paginatedGenerationSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedGenerationSummaryList paginatedGenerationSummaryList = new OASPaginatedGenerationSummaryList();
        System.assertEquals(new List<OASGenerationSummary>(), paginatedGenerationSummaryList.results);
        System.assertEquals(null, paginatedGenerationSummaryList.count);
        System.assertEquals(null, paginatedGenerationSummaryList.next);
        System.assertEquals(null, paginatedGenerationSummaryList.previous);
    }
}
