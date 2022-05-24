# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestMoveLearnMethodController(BaseTestCase):
    """MoveLearnMethodController integration test stubs"""

    def test_move_learn_method_list(self):
        """Test case for move_learn_method_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/move-learn-method/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_learn_method_read(self):
        """Test case for move_learn_method_read

        
        """
        response = self.client.open(
            '/api/v2/move-learn-method/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
