/**
 * The CharacteristicController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/CharacteristicService');
const characteristic_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.characteristic_list);
};

const characteristic_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.characteristic_read);
};


module.exports = {
  characteristic_list,
  characteristic_read,
};
