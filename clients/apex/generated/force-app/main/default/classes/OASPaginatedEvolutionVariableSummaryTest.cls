@isTest
private class OASPaginatedEvolutionVariableSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = paginatedEvolutionVariableSummaryList1;
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList3 = new OASPaginatedEvolutionVariableSummary();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList4 = paginatedEvolutionVariableSummaryList3;

        System.assert(paginatedEvolutionVariableSummaryList1.equals(paginatedEvolutionVariableSummaryList2));
        System.assert(paginatedEvolutionVariableSummaryList2.equals(paginatedEvolutionVariableSummaryList1));
        System.assert(paginatedEvolutionVariableSummaryList1.equals(paginatedEvolutionVariableSummaryList1));
        System.assert(paginatedEvolutionVariableSummaryList3.equals(paginatedEvolutionVariableSummaryList4));
        System.assert(paginatedEvolutionVariableSummaryList4.equals(paginatedEvolutionVariableSummaryList3));
        System.assert(paginatedEvolutionVariableSummaryList3.equals(paginatedEvolutionVariableSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList3 = new OASPaginatedEvolutionVariableSummary();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList4 = new OASPaginatedEvolutionVariableSummary();

        System.assert(paginatedEvolutionVariableSummaryList1.equals(paginatedEvolutionVariableSummaryList2));
        System.assert(paginatedEvolutionVariableSummaryList2.equals(paginatedEvolutionVariableSummaryList1));
        System.assert(paginatedEvolutionVariableSummaryList3.equals(paginatedEvolutionVariableSummaryList4));
        System.assert(paginatedEvolutionVariableSummaryList4.equals(paginatedEvolutionVariableSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = new OASPaginatedEvolutionVariableSummary();

        System.assertEquals(false, paginatedEvolutionVariableSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEvolutionVariableSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = new OASPaginatedEvolutionVariableSummary();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList3;

        System.assertEquals(false, paginatedEvolutionVariableSummaryList1.equals(paginatedEvolutionVariableSummaryList3));
        System.assertEquals(false, paginatedEvolutionVariableSummaryList2.equals(paginatedEvolutionVariableSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = new OASPaginatedEvolutionVariableSummary();

        System.assertEquals(paginatedEvolutionVariableSummaryList1.hashCode(), paginatedEvolutionVariableSummaryList1.hashCode());
        System.assertEquals(paginatedEvolutionVariableSummaryList2.hashCode(), paginatedEvolutionVariableSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList1 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList2 = OASPaginatedEvolutionVariableSummary.getExample();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList3 = new OASPaginatedEvolutionVariableSummary();
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList4 = new OASPaginatedEvolutionVariableSummary();

        System.assert(paginatedEvolutionVariableSummaryList1.equals(paginatedEvolutionVariableSummaryList2));
        System.assert(paginatedEvolutionVariableSummaryList3.equals(paginatedEvolutionVariableSummaryList4));
        System.assertEquals(paginatedEvolutionVariableSummaryList1.hashCode(), paginatedEvolutionVariableSummaryList2.hashCode());
        System.assertEquals(paginatedEvolutionVariableSummaryList3.hashCode(), paginatedEvolutionVariableSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEvolutionVariableSummary paginatedEvolutionVariableSummaryList = new OASPaginatedEvolutionVariableSummary();
        System.assertEquals(new List<OASEvolutionVariableSummary>(), paginatedEvolutionVariableSummaryList.results);
        System.assertEquals(null, paginatedEvolutionVariableSummaryList.count);
        System.assertEquals(null, paginatedEvolutionVariableSummaryList.next);
        System.assertEquals(null, paginatedEvolutionVariableSummaryList.previous);
    }
}
