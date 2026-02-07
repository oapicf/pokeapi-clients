/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List contest effects
* Contest effects refer to the effects of moves when used in contests.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedContestEffectSummaryList
* */
const contest_effect_list = ({ limit, offset, q }) => new Promise(
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
* Get contest effect
* Contest effects refer to the effects of moves when used in contests.
*
* id String This parameter can be a string or an integer.
* returns ContestEffectDetail
* */
const contest_effect_retrieve = ({ id }) => new Promise(
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
* List contest types
* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedContestTypeSummaryList
* */
const contest_type_list = ({ limit, offset, q }) => new Promise(
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
* Get contest type
* Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns ContestTypeDetail
* */
const contest_type_retrieve = ({ id }) => new Promise(
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
* List super contest effects
* Super contest effects refer to the effects of moves when used in super contests.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedSuperContestEffectSummaryList
* */
const super_contest_effect_list = ({ limit, offset, q }) => new Promise(
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
* Get super contest effect
* Super contest effects refer to the effects of moves when used in super contests.
*
* id String This parameter can be a string or an integer.
* returns SuperContestEffectDetail
* */
const super_contest_effect_retrieve = ({ id }) => new Promise(
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
  contest_effect_list,
  contest_effect_retrieve,
  contest_type_list,
  contest_type_retrieve,
  super_contest_effect_list,
  super_contest_effect_retrieve,
};
