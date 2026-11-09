@isTest
private class OASMoveEffectEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = moveEffectEffectText1;
        OASMoveEffectEffectText moveEffectEffectText3 = new OASMoveEffectEffectText();
        OASMoveEffectEffectText moveEffectEffectText4 = moveEffectEffectText3;

        System.assert(moveEffectEffectText1.equals(moveEffectEffectText2));
        System.assert(moveEffectEffectText2.equals(moveEffectEffectText1));
        System.assert(moveEffectEffectText1.equals(moveEffectEffectText1));
        System.assert(moveEffectEffectText3.equals(moveEffectEffectText4));
        System.assert(moveEffectEffectText4.equals(moveEffectEffectText3));
        System.assert(moveEffectEffectText3.equals(moveEffectEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText3 = new OASMoveEffectEffectText();
        OASMoveEffectEffectText moveEffectEffectText4 = new OASMoveEffectEffectText();

        System.assert(moveEffectEffectText1.equals(moveEffectEffectText2));
        System.assert(moveEffectEffectText2.equals(moveEffectEffectText1));
        System.assert(moveEffectEffectText3.equals(moveEffectEffectText4));
        System.assert(moveEffectEffectText4.equals(moveEffectEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = new OASMoveEffectEffectText();

        System.assertEquals(false, moveEffectEffectText1.equals('foo'));
        System.assertEquals(false, moveEffectEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = new OASMoveEffectEffectText();
        OASMoveEffectEffectText moveEffectEffectText3;

        System.assertEquals(false, moveEffectEffectText1.equals(moveEffectEffectText3));
        System.assertEquals(false, moveEffectEffectText2.equals(moveEffectEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = new OASMoveEffectEffectText();

        System.assertEquals(moveEffectEffectText1.hashCode(), moveEffectEffectText1.hashCode());
        System.assertEquals(moveEffectEffectText2.hashCode(), moveEffectEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveEffectEffectText moveEffectEffectText1 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText2 = OASMoveEffectEffectText.getExample();
        OASMoveEffectEffectText moveEffectEffectText3 = new OASMoveEffectEffectText();
        OASMoveEffectEffectText moveEffectEffectText4 = new OASMoveEffectEffectText();

        System.assert(moveEffectEffectText1.equals(moveEffectEffectText2));
        System.assert(moveEffectEffectText3.equals(moveEffectEffectText4));
        System.assertEquals(moveEffectEffectText1.hashCode(), moveEffectEffectText2.hashCode());
        System.assertEquals(moveEffectEffectText3.hashCode(), moveEffectEffectText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveEffectEffectText moveEffectEffectText = new OASMoveEffectEffectText();
        Map<String, String> x-property-mappings = moveEffectEffectText.getx-property-mappings();
        System.assertEquals('shortEffect', x-property-mappings.get('short_effect'));
    }
}
