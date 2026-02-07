/**
 * The MovesController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/MovesService');
const move_ailment_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_ailment_list);
};

const move_ailment_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_ailment_retrieve);
};

const move_battle_style_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_battle_style_list);
};

const move_battle_style_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_battle_style_retrieve);
};

const move_category_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_category_list);
};

const move_category_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_category_retrieve);
};

const move_learn_method_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_learn_method_list);
};

const move_learn_method_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_learn_method_retrieve);
};

const move_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_list);
};

const move_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_retrieve);
};

const move_target_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_target_list);
};

const move_target_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_target_retrieve);
};


module.exports = {
  move_ailment_list,
  move_ailment_retrieve,
  move_battle_style_list,
  move_battle_style_retrieve,
  move_category_list,
  move_category_retrieve,
  move_learn_method_list,
  move_learn_method_retrieve,
  move_list,
  move_retrieve,
  move_target_list,
  move_target_retrieve,
};
