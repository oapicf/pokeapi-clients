# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.evolution_chain_detail import EvolutionChainDetail  # noqa: E501
from app.openapi_server.models.evolution_trigger_detail import EvolutionTriggerDetail  # noqa: E501
from app.openapi_server.models.paginated_evolution_chain_summary_list import PaginatedEvolutionChainSummaryList  # noqa: E501
from app.openapi_server.models.paginated_evolution_trigger_summary_list import PaginatedEvolutionTriggerSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEvolutionController(BaseTestCase):
    """EvolutionController integration test stubs"""

    def test_evolution_chain_list(self):
        """Test case for evolution_chain_list

        List evolution chains
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/evolution-chain/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_evolution_chain_retrieve(self):
        """Test case for evolution_chain_retrieve

        Get evolution chain
        """
        response = self.client.open(
            '/api/v2/evolution-chain/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_evolution_trigger_list(self):
        """Test case for evolution_trigger_list

        List evolution triggers
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/evolution-trigger/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_evolution_trigger_retrieve(self):
        """Test case for evolution_trigger_retrieve

        Get evolution trigger
        """
        response = self.client.open(
            '/api/v2/evolution-trigger/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
