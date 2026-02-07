const utils = require('../utils/utils');
const BerryFlavorSummary = require('../models/BerryFlavorSummary');
const BerrySummary = require('../models/BerrySummary');
const NatureBattleStylePreference = require('../models/NatureBattleStylePreference');
const NatureDetail_pokeathlon_stat_changes_inner = require('../models/NatureDetail_pokeathlon_stat_changes_inner');
const NatureName = require('../models/NatureName');
const StatSummary = require('../models/StatSummary');

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
            ...StatSummary.fields(`${keyPrefix}decreased_stat`, isInput),
            ...StatSummary.fields(`${keyPrefix}increased_stat`, isInput),
            ...BerryFlavorSummary.fields(`${keyPrefix}likes_flavor`, isInput),
            ...BerryFlavorSummary.fields(`${keyPrefix}hates_flavor`, isInput),
            {
                key: `${keyPrefix}berries`,
                label: `[${labelPrefix}berries]`,
                children: BerrySummary.fields(`${keyPrefix}berries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokeathlon_stat_changes`,
                label: `[${labelPrefix}pokeathlon_stat_changes]`,
                children: NatureDetail_pokeathlon_stat_changes_inner.fields(`${keyPrefix}pokeathlon_stat_changes${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}move_battle_style_preferences`,
                label: `[${labelPrefix}move_battle_style_preferences]`,
                children: NatureBattleStylePreference.fields(`${keyPrefix}move_battle_style_preferences${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: NatureName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'decreased_stat': utils.removeIfEmpty(StatSummary.mapping(bundle, `${keyPrefix}decreased_stat`)),
            'increased_stat': utils.removeIfEmpty(StatSummary.mapping(bundle, `${keyPrefix}increased_stat`)),
            'likes_flavor': utils.removeIfEmpty(BerryFlavorSummary.mapping(bundle, `${keyPrefix}likes_flavor`)),
            'hates_flavor': utils.removeIfEmpty(BerryFlavorSummary.mapping(bundle, `${keyPrefix}hates_flavor`)),
            'berries': utils.childMapping(bundle.inputData?.[`${keyPrefix}berries`], `${keyPrefix}berries`, BerrySummary),
            'pokeathlon_stat_changes': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokeathlon_stat_changes`], `${keyPrefix}pokeathlon_stat_changes`, NatureDetail_pokeathlon_stat_changes_inner),
            'move_battle_style_preferences': utils.childMapping(bundle.inputData?.[`${keyPrefix}move_battle_style_preferences`], `${keyPrefix}move_battle_style_preferences`, NatureBattleStylePreference),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, NatureName),
        }
    },
}
