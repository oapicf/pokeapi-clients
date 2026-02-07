@isTest
private class OASMoveTargetDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = moveTargetDetail1;
        OASMoveTargetDetail moveTargetDetail3 = new OASMoveTargetDetail();
        OASMoveTargetDetail moveTargetDetail4 = moveTargetDetail3;

        System.assert(moveTargetDetail1.equals(moveTargetDetail2));
        System.assert(moveTargetDetail2.equals(moveTargetDetail1));
        System.assert(moveTargetDetail1.equals(moveTargetDetail1));
        System.assert(moveTargetDetail3.equals(moveTargetDetail4));
        System.assert(moveTargetDetail4.equals(moveTargetDetail3));
        System.assert(moveTargetDetail3.equals(moveTargetDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail3 = new OASMoveTargetDetail();
        OASMoveTargetDetail moveTargetDetail4 = new OASMoveTargetDetail();

        System.assert(moveTargetDetail1.equals(moveTargetDetail2));
        System.assert(moveTargetDetail2.equals(moveTargetDetail1));
        System.assert(moveTargetDetail3.equals(moveTargetDetail4));
        System.assert(moveTargetDetail4.equals(moveTargetDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = new OASMoveTargetDetail();

        System.assertEquals(false, moveTargetDetail1.equals('foo'));
        System.assertEquals(false, moveTargetDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = new OASMoveTargetDetail();
        OASMoveTargetDetail moveTargetDetail3;

        System.assertEquals(false, moveTargetDetail1.equals(moveTargetDetail3));
        System.assertEquals(false, moveTargetDetail2.equals(moveTargetDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = new OASMoveTargetDetail();

        System.assertEquals(moveTargetDetail1.hashCode(), moveTargetDetail1.hashCode());
        System.assertEquals(moveTargetDetail2.hashCode(), moveTargetDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveTargetDetail moveTargetDetail1 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail2 = OASMoveTargetDetail.getExample();
        OASMoveTargetDetail moveTargetDetail3 = new OASMoveTargetDetail();
        OASMoveTargetDetail moveTargetDetail4 = new OASMoveTargetDetail();

        System.assert(moveTargetDetail1.equals(moveTargetDetail2));
        System.assert(moveTargetDetail3.equals(moveTargetDetail4));
        System.assertEquals(moveTargetDetail1.hashCode(), moveTargetDetail2.hashCode());
        System.assertEquals(moveTargetDetail3.hashCode(), moveTargetDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveTargetDetail moveTargetDetail = new OASMoveTargetDetail();
        System.assertEquals(new List<OASMoveTargetDescription>(), moveTargetDetail.descriptions);
        System.assertEquals(new List<OASMoveSummary>(), moveTargetDetail.moves);
        System.assertEquals(new List<OASMoveTargetName>(), moveTargetDetail.names);
        System.assertEquals(null, moveTargetDetail.id);
        System.assertEquals(null, moveTargetDetail.name);
    }
}
