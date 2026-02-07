# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.contest_effect_detail import ContestEffectDetail
from openapi_server.models.contest_type_detail import ContestTypeDetail
from openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList
from openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList
from openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList
from openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail


pytestmark = pytest.mark.asyncio

async def test_contest_effect_list(client):
    """Test case for contest_effect_list

    List contest effects
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
        path='/api/v2/contest-effect/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_contest_effect_retrieve(client):
    """Test case for contest_effect_retrieve

    Get contest effect
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/contest-effect/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_contest_type_list(client):
    """Test case for contest_type_list

    List contest types
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
        path='/api/v2/contest-type/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_contest_type_retrieve(client):
    """Test case for contest_type_retrieve

    Get contest type
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/contest-type/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_super_contest_effect_list(client):
    """Test case for super_contest_effect_list

    List super contest effects
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
        path='/api/v2/super-contest-effect/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_super_contest_effect_retrieve(client):
    """Test case for super_contest_effect_retrieve

    Get super contest effect
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/super-contest-effect/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

