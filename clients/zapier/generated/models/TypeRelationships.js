const utils = require('../utils/utils');
const TypeSummary = require('../models/TypeSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}no_damage_to`,
                label: `[${labelPrefix}no_damage_to]`,
                children: TypeSummary.fields(`${keyPrefix}no_damage_to${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}half_damage_to`,
                label: `[${labelPrefix}half_damage_to]`,
                children: TypeSummary.fields(`${keyPrefix}half_damage_to${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}double_damage_to`,
                label: `[${labelPrefix}double_damage_to]`,
                children: TypeSummary.fields(`${keyPrefix}double_damage_to${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}no_damage_from`,
                label: `[${labelPrefix}no_damage_from]`,
                children: TypeSummary.fields(`${keyPrefix}no_damage_from${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}half_damage_from`,
                label: `[${labelPrefix}half_damage_from]`,
                children: TypeSummary.fields(`${keyPrefix}half_damage_from${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}double_damage_from`,
                label: `[${labelPrefix}double_damage_from]`,
                children: TypeSummary.fields(`${keyPrefix}double_damage_from${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'no_damage_to': utils.childMapping(bundle.inputData?.[`${keyPrefix}no_damage_to`], `${keyPrefix}no_damage_to`, TypeSummary),
            'half_damage_to': utils.childMapping(bundle.inputData?.[`${keyPrefix}half_damage_to`], `${keyPrefix}half_damage_to`, TypeSummary),
            'double_damage_to': utils.childMapping(bundle.inputData?.[`${keyPrefix}double_damage_to`], `${keyPrefix}double_damage_to`, TypeSummary),
            'no_damage_from': utils.childMapping(bundle.inputData?.[`${keyPrefix}no_damage_from`], `${keyPrefix}no_damage_from`, TypeSummary),
            'half_damage_from': utils.childMapping(bundle.inputData?.[`${keyPrefix}half_damage_from`], `${keyPrefix}half_damage_from`, TypeSummary),
            'double_damage_from': utils.childMapping(bundle.inputData?.[`${keyPrefix}double_damage_from`], `${keyPrefix}double_damage_from`, TypeSummary),
        }
    },
}
