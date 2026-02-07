require 'pokeapi_client'

describe 'PokemonColorApiClient' do
  before do
  end

  after do
  end

  describe 'test retrieve' do
    it 'should respond with pokemon color detail' do
      api_instance = PokeApiClient::PokemonApi.new

      begin
        # Use debug_auth_names: [] to skip auth (avoids cookie auth issue)
        result = api_instance.pokemon_color_retrieve('black', { debug_auth_names: [] })
        p result
        expect(result).to be_a(PokeApiClient::PokemonColorDetail)
      rescue PokeApiClient::ApiError => e
        puts "Error when calling PokemonApi->pokemon_color_retrieve: #{e}"
        raise e
      end

    end
  end

end