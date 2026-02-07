@isTest
private class OASContestTypeDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = contestTypeDetail1;
        OASContestTypeDetail contestTypeDetail3 = new OASContestTypeDetail();
        OASContestTypeDetail contestTypeDetail4 = contestTypeDetail3;

        System.assert(contestTypeDetail1.equals(contestTypeDetail2));
        System.assert(contestTypeDetail2.equals(contestTypeDetail1));
        System.assert(contestTypeDetail1.equals(contestTypeDetail1));
        System.assert(contestTypeDetail3.equals(contestTypeDetail4));
        System.assert(contestTypeDetail4.equals(contestTypeDetail3));
        System.assert(contestTypeDetail3.equals(contestTypeDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail3 = new OASContestTypeDetail();
        OASContestTypeDetail contestTypeDetail4 = new OASContestTypeDetail();

        System.assert(contestTypeDetail1.equals(contestTypeDetail2));
        System.assert(contestTypeDetail2.equals(contestTypeDetail1));
        System.assert(contestTypeDetail3.equals(contestTypeDetail4));
        System.assert(contestTypeDetail4.equals(contestTypeDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = new OASContestTypeDetail();

        System.assertEquals(false, contestTypeDetail1.equals('foo'));
        System.assertEquals(false, contestTypeDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = new OASContestTypeDetail();
        OASContestTypeDetail contestTypeDetail3;

        System.assertEquals(false, contestTypeDetail1.equals(contestTypeDetail3));
        System.assertEquals(false, contestTypeDetail2.equals(contestTypeDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = new OASContestTypeDetail();

        System.assertEquals(contestTypeDetail1.hashCode(), contestTypeDetail1.hashCode());
        System.assertEquals(contestTypeDetail2.hashCode(), contestTypeDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestTypeDetail contestTypeDetail1 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail2 = OASContestTypeDetail.getExample();
        OASContestTypeDetail contestTypeDetail3 = new OASContestTypeDetail();
        OASContestTypeDetail contestTypeDetail4 = new OASContestTypeDetail();

        System.assert(contestTypeDetail1.equals(contestTypeDetail2));
        System.assert(contestTypeDetail3.equals(contestTypeDetail4));
        System.assertEquals(contestTypeDetail1.hashCode(), contestTypeDetail2.hashCode());
        System.assertEquals(contestTypeDetail3.hashCode(), contestTypeDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASContestTypeDetail contestTypeDetail = new OASContestTypeDetail();
        Map<String, String> x-property-mappings = contestTypeDetail.getx-property-mappings();
        System.assertEquals('berryFlavor', x-property-mappings.get('berry_flavor'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASContestTypeDetail contestTypeDetail = new OASContestTypeDetail();
        System.assertEquals(new List<OASContestTypeName>(), contestTypeDetail.names);
        System.assertEquals(null, contestTypeDetail.id);
        System.assertEquals(null, contestTypeDetail.name);
        System.assertEquals(null, contestTypeDetail.berryFlavor);
    }
}
