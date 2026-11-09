const utils = require('../utils/utils');
const ContestEffectSummary = require('../models/ContestEffectSummary');
const ContestTypeSummary = require('../models/ContestTypeSummary');
const GenerationSummary = require('../models/GenerationSummary');
const ItemMachine = require('../models/ItemMachine');
const MoveChange = require('../models/MoveChange');
const MoveCombos = require('../models/MoveCombos');
const MoveDamageClassSummary = require('../models/MoveDamageClassSummary');
const MoveEffectChange = require('../models/MoveEffectChange');
const MoveEffectEffectText = require('../models/MoveEffectEffectText');
const MoveFlavorText = require('../models/MoveFlavorText');
const MoveMeta = require('../models/MoveMeta');
const MoveMetaStatChange = require('../models/MoveMetaStatChange');
const MoveName = require('../models/MoveName');
const MoveTargetSummary = require('../models/MoveTargetSummary');
const PokemonSummary = require('../models/PokemonSummary');
const SuperContestEffectSummary = require('../models/SuperContestEffectSummary');
const TypeSummary = require('../models/TypeSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier for this resource. - [${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name for this resource. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}accuracy`,
                label: `The percent value of how likely this move is to be successful. - [${labelPrefix}accuracy]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effect_chance`,
                label: `The percent value of how likely it is this moves effect will happen. - [${labelPrefix}effect_chance]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pp`,
                label: `Power points. The number of times this move can be used. - [${labelPrefix}pp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}priority`,
                label: `A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. - [${labelPrefix}priority]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}power`,
                label: `The base power of this move, or null if it has no fixed base power. - [${labelPrefix}power]`,
                type: 'integer',
            },
            ...MoveCombos.fields(`${keyPrefix}contest_combos`, isInput),
            ...ContestTypeSummary.fields(`${keyPrefix}contest_type`, isInput),
            ...ContestEffectSummary.fields(`${keyPrefix}contest_effect`, isInput),
            ...MoveDamageClassSummary.fields(`${keyPrefix}damage_class`, isInput),
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: MoveEffectEffectText.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}effect_changes`,
                label: `[${labelPrefix}effect_changes]`,
                children: MoveEffectChange.fields(`${keyPrefix}effect_changes${!isInput ? '[]' : ''}`, isInput, true), 
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
                children: MoveMetaStatChange.fields(`${keyPrefix}stat_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...SuperContestEffectSummary.fields(`${keyPrefix}super_contest_effect`, isInput),
            ...MoveTargetSummary.fields(`${keyPrefix}target`, isInput),
            ...TypeSummary.fields(`${keyPrefix}type`, isInput),
            {
                key: `${keyPrefix}machines`,
                label: `[${labelPrefix}machines]`,
                children: ItemMachine.fields(`${keyPrefix}machines${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}flavor_text_entries`,
                label: `[${labelPrefix}flavor_text_entries]`,
                children: MoveFlavorText.fields(`${keyPrefix}flavor_text_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}learned_by_pokemon`,
                label: `[${labelPrefix}learned_by_pokemon]`,
                children: PokemonSummary.fields(`${keyPrefix}learned_by_pokemon${!isInput ? '[]' : ''}`, isInput, true), 
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
            'contest_combos': utils.removeIfEmpty(MoveCombos.mapping(bundle, `${keyPrefix}contest_combos`)),
            'contest_type': utils.removeIfEmpty(ContestTypeSummary.mapping(bundle, `${keyPrefix}contest_type`)),
            'contest_effect': utils.removeIfEmpty(ContestEffectSummary.mapping(bundle, `${keyPrefix}contest_effect`)),
            'damage_class': utils.removeIfEmpty(MoveDamageClassSummary.mapping(bundle, `${keyPrefix}damage_class`)),
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, MoveEffectEffectText),
            'effect_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_changes`], `${keyPrefix}effect_changes`, MoveEffectChange),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'meta': utils.removeIfEmpty(MoveMeta.mapping(bundle, `${keyPrefix}meta`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, MoveName),
            'past_values': utils.childMapping(bundle.inputData?.[`${keyPrefix}past_values`], `${keyPrefix}past_values`, MoveChange),
            'stat_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}stat_changes`], `${keyPrefix}stat_changes`, MoveMetaStatChange),
            'super_contest_effect': utils.removeIfEmpty(SuperContestEffectSummary.mapping(bundle, `${keyPrefix}super_contest_effect`)),
            'target': utils.removeIfEmpty(MoveTargetSummary.mapping(bundle, `${keyPrefix}target`)),
            'type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}type`)),
            'machines': utils.childMapping(bundle.inputData?.[`${keyPrefix}machines`], `${keyPrefix}machines`, ItemMachine),
            'flavor_text_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}flavor_text_entries`], `${keyPrefix}flavor_text_entries`, MoveFlavorText),
            'learned_by_pokemon': utils.childMapping(bundle.inputData?.[`${keyPrefix}learned_by_pokemon`], `${keyPrefix}learned_by_pokemon`, PokemonSummary),
        }
    },
}
