
#include "VersionGroupDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_VersionGroupDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    VersionGroupDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_VersionGroupDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    VersionGroupDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_VersionGroupDetail_order_is_assigned_from_json()
{
    bourne::json input =
    {
        "order", 1
    };

    VersionGroupDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getOrder());








}








void test_VersionGroupDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    VersionGroupDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_VersionGroupDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    VersionGroupDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_VersionGroupDetail_order_is_converted_to_json()
{
    bourne::json input =
    {
        "order", 1
    };

    VersionGroupDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["order"] == output["order"]);




}







