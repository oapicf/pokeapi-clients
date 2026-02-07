import unittest

from flask import json

from openapi_server.models.move_battle_style_detail import MoveBattleStyleDetail  # noqa: E501
from openapi_server.models.move_detail import MoveDetail  # noqa: E501
from openapi_server.models.move_learn_method_detail import MoveLearnMethodDetail  # noqa: E501
from openapi_server.models.move_meta_ailment_detail import MoveMetaAilmentDetail  # noqa: E501
from openapi_server.models.move_meta_category_detail import MoveMetaCategoryDetail  # noqa: E501
from openapi_server.models.move_target_detail import MoveTargetDetail  # noqa: E501
from openapi_server.models.paginated_move_battle_style_summary_list import PaginatedMoveBattleStyleSummaryList  # noqa: E501
from openapi_server.models.paginated_move_learn_method_summary_list import PaginatedMoveLearnMethodSummaryList  # noqa: E501
from openapi_server.models.paginated_move_meta_ailment_summary_list import PaginatedMoveMetaAilmentSummaryList  # noqa: E501
from openapi_server.models.paginated_move_meta_category_summary_list import PaginatedMoveMetaCategorySummaryList  # noqa: E501
from openapi_server.models.paginated_move_summary_list import PaginatedMoveSummaryList  # noqa: E501
from openapi_server.models.paginated_move_target_summary_list import PaginatedMoveTargetSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMovesController(BaseTestCase):
    """MovesController integration test stubs"""

    def test_move_ailment_list(self):
        """Test case for move_ailment_list

        List move meta ailments
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
            '/api/v2/move-ailment/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_ailment_retrieve(self):
        """Test case for move_ailment_retrieve

        Get move meta ailment
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-ailment/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_battle_style_list(self):
        """Test case for move_battle_style_list

        List move battle styles
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
            '/api/v2/move-battle-style/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_battle_style_retrieve(self):
        """Test case for move_battle_style_retrieve

        Get move battle style
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-battle-style/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_category_list(self):
        """Test case for move_category_list

        List move meta categories
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
            '/api/v2/move-category/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_category_retrieve(self):
        """Test case for move_category_retrieve

        Get move meta category
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-category/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_learn_method_list(self):
        """Test case for move_learn_method_list

        List move learn methods
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
            '/api/v2/move-learn-method/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_learn_method_retrieve(self):
        """Test case for move_learn_method_retrieve

        Get move learn method
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-learn-method/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_list(self):
        """Test case for move_list

        List moves
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
            '/api/v2/move/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_retrieve(self):
        """Test case for move_retrieve

        Get move
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_target_list(self):
        """Test case for move_target_list

        List move targets
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
            '/api/v2/move-target/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_target_retrieve(self):
        """Test case for move_target_retrieve

        Get move target
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/move-target/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
