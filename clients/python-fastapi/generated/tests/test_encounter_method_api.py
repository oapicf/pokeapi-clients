# coding: utf-8

from fastapi.testclient import TestClient




def test_encounter_method_list(client: TestClient):
    """Test case for encounter_method_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/encounter-method/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_encounter_method_read(client: TestClient):
    """Test case for encounter_method_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/encounter-method/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

