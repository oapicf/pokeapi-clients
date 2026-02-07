/**
 * The PokemonController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic routes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/PokemonService');
const ability_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.ability_list);
};

const ability_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.ability_retrieve);
};

const characteristic_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.characteristic_list);
};

const characteristic_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.characteristic_retrieve);
};

const egg_group_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.egg_group_list);
};

const egg_group_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.egg_group_retrieve);
};

const gender_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.gender_list);
};

const gender_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.gender_retrieve);
};

const growth_rate_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.growth_rate_list);
};

const growth_rate_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.growth_rate_retrieve);
};

const move_damage_class_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_damage_class_list);
};

const move_damage_class_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.move_damage_class_retrieve);
};

const nature_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.nature_list);
};

const nature_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.nature_retrieve);
};

const pokeathlon_stat_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokeathlon_stat_list);
};

const pokeathlon_stat_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokeathlon_stat_retrieve);
};

const pokemon_color_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_color_list);
};

const pokemon_color_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_color_retrieve);
};

const pokemon_form_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_form_list);
};

const pokemon_form_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_form_retrieve);
};

const pokemon_habitat_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_habitat_list);
};

const pokemon_habitat_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_habitat_retrieve);
};

const pokemon_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_list);
};

const pokemon_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_retrieve);
};

const pokemon_shape_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_shape_list);
};

const pokemon_shape_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_shape_retrieve);
};

const pokemon_species_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_species_list);
};

const pokemon_species_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.pokemon_species_retrieve);
};

const stat_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.stat_list);
};

const stat_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.stat_retrieve);
};

const type_list = async (request, response) => {
  await Controller.handleRequest(request, response, service.type_list);
};

const type_retrieve = async (request, response) => {
  await Controller.handleRequest(request, response, service.type_retrieve);
};


module.exports = {
  ability_list,
  ability_retrieve,
  characteristic_list,
  characteristic_retrieve,
  egg_group_list,
  egg_group_retrieve,
  gender_list,
  gender_retrieve,
  growth_rate_list,
  growth_rate_retrieve,
  move_damage_class_list,
  move_damage_class_retrieve,
  nature_list,
  nature_retrieve,
  pokeathlon_stat_list,
  pokeathlon_stat_retrieve,
  pokemon_color_list,
  pokemon_color_retrieve,
  pokemon_form_list,
  pokemon_form_retrieve,
  pokemon_habitat_list,
  pokemon_habitat_retrieve,
  pokemon_list,
  pokemon_retrieve,
  pokemon_shape_list,
  pokemon_shape_retrieve,
  pokemon_species_list,
  pokemon_species_retrieve,
  stat_list,
  stat_retrieve,
  type_list,
  type_retrieve,
};
