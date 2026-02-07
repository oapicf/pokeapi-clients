/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List evolution chains
* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEvolutionChainSummaryList
* */
const evolution_chain_list = ({ limit, offset, q }) => new Promise(
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
* Get evolution chain
* Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
*
* id String This parameter can be a string or an integer.
* returns EvolutionChainDetail
* */
const evolution_chain_retrieve = ({ id }) => new Promise(
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
* List evolution triggers
* Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedEvolutionTriggerSummaryList
* */
const evolution_trigger_list = ({ limit, offset, q }) => new Promise(
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
* Get evolution trigger
* Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
*
* id String This parameter can be a string or an integer.
* returns EvolutionTriggerDetail
* */
const evolution_trigger_retrieve = ({ id }) => new Promise(
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
  evolution_chain_list,
  evolution_chain_retrieve,
  evolution_trigger_list,
  evolution_trigger_retrieve,
};
