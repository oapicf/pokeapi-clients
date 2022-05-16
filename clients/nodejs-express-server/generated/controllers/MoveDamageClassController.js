/**
 * The MoveDamageClassController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MoveDamageClassService');
const moveDamageClass_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.moveDamageClass_list);
};

const moveDamageClass_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.moveDamageClass_read);
};


module.exports = {
  moveDamageClass_list,
  moveDamageClass_read,
};
