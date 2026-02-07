@isTest
private class OASVersionNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = versionName1;
        OASVersionName versionName3 = new OASVersionName();
        OASVersionName versionName4 = versionName3;

        System.assert(versionName1.equals(versionName2));
        System.assert(versionName2.equals(versionName1));
        System.assert(versionName1.equals(versionName1));
        System.assert(versionName3.equals(versionName4));
        System.assert(versionName4.equals(versionName3));
        System.assert(versionName3.equals(versionName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = OASVersionName.getExample();
        OASVersionName versionName3 = new OASVersionName();
        OASVersionName versionName4 = new OASVersionName();

        System.assert(versionName1.equals(versionName2));
        System.assert(versionName2.equals(versionName1));
        System.assert(versionName3.equals(versionName4));
        System.assert(versionName4.equals(versionName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = new OASVersionName();

        System.assertEquals(false, versionName1.equals('foo'));
        System.assertEquals(false, versionName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = new OASVersionName();
        OASVersionName versionName3;

        System.assertEquals(false, versionName1.equals(versionName3));
        System.assertEquals(false, versionName2.equals(versionName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = new OASVersionName();

        System.assertEquals(versionName1.hashCode(), versionName1.hashCode());
        System.assertEquals(versionName2.hashCode(), versionName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionName versionName1 = OASVersionName.getExample();
        OASVersionName versionName2 = OASVersionName.getExample();
        OASVersionName versionName3 = new OASVersionName();
        OASVersionName versionName4 = new OASVersionName();

        System.assert(versionName1.equals(versionName2));
        System.assert(versionName3.equals(versionName4));
        System.assertEquals(versionName1.hashCode(), versionName2.hashCode());
        System.assertEquals(versionName3.hashCode(), versionName4.hashCode());
    }
}
