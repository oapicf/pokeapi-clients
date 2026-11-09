const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const PokemonStat = require('../models/PokemonStat');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            {
                key: `${keyPrefix}stats`,
                label: `[${labelPrefix}stats]`,
                children: PokemonStat.fields(`${keyPrefix}stats${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'stats': utils.childMapping(bundle.inputData?.[`${keyPrefix}stats`], `${keyPrefix}stats`, PokemonStat),
        }
    },
}
