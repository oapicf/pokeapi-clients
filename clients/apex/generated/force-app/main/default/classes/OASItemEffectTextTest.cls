@isTest
private class OASItemEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = itemEffectText1;
        OASItemEffectText itemEffectText3 = new OASItemEffectText();
        OASItemEffectText itemEffectText4 = itemEffectText3;

        System.assert(itemEffectText1.equals(itemEffectText2));
        System.assert(itemEffectText2.equals(itemEffectText1));
        System.assert(itemEffectText1.equals(itemEffectText1));
        System.assert(itemEffectText3.equals(itemEffectText4));
        System.assert(itemEffectText4.equals(itemEffectText3));
        System.assert(itemEffectText3.equals(itemEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText3 = new OASItemEffectText();
        OASItemEffectText itemEffectText4 = new OASItemEffectText();

        System.assert(itemEffectText1.equals(itemEffectText2));
        System.assert(itemEffectText2.equals(itemEffectText1));
        System.assert(itemEffectText3.equals(itemEffectText4));
        System.assert(itemEffectText4.equals(itemEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = new OASItemEffectText();

        System.assertEquals(false, itemEffectText1.equals('foo'));
        System.assertEquals(false, itemEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = new OASItemEffectText();
        OASItemEffectText itemEffectText3;

        System.assertEquals(false, itemEffectText1.equals(itemEffectText3));
        System.assertEquals(false, itemEffectText2.equals(itemEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = new OASItemEffectText();

        System.assertEquals(itemEffectText1.hashCode(), itemEffectText1.hashCode());
        System.assertEquals(itemEffectText2.hashCode(), itemEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemEffectText itemEffectText1 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText2 = OASItemEffectText.getExample();
        OASItemEffectText itemEffectText3 = new OASItemEffectText();
        OASItemEffectText itemEffectText4 = new OASItemEffectText();

        System.assert(itemEffectText1.equals(itemEffectText2));
        System.assert(itemEffectText3.equals(itemEffectText4));
        System.assertEquals(itemEffectText1.hashCode(), itemEffectText2.hashCode());
        System.assertEquals(itemEffectText3.hashCode(), itemEffectText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemEffectText itemEffectText = new OASItemEffectText();
        Map<String, String> x-property-mappings = itemEffectText.getx-property-mappings();
        System.assertEquals('shortEffect', x-property-mappings.get('short_effect'));
    }
}
