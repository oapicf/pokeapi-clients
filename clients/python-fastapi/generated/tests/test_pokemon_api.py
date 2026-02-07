# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.ability_detail import AbilityDetail  # noqa: F401
from openapi_server.models.characteristic_detail import CharacteristicDetail  # noqa: F401
from openapi_server.models.egg_group_detail import EggGroupDetail  # noqa: F401
from openapi_server.models.gender_detail import GenderDetail  # noqa: F401
from openapi_server.models.growth_rate_detail import GrowthRateDetail  # noqa: F401
from openapi_server.models.move_damage_class_detail import MoveDamageClassDetail  # noqa: F401
from openapi_server.models.nature_detail import NatureDetail  # noqa: F401
from openapi_server.models.paginated_ability_summary_list import PaginatedAbilitySummaryList  # noqa: F401
from openapi_server.models.paginated_characteristic_summary_list import PaginatedCharacteristicSummaryList  # noqa: F401
from openapi_server.models.paginated_egg_group_summary_list import PaginatedEggGroupSummaryList  # noqa: F401
from openapi_server.models.paginated_gender_summary_list import PaginatedGenderSummaryList  # noqa: F401
from openapi_server.models.paginated_growth_rate_summary_list import PaginatedGrowthRateSummaryList  # noqa: F401
from openapi_server.models.paginated_move_damage_class_summary_list import PaginatedMoveDamageClassSummaryList  # noqa: F401
from openapi_server.models.paginated_nature_summary_list import PaginatedNatureSummaryList  # noqa: F401
from openapi_server.models.paginated_pokeathlon_stat_summary_list import PaginatedPokeathlonStatSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_color_summary_list import PaginatedPokemonColorSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_form_summary_list import PaginatedPokemonFormSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_habitat_summary_list import PaginatedPokemonHabitatSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_shape_summary_list import PaginatedPokemonShapeSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_species_summary_list import PaginatedPokemonSpeciesSummaryList  # noqa: F401
from openapi_server.models.paginated_pokemon_summary_list import PaginatedPokemonSummaryList  # noqa: F401
from openapi_server.models.paginated_stat_summary_list import PaginatedStatSummaryList  # noqa: F401
from openapi_server.models.paginated_type_summary_list import PaginatedTypeSummaryList  # noqa: F401
from openapi_server.models.pokeathlon_stat_detail import PokeathlonStatDetail  # noqa: F401
from openapi_server.models.pokemon_color_detail import PokemonColorDetail  # noqa: F401
from openapi_server.models.pokemon_detail import PokemonDetail  # noqa: F401
from openapi_server.models.pokemon_form_detail import PokemonFormDetail  # noqa: F401
from openapi_server.models.pokemon_habitat_detail import PokemonHabitatDetail  # noqa: F401
from openapi_server.models.pokemon_shape_detail import PokemonShapeDetail  # noqa: F401
from openapi_server.models.pokemon_species_detail import PokemonSpeciesDetail  # noqa: F401
from openapi_server.models.stat_detail import StatDetail  # noqa: F401
from openapi_server.models.type_detail import TypeDetail  # noqa: F401


def test_ability_list(client: TestClient):
    """Test case for ability_list

    
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/ability/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_ability_retrieve(client: TestClient):
    """Test case for ability_retrieve

    
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/ability/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_characteristic_list(client: TestClient):
    """Test case for characteristic_list

    List charecterictics
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/characteristic/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_characteristic_retrieve(client: TestClient):
    """Test case for characteristic_retrieve

    Get characteristic
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/characteristic/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_egg_group_list(client: TestClient):
    """Test case for egg_group_list

    List egg groups
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/egg-group/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_egg_group_retrieve(client: TestClient):
    """Test case for egg_group_retrieve

    Get egg group
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/egg-group/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_gender_list(client: TestClient):
    """Test case for gender_list

    List genders
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/gender/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_gender_retrieve(client: TestClient):
    """Test case for gender_retrieve

    Get gender
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/gender/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_growth_rate_list(client: TestClient):
    """Test case for growth_rate_list

    List growth rates
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/growth-rate/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_growth_rate_retrieve(client: TestClient):
    """Test case for growth_rate_retrieve

    Get growth rate
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/growth-rate/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_damage_class_list(client: TestClient):
    """Test case for move_damage_class_list

    List move damage classes
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-damage-class/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_damage_class_retrieve(client: TestClient):
    """Test case for move_damage_class_retrieve

    Get move damage class
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-damage-class/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_nature_list(client: TestClient):
    """Test case for nature_list

    List natures
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/nature/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_nature_retrieve(client: TestClient):
    """Test case for nature_retrieve

    Get nature
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/nature/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_list(client: TestClient):
    """Test case for pokemon_list

    List pokemon
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_retrieve(client: TestClient):
    """Test case for pokemon_retrieve

    Get pokemon
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_color_list(client: TestClient):
    """Test case for pokemon_color_list

    List pokemon colors
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-color/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_color_retrieve(client: TestClient):
    """Test case for pokemon_color_retrieve

    Get pokemon color
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-color/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_form_list(client: TestClient):
    """Test case for pokemon_form_list

    List pokemon forms
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-form/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_form_retrieve(client: TestClient):
    """Test case for pokemon_form_retrieve

    Get pokemon form
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-form/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_habitat_list(client: TestClient):
    """Test case for pokemon_habitat_list

    List pokemom habitas
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-habitat/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_habitat_retrieve(client: TestClient):
    """Test case for pokemon_habitat_retrieve

    Get pokemom habita
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-habitat/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_shape_list(client: TestClient):
    """Test case for pokemon_shape_list

    List pokemon shapes
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-shape/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_shape_retrieve(client: TestClient):
    """Test case for pokemon_shape_retrieve

    Get pokemon shape
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-shape/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_species_list(client: TestClient):
    """Test case for pokemon_species_list

    List pokemon species
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-species/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_species_retrieve(client: TestClient):
    """Test case for pokemon_species_retrieve

    Get pokemon species
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon-species/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokeathlon_stat_list(client: TestClient):
    """Test case for pokeathlon_stat_list

    List pokeathlon stats
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokeathlon-stat/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokeathlon_stat_retrieve(client: TestClient):
    """Test case for pokeathlon_stat_retrieve

    Get pokeathlon stat
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokeathlon-stat/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_stat_list(client: TestClient):
    """Test case for stat_list

    List stats
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/stat/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_stat_retrieve(client: TestClient):
    """Test case for stat_retrieve

    Get stat
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/stat/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_type_list(client: TestClient):
    """Test case for type_list

    List types
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/type/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_type_retrieve(client: TestClient):
    """Test case for type_retrieve

    Get types
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/type/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

