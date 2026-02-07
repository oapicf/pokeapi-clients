const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const MoveMetaAilmentName = require('../models/MoveMetaAilmentName');

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
                key: `${keyPrefix}moves`,
                label: `[${labelPrefix}moves]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}moves${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: MoveMetaAilmentName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'moves': utils.childMapping(bundle.inputData?.[`${keyPrefix}moves`], `${keyPrefix}moves`, AbilityDetail_pokemon_inner_pokemon),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, MoveMetaAilmentName),
        }
    },
}
