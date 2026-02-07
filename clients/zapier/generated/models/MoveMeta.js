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
                label: `[${labelPrefix}min_hits]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_hits`,
                label: `[${labelPrefix}max_hits]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}min_turns`,
                label: `[${labelPrefix}min_turns]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}max_turns`,
                label: `[${labelPrefix}max_turns]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}drain`,
                label: `[${labelPrefix}drain]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}healing`,
                label: `[${labelPrefix}healing]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}crit_rate`,
                label: `[${labelPrefix}crit_rate]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}ailment_chance`,
                label: `[${labelPrefix}ailment_chance]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}flinch_chance`,
                label: `[${labelPrefix}flinch_chance]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}stat_chance`,
                label: `[${labelPrefix}stat_chance]`,
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
