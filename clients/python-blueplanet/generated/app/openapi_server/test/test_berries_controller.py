# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.berry_detail import BerryDetail  # noqa: E501
from app.openapi_server.models.berry_firmness_detail import BerryFirmnessDetail  # noqa: E501
from app.openapi_server.models.berry_flavor_detail import BerryFlavorDetail  # noqa: E501
from app.openapi_server.models.paginated_berry_firmness_summary_list import PaginatedBerryFirmnessSummaryList  # noqa: E501
from app.openapi_server.models.paginated_berry_flavor_summary_list import PaginatedBerryFlavorSummaryList  # noqa: E501
from app.openapi_server.models.paginated_berry_summary_list import PaginatedBerrySummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBerriesController(BaseTestCase):
    """BerriesController integration test stubs"""

    def test_berry_firmness_list(self):
        """Test case for berry_firmness_list

        List berry firmness
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/berry-firmness/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_berry_firmness_retrieve(self):
        """Test case for berry_firmness_retrieve

        Get berry by firmness
        """
        response = self.client.open(
            '/api/v2/berry-firmness/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_berry_flavor_list(self):
        """Test case for berry_flavor_list

        List berry flavors
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/berry-flavor/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_berry_flavor_retrieve(self):
        """Test case for berry_flavor_retrieve

        Get berries by flavor
        """
        response = self.client.open(
            '/api/v2/berry-flavor/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_berry_list(self):
        """Test case for berry_list

        List berries
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/berry/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_berry_retrieve(self):
        """Test case for berry_retrieve

        Get a berry
        """
        response = self.client.open(
            '/api/v2/berry/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
