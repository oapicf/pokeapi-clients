const assert = require('assert');
const PokeapiClient = require('pokeapi-client');

describe('pokemon-color', function() {
  describe('retrieve', function() {
    it('should respond with pokemon color detail', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        console.dir(data);
        assert.equal(data instanceof PokeapiClient.PokemonColorDetail, true);
        assert.equal(response.res.statusCode, 200);
        done();
      };

      const apiClient = new PokeapiClient.PokemonApi();
      apiClient.pokemonColorRetrieve('black', callback);
    });
  });
});