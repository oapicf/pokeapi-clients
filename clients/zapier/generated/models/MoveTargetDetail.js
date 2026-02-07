const utils = require('../utils/utils');
const MoveSummary = require('../models/MoveSummary');
const MoveTargetDescription = require('../models/MoveTargetDescription');
const MoveTargetName = require('../models/MoveTargetName');

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
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: MoveTargetDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: MoveSummary.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: MoveTargetName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, MoveTargetDescription),
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, MoveSummary),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, MoveTargetName),
        }
    },
}
