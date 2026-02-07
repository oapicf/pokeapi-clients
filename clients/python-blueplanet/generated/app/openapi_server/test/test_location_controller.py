# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.location_area_detail import LocationAreaDetail  # noqa: E501
from app.openapi_server.models.location_detail import LocationDetail  # noqa: E501
from app.openapi_server.models.paginated_location_area_summary_list import PaginatedLocationAreaSummaryList  # noqa: E501
from app.openapi_server.models.paginated_location_summary_list import PaginatedLocationSummaryList  # noqa: E501
from app.openapi_server.models.paginated_pal_park_area_summary_list import PaginatedPalParkAreaSummaryList  # noqa: E501
from app.openapi_server.models.paginated_region_summary_list import PaginatedRegionSummaryList  # noqa: E501
from app.openapi_server.models.pal_park_area_detail import PalParkAreaDetail  # noqa: E501
from app.openapi_server.models.region_detail import RegionDetail  # noqa: E501
from openapi_server.test import BaseTestCase


class TestLocationController(BaseTestCase):
    """LocationController integration test stubs"""

    def test_location_area_list(self):
        """Test case for location_area_list

        List location areas
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/location-area/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_location_area_retrieve(self):
        """Test case for location_area_retrieve

        Get location area
        """
        response = self.client.open(
            '/api/v2/location-area/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_location_list(self):
        """Test case for location_list

        List locations
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/location/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_location_retrieve(self):
        """Test case for location_retrieve

        Get location
        """
        response = self.client.open(
            '/api/v2/location/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pal_park_area_list(self):
        """Test case for pal_park_area_list

        List pal park areas
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/pal-park-area/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_pal_park_area_retrieve(self):
        """Test case for pal_park_area_retrieve

        Get pal park area
        """
        response = self.client.open(
            '/api/v2/pal-park-area/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_region_list(self):
        """Test case for region_list

        List regions
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/region/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_region_retrieve(self):
        """Test case for region_retrieve

        Get region
        """
        response = self.client.open(
            '/api/v2/region/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
