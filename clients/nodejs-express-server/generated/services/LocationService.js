/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List location areas
* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* returns PaginatedLocationAreaSummaryList
* */
const location_area_list = ({ limit, offset }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        limit,
        offset,
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
* Get location area
* Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
*
* id Integer A unique integer value identifying this location area.
* returns LocationAreaDetail
* */
const location_area_retrieve = ({ id }) => new Promise(
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
* List locations
* Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedLocationSummaryList
* */
const location_list = ({ limit, offset, q }) => new Promise(
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
* Get location
* Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
*
* id String This parameter can be a string or an integer.
* returns LocationDetail
* */
const location_retrieve = ({ id }) => new Promise(
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
* List pal park areas
* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedPalParkAreaSummaryList
* */
const pal_park_area_list = ({ limit, offset, q }) => new Promise(
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
* Get pal park area
* Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.
*
* id String This parameter can be a string or an integer.
* returns PalParkAreaDetail
* */
const pal_park_area_retrieve = ({ id }) => new Promise(
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
* List regions
* A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
*
* limit Integer Number of results to return per page. (optional)
* offset Integer The initial index from which to return the results. (optional)
* q String > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
* returns PaginatedRegionSummaryList
* */
const region_list = ({ limit, offset, q }) => new Promise(
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
* Get region
* A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
*
* id String This parameter can be a string or an integer.
* returns RegionDetail
* */
const region_retrieve = ({ id }) => new Promise(
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
  location_area_list,
  location_area_retrieve,
  location_list,
  location_retrieve,
  pal_park_area_list,
  pal_park_area_retrieve,
  region_list,
  region_retrieve,
};
