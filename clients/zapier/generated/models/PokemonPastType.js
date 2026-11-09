const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const PokemonType = require('../models/PokemonType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}types`,
                label: `[${labelPrefix}types]`,
                children: PokemonType.fields(`${keyPrefix}types${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'types': utils.childMapping(bundle.inputData?.[`${keyPrefix}types`], `${keyPrefix}types`, PokemonType),
        }
    },
}
