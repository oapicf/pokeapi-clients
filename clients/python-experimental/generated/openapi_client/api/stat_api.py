# coding: utf-8

"""

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from openapi_client.api_client import ApiClient
from openapi_client.api.stat_api_endpoints.stat_list import StatList
from openapi_client.api.stat_api_endpoints.stat_read import StatRead


class StatApi(
    StatList,
    StatRead,
    ApiClient,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
