const assert = require('assert');
const PokeapiClient = require('pokeapi-client');

describe('pokemon-color', function() {
  describe('list', function() {
    it('should respond with colors list', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        console.dir(data);
        assert.equal(typeof data, 'string'); // response schema hasn't been added to spec
        assert.equal(response.res.statusCode, 200);
        done();
      };

      const apiClient = new PokeapiClient.PokemonColorApi();
      let opts = {
        'limit': 100,
        'offset': 1
      };
      apiClient.pokemonColorList(opts, callback);
    });
  });
});