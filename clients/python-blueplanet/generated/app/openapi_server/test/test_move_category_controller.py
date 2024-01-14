# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from openapi_server.test import BaseTestCase


class TestMoveCategoryController(BaseTestCase):
    """MoveCategoryController integration test stubs"""

    def test_move_category_list(self):
        """Test case for move_category_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/move-category/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_category_read(self):
        """Test case for move_category_read

        
        """
        response = self.client.open(
            '/api/v2/move-category/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
