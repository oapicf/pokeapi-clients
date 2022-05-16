/**
 * The PokeathlonStatController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PokeathlonStatService');
const pokeathlonStat_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokeathlonStat_list);
};

const pokeathlonStat_read = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokeathlonStat_read);
};


module.exports = {
  pokeathlonStat_list,
  pokeathlonStat_read,
};
