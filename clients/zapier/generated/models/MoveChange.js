const utils = require('../utils/utils');
const MoveEffectEffectText = require('../models/MoveEffectEffectText');
const TypeSummary = require('../models/TypeSummary');
const VersionGroupSummary = require('../models/VersionGroupSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accuracy`,
                label: `The percent value of how likely this move is to be successful. - [${labelPrefix}accuracy]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}power`,
                label: `The base power before the listed version group, or null if power did not change. - [${labelPrefix}power]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pp`,
                label: `Power points. The number of times this move can be used. - [${labelPrefix}pp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effect_chance`,
                label: `The percent value of how likely it is this moves effect will take effect. - [${labelPrefix}effect_chance]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}effect_entries`,
                label: `[${labelPrefix}effect_entries]`,
                children: MoveEffectEffectText.fields(`${keyPrefix}effect_entries${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...TypeSummary.fields(`${keyPrefix}type`, isInput),
            ...VersionGroupSummary.fields(`${keyPrefix}version_group`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accuracy': bundle.inputData?.[`${keyPrefix}accuracy`],
            'power': bundle.inputData?.[`${keyPrefix}power`],
            'pp': bundle.inputData?.[`${keyPrefix}pp`],
            'effect_chance': bundle.inputData?.[`${keyPrefix}effect_chance`],
            'effect_entries': utils.childMapping(bundle.inputData?.[`${keyPrefix}effect_entries`], `${keyPrefix}effect_entries`, MoveEffectEffectText),
            'type': utils.removeIfEmpty(TypeSummary.mapping(bundle, `${keyPrefix}type`)),
            'version_group': utils.removeIfEmpty(VersionGroupSummary.mapping(bundle, `${keyPrefix}version_group`)),
        }
    },
}
