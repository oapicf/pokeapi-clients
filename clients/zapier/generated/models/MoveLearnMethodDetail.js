const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const MoveLearnMethodDescription = require('../models/MoveLearnMethodDescription');
const MoveLearnMethodName = require('../models/MoveLearnMethodName');

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
                children: MoveLearnMethodName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}descriptions`,
                label: `[${labelPrefix}descriptions]`,
                children: MoveLearnMethodDescription.fields(`${keyPrefix}descriptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}version_groups`,
                label: `[${labelPrefix}version_groups]`,
                children: AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version_groups${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, MoveLearnMethodName),
            'descriptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}descriptions`], `${keyPrefix}descriptions`, MoveLearnMethodDescription),
            'version_groups': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_groups`], `${keyPrefix}version_groups`, AbilityDetail_pokemon_inner_pokemon),
        }
    },
}
