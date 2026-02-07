/**
 * The BerriesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BerriesService');
const berry_firmness_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_firmness_list);
};

const berry_firmness_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_firmness_retrieve);
};

const berry_flavor_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_flavor_list);
};

const berry_flavor_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_flavor_retrieve);
};

const berry_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_list);
};

const berry_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.berry_retrieve);
};


module.exports = {
  berry_firmness_list,
  berry_firmness_retrieve,
  berry_flavor_list,
  berry_flavor_retrieve,
  berry_list,
  berry_retrieve,
};
