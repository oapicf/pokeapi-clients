/**
 * The GamesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/GamesService');
const generation_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.generation_list);
};

const generation_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.generation_retrieve);
};

const pokedex_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokedex_list);
};

const pokedex_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokedex_retrieve);
};

const version_group_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.version_group_list);
};

const version_group_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.version_group_retrieve);
};

const version_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.version_list);
};

const version_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.version_retrieve);
};


module.exports = {
  generation_list,
  generation_retrieve,
  pokedex_list,
  pokedex_retrieve,
  version_group_list,
  version_group_retrieve,
  version_list,
  version_retrieve,
};
