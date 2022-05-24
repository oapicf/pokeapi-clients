# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestVersionGroupController(BaseTestCase):
    """VersionGroupController integration test stubs"""

    def test_version_group_list(self):
        """Test case for version_group_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/version-group/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_version_group_read(self):
        """Test case for version_group_read

        
        """
        response = self.client.open(
            '/api/v2/version-group/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
