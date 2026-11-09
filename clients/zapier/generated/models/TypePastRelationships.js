const utils = require('../utils/utils');
const GenerationSummary = require('../models/GenerationSummary');
const TypeRelationships = require('../models/TypeRelationships');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...GenerationSummary.fields(`${keyPrefix}generation`, isInput),
            ...TypeRelationships.fields(`${keyPrefix}damage_relations`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'generation': utils.removeIfEmpty(GenerationSummary.mapping(bundle, `${keyPrefix}generation`)),
            'damage_relations': utils.removeIfEmpty(TypeRelationships.mapping(bundle, `${keyPrefix}damage_relations`)),
        }
    },
}
