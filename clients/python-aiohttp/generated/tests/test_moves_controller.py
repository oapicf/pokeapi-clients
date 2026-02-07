# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail
from openapi_server.models.move_detail import MoveDetail
from openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail
from openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail
from openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail
from openapi_server.models.move_target_detail import MoveTargetDetail
from openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList
from openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList
from openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList
from openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList
from openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList
from openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList


pytestmark = pytest.mark.asyncio

async def test_move_ailment_list(client):
    """Test case for move_ailment_list

    List move meta ailments
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-ailment/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_ailment_retrieve(client):
    """Test case for move_ailment_retrieve

    Get move meta ailment
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-ailment/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_battle_style_list(client):
    """Test case for move_battle_style_list

    List move battle styles
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-battle-style/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_battle_style_retrieve(client):
    """Test case for move_battle_style_retrieve

    Get move battle style
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-battle-style/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_category_list(client):
    """Test case for move_category_list

    List move meta categories
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-category/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_category_retrieve(client):
    """Test case for move_category_retrieve

    Get move meta category
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-category/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_learn_method_list(client):
    """Test case for move_learn_method_list

    List move learn methods
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-learn-method/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_learn_method_retrieve(client):
    """Test case for move_learn_method_retrieve

    Get move learn method
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-learn-method/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_list(client):
    """Test case for move_list

    List moves
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_retrieve(client):
    """Test case for move_retrieve

    Get move
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_target_list(client):
    """Test case for move_target_list

    List move targets
    """
    params = [('limit', 56),
                    ('offset', 56),
                    ('q', 'q_example')]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-target/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_move_target_retrieve(client):
    """Test case for move_target_retrieve

    Get move target
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/move-target/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

