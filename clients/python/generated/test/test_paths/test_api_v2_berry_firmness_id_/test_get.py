# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

import unittest
from unittest.mock import patch

import urllib3

import pokeapiclient
from pokeapiclient.paths.api_v2_berry_firmness_id_ import get  # noqa: E501
from pokeapiclient import configuration, schemas, api_client

from .. import ApiTestMixin


class TestApiV2BerryFirmnessId(ApiTestMixin, unittest.TestCase):
    """
    ApiV2BerryFirmnessId unit test stubs
    """
    _configuration = configuration.Configuration()

    def setUp(self):
        used_api_client = api_client.ApiClient(configuration=self._configuration)
        self.api = get.ApiForget(api_client=used_api_client)  # noqa: E501

    def tearDown(self):
        pass

    response_status = 0




if __name__ == '__main__':
    unittest.main()
