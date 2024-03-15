# coding: utf-8

from fastapi.testclient import TestClient




def test_berry_firmness_list(client: TestClient):
    """Test case for berry_firmness_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry-firmness/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_firmness_read(client: TestClient):
    """Test case for berry_firmness_read

    
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry-firmness/{id}/".format(id=56),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

