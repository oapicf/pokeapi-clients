# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestCharacteristicController(BaseTestCase):
    """CharacteristicController integration test stubs"""

    def test_characteristic_list(self):
        """Test case for characteristic_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/characteristic/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_characteristic_read(self):
        """Test case for characteristic_read

        
        """
        response = self.client.open(
            '/api/v2/characteristic/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
