@isTest
private class OASPaginatedBerryFirmnessSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = paginatedBerryFirmnessSummaryList1;
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList3 = new OASPaginatedBerryFirmnessSummaryList();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList4 = paginatedBerryFirmnessSummaryList3;

        System.assert(paginatedBerryFirmnessSummaryList1.equals(paginatedBerryFirmnessSummaryList2));
        System.assert(paginatedBerryFirmnessSummaryList2.equals(paginatedBerryFirmnessSummaryList1));
        System.assert(paginatedBerryFirmnessSummaryList1.equals(paginatedBerryFirmnessSummaryList1));
        System.assert(paginatedBerryFirmnessSummaryList3.equals(paginatedBerryFirmnessSummaryList4));
        System.assert(paginatedBerryFirmnessSummaryList4.equals(paginatedBerryFirmnessSummaryList3));
        System.assert(paginatedBerryFirmnessSummaryList3.equals(paginatedBerryFirmnessSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList3 = new OASPaginatedBerryFirmnessSummaryList();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList4 = new OASPaginatedBerryFirmnessSummaryList();

        System.assert(paginatedBerryFirmnessSummaryList1.equals(paginatedBerryFirmnessSummaryList2));
        System.assert(paginatedBerryFirmnessSummaryList2.equals(paginatedBerryFirmnessSummaryList1));
        System.assert(paginatedBerryFirmnessSummaryList3.equals(paginatedBerryFirmnessSummaryList4));
        System.assert(paginatedBerryFirmnessSummaryList4.equals(paginatedBerryFirmnessSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = new OASPaginatedBerryFirmnessSummaryList();

        System.assertEquals(false, paginatedBerryFirmnessSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedBerryFirmnessSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = new OASPaginatedBerryFirmnessSummaryList();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList3;

        System.assertEquals(false, paginatedBerryFirmnessSummaryList1.equals(paginatedBerryFirmnessSummaryList3));
        System.assertEquals(false, paginatedBerryFirmnessSummaryList2.equals(paginatedBerryFirmnessSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = new OASPaginatedBerryFirmnessSummaryList();

        System.assertEquals(paginatedBerryFirmnessSummaryList1.hashCode(), paginatedBerryFirmnessSummaryList1.hashCode());
        System.assertEquals(paginatedBerryFirmnessSummaryList2.hashCode(), paginatedBerryFirmnessSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList1 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList2 = OASPaginatedBerryFirmnessSummaryList.getExample();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList3 = new OASPaginatedBerryFirmnessSummaryList();
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList4 = new OASPaginatedBerryFirmnessSummaryList();

        System.assert(paginatedBerryFirmnessSummaryList1.equals(paginatedBerryFirmnessSummaryList2));
        System.assert(paginatedBerryFirmnessSummaryList3.equals(paginatedBerryFirmnessSummaryList4));
        System.assertEquals(paginatedBerryFirmnessSummaryList1.hashCode(), paginatedBerryFirmnessSummaryList2.hashCode());
        System.assertEquals(paginatedBerryFirmnessSummaryList3.hashCode(), paginatedBerryFirmnessSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedBerryFirmnessSummaryList paginatedBerryFirmnessSummaryList = new OASPaginatedBerryFirmnessSummaryList();
        System.assertEquals(new List<OASBerryFirmnessSummary>(), paginatedBerryFirmnessSummaryList.results);
        System.assertEquals(null, paginatedBerryFirmnessSummaryList.count);
        System.assertEquals(null, paginatedBerryFirmnessSummaryList.next);
        System.assertEquals(null, paginatedBerryFirmnessSummaryList.previous);
    }
}
