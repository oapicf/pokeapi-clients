@isTest
private class OASPaginatedMoveMetaCategorySummaryLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = paginatedMoveMetaCategorySummaryList1;
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList3 = new OASPaginatedMoveMetaCategorySummaryL();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList4 = paginatedMoveMetaCategorySummaryList3;

        System.assert(paginatedMoveMetaCategorySummaryList1.equals(paginatedMoveMetaCategorySummaryList2));
        System.assert(paginatedMoveMetaCategorySummaryList2.equals(paginatedMoveMetaCategorySummaryList1));
        System.assert(paginatedMoveMetaCategorySummaryList1.equals(paginatedMoveMetaCategorySummaryList1));
        System.assert(paginatedMoveMetaCategorySummaryList3.equals(paginatedMoveMetaCategorySummaryList4));
        System.assert(paginatedMoveMetaCategorySummaryList4.equals(paginatedMoveMetaCategorySummaryList3));
        System.assert(paginatedMoveMetaCategorySummaryList3.equals(paginatedMoveMetaCategorySummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList3 = new OASPaginatedMoveMetaCategorySummaryL();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList4 = new OASPaginatedMoveMetaCategorySummaryL();

        System.assert(paginatedMoveMetaCategorySummaryList1.equals(paginatedMoveMetaCategorySummaryList2));
        System.assert(paginatedMoveMetaCategorySummaryList2.equals(paginatedMoveMetaCategorySummaryList1));
        System.assert(paginatedMoveMetaCategorySummaryList3.equals(paginatedMoveMetaCategorySummaryList4));
        System.assert(paginatedMoveMetaCategorySummaryList4.equals(paginatedMoveMetaCategorySummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = new OASPaginatedMoveMetaCategorySummaryL();

        System.assertEquals(false, paginatedMoveMetaCategorySummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveMetaCategorySummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = new OASPaginatedMoveMetaCategorySummaryL();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList3;

        System.assertEquals(false, paginatedMoveMetaCategorySummaryList1.equals(paginatedMoveMetaCategorySummaryList3));
        System.assertEquals(false, paginatedMoveMetaCategorySummaryList2.equals(paginatedMoveMetaCategorySummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = new OASPaginatedMoveMetaCategorySummaryL();

        System.assertEquals(paginatedMoveMetaCategorySummaryList1.hashCode(), paginatedMoveMetaCategorySummaryList1.hashCode());
        System.assertEquals(paginatedMoveMetaCategorySummaryList2.hashCode(), paginatedMoveMetaCategorySummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList1 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList2 = OASPaginatedMoveMetaCategorySummaryL.getExample();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList3 = new OASPaginatedMoveMetaCategorySummaryL();
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList4 = new OASPaginatedMoveMetaCategorySummaryL();

        System.assert(paginatedMoveMetaCategorySummaryList1.equals(paginatedMoveMetaCategorySummaryList2));
        System.assert(paginatedMoveMetaCategorySummaryList3.equals(paginatedMoveMetaCategorySummaryList4));
        System.assertEquals(paginatedMoveMetaCategorySummaryList1.hashCode(), paginatedMoveMetaCategorySummaryList2.hashCode());
        System.assertEquals(paginatedMoveMetaCategorySummaryList3.hashCode(), paginatedMoveMetaCategorySummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveMetaCategorySummaryL paginatedMoveMetaCategorySummaryList = new OASPaginatedMoveMetaCategorySummaryL();
        System.assertEquals(new List<OASMoveMetaCategorySummary>(), paginatedMoveMetaCategorySummaryList.results);
        System.assertEquals(null, paginatedMoveMetaCategorySummaryList.count);
        System.assertEquals(null, paginatedMoveMetaCategorySummaryList.next);
        System.assertEquals(null, paginatedMoveMetaCategorySummaryList.previous);
    }
}
