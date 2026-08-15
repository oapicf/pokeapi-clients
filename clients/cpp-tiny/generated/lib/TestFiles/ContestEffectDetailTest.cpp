
#include "ContestEffectDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ContestEffectDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    ContestEffectDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_ContestEffectDetail_appeal_is_assigned_from_json()
{
    bourne::json input =
    {
        "appeal", 1
    };

    ContestEffectDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAppeal());








}


void test_ContestEffectDetail_jam_is_assigned_from_json()
{
    bourne::json input =
    {
        "jam", 1
    };

    ContestEffectDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getJam());








}





void test_ContestEffectDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    ContestEffectDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_ContestEffectDetail_appeal_is_converted_to_json()
{
    bourne::json input =
    {
        "appeal", 1
    };

    ContestEffectDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["appeal"] == output["appeal"]);




}


void test_ContestEffectDetail_jam_is_converted_to_json()
{
    bourne::json input =
    {
        "jam", 1
    };

    ContestEffectDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["jam"] == output["jam"]);




}




