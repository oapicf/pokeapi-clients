const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const PokemonAbilityPast = require('../models/PokemonAbilityPast');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}abilities`,
                label: `[${labelPrefix}abilities]`,
                children: PokemonAbilityPast.fields(`${keyPrefix}abilities${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'abilities': utils.childMapping(bundle.inputData?.[`${keyPrefix}abilities`], `${keyPrefix}abilities`, PokemonAbilityPast),
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
        }
    },
}
