# coding: utf-8

from fastapi.testclient import TestClient


from pydantic import Field, StrictInt, StrictStr  # noqa: F401
from typing import Optional  # noqa: F401
from typing_extensions import Annotated  # noqa: F401
from openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail  # noqa: F401
from openapi_server.models.move_detail import MoveDetail  # noqa: F401
from openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail  # noqa: F401
from openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail  # noqa: F401
from openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail  # noqa: F401
from openapi_server.models.move_target_detail import MoveTargetDetail  # noqa: F401
from openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList  # noqa: F401
from openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList  # noqa: F401
from openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList  # noqa: F401
from openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList  # noqa: F401
from openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList  # noqa: F401
from openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList  # noqa: F401


def test_move_list(client: TestClient):
    """Test case for move_list

    List moves
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_retrieve(client: TestClient):
    """Test case for move_retrieve

    Get move
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_ailment_list(client: TestClient):
    """Test case for move_ailment_list

    List move meta ailments
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-ailment/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_ailment_retrieve(client: TestClient):
    """Test case for move_ailment_retrieve

    Get move meta ailment
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-ailment/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_battle_style_list(client: TestClient):
    """Test case for move_battle_style_list

    List move battle styles
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-battle-style/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_battle_style_retrieve(client: TestClient):
    """Test case for move_battle_style_retrieve

    Get move battle style
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-battle-style/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_category_list(client: TestClient):
    """Test case for move_category_list

    List move meta categories
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-category/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_category_retrieve(client: TestClient):
    """Test case for move_category_retrieve

    Get move meta category
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-category/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_learn_method_list(client: TestClient):
    """Test case for move_learn_method_list

    List move learn methods
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-learn-method/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_learn_method_retrieve(client: TestClient):
    """Test case for move_learn_method_retrieve

    Get move learn method
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-learn-method/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_target_list(client: TestClient):
    """Test case for move_target_list

    List move targets
    """
    params = [("limit", 56),     ("offset", 56),     ("q", 'q_example')]
    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-target/",
    #    headers=headers,
    #    params=params,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200


def test_move_target_retrieve(client: TestClient):
    """Test case for move_target_retrieve

    Get move target
    """

    headers = {
        "Authorization": "BasicZm9vOmJhcg==",
        "cookieAuth": "special-key",
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/api/v2/move-target/{id}/".format(id='id_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

