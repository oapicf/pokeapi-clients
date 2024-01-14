import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def type_list(limit=None, offset=None):  # noqa: E501
    """type_list

     # noqa: E501

    :param limit: 
    :type limit: int
    :param offset: 
    :type offset: int

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'


def type_read(id):  # noqa: E501
    """type_read

     # noqa: E501

    :param id: 
    :type id: int

    :rtype: Union[str, Tuple[str, int], Tuple[str, int, Dict[str, str]]
    """
    return 'do some magic!'
