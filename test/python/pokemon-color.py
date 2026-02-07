import unittest
import pokeapiclient
from pokeapiclient.rest import ApiException
from pprint import pprint

class TestPokemonColor(unittest.TestCase):

    def test_pokemon_color_retrieve(self):

      configuration = pokeapiclient.Configuration(
          host = "https://pokeapi.co"
      )

      with pokeapiclient.ApiClient(configuration) as api_client:

          api_instance = pokeapiclient.PokemonApi(api_client)

          try:
              api_response = api_instance.pokemon_color_retrieve('black')
              print("The response of PokemonApi->pokemon_color_retrieve:\n")
              pprint(api_response)
              self.assertIsInstance(api_response, pokeapiclient.PokemonColorDetail)
          except ApiException as e:
              self.fail('Exception when calling PokemonApi->pokemon_color_retrieve: %s\n' % e)