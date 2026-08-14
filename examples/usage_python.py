import pokeapiclient
from pokeapiclient.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://pokeapi.co
# See configuration.py for a list of all supported configuration parameters.
configuration = pokeapiclient.Configuration(
    host = "https://pokeapi.co"
)

# Enter a context with an instance of the API client
with pokeapiclient.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pokeapiclient.PokemonApi(api_client)

    try:
        # Retrieve pokemon color detail
        api_response = api_instance.pokemon_color_retrieve('black')
        print("The response of PokemonApi->pokemon_color_retrieve:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling PokemonApi->pokemon_color_retrieve: %s\n" % e)
        raise
