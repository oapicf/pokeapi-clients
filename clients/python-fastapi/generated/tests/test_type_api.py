# coding: utf-8

from fastapi.testclient import TestClient




def test_type_list(client: TestClient):
    """Test case for type_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/type/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_type_read(client: TestClient):
    """Test case for type_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/type/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

