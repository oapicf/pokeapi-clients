# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.location_area_detail import LocationAreaDetail
from openapi_server.models.location_detail import LocationDetail
from openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList
from openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList
from openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList
from openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList
from openapi_server.models.pal_park_area_detail import PalParkAreaDetail
from openapi_server.models.region_detail import RegionDetail


pytestmark = pytest.mark.asyncio

async def test_location_area_list(client):
    """Test case for location_area_list

    List location areas
    """
    params = [('limit', 56),
                    ('offset', 56)]
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/location-area/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_location_area_retrieve(client):
    """Test case for location_area_retrieve

    Get location area
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/location-area/{id}'.format(id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_location_list(client):
    """Test case for location_list

    List locations
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
        path='/api/v2/location/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_location_retrieve(client):
    """Test case for location_retrieve

    Get location
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/location/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_pal_park_area_list(client):
    """Test case for pal_park_area_list

    List pal park areas
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
        path='/api/v2/pal-park-area/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_pal_park_area_retrieve(client):
    """Test case for pal_park_area_retrieve

    Get pal park area
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/pal-park-area/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_region_list(client):
    """Test case for region_list

    List regions
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
        path='/api/v2/region/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_region_retrieve(client):
    """Test case for region_retrieve

    Get region
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/region/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

