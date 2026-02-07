/**
 * The LocationController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/LocationService');
const location_area_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.location_area_list);
};

const location_area_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.location_area_retrieve);
};

const location_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.location_list);
};

const location_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.location_retrieve);
};

const pal_park_area_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pal_park_area_list);
};

const pal_park_area_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pal_park_area_retrieve);
};

const region_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.region_list);
};

const region_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.region_retrieve);
};


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
