# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.encounter_condition_detail import EncounterConditionDetail  # noqa: E501
from app.openapi_server.models.encounter_condition_value_detail import EncounterConditionValueDetail  # noqa: E501
from app.openapi_server.models.encounter_method_detail import EncounterMethodDetail  # noqa: E501
from app.openapi_server.models.paginated_encounter_condition_summary_list import PaginatedEncounterConditionSummaryList  # noqa: E501
from app.openapi_server.models.paginated_encounter_condition_value_summary_list import PaginatedEncounterConditionValueSummaryList  # noqa: E501
from app.openapi_server.models.paginated_encounter_method_summary_list import PaginatedEncounterMethodSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEncountersController(BaseTestCase):
    """EncountersController integration test stubs"""

    def test_encounter_condition_list(self):
        """Test case for encounter_condition_list

        List encounter conditions
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/encounter-condition/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encounter_condition_retrieve(self):
        """Test case for encounter_condition_retrieve

        Get encounter condition
        """
        response = self.client.open(
            '/api/v2/encounter-condition/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encounter_condition_value_list(self):
        """Test case for encounter_condition_value_list

        List encounter condition values
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/encounter-condition-value/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encounter_condition_value_retrieve(self):
        """Test case for encounter_condition_value_retrieve

        Get encounter condition value
        """
        response = self.client.open(
            '/api/v2/encounter-condition-value/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encounter_method_list(self):
        """Test case for encounter_method_list

        List encounter methods
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/encounter-method/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_encounter_method_retrieve(self):
        """Test case for encounter_method_retrieve

        Get encounter method
        """
        response = self.client.open(
            '/api/v2/encounter-method/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
