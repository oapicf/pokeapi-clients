require 'pokeapi_client'

describe 'PokemonColorApiClient' do
  before do
  end

  after do
  end

  describe 'test retrieve' do
    it 'should respond with pokemon color detail' do
      api_instance = PokeapiClient::PokemonApi.new

      begin
        result = api_instance.pokemon_color_retrieve('black')
        p result
        expect(result).to be_a(PokeapiClient::PokemonColorDetail)
      rescue PokeapiClient::ApiError => e
        puts "Error when calling PokemonApi->pokemon_color_retrieve: #{e}"
        raise e
      end

    end
  end

end