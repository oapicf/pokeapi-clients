@isTest
private class OASItemFlingEffectEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = itemFlingEffectEffectText1;
        OASItemFlingEffectEffectText itemFlingEffectEffectText3 = new OASItemFlingEffectEffectText();
        OASItemFlingEffectEffectText itemFlingEffectEffectText4 = itemFlingEffectEffectText3;

        System.assert(itemFlingEffectEffectText1.equals(itemFlingEffectEffectText2));
        System.assert(itemFlingEffectEffectText2.equals(itemFlingEffectEffectText1));
        System.assert(itemFlingEffectEffectText1.equals(itemFlingEffectEffectText1));
        System.assert(itemFlingEffectEffectText3.equals(itemFlingEffectEffectText4));
        System.assert(itemFlingEffectEffectText4.equals(itemFlingEffectEffectText3));
        System.assert(itemFlingEffectEffectText3.equals(itemFlingEffectEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText3 = new OASItemFlingEffectEffectText();
        OASItemFlingEffectEffectText itemFlingEffectEffectText4 = new OASItemFlingEffectEffectText();

        System.assert(itemFlingEffectEffectText1.equals(itemFlingEffectEffectText2));
        System.assert(itemFlingEffectEffectText2.equals(itemFlingEffectEffectText1));
        System.assert(itemFlingEffectEffectText3.equals(itemFlingEffectEffectText4));
        System.assert(itemFlingEffectEffectText4.equals(itemFlingEffectEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = new OASItemFlingEffectEffectText();

        System.assertEquals(false, itemFlingEffectEffectText1.equals('foo'));
        System.assertEquals(false, itemFlingEffectEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = new OASItemFlingEffectEffectText();
        OASItemFlingEffectEffectText itemFlingEffectEffectText3;

        System.assertEquals(false, itemFlingEffectEffectText1.equals(itemFlingEffectEffectText3));
        System.assertEquals(false, itemFlingEffectEffectText2.equals(itemFlingEffectEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = new OASItemFlingEffectEffectText();

        System.assertEquals(itemFlingEffectEffectText1.hashCode(), itemFlingEffectEffectText1.hashCode());
        System.assertEquals(itemFlingEffectEffectText2.hashCode(), itemFlingEffectEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemFlingEffectEffectText itemFlingEffectEffectText1 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText2 = OASItemFlingEffectEffectText.getExample();
        OASItemFlingEffectEffectText itemFlingEffectEffectText3 = new OASItemFlingEffectEffectText();
        OASItemFlingEffectEffectText itemFlingEffectEffectText4 = new OASItemFlingEffectEffectText();

        System.assert(itemFlingEffectEffectText1.equals(itemFlingEffectEffectText2));
        System.assert(itemFlingEffectEffectText3.equals(itemFlingEffectEffectText4));
        System.assertEquals(itemFlingEffectEffectText1.hashCode(), itemFlingEffectEffectText2.hashCode());
        System.assertEquals(itemFlingEffectEffectText3.hashCode(), itemFlingEffectEffectText4.hashCode());
    }
}
