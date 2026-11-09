const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');
const PokemonSpritesOther = require('../models/PokemonSpritesOther');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}front_default`,
                label: `The default depiction of this Pokémon from the front in battle. - [${labelPrefix}front_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_shiny`,
                label: `The shiny depiction of this Pokémon from the front in battle. - [${labelPrefix}front_shiny]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_female`,
                label: `The female depiction of this Pokémon from the front in battle. - [${labelPrefix}front_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}front_shiny_female`,
                label: `The shiny female depiction of this Pokémon from the front in battle. - [${labelPrefix}front_shiny_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_default`,
                label: `The default depiction of this Pokémon from the back in battle. - [${labelPrefix}back_default]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_shiny`,
                label: `The shiny depiction of this Pokémon from the back in battle. - [${labelPrefix}back_shiny]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_female`,
                label: `The female depiction of this Pokémon from the back in battle. - [${labelPrefix}back_female]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}back_shiny_female`,
                label: `The shiny female depiction of this Pokémon from the back in battle. - [${labelPrefix}back_shiny_female]`,
                required: true,
                type: 'string',
            },
            ...PokemonSpritesOther.fields(`${keyPrefix}other`, isInput),
            {
                key: `${keyPrefix}versions`,
                label: `Sprites grouped by generation and game. Available keys vary by resource. - [${labelPrefix}versions]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'front_default': bundle.inputData?.[`${keyPrefix}front_default`],
            'front_shiny': bundle.inputData?.[`${keyPrefix}front_shiny`],
            'front_female': bundle.inputData?.[`${keyPrefix}front_female`],
            'front_shiny_female': bundle.inputData?.[`${keyPrefix}front_shiny_female`],
            'back_default': bundle.inputData?.[`${keyPrefix}back_default`],
            'back_shiny': bundle.inputData?.[`${keyPrefix}back_shiny`],
            'back_female': bundle.inputData?.[`${keyPrefix}back_female`],
            'back_shiny_female': bundle.inputData?.[`${keyPrefix}back_shiny_female`],
            'other': utils.removeIfEmpty(PokemonSpritesOther.mapping(bundle, `${keyPrefix}other`)),
            'versions': bundle.inputData?.[`${keyPrefix}versions`],
        }
    },
}
