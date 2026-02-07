const utils = require('../utils/utils');
const AbilityDetail_pokemon_inner_pokemon = require('../models/AbilityDetail_pokemon_inner_pokemon');
const MoveDetail_machines_inner_machine = require('../models/MoveDetail_machines_inner_machine');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...MoveDetail_machines_inner_machine.fields(`${keyPrefix}machine`, isInput),
            ...AbilityDetail_pokemon_inner_pokemon.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'machine': utils.removeIfEmpty(MoveDetail_machines_inner_machine.mapping(bundle, `${keyPrefix}machine`)),
            'version_group': utils.removeIfEmpty(AbilityDetail_pokemon_inner_pokemon.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
