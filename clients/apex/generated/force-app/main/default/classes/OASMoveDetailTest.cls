@isTest
private class OASMoveDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = moveDetail1;
        OASMoveDetail moveDetail3 = new OASMoveDetail();
        OASMoveDetail moveDetail4 = moveDetail3;

        System.assert(moveDetail1.equals(moveDetail2));
        System.assert(moveDetail2.equals(moveDetail1));
        System.assert(moveDetail1.equals(moveDetail1));
        System.assert(moveDetail3.equals(moveDetail4));
        System.assert(moveDetail4.equals(moveDetail3));
        System.assert(moveDetail3.equals(moveDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail3 = new OASMoveDetail();
        OASMoveDetail moveDetail4 = new OASMoveDetail();

        System.assert(moveDetail1.equals(moveDetail2));
        System.assert(moveDetail2.equals(moveDetail1));
        System.assert(moveDetail3.equals(moveDetail4));
        System.assert(moveDetail4.equals(moveDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = new OASMoveDetail();

        System.assertEquals(false, moveDetail1.equals('foo'));
        System.assertEquals(false, moveDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = new OASMoveDetail();
        OASMoveDetail moveDetail3;

        System.assertEquals(false, moveDetail1.equals(moveDetail3));
        System.assertEquals(false, moveDetail2.equals(moveDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = new OASMoveDetail();

        System.assertEquals(moveDetail1.hashCode(), moveDetail1.hashCode());
        System.assertEquals(moveDetail2.hashCode(), moveDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetail moveDetail1 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail2 = OASMoveDetail.getExample();
        OASMoveDetail moveDetail3 = new OASMoveDetail();
        OASMoveDetail moveDetail4 = new OASMoveDetail();

        System.assert(moveDetail1.equals(moveDetail2));
        System.assert(moveDetail3.equals(moveDetail4));
        System.assertEquals(moveDetail1.hashCode(), moveDetail2.hashCode());
        System.assertEquals(moveDetail3.hashCode(), moveDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveDetail moveDetail = new OASMoveDetail();
        Map<String, String> x-property-mappings = moveDetail.getx-property-mappings();
        System.assertEquals('effectChance', x-property-mappings.get('effect_chance'));
        System.assertEquals('contestCombos', x-property-mappings.get('contest_combos'));
        System.assertEquals('contestType', x-property-mappings.get('contest_type'));
        System.assertEquals('contestEffect', x-property-mappings.get('contest_effect'));
        System.assertEquals('damageClass', x-property-mappings.get('damage_class'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('effectChanges', x-property-mappings.get('effect_changes'));
        System.assertEquals('pastValues', x-property-mappings.get('past_values'));
        System.assertEquals('statChanges', x-property-mappings.get('stat_changes'));
        System.assertEquals('superContestEffect', x-property-mappings.get('super_contest_effect'));
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
        System.assertEquals('learnedByPokemon', x-property-mappings.get('learned_by_pokemon'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASMoveDetail moveDetail = new OASMoveDetail();
        System.assertEquals(new List<OASMoveChangeEffectEntriesInner>(), moveDetail.effectEntries);
        System.assertEquals(new List<OASMoveDetailEffectChangesInner>(), moveDetail.effectChanges);
        System.assertEquals(new List<OASMoveName>(), moveDetail.names);
        System.assertEquals(new List<OASMoveChange>(), moveDetail.pastValues);
        System.assertEquals(new List<OASMoveDetailStatChangesInner>(), moveDetail.statChanges);
        System.assertEquals(new List<OASMoveDetailMachinesInner>(), moveDetail.machines);
        System.assertEquals(new List<OASMoveFlavorText>(), moveDetail.flavorTextEntries);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), moveDetail.learnedByPokemon);
        System.assertEquals(null, moveDetail.id);
        System.assertEquals(null, moveDetail.name);
        System.assertEquals(null, moveDetail.accuracy);
        System.assertEquals(null, moveDetail.effectChance);
        System.assertEquals(null, moveDetail.pp);
        System.assertEquals(null, moveDetail.priority);
        System.assertEquals(null, moveDetail.power);
        System.assertEquals(null, moveDetail.contestCombos);
        System.assertEquals(null, moveDetail.contestType);
        System.assertEquals(null, moveDetail.contestEffect);
        System.assertEquals(null, moveDetail.damageClass);
        System.assertEquals(null, moveDetail.generation);
        System.assertEquals(null, moveDetail.meta);
        System.assertEquals(null, moveDetail.superContestEffect);
        System.assertEquals(null, moveDetail.target);
        System.assertEquals(null, moveDetail.type);
    }
}
