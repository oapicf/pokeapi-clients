# coding: utf-8

from fastapi.testclient import TestClient




def test_pokemon_shape_list(client: TestClient):
    """Test case for pokemon_shape_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/pokemon-shape/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_shape_read(client: TestClient):
    """Test case for pokemon_shape_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/pokemon-shape/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

