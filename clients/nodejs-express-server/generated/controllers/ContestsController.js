/**
 * The ContestsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ContestsService');
const contest_effect_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.contest_effect_list);
};

const contest_effect_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.contest_effect_retrieve);
};

const contest_type_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.contest_type_list);
};

const contest_type_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.contest_type_retrieve);
};

const super_contest_effect_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.super_contest_effect_list);
};

const super_contest_effect_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.super_contest_effect_retrieve);
};


module.exports = {
  contest_effect_list,
  contest_effect_retrieve,
  contest_type_list,
  contest_type_retrieve,
  super_contest_effect_list,
  super_contest_effect_retrieve,
};
