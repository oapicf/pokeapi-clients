@isTest
private class OASVersionDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = versionDetail1;
        OASVersionDetail versionDetail3 = new OASVersionDetail();
        OASVersionDetail versionDetail4 = versionDetail3;

        System.assert(versionDetail1.equals(versionDetail2));
        System.assert(versionDetail2.equals(versionDetail1));
        System.assert(versionDetail1.equals(versionDetail1));
        System.assert(versionDetail3.equals(versionDetail4));
        System.assert(versionDetail4.equals(versionDetail3));
        System.assert(versionDetail3.equals(versionDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail3 = new OASVersionDetail();
        OASVersionDetail versionDetail4 = new OASVersionDetail();

        System.assert(versionDetail1.equals(versionDetail2));
        System.assert(versionDetail2.equals(versionDetail1));
        System.assert(versionDetail3.equals(versionDetail4));
        System.assert(versionDetail4.equals(versionDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = new OASVersionDetail();

        System.assertEquals(false, versionDetail1.equals('foo'));
        System.assertEquals(false, versionDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = new OASVersionDetail();
        OASVersionDetail versionDetail3;

        System.assertEquals(false, versionDetail1.equals(versionDetail3));
        System.assertEquals(false, versionDetail2.equals(versionDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = new OASVersionDetail();

        System.assertEquals(versionDetail1.hashCode(), versionDetail1.hashCode());
        System.assertEquals(versionDetail2.hashCode(), versionDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionDetail versionDetail1 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail2 = OASVersionDetail.getExample();
        OASVersionDetail versionDetail3 = new OASVersionDetail();
        OASVersionDetail versionDetail4 = new OASVersionDetail();

        System.assert(versionDetail1.equals(versionDetail2));
        System.assert(versionDetail3.equals(versionDetail4));
        System.assertEquals(versionDetail1.hashCode(), versionDetail2.hashCode());
        System.assertEquals(versionDetail3.hashCode(), versionDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVersionDetail versionDetail = new OASVersionDetail();
        Map<String, String> x-property-mappings = versionDetail.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVersionDetail versionDetail = new OASVersionDetail();
        System.assertEquals(new List<OASVersionName>(), versionDetail.names);
        System.assertEquals(null, versionDetail.id);
        System.assertEquals(null, versionDetail.name);
        System.assertEquals(null, versionDetail.versionGroup);
    }
}
