import unittest

from flask import json

from openapi_server.test import BaseTestCase


class TestMoveAilmentController(BaseTestCase):
    """MoveAilmentController integration test stubs"""

    def test_move_ailment_list(self):
        """Test case for move_ailment_list

        
        """
        query_string = [('limit', 56),
                        ('offset', 56)]
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/api/v2/move-ailment/',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_ailment_read(self):
        """Test case for move_ailment_read

        
        """
        headers = { 
            'Accept': 'text/plain',
        }
        response = self.client.open(
            '/api/v2/move-ailment/{id}'.format(id=56),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
