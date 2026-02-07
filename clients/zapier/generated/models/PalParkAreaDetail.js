const utils = require('../utils/utils');
const PalParkAreaDetail_pokemon_encounters_inner = require('../models/PalParkAreaDetail_pokemon_encounters_inner');
const PalParkAreaName = require('../models/PalParkAreaName');

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
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: PalParkAreaName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}pokemon_encounters`,
                label: `[${labelPrefix}pokemon_encounters]`,
                children: PalParkAreaDetail_pokemon_encounters_inner.fields(`${keyPrefix}pokemon_encounters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, PalParkAreaName),
            'pokemon_encounters': utils.childMapping(bundle.inputData?.[`${keyPrefix}pokemon_encounters`], `${keyPrefix}pokemon_encounters`, PalParkAreaDetail_pokemon_encounters_inner),
        }
    },
}
