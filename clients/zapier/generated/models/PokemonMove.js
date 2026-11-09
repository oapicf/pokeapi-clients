const utils = require('../utils/utils');
const MoveSummary = require('../models/MoveSummary');
const PokemonMoveVersionGroup = require('../models/PokemonMoveVersionGroup');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...MoveSummary.fields(`${keyPrefix}move`, isInput),
            {
                key: `${keyPrefix}version_group_details`,
                label: `[${labelPrefix}version_group_details]`,
                children: PokemonMoveVersionGroup.fields(`${keyPrefix}version_group_details${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'move': utils.removeIfEmpty(MoveSummary.mapping(bundle, `${keyPrefix}move`)),
            'version_group_details': utils.childMapping(bundle.inputData?.[`${keyPrefix}version_group_details`], `${keyPrefix}version_group_details`, PokemonMoveVersionGroup),
        }
    },
}
