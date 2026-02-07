# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.evolution_chain_detail import EvolutionChainDetail
from openapi_server.models.evolution_trigger_detail import EvolutionTriggerDetail
from openapi_server.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList
from openapi_server.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList


pytestmark = pytest.mark.asyncio

async def test_evolution_chain_list(client):
    """Test case for evolution_chain_list

    List evolution chains
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
        path='/api/v2/evolution-chain/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_evolution_chain_retrieve(client):
    """Test case for evolution_chain_retrieve

    Get evolution chain
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/evolution-chain/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_evolution_trigger_list(client):
    """Test case for evolution_trigger_list

    List evolution triggers
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
        path='/api/v2/evolution-trigger/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


pytestmark = pytest.mark.asyncio

async def test_evolution_trigger_retrieve(client):
    """Test case for evolution_trigger_retrieve

    Get evolution trigger
    """
    headers = { 
        'Accept': 'application/json',
        'Authorization': 'BasicZm9vOmJhcg==',
        'cookieAuth': 'special-key',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/evolution-trigger/{id}'.format(id='id_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

