import unittest

from flask import json

from openapi_server.models.item_attribute_detail import ItemAttributeDetail  # noqa: E501
from openapi_server.models.item_category_detail import ItemCategoryDetail  # noqa: E501
from openapi_server.models.item_detail import ItemDetail  # noqa: E501
from openapi_server.models.item_fling_effect_detail import ItemFlingEffectDetail  # noqa: E501
from openapi_server.models.item_pocket_detail import ItemPocketDetail  # noqa: E501
from openapi_server.models.paginated_item_attribute_summary_list import PaginatedItemAttributeSummaryList  # noqa: E501
from openapi_server.models.paginated_item_category_summary_list import PaginatedItemCategorySummaryList  # noqa: E501
from openapi_server.models.paginated_item_fling_effect_summary_list import PaginatedItemFlingEffectSummaryList  # noqa: E501
from openapi_server.models.paginated_item_pocket_summary_list import PaginatedItemPocketSummaryList  # noqa: E501
from openapi_server.models.paginated_item_summary_list import PaginatedItemSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestItemsController(BaseTestCase):
    """ItemsController integration test stubs"""

    def test_item_attribute_list(self):
        """Test case for item_attribute_list

        List item attributes
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
            '/api/v2/item-attribute/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_attribute_retrieve(self):
        """Test case for item_attribute_retrieve

        Get item attribute
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/item-attribute/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_category_list(self):
        """Test case for item_category_list

        List item categories
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
            '/api/v2/item-category/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_category_retrieve(self):
        """Test case for item_category_retrieve

        Get item category
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/item-category/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_fling_effect_list(self):
        """Test case for item_fling_effect_list

        List item fling effects
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
            '/api/v2/item-fling-effect/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_fling_effect_retrieve(self):
        """Test case for item_fling_effect_retrieve

        Get item fling effect
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/item-fling-effect/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_list(self):
        """Test case for item_list

        List items
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
            '/api/v2/item/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_pocket_list(self):
        """Test case for item_pocket_list

        List item pockets
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
            '/api/v2/item-pocket/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_pocket_retrieve(self):
        """Test case for item_pocket_retrieve

        Get item pocket
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/item-pocket/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_item_retrieve(self):
        """Test case for item_retrieve

        Get item
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Basic Zm9vOmJhcg==',
            'cookieAuth': 'special-key',
        }
        response = self.client.open(
            '/api/v2/item/{id}'.format(id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
