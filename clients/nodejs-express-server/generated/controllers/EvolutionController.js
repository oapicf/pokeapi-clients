/**
 * The EvolutionController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/EvolutionService');
const evolution_chain_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.evolution_chain_list);
};

const evolution_chain_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.evolution_chain_retrieve);
};

const evolution_trigger_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.evolution_trigger_list);
};

const evolution_trigger_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.evolution_trigger_retrieve);
};


module.exports = {
  evolution_chain_list,
  evolution_chain_retrieve,
  evolution_trigger_list,
  evolution_trigger_retrieve,
};
