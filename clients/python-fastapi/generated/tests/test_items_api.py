# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.item_attribute_detail import ItemAttributeDetail  # noqa: F401
from openapi_server.models.item_category_detail import ItemCategoryDetail  # noqa: F401
from openapi_server.models.item_detail import ItemDetail  # noqa: F401
from openapi_server.models.item_fling_effect_detail import ItemFlingEffectDetail  # noqa: F401
from openapi_server.models.item_pocket_detail import ItemPocketDetail  # noqa: F401
from openapi_server.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList  # noqa: F401
from openapi_server.models.paginated_item_category_summary_list import PaginatedItemCategorySummaryList  # noqa: F401
from openapi_server.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList  # noqa: F401
from openapi_server.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList  # noqa: F401
from openapi_server.models.paginated_item_summary_list import PaginatedItemSummaryList  # noqa: F401


def test_item_list(client: TestClient):
    """Test case for item_list

    List items
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_retrieve(client: TestClient):
    """Test case for item_retrieve

    Get item
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_category_list(client: TestClient):
    """Test case for item_category_list

    List item categories
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-category/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_category_retrieve(client: TestClient):
    """Test case for item_category_retrieve

    Get item category
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-category/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_attribute_list(client: TestClient):
    """Test case for item_attribute_list

    List item attributes
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-attribute/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_attribute_retrieve(client: TestClient):
    """Test case for item_attribute_retrieve

    Get item attribute
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-attribute/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_fling_effect_list(client: TestClient):
    """Test case for item_fling_effect_list

    List item fling effects
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-fling-effect/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_fling_effect_retrieve(client: TestClient):
    """Test case for item_fling_effect_retrieve

    Get item fling effect
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-fling-effect/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_pocket_list(client: TestClient):
    """Test case for item_pocket_list

    List item pockets
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-pocket/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_item_pocket_retrieve(client: TestClient):
    """Test case for item_pocket_retrieve

    Get item pocket
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/item-pocket/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

