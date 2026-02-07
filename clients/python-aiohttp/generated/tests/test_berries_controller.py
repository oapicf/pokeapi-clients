# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.berry_detail import BerryDetail
from openapi_server.models.berry_firmness_detail import BerryFirmnessDetail
from openapi_server.models.berry_flavor_detail import BerryFlavorDetail
from openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList
from openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList
from openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList


pytestmark = pytest.mark.asyncio

async def test_berry_firmness_list(client):
    """Test case for berry_firmness_list

    List berry firmness
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
        path='/api/v2/berry-firmness/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_berry_firmness_retrieve(client):
    """Test case for berry_firmness_retrieve

    Get berry by firmness
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/berry-firmness/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_berry_flavor_list(client):
    """Test case for berry_flavor_list

    List berry flavors
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
        path='/api/v2/berry-flavor/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_berry_flavor_retrieve(client):
    """Test case for berry_flavor_retrieve

    Get berries by flavor
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/berry-flavor/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_berry_list(client):
    """Test case for berry_list

    List berries
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
        path='/api/v2/berry/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_berry_retrieve(client):
    """Test case for berry_retrieve

    Get a berry
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/berry/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

