const utils = require('../utils/utils');
const PokemonSpritesOtherDreamWorld = require('../models/PokemonSpritesOtherDreamWorld');
const PokemonSpritesOtherHome = require('../models/PokemonSpritesOtherHome');
const PokemonSpritesOtherOfficialArtwork = require('../models/PokemonSpritesOtherOfficialArtwork');
const PokemonSpritesOtherShowdown = require('../models/PokemonSpritesOtherShowdown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PokemonSpritesOtherDreamWorld.fields(`${keyPrefix}dream_world`, isInput),
            ...PokemonSpritesOtherHome.fields(`${keyPrefix}home`, isInput),
            ...PokemonSpritesOtherShowdown.fields(`${keyPrefix}showdown`, isInput),
            ...PokemonSpritesOtherOfficialArtwork.fields(`${keyPrefix}official-artwork`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dream_world': utils.removeIfEmpty(PokemonSpritesOtherDreamWorld.mapping(bundle, `${keyPrefix}dream_world`)),
            'home': utils.removeIfEmpty(PokemonSpritesOtherHome.mapping(bundle, `${keyPrefix}home`)),
            'showdown': utils.removeIfEmpty(PokemonSpritesOtherShowdown.mapping(bundle, `${keyPrefix}showdown`)),
            'official-artwork': utils.removeIfEmpty(PokemonSpritesOtherOfficialArtwork.mapping(bundle, `${keyPrefix}official-artwork`)),
        }
    },
}
