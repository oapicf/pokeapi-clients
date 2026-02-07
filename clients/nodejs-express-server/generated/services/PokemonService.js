/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedAbilitySummaryList
* */
const ability_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns AbilityDetail
* */
const ability_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List charecterictics
* Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedCharacteristicSummaryList
* */
const characteristic_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get characteristic
* Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns CharacteristicDetail
* */
const characteristic_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List egg groups
* Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEggGroupSummaryList
* */
const egg_group_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get egg group
* Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns EggGroupDetail
* */
const egg_group_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List genders
* Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedGenderSummaryList
* */
const gender_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get gender
* Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns GenderDetail
* */
const gender_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List growth rates
* Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedGrowthRateSummaryList
* */
const growth_rate_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get growth rate
* Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns GrowthRateDetail
* */
const growth_rate_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List move damage classes
* Damage classes moves can have, e.g. physical, special, or non-damaging.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedMoveDamageClassSummaryList
* */
const move_damage_class_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get move damage class
* Damage classes moves can have, e.g. physical, special, or non-damaging.
*
* id String This parameter can be a string or an integer.
* returns MoveDamageClassDetail
* */
const move_damage_class_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List natures
* Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedNatureSummaryList
* */
const nature_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get nature
* Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns NatureDetail
* */
const nature_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokeathlon stats
* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokeathlonStatSummaryList
* */
const pokeathlon_stat_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokeathlon stat
* Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns PokeathlonStatDetail
* */
const pokeathlon_stat_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemon colors
* Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonColorSummaryList
* */
const pokemon_color_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemon color
* Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
*
* id String This parameter can be a string or an integer.
* returns PokemonColorDetail
* */
const pokemon_color_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemon forms
* Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonFormSummaryList
* */
const pokemon_form_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemon form
* Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
*
* id String This parameter can be a string or an integer.
* returns PokemonFormDetail
* */
const pokemon_form_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemom habitas
* Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonHabitatSummaryList
* */
const pokemon_habitat_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemom habita
* Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
*
* id String This parameter can be a string or an integer.
* returns PokemonHabitatDetail
* */
const pokemon_habitat_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemon
* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonSummaryList
* */
const pokemon_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemon
* Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns PokemonDetail
* */
const pokemon_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemon shapes
* Shapes used for sorting Pokémon in a Pokédex.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonShapeSummaryList
* */
const pokemon_shape_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemon shape
* Shapes used for sorting Pokémon in a Pokédex.
*
* id String This parameter can be a string or an integer.
* returns PokemonShapeDetail
* */
const pokemon_shape_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List pokemon species
* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPokemonSpeciesSummaryList
* */
const pokemon_species_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get pokemon species
* A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
*
* id String This parameter can be a string or an integer.
* returns PokemonSpeciesDetail
* */
const pokemon_species_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List stats
* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedStatSummaryList
* */
const stat_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get stat
* Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
*
* id String This parameter can be a string or an integer.
* returns StatDetail
* */
const stat_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* List types
* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedTypeSummaryList
* */
const type_list = ({ limit, offset, q }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
        q,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get types
* Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
*
* id String This parameter can be a string or an integer.
* returns TypeDetail
* */
const type_retrieve = ({ id }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        id,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  ability_list,
  ability_retrieve,
  characteristic_list,
  characteristic_retrieve,
  egg_group_list,
  egg_group_retrieve,
  gender_list,
  gender_retrieve,
  growth_rate_list,
  growth_rate_retrieve,
  move_damage_class_list,
  move_damage_class_retrieve,
  nature_list,
  nature_retrieve,
  pokeathlon_stat_list,
  pokeathlon_stat_retrieve,
  pokemon_color_list,
  pokemon_color_retrieve,
  pokemon_form_list,
  pokemon_form_retrieve,
  pokemon_habitat_list,
  pokemon_habitat_retrieve,
  pokemon_list,
  pokemon_retrieve,
  pokemon_shape_list,
  pokemon_shape_retrieve,
  pokemon_species_list,
  pokemon_species_retrieve,
  stat_list,
  stat_retrieve,
  type_list,
  type_retrieve,
};
