const utils = require('../utils/utils');
const MoveMetaAilmentSummary = require('../models/MoveMetaAilmentSummary');
const MoveMetaCategorySummary = require('../models/MoveMetaCategorySummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...MoveMetaAilmentSummary.fields(`${keyPrefix}ailment`, isInput),
            ...MoveMetaCategorySummary.fields(`${keyPrefix}category`, isInput),
            {
                key: `${keyPrefix}min_hits`,
                label: `The minimum number of times this move hits. Null if it always only hits once. - [${labelPrefix}min_hits]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_hits`,
                label: `The maximum number of times this move hits. Null if it always only hits once. - [${labelPrefix}max_hits]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_turns`,
                label: `The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. - [${labelPrefix}min_turns]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_turns`,
                label: `The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. - [${labelPrefix}max_turns]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}drain`,
                label: `HP drain (if positive) or Recoil damage (if negative), in percent of damage done. - [${labelPrefix}drain]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}healing`,
                label: `The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP. - [${labelPrefix}healing]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}crit_rate`,
                label: `Critical hit rate bonus. - [${labelPrefix}crit_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ailment_chance`,
                label: `The likelihood this attack will cause an ailment. - [${labelPrefix}ailment_chance]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}flinch_chance`,
                label: `The likelihood this attack will cause the target Pokémon to flinch. - [${labelPrefix}flinch_chance]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}stat_chance`,
                label: `The likelihood this attack will cause a stat change in the target Pokémon. - [${labelPrefix}stat_chance]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ailment': utils.removeIfEmpty(MoveMetaAilmentSummary.mapping(bundle, `${keyPrefix}ailment`)),
            'category': utils.removeIfEmpty(MoveMetaCategorySummary.mapping(bundle, `${keyPrefix}category`)),
            'min_hits': bundle.inputData?.[`${keyPrefix}min_hits`],
            'max_hits': bundle.inputData?.[`${keyPrefix}max_hits`],
            'min_turns': bundle.inputData?.[`${keyPrefix}min_turns`],
            'max_turns': bundle.inputData?.[`${keyPrefix}max_turns`],
            'drain': bundle.inputData?.[`${keyPrefix}drain`],
            'healing': bundle.inputData?.[`${keyPrefix}healing`],
            'crit_rate': bundle.inputData?.[`${keyPrefix}crit_rate`],
            'ailment_chance': bundle.inputData?.[`${keyPrefix}ailment_chance`],
            'flinch_chance': bundle.inputData?.[`${keyPrefix}flinch_chance`],
            'stat_chance': bundle.inputData?.[`${keyPrefix}stat_chance`],
        }
    },
}
