# coding: utf-8

from fastapi.testclient import TestClient




def test_berry_flavor_list(client: TestClient):
    """Test case for berry_flavor_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/berry-flavor/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_flavor_read(client: TestClient):
    """Test case for berry_flavor_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/berry-flavor/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

