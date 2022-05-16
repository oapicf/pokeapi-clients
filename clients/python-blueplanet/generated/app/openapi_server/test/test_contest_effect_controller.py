# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from openapi_server.test import BaseTestCase


class TestContestEffectController(BaseTestCase):
    """ContestEffectController integration test stubs"""

    def test_contest_effect_list(self):
        """Test case for contest_effect_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        response = self.client.open(
            '/api/v2/api/v2/contest-effect/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_contest_effect_read(self):
        """Test case for contest_effect_read

        
        """
        response = self.client.open(
            '/api/v2/api/v2/contest-effect/{id}'.format(id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
