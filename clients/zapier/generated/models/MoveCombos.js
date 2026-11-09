const utils = require('../utils/utils');
const MoveComboUsage = require('../models/MoveComboUsage');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...MoveComboUsage.fields(`${keyPrefix}normal`, isInput),
            ...MoveComboUsage.fields(`${keyPrefix}super`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'normal': utils.removeIfEmpty(MoveComboUsage.mapping(bundle, `${keyPrefix}normal`)),
            'super': utils.removeIfEmpty(MoveComboUsage.mapping(bundle, `${keyPrefix}super`)),
        }
    },
}
