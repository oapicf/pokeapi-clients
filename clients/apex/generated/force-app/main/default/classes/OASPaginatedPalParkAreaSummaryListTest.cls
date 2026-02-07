@isTest
private class OASPaginatedPalParkAreaSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = paginatedPalParkAreaSummaryList1;
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList3 = new OASPaginatedPalParkAreaSummaryList();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList4 = paginatedPalParkAreaSummaryList3;

        System.assert(paginatedPalParkAreaSummaryList1.equals(paginatedPalParkAreaSummaryList2));
        System.assert(paginatedPalParkAreaSummaryList2.equals(paginatedPalParkAreaSummaryList1));
        System.assert(paginatedPalParkAreaSummaryList1.equals(paginatedPalParkAreaSummaryList1));
        System.assert(paginatedPalParkAreaSummaryList3.equals(paginatedPalParkAreaSummaryList4));
        System.assert(paginatedPalParkAreaSummaryList4.equals(paginatedPalParkAreaSummaryList3));
        System.assert(paginatedPalParkAreaSummaryList3.equals(paginatedPalParkAreaSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList3 = new OASPaginatedPalParkAreaSummaryList();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList4 = new OASPaginatedPalParkAreaSummaryList();

        System.assert(paginatedPalParkAreaSummaryList1.equals(paginatedPalParkAreaSummaryList2));
        System.assert(paginatedPalParkAreaSummaryList2.equals(paginatedPalParkAreaSummaryList1));
        System.assert(paginatedPalParkAreaSummaryList3.equals(paginatedPalParkAreaSummaryList4));
        System.assert(paginatedPalParkAreaSummaryList4.equals(paginatedPalParkAreaSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = new OASPaginatedPalParkAreaSummaryList();

        System.assertEquals(false, paginatedPalParkAreaSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPalParkAreaSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = new OASPaginatedPalParkAreaSummaryList();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList3;

        System.assertEquals(false, paginatedPalParkAreaSummaryList1.equals(paginatedPalParkAreaSummaryList3));
        System.assertEquals(false, paginatedPalParkAreaSummaryList2.equals(paginatedPalParkAreaSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = new OASPaginatedPalParkAreaSummaryList();

        System.assertEquals(paginatedPalParkAreaSummaryList1.hashCode(), paginatedPalParkAreaSummaryList1.hashCode());
        System.assertEquals(paginatedPalParkAreaSummaryList2.hashCode(), paginatedPalParkAreaSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList1 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList2 = OASPaginatedPalParkAreaSummaryList.getExample();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList3 = new OASPaginatedPalParkAreaSummaryList();
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList4 = new OASPaginatedPalParkAreaSummaryList();

        System.assert(paginatedPalParkAreaSummaryList1.equals(paginatedPalParkAreaSummaryList2));
        System.assert(paginatedPalParkAreaSummaryList3.equals(paginatedPalParkAreaSummaryList4));
        System.assertEquals(paginatedPalParkAreaSummaryList1.hashCode(), paginatedPalParkAreaSummaryList2.hashCode());
        System.assertEquals(paginatedPalParkAreaSummaryList3.hashCode(), paginatedPalParkAreaSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPalParkAreaSummaryList paginatedPalParkAreaSummaryList = new OASPaginatedPalParkAreaSummaryList();
        System.assertEquals(new List<OASPalParkAreaSummary>(), paginatedPalParkAreaSummaryList.results);
        System.assertEquals(null, paginatedPalParkAreaSummaryList.count);
        System.assertEquals(null, paginatedPalParkAreaSummaryList.next);
        System.assertEquals(null, paginatedPalParkAreaSummaryList.previous);
    }
}
