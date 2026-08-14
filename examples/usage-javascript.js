var PokeapiClient = require('pokeapi-client');

var api = new PokeapiClient.PokemonApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.pokemonColorRetrieve('black', callback);
