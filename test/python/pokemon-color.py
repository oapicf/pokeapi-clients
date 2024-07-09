import unittest
import pokeapiclient
from pokeapiclient.rest import ApiException
from pprint import pprint

class TestPokemonColor(unittest.TestCase):

    def test_pokemon_color_list(self):

      configuration = pokeapiclient.Configuration(
          host = "https://pokeapi.co"
      )

      with pokeapiclient.ApiClient(configuration) as api_client:

          api_instance = pokeapiclient.PokemonColorApi(api_client)

          try:
              api_response = api_instance.pokemon_color_list(limit=100, offset=1)
              print("The response of PokemonColorApi->pokemon_color_list:\n")
              pprint(api_response)
          except ApiException as e:
              self.fail('Exception when calling PokemonColorApi->pokemon_color_list: %s\n' % e)