# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.machine_detail import MachineDetail  # noqa: E501
from app.openapi_server.models.paginated_machine_summary_list import PaginatedMachineSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMachinesController(BaseTestCase):
    """MachinesController integration test stubs"""

    def test_machine_list(self):
        """Test case for machine_list

        List machines
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/machine/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_machine_retrieve(self):
        """Test case for machine_retrieve

        Get machine
        """
        response = self.client.open(
            '/api/v2/machine/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
