# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401


def test_pokemon_list(client: TestClient):
    """Test case for pokemon_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
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


def test_pokemon_read(client: TestClient):
    """Test case for pokemon_read

    
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/pokemon/{id}/".format(id=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

