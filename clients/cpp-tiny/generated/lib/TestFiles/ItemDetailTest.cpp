
#include "ItemDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    ItemDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_ItemDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    ItemDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_ItemDetail_cost_is_assigned_from_json()
{
    bourne::json input =
    {
        "cost", 1
    };

    ItemDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCost());








}


void test_ItemDetail_fling_power_is_assigned_from_json()
{
    bourne::json input =
    {
        "fling_power", 1
    };

    ItemDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFlingPower());








}














void test_ItemDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    ItemDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_ItemDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    ItemDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_ItemDetail_cost_is_converted_to_json()
{
    bourne::json input =
    {
        "cost", 1
    };

    ItemDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cost"] == output["cost"]);




}


void test_ItemDetail_fling_power_is_converted_to_json()
{
    bourne::json input =
    {
        "fling_power", 1
    };

    ItemDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fling_power"] == output["fling_power"]);




}













