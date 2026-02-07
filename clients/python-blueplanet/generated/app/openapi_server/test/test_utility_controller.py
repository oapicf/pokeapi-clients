# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.language_detail import LanguageDetail  # noqa: E501
from app.openapi_server.models.paginated_language_summary_list import PaginatedLanguageSummaryList  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUtilityController(BaseTestCase):
    """UtilityController integration test stubs"""

    def test_language_list(self):
        """Test case for language_list

        List languages
        """
        query_string = [('limit', 56),
                        ('offset', 56),
                        ('q', 'q_example')]
        response = self.client.open(
            '/api/v2/language/',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_language_retrieve(self):
        """Test case for language_retrieve

        Get language
        """
        response = self.client.open(
            '/api/v2/language/{id}'.format(id='id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
