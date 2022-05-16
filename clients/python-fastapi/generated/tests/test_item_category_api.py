# coding: utf-8

from fastapi.testclient import TestClient




def test_item_category_list(client: TestClient):
    """Test case for item_category_list

    
    """
    params = [("limit", 56),     ("offset", 56)]
    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/item-category/",
        headers=headers,
        params=params,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_category_read(client: TestClient):
    """Test case for item_category_read

    
    """

    headers = {
    }
    response = client.request(
        "GET",
        "/api/v2/item-category/{id}/".format(id=56),
        headers=headers,
    )

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

