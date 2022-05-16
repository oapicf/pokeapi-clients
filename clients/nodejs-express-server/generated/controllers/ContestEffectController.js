/**
 * The ContestEffectController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ContestEffectService');
const contestEffect_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.contestEffect_list);
};

const contestEffect_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.contestEffect_read);
};


module.exports = {
  contestEffect_list,
  contestEffect_read,
};
