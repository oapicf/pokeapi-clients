const utils = require('../utils/utils');
const MoveLearnMethodSummary = require('../models/MoveLearnMethodSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}level_learned_at`,
                label: `The minimum level to learn the move. - [${labelPrefix}level_learned_at]`,
                required: true,
                type: 'integer',
            },
            ...MoveLearnMethodSummary.fields(`${keyPrefix}move_learn_method`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
            {
                key: `${keyPrefix}order`,
                label: `Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. - [${labelPrefix}order]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'level_learned_at': bundle.inputData?.[`${keyPrefix}level_learned_at`],
            'move_learn_method': utils.removeIfEmpty(MoveLearnMethodSummary.mapping(bundle, `${keyPrefix}move_learn_method`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
            'order': bundle.inputData?.[`${keyPrefix}order`],
        }
    },
}
