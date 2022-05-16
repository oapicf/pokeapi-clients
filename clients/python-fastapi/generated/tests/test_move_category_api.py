# coding: utf-8

from fastapi.testclient import TestClient




def test_move_category_list(client: TestClient):
    """Test case for move_category_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/move-category/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_category_read(client: TestClient):
    """Test case for move_category_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/move-category/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

