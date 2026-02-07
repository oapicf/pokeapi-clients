# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.generation_detail import GenerationDetail  # noqa: E501
from app.openapi_server.models.paginated_generation_summary_list import PaginatedGenerationSummaryList  # noqa: E501
from app.openapi_server.models.paginated_pokedex_summary_list import PaginatedPokedexSummaryList  # noqa: E501
from app.openapi_server.models.paginated_version_group_summary_list import PaginatedVersionGroupSummaryList  # noqa: E501
from app.openapi_server.models.paginated_version_summary_list import PaginatedVersionSummaryList  # noqa: E501
from app.openapi_server.models.pokedex_detail import PokedexDetail  # noqa: E501
from app.openapi_server.models.version_detail import VersionDetail  # noqa: E501
from app.openapi_server.models.version_group_detail import VersionGroupDetail  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGamesController(BaseTestCase):
    """GamesController integration test stubs"""

    def test_generation_list(self):
        """Test case for generation_list

        List genrations
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/generation/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_generation_retrieve(self):
        """Test case for generation_retrieve

        Get genration
        """
        response = self.client.open(
            '/api/v2/generation/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokedex_list(self):
        """Test case for pokedex_list

        List pokedex
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/pokedex/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pokedex_retrieve(self):
        """Test case for pokedex_retrieve

        Get pokedex
        """
        response = self.client.open(
            '/api/v2/pokedex/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_version_group_list(self):
        """Test case for version_group_list

        List version groups
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/version-group/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_version_group_retrieve(self):
        """Test case for version_group_retrieve

        Get version group
        """
        response = self.client.open(
            '/api/v2/version-group/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_version_list(self):
        """Test case for version_list

        List versions
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/version/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_version_retrieve(self):
        """Test case for version_retrieve

        Get version
        """
        response = self.client.open(
            '/api/v2/version/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
