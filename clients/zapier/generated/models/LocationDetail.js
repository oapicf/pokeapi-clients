const utils = require('../utils/utils');
const LocationAreaSummary = require('../models/LocationAreaSummary');
const LocationGameIndex = require('../models/LocationGameIndex');
const LocationName = require('../models/LocationName');
const RegionSummary = require('../models/RegionSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...RegionSummary.fields(`${keyPrefix}region`, isInput),
            {
                key: `${keyPrefix}names`,
                label: `[${labelPrefix}names]`,
                children: LocationName.fields(`${keyPrefix}names${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}game_indices`,
                label: `[${labelPrefix}game_indices]`,
                children: LocationGameIndex.fields(`${keyPrefix}game_indices${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}areas`,
                label: `[${labelPrefix}areas]`,
                children: LocationAreaSummary.fields(`${keyPrefix}areas${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'region': utils.removeIfEmpty(RegionSummary.mapping(bundle, `${keyPrefix}region`)),
            'names': utils.childMapping(bundle.inputData?.[`${keyPrefix}names`], `${keyPrefix}names`, LocationName),
            'game_indices': utils.childMapping(bundle.inputData?.[`${keyPrefix}game_indices`], `${keyPrefix}game_indices`, LocationGameIndex),
            'areas': utils.childMapping(bundle.inputData?.[`${keyPrefix}areas`], `${keyPrefix}areas`, LocationAreaSummary),
        }
    },
}
