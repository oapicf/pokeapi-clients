import unittest

from flask import json

from openapi_server.models.ability_detail import AbilityDetail  # noqa: E501
from openapi_server.models.characteristic_detail import CharacteristicDetail  # noqa: E501
from openapi_server.models.egg_group_detail import EggGroupDetail  # noqa: E501
from openapi_server.models.gender_detail import GenderDetail  # noqa: E501
from openapi_server.models.growth_rate_detail import GrowthRateDetail  # noqa: E501
from openapi_server.models.move_damage_class_detail import MoveDamageClassDetail  # noqa: E501
from openapi_server.models.nature_detail import NatureDetail  # noqa: E501
from openapi_server.models.paginated_ability_summary_list import PaginatedAbilitySummaryList  # noqa: E501
from openapi_server.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList  # noqa: E501
from openapi_server.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList  # noqa: E501
from openapi_server.models.paginated_gender_summary_list import PaginatedGenderSummaryList  # noqa: E501
from openapi_server.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList  # noqa: E501
from openapi_server.models.paginated_move_damage_class_summary_list import PaginatedMoveDamageClassSummaryList  # noqa: E501
from openapi_server.models.paginated_nature_summary_list import PaginatedNatureSummaryList  # noqa: E501
from openapi_server.models.paginated_pokeathlon_stat_summary_list import PaginatedPokeathlonStatSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_color_summary_list import PaginatedPokemonColorSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_habitat_summary_list import PaginatedPokemonHabitatSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList  # noqa: E501
from openapi_server.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList  # noqa: E501
from openapi_server.models.paginated_stat_summary_list import PaginatedStatSummaryList  # noqa: E501
from openapi_server.models.paginated_type_summary_list import PaginatedTypeSummaryList  # noqa: E501
from openapi_server.models.pokeathlon_stat_detail import PokeathlonStatDetail  # noqa: E501
from openapi_server.models.pokemon_color_detail import PokemonColorDetail  # noqa: E501
from openapi_server.models.pokemon_detail import PokemonDetail  # noqa: E501
from openapi_server.models.pokemon_form_detail import PokemonFormDetail  # noqa: E501
from openapi_server.models.pokemon_habitat_detail import PokemonHabitatDetail  # noqa: E501
from openapi_server.models.pokemon_shape_detail import PokemonShapeDetail  # noqa: E501
from openapi_server.models.pokemon_species_detail import PokemonSpeciesDetail  # noqa: E501
from openapi_server.models.stat_detail import StatDetail  # noqa: E501
from openapi_server.models.type_detail import TypeDetail  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPokemonController(BaseTestCase):
    """PokemonController integration test stubs"""

    def test_ability_list(self):
        """Test case for ability_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/ability/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_ability_retrieve(self):
        """Test case for ability_retrieve

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/ability/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_characteristic_list(self):
        """Test case for characteristic_list

        List charecterictics
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/characteristic/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_characteristic_retrieve(self):
        """Test case for characteristic_retrieve

        Get characteristic
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/characteristic/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_egg_group_list(self):
        """Test case for egg_group_list

        List egg groups
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/egg-group/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_egg_group_retrieve(self):
        """Test case for egg_group_retrieve

        Get egg group
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/egg-group/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_gender_list(self):
        """Test case for gender_list

        List genders
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/gender/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_gender_retrieve(self):
        """Test case for gender_retrieve

        Get gender
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/gender/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_growth_rate_list(self):
        """Test case for growth_rate_list

        List growth rates
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/growth-rate/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_growth_rate_retrieve(self):
        """Test case for growth_rate_retrieve

        Get growth rate
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/growth-rate/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_damage_class_list(self):
        """Test case for move_damage_class_list

        List move damage classes
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-damage-class/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_damage_class_retrieve(self):
        """Test case for move_damage_class_retrieve

        Get move damage class
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-damage-class/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_nature_list(self):
        """Test case for nature_list

        List natures
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/nature/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_nature_retrieve(self):
        """Test case for nature_retrieve

        Get nature
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/nature/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokeathlon_stat_list(self):
        """Test case for pokeathlon_stat_list

        List pokeathlon stats
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokeathlon-stat/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokeathlon_stat_retrieve(self):
        """Test case for pokeathlon_stat_retrieve

        Get pokeathlon stat
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokeathlon-stat/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_color_list(self):
        """Test case for pokemon_color_list

        List pokemon colors
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-color/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_color_retrieve(self):
        """Test case for pokemon_color_retrieve

        Get pokemon color
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-color/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_form_list(self):
        """Test case for pokemon_form_list

        List pokemon forms
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-form/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_form_retrieve(self):
        """Test case for pokemon_form_retrieve

        Get pokemon form
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-form/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_habitat_list(self):
        """Test case for pokemon_habitat_list

        List pokemom habitas
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-habitat/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_habitat_retrieve(self):
        """Test case for pokemon_habitat_retrieve

        Get pokemom habita
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-habitat/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_list(self):
        """Test case for pokemon_list

        List pokemon
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_retrieve(self):
        """Test case for pokemon_retrieve

        Get pokemon
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_shape_list(self):
        """Test case for pokemon_shape_list

        List pokemon shapes
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-shape/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_shape_retrieve(self):
        """Test case for pokemon_shape_retrieve

        Get pokemon shape
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-shape/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_species_list(self):
        """Test case for pokemon_species_list

        List pokemon species
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-species/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokemon_species_retrieve(self):
        """Test case for pokemon_species_retrieve

        Get pokemon species
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/pokemon-species/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stat_list(self):
        """Test case for stat_list

        List stats
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/stat/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_stat_retrieve(self):
        """Test case for stat_retrieve

        Get stat
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/stat/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_type_list(self):
        """Test case for type_list

        List types
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/type/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_type_retrieve(self):
        """Test case for type_retrieve

        Get types
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/type/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
