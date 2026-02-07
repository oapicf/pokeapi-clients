@isTest
private class OASPaginatedEvolutionTriggerSummaryLTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = paginatedEvolutionTriggerSummaryList1;
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList3 = new OASPaginatedEvolutionTriggerSummaryL();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList4 = paginatedEvolutionTriggerSummaryList3;

        System.assert(paginatedEvolutionTriggerSummaryList1.equals(paginatedEvolutionTriggerSummaryList2));
        System.assert(paginatedEvolutionTriggerSummaryList2.equals(paginatedEvolutionTriggerSummaryList1));
        System.assert(paginatedEvolutionTriggerSummaryList1.equals(paginatedEvolutionTriggerSummaryList1));
        System.assert(paginatedEvolutionTriggerSummaryList3.equals(paginatedEvolutionTriggerSummaryList4));
        System.assert(paginatedEvolutionTriggerSummaryList4.equals(paginatedEvolutionTriggerSummaryList3));
        System.assert(paginatedEvolutionTriggerSummaryList3.equals(paginatedEvolutionTriggerSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList3 = new OASPaginatedEvolutionTriggerSummaryL();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList4 = new OASPaginatedEvolutionTriggerSummaryL();

        System.assert(paginatedEvolutionTriggerSummaryList1.equals(paginatedEvolutionTriggerSummaryList2));
        System.assert(paginatedEvolutionTriggerSummaryList2.equals(paginatedEvolutionTriggerSummaryList1));
        System.assert(paginatedEvolutionTriggerSummaryList3.equals(paginatedEvolutionTriggerSummaryList4));
        System.assert(paginatedEvolutionTriggerSummaryList4.equals(paginatedEvolutionTriggerSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = new OASPaginatedEvolutionTriggerSummaryL();

        System.assertEquals(false, paginatedEvolutionTriggerSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEvolutionTriggerSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = new OASPaginatedEvolutionTriggerSummaryL();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList3;

        System.assertEquals(false, paginatedEvolutionTriggerSummaryList1.equals(paginatedEvolutionTriggerSummaryList3));
        System.assertEquals(false, paginatedEvolutionTriggerSummaryList2.equals(paginatedEvolutionTriggerSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = new OASPaginatedEvolutionTriggerSummaryL();

        System.assertEquals(paginatedEvolutionTriggerSummaryList1.hashCode(), paginatedEvolutionTriggerSummaryList1.hashCode());
        System.assertEquals(paginatedEvolutionTriggerSummaryList2.hashCode(), paginatedEvolutionTriggerSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList1 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList2 = OASPaginatedEvolutionTriggerSummaryL.getExample();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList3 = new OASPaginatedEvolutionTriggerSummaryL();
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList4 = new OASPaginatedEvolutionTriggerSummaryL();

        System.assert(paginatedEvolutionTriggerSummaryList1.equals(paginatedEvolutionTriggerSummaryList2));
        System.assert(paginatedEvolutionTriggerSummaryList3.equals(paginatedEvolutionTriggerSummaryList4));
        System.assertEquals(paginatedEvolutionTriggerSummaryList1.hashCode(), paginatedEvolutionTriggerSummaryList2.hashCode());
        System.assertEquals(paginatedEvolutionTriggerSummaryList3.hashCode(), paginatedEvolutionTriggerSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEvolutionTriggerSummaryL paginatedEvolutionTriggerSummaryList = new OASPaginatedEvolutionTriggerSummaryL();
        System.assertEquals(new List<OASEvolutionTriggerSummary>(), paginatedEvolutionTriggerSummaryList.results);
        System.assertEquals(null, paginatedEvolutionTriggerSummaryList.count);
        System.assertEquals(null, paginatedEvolutionTriggerSummaryList.next);
        System.assertEquals(null, paginatedEvolutionTriggerSummaryList.previous);
    }
}
