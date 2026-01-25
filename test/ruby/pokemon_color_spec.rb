require 'pokeapi_client'

describe 'PokemonColorApiClient' do
  before do
  end

  after do
  end

  describe 'test list' do
    it 'should respond with colors list' do
      api_instance = PokeApiClient::PokemonColorApi.new
      opts = {
        limit: 100,
        offset: 1
      }

      begin
        result = api_instance.pokemon_color_list(opts)
        p result
      rescue PokeApiClient::ApiError => e
        puts "Error when calling PokemonColorApi->pokemon_color_list: #{e}"
      end

    end
  end

end