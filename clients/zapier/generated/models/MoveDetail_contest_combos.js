const utils = require('../utils/utils');
const MoveDetail_contest_combos_normal = require('../models/MoveDetail_contest_combos_normal');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...MoveDetail_contest_combos_normal.fields(`${keyPrefix}normal`, isInput),
            ...MoveDetail_contest_combos_normal.fields(`${keyPrefix}super`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'normal': utils.removeIfEmpty(MoveDetail_contest_combos_normal.mapping(bundle, `${keyPrefix}normal`)),
            'super': utils.removeIfEmpty(MoveDetail_contest_combos_normal.mapping(bundle, `${keyPrefix}super`)),
        }
    },
}
