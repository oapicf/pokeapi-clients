/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List encounter conditions
* Conditions which affect what pokemon might appear in the wild, e.g., day or night.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEncounterConditionSummaryList
* */
const encounter_condition_list = ({ limit, offset, q }) => new Promise(
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
* Get encounter condition
* Conditions which affect what pokemon might appear in the wild, e.g., day or night.
*
* id String This parameter can be a string or an integer.
* returns EncounterConditionDetail
* */
const encounter_condition_retrieve = ({ id }) => new Promise(
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
* List encounter condition values
* Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEncounterConditionValueSummaryList
* */
const encounter_condition_value_list = ({ limit, offset, q }) => new Promise(
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
* Get encounter condition value
* Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
*
* id String This parameter can be a string or an integer.
* returns EncounterConditionValueDetail
* */
const encounter_condition_value_retrieve = ({ id }) => new Promise(
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
* List encounter methods
* Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEncounterMethodSummaryList
* */
const encounter_method_list = ({ limit, offset, q }) => new Promise(
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
* Get encounter method
* Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
*
* id String This parameter can be a string or an integer.
* returns EncounterMethodDetail
* */
const encounter_method_retrieve = ({ id }) => new Promise(
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
* Get pokemon encounter
* Handles Pokemon Encounters as a sub-resource.
*
* pokemonUnderscoreid String 
* returns List
* */
const pokemon_encounters_retrieve = ({ pokemonUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pokemonUnderscoreid,
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
  encounter_condition_list,
  encounter_condition_retrieve,
  encounter_condition_value_list,
  encounter_condition_value_retrieve,
  encounter_method_list,
  encounter_method_retrieve,
  pokemon_encounters_retrieve,
};
