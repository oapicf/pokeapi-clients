# coding: utf-8

from fastapi.testclient import TestClient




def test_pokemon_color_list(client: TestClient):
    """Test case for pokemon_color_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/pokemon-color/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_pokemon_color_read(client: TestClient):
    """Test case for pokemon_color_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/pokemon-color/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

