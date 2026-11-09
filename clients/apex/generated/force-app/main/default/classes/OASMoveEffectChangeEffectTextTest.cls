@isTest
private class OASMoveEffectChangeEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = moveEffectChangeEffectText1;
        OASMoveEffectChangeEffectText moveEffectChangeEffectText3 = new OASMoveEffectChangeEffectText();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText4 = moveEffectChangeEffectText3;

        System.assert(moveEffectChangeEffectText1.equals(moveEffectChangeEffectText2));
        System.assert(moveEffectChangeEffectText2.equals(moveEffectChangeEffectText1));
        System.assert(moveEffectChangeEffectText1.equals(moveEffectChangeEffectText1));
        System.assert(moveEffectChangeEffectText3.equals(moveEffectChangeEffectText4));
        System.assert(moveEffectChangeEffectText4.equals(moveEffectChangeEffectText3));
        System.assert(moveEffectChangeEffectText3.equals(moveEffectChangeEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText3 = new OASMoveEffectChangeEffectText();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText4 = new OASMoveEffectChangeEffectText();

        System.assert(moveEffectChangeEffectText1.equals(moveEffectChangeEffectText2));
        System.assert(moveEffectChangeEffectText2.equals(moveEffectChangeEffectText1));
        System.assert(moveEffectChangeEffectText3.equals(moveEffectChangeEffectText4));
        System.assert(moveEffectChangeEffectText4.equals(moveEffectChangeEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = new OASMoveEffectChangeEffectText();

        System.assertEquals(false, moveEffectChangeEffectText1.equals('foo'));
        System.assertEquals(false, moveEffectChangeEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = new OASMoveEffectChangeEffectText();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText3;

        System.assertEquals(false, moveEffectChangeEffectText1.equals(moveEffectChangeEffectText3));
        System.assertEquals(false, moveEffectChangeEffectText2.equals(moveEffectChangeEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = new OASMoveEffectChangeEffectText();

        System.assertEquals(moveEffectChangeEffectText1.hashCode(), moveEffectChangeEffectText1.hashCode());
        System.assertEquals(moveEffectChangeEffectText2.hashCode(), moveEffectChangeEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveEffectChangeEffectText moveEffectChangeEffectText1 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText2 = OASMoveEffectChangeEffectText.getExample();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText3 = new OASMoveEffectChangeEffectText();
        OASMoveEffectChangeEffectText moveEffectChangeEffectText4 = new OASMoveEffectChangeEffectText();

        System.assert(moveEffectChangeEffectText1.equals(moveEffectChangeEffectText2));
        System.assert(moveEffectChangeEffectText3.equals(moveEffectChangeEffectText4));
        System.assertEquals(moveEffectChangeEffectText1.hashCode(), moveEffectChangeEffectText2.hashCode());
        System.assertEquals(moveEffectChangeEffectText3.hashCode(), moveEffectChangeEffectText4.hashCode());
    }
}
