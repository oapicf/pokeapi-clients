import unittest

from flask import json

from openapi_server.models.contest_effect_detail import ContestEffectDetail  # noqa: E501
from openapi_server.models.contest_type_detail import ContestTypeDetail  # noqa: E501
from openapi_server.models.paginated_contest_effect_summary_list import PaginatedContestEffectSummaryList  # noqa: E501
from openapi_server.models.paginated_contest_type_summary_list import PaginatedContestTypeSummaryList  # noqa: E501
from openapi_server.models.paginated_super_contest_effect_summary_list import PaginatedSuperContestEffectSummaryList  # noqa: E501
from openapi_server.models.super_contest_effect_detail import SuperContestEffectDetail  # noqa: E501
from openapi_server.test import BaseTestCase


class TestContestsController(BaseTestCase):
    """ContestsController integration test stubs"""

    def test_contest_effect_list(self):
        """Test case for contest_effect_list

        List contest effects
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/contest-effect/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_contest_effect_retrieve(self):
        """Test case for contest_effect_retrieve

        Get contest effect
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/contest-effect/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_contest_type_list(self):
        """Test case for contest_type_list

        List contest types
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/contest-type/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_contest_type_retrieve(self):
        """Test case for contest_type_retrieve

        Get contest type
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/contest-type/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_super_contest_effect_list(self):
        """Test case for super_contest_effect_list

        List super contest effects
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/super-contest-effect/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_super_contest_effect_retrieve(self):
        """Test case for super_contest_effect_retrieve

        Get super contest effect
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/super-contest-effect/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
