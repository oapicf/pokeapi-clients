@isTest
private class OASItemPriceTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = itemPrice1;
        OASItemPrice itemPrice3 = new OASItemPrice();
        OASItemPrice itemPrice4 = itemPrice3;

        System.assert(itemPrice1.equals(itemPrice2));
        System.assert(itemPrice2.equals(itemPrice1));
        System.assert(itemPrice1.equals(itemPrice1));
        System.assert(itemPrice3.equals(itemPrice4));
        System.assert(itemPrice4.equals(itemPrice3));
        System.assert(itemPrice3.equals(itemPrice3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = OASItemPrice.getExample();
        OASItemPrice itemPrice3 = new OASItemPrice();
        OASItemPrice itemPrice4 = new OASItemPrice();

        System.assert(itemPrice1.equals(itemPrice2));
        System.assert(itemPrice2.equals(itemPrice1));
        System.assert(itemPrice3.equals(itemPrice4));
        System.assert(itemPrice4.equals(itemPrice3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = new OASItemPrice();

        System.assertEquals(false, itemPrice1.equals('foo'));
        System.assertEquals(false, itemPrice2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = new OASItemPrice();
        OASItemPrice itemPrice3;

        System.assertEquals(false, itemPrice1.equals(itemPrice3));
        System.assertEquals(false, itemPrice2.equals(itemPrice3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = new OASItemPrice();

        System.assertEquals(itemPrice1.hashCode(), itemPrice1.hashCode());
        System.assertEquals(itemPrice2.hashCode(), itemPrice2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemPrice itemPrice1 = OASItemPrice.getExample();
        OASItemPrice itemPrice2 = OASItemPrice.getExample();
        OASItemPrice itemPrice3 = new OASItemPrice();
        OASItemPrice itemPrice4 = new OASItemPrice();

        System.assert(itemPrice1.equals(itemPrice2));
        System.assert(itemPrice3.equals(itemPrice4));
        System.assertEquals(itemPrice1.hashCode(), itemPrice2.hashCode());
        System.assertEquals(itemPrice3.hashCode(), itemPrice4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemPrice itemPrice = new OASItemPrice();
        Map<String, String> x-property-mappings = itemPrice.getx-property-mappings();
        System.assertEquals('purchasePrice', x-property-mappings.get('purchase_price'));
        System.assertEquals('sellPrice', x-property-mappings.get('sell_price'));
        System.assertEquals('r_currency', x-property-mappings.get('currency'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
