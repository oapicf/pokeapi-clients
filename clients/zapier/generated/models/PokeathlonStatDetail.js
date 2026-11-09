const utils = require('../utils/utils');
const PokeathlonStatAffectingNatures = require('../models/PokeathlonStatAffectingNatures');
const PokeathlonStatName = require('../models/PokeathlonStatName');

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
            ...PokeathlonStatAffectingNatures.fields(`${keyPrefix}affecting_natures`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PokeathlonStatName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'affecting_natures': utils.removeIfEmpty(PokeathlonStatAffectingNatures.mapping(bundle, `${keyPrefix}affecting_natures`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PokeathlonStatName),
        }
    },
}
