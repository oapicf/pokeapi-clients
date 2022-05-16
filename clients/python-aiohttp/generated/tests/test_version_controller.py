# coding: utf-8

import pytest
import json
from aiohttp import web



async def test_version_list(client):
    """Test case for version_list

    
    """
    params = [('limit', 56),
                    ('offset', 56)]
    headers = { 
        'Accept': 'text/plain',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/api/v2/version/',
        headers=headers,
        params=params,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')


async def test_version_read(client):
    """Test case for version_read

    
    """
    headers = { 
        'Accept': 'text/plain',
    }
    response = await client.request(
        method='GET',
        path='/api/v2/api/v2/version/{id}'.format(id=56),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

