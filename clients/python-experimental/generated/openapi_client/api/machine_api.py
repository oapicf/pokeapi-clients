# coding: utf-8

"""

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""

from openapi_client.api_client import ApiClient
from openapi_client.api.machine_api_endpoints.machine_list import MachineList
from openapi_client.api.machine_api_endpoints.machine_read import MachineRead


class MachineApi(
    MachineList,
    MachineRead,
    ApiClient,
):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    pass
