const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const ContestEffectSummary = require('../models/ContestEffectSummary');
const ContestTypeSummary = require('../models/ContestTypeSummary');
const GenerationSummary = require('../models/GenerationSummary');
const MoveChange = require('../models/MoveChange');
const MoveChange_effect_entries_inner = require('../models/MoveChange_effect_entries_inner');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const MoveDetail_contest_combos = require('../models/MoveDetail_contest_combos');
const MoveDetail_effect_changes_inner = require('../models/MoveDetail_effect_changes_inner');
const MoveDetail_machines_inner = require('../models/MoveDetail_machines_inner');
const MoveDetail_stat_changes_inner = require('../models/MoveDetail_stat_changes_inner');
const MoveFlavorText = require('../models/MoveFlavorText');
const MoveMeta = require('../models/MoveMeta');
const MoveName = require('../models/MoveName');
const MoveTargetSummary = require('../models/MoveTargetSummary');
const SuperContestEffectSummary = require('../models/SuperContestEffectSummary');
const TypeSummary = require('../models/TypeSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}accuracy`,
                label: `[${labelPrefix}accuracy]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effect_chance`,
                label: `[${labelPrefix}effect_chance]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pp`,
                label: `[${labelPrefix}pp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}priority`,
                label: `[${labelPrefix}priority]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}power`,
                label: `[${labelPrefix}power]`,
                type: 'integer',
            },
            ...MoveDetail_contest_combos.fields(`${keyPrefix}contest_combos`, isInput),
            ...ContestTypeSummary.fields(`${keyPrefix}contest_type`, isInput),
            ...ContestEffectSummary.fields(`${keyPrefix}contest_effect`, isInput),
            ...MoveDamageClassSummary.fields(`${keyPrefix}damage_class`, isInput),
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: MoveChange_effect_entries_inner.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}effect_changes`,
                label: `[${labelPrefix}effect_changes]`,
                children: MoveDetail_effect_changes_inner.fields(`${keyPrefix}effect_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            ...MoveMeta.fields(`${keyPrefix}meta`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: MoveName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}past_values`,
                label: `[${labelPrefix}past_values]`,
                children: MoveChange.fields(`${keyPrefix}past_values${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}stat_changes`,
                label: `[${labelPrefix}stat_changes]`,
                children: MoveDetail_stat_changes_inner.fields(`${keyPrefix}stat_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...SuperContestEffectSummary.fields(`${keyPrefix}super_contest_effect`, isInput),
            ...MoveTargetSummary.fields(`${keyPrefix}target`, isInput),
            ...TypeSummary.fields(`${keyPrefix}type`, isInput),
            {
                key: `${keyPrefix}machines`,
                label: `[${labelPrefix}machines]`,
                children: MoveDetail_machines_inner.fields(`${keyPrefix}machines${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: MoveFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}learned_by_pokemon`,
                label: `[${labelPrefix}learned_by_pokemon]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}learned_by_pokemon${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'accuracy': bundle.inputData?.[`${keyPrefix}accuracy`],
            'effect_chance': bundle.inputData?.[`${keyPrefix}effect_chance`],
            'pp': bundle.inputData?.[`${keyPrefix}pp`],
            'priority': bundle.inputData?.[`${keyPrefix}priority`],
            'power': bundle.inputData?.[`${keyPrefix}power`],
            'contest_combos': utils.removeIfEmpty(MoveDetail_contest_combos.mapping(bundle, `${keyPrefix}contest_combos`)),
            'contest_type': utils.removeIfEmpty(ContestTypeSummary.mapping(bundle, `${keyPrefix}contest_type`)),
            'contest_effect': utils.removeIfEmpty(ContestEffectSummary.mapping(bundle, `${keyPrefix}contest_effect`)),
            'damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}damage_class`)),
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, MoveChange_effect_entries_inner),
            'effect_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_changes`], `${keyPrefix}effect_changes`, MoveDetail_effect_changes_inner),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'meta': utils.removeIfEmpty(MoveMeta.mapping(bundle, `${keyPrefix}meta`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, MoveName),
            'past_values': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_values`], `${keyPrefix}past_values`, MoveChange),
            'stat_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}stat_changes`], `${keyPrefix}stat_changes`, MoveDetail_stat_changes_inner),
            'super_contest_effect': utils.removeIfEmpty(SuperContestEffectSummary.mapping(bundle, `${keyPrefix}super_contest_effect`)),
            'target': utils.removeIfEmpty(MoveTargetSummary.mapping(bundle, `${keyPrefix}target`)),
            'type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}type`)),
            'machines': utils.childMapping(bundle.inputData?.[`${keyPrefix}machines`], `${keyPrefix}machines`, MoveDetail_machines_inner),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, MoveFlavorText),
            'learned_by_pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}learned_by_pokemon`], `${keyPrefix}learned_by_pokemon`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
