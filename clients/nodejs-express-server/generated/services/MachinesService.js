/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List machines
* Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedMachineSummaryList
* */
const machine_list = ({ limit, offset, q }) => new Promise(
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
* Get machine
* Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
*
* id String This parameter can be a string or an integer.
* returns MachineDetail
* */
const machine_retrieve = ({ id }) => new Promise(
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
  machine_list,
  machine_retrieve,
};
