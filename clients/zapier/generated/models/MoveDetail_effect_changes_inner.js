const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const MoveDetail_effect_changes_inner_effect_entries_inner = require('../models/MoveDetail_effect_changes_inner_effect_entries_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: MoveDetail_effect_changes_inner_effect_entries_inner.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, MoveDetail_effect_changes_inner_effect_entries_inner),
            'version_group': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
