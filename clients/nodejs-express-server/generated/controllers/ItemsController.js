/**
 * The ItemsController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ItemsService');
const item_attribute_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_attribute_list);
};

const item_attribute_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_attribute_retrieve);
};

const item_category_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_category_list);
};

const item_category_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_category_retrieve);
};

const item_fling_effect_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_fling_effect_list);
};

const item_fling_effect_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_fling_effect_retrieve);
};

const item_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_list);
};

const item_pocket_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_pocket_list);
};

const item_pocket_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_pocket_retrieve);
};

const item_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.item_retrieve);
};


module.exports = {
  item_attribute_list,
  item_attribute_retrieve,
  item_category_list,
  item_category_retrieve,
  item_fling_effect_list,
  item_fling_effect_retrieve,
  item_list,
  item_pocket_list,
  item_pocket_retrieve,
  item_retrieve,
};
