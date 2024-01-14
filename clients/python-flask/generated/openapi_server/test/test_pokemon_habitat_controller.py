import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestPokemonHabitatController(BaseTestCase):
    """PokemonHabitatController integration test stubs"""

    def test_pokemon_habitat_list(self):
        """Test case for pokemon_habitat_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/api/v2/pokemon-habitat/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_habitat_read(self):
        """Test case for pokemon_habitat_read

        
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/api/v2/pokemon-habitat/{id}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
