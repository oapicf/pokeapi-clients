# coding: utf-8

"""

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from openapi_client.api_client import ApiClient
from openapi_client.api.pokemon_species_api_endpoints.pokemon_species_list import PokemonSpeciesList
from openapi_client.api.pokemon_species_api_endpoints.pokemon_species_read import PokemonSpeciesRead


class PokemonSpeciesApi(
    PokemonSpeciesList,
    PokemonSpeciesRead,
    ApiClient,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
