# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.machine_detail import MachineDetail  # noqa: F401
from openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList  # noqa: F401


def test_machine_list(client: TestClient):
    """Test case for machine_list

    List machines
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/machine/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_machine_retrieve(client: TestClient):
    """Test case for machine_retrieve

    Get machine
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/machine/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

