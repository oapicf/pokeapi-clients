# coding: utf-8

from fastapi.testclient import TestClient




def test_move_learn_method_list(client: TestClient):
    """Test case for move_learn_method_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/move-learn-method/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_learn_method_read(client: TestClient):
    """Test case for move_learn_method_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/move-learn-method/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

