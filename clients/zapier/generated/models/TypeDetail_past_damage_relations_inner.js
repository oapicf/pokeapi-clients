const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const TypeDetail_past_damage_relations_inner_damage_relations = require('../models/TypeDetail_past_damage_relations_inner_damage_relations');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}generation`, isInput),
            ...TypeDetail_past_damage_relations_inner_damage_relations.fields(`${keyPrefix}damage_relations`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generation': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}generation`)),
            'damage_relations': utils.removeIfEmpty(TypeDetail_past_damage_relations_inner_damage_relations.mapping(bundle, `${keyPrefix}damage_relations`)),
        }
    },
}
