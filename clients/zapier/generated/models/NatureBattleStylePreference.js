const utils = require('../utils/utils');
const MoveBattleStyleSummary = require('../models/MoveBattleStyleSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}low_hp_preference`,
                label: `[${labelPrefix}low_hp_preference]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}high_hp_preference`,
                label: `[${labelPrefix}high_hp_preference]`,
                required: true,
                type: 'integer',
            },
            ...MoveBattleStyleSummary.fields(`${keyPrefix}move_battle_style`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'low_hp_preference': bundle.inputData?.[`${keyPrefix}low_hp_preference`],
            'high_hp_preference': bundle.inputData?.[`${keyPrefix}high_hp_preference`],
            'move_battle_style': utils.removeIfEmpty(MoveBattleStyleSummary.mapping(bundle, `${keyPrefix}move_battle_style`)),
        }
    },
}
