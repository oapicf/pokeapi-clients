@isTest
private class OASItemFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = itemFlavorText1;
        OASItemFlavorText itemFlavorText3 = new OASItemFlavorText();
        OASItemFlavorText itemFlavorText4 = itemFlavorText3;

        System.assert(itemFlavorText1.equals(itemFlavorText2));
        System.assert(itemFlavorText2.equals(itemFlavorText1));
        System.assert(itemFlavorText1.equals(itemFlavorText1));
        System.assert(itemFlavorText3.equals(itemFlavorText4));
        System.assert(itemFlavorText4.equals(itemFlavorText3));
        System.assert(itemFlavorText3.equals(itemFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText3 = new OASItemFlavorText();
        OASItemFlavorText itemFlavorText4 = new OASItemFlavorText();

        System.assert(itemFlavorText1.equals(itemFlavorText2));
        System.assert(itemFlavorText2.equals(itemFlavorText1));
        System.assert(itemFlavorText3.equals(itemFlavorText4));
        System.assert(itemFlavorText4.equals(itemFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = new OASItemFlavorText();

        System.assertEquals(false, itemFlavorText1.equals('foo'));
        System.assertEquals(false, itemFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = new OASItemFlavorText();
        OASItemFlavorText itemFlavorText3;

        System.assertEquals(false, itemFlavorText1.equals(itemFlavorText3));
        System.assertEquals(false, itemFlavorText2.equals(itemFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = new OASItemFlavorText();

        System.assertEquals(itemFlavorText1.hashCode(), itemFlavorText1.hashCode());
        System.assertEquals(itemFlavorText2.hashCode(), itemFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemFlavorText itemFlavorText1 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText2 = OASItemFlavorText.getExample();
        OASItemFlavorText itemFlavorText3 = new OASItemFlavorText();
        OASItemFlavorText itemFlavorText4 = new OASItemFlavorText();

        System.assert(itemFlavorText1.equals(itemFlavorText2));
        System.assert(itemFlavorText3.equals(itemFlavorText4));
        System.assertEquals(itemFlavorText1.hashCode(), itemFlavorText2.hashCode());
        System.assertEquals(itemFlavorText3.hashCode(), itemFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemFlavorText itemFlavorText = new OASItemFlavorText();
        Map<String, String> x-property-mappings = itemFlavorText.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
