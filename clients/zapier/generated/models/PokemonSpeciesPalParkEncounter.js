const utils = require('../utils/utils');
const PalParkAreaSummary = require('../models/PalParkAreaSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}base_score`,
                label: `The base score given to the player when the referenced Pokémon is caught during a pal park run. - [${labelPrefix}base_score]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}rate`,
                label: `The base rate for encountering the referenced Pokémon in this pal park area. - [${labelPrefix}rate]`,
                required: true,
                type: 'integer',
            },
            ...PalParkAreaSummary.fields(`${keyPrefix}area`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'base_score': bundle.inputData?.[`${keyPrefix}base_score`],
            'rate': bundle.inputData?.[`${keyPrefix}rate`],
            'area': utils.removeIfEmpty(PalParkAreaSummary.mapping(bundle, `${keyPrefix}area`)),
        }
    },
}
