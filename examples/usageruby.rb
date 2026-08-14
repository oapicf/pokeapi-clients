# Load the gem
require 'pokeapi_client'

api_instance = PokeApiClient::PokemonApi.new

begin
  # Use debug_auth_names: [] to skip auth (avoids cookie auth issue)
  result = api_instance.pokemon_color_retrieve('black', { debug_auth_names: [] })
  p result
rescue PokeApiClient::ApiError => e
  puts "Exception when calling PokemonApi->pokemon_color_retrieve: #{e}"
  raise
end
