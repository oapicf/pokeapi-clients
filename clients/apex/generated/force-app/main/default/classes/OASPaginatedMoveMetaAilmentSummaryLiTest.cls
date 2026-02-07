@isTest
private class OASPaginatedMoveMetaAilmentSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = paginatedMoveMetaAilmentSummaryList1;
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList3 = new OASPaginatedMoveMetaAilmentSummaryLi();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList4 = paginatedMoveMetaAilmentSummaryList3;

        System.assert(paginatedMoveMetaAilmentSummaryList1.equals(paginatedMoveMetaAilmentSummaryList2));
        System.assert(paginatedMoveMetaAilmentSummaryList2.equals(paginatedMoveMetaAilmentSummaryList1));
        System.assert(paginatedMoveMetaAilmentSummaryList1.equals(paginatedMoveMetaAilmentSummaryList1));
        System.assert(paginatedMoveMetaAilmentSummaryList3.equals(paginatedMoveMetaAilmentSummaryList4));
        System.assert(paginatedMoveMetaAilmentSummaryList4.equals(paginatedMoveMetaAilmentSummaryList3));
        System.assert(paginatedMoveMetaAilmentSummaryList3.equals(paginatedMoveMetaAilmentSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList3 = new OASPaginatedMoveMetaAilmentSummaryLi();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList4 = new OASPaginatedMoveMetaAilmentSummaryLi();

        System.assert(paginatedMoveMetaAilmentSummaryList1.equals(paginatedMoveMetaAilmentSummaryList2));
        System.assert(paginatedMoveMetaAilmentSummaryList2.equals(paginatedMoveMetaAilmentSummaryList1));
        System.assert(paginatedMoveMetaAilmentSummaryList3.equals(paginatedMoveMetaAilmentSummaryList4));
        System.assert(paginatedMoveMetaAilmentSummaryList4.equals(paginatedMoveMetaAilmentSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = new OASPaginatedMoveMetaAilmentSummaryLi();

        System.assertEquals(false, paginatedMoveMetaAilmentSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveMetaAilmentSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = new OASPaginatedMoveMetaAilmentSummaryLi();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList3;

        System.assertEquals(false, paginatedMoveMetaAilmentSummaryList1.equals(paginatedMoveMetaAilmentSummaryList3));
        System.assertEquals(false, paginatedMoveMetaAilmentSummaryList2.equals(paginatedMoveMetaAilmentSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = new OASPaginatedMoveMetaAilmentSummaryLi();

        System.assertEquals(paginatedMoveMetaAilmentSummaryList1.hashCode(), paginatedMoveMetaAilmentSummaryList1.hashCode());
        System.assertEquals(paginatedMoveMetaAilmentSummaryList2.hashCode(), paginatedMoveMetaAilmentSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList1 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList2 = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList3 = new OASPaginatedMoveMetaAilmentSummaryLi();
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList4 = new OASPaginatedMoveMetaAilmentSummaryLi();

        System.assert(paginatedMoveMetaAilmentSummaryList1.equals(paginatedMoveMetaAilmentSummaryList2));
        System.assert(paginatedMoveMetaAilmentSummaryList3.equals(paginatedMoveMetaAilmentSummaryList4));
        System.assertEquals(paginatedMoveMetaAilmentSummaryList1.hashCode(), paginatedMoveMetaAilmentSummaryList2.hashCode());
        System.assertEquals(paginatedMoveMetaAilmentSummaryList3.hashCode(), paginatedMoveMetaAilmentSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveMetaAilmentSummaryLi paginatedMoveMetaAilmentSummaryList = new OASPaginatedMoveMetaAilmentSummaryLi();
        System.assertEquals(new List<OASMoveMetaAilmentSummary>(), paginatedMoveMetaAilmentSummaryList.results);
        System.assertEquals(null, paginatedMoveMetaAilmentSummaryList.count);
        System.assertEquals(null, paginatedMoveMetaAilmentSummaryList.next);
        System.assertEquals(null, paginatedMoveMetaAilmentSummaryList.previous);
    }
}
