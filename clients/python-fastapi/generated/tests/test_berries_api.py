# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.berry_detail import BerryDetail  # noqa: F401
from openapi_server.models.berry_firmness_detail import BerryFirmnessDetail  # noqa: F401
from openapi_server.models.berry_flavor_detail import BerryFlavorDetail  # noqa: F401
from openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList  # noqa: F401
from openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList  # noqa: F401
from openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList  # noqa: F401


def test_berry_list(client: TestClient):
    """Test case for berry_list

    List berries
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_retrieve(client: TestClient):
    """Test case for berry_retrieve

    Get a berry
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_firmness_list(client: TestClient):
    """Test case for berry_firmness_list

    List berry firmness
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
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


def test_berry_firmness_retrieve(client: TestClient):
    """Test case for berry_firmness_retrieve

    Get berry by firmness
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry-firmness/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_flavor_list(client: TestClient):
    """Test case for berry_flavor_list

    List berry flavors
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry-flavor/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_berry_flavor_retrieve(client: TestClient):
    """Test case for berry_flavor_retrieve

    Get berries by flavor
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/berry-flavor/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

