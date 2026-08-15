
#include "GrowthRateDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GrowthRateDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    GrowthRateDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_GrowthRateDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    GrowthRateDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_GrowthRateDetail_formula_is_assigned_from_json()
{


    bourne::json input =
    {
        "formula", "hello"
    };

    GrowthRateDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getFormula().c_str());






}






void test_GrowthRateDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    GrowthRateDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_GrowthRateDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    GrowthRateDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_GrowthRateDetail_formula_is_converted_to_json()
{

    bourne::json input =
    {
        "formula", "hello"
    };

    GrowthRateDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["formula"] == output["formula"]);



}





