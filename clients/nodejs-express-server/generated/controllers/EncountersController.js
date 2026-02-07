/**
 * The EncountersController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EncountersService');
const encounter_condition_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_condition_list);
};

const encounter_condition_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_condition_retrieve);
};

const encounter_condition_value_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_condition_value_list);
};

const encounter_condition_value_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_condition_value_retrieve);
};

const encounter_method_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_method_list);
};

const encounter_method_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.encounter_method_retrieve);
};

const pokemon_encounters_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_encounters_retrieve);
};


module.exports = {
  encounter_condition_list,
  encounter_condition_retrieve,
  encounter_condition_value_list,
  encounter_condition_value_retrieve,
  encounter_method_list,
  encounter_method_retrieve,
  pokemon_encounters_retrieve,
};
