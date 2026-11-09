
#include "PalParkEncounter.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PalParkEncounter_base_score_is_assigned_from_json()
{
    bourne::json input =
    {
        "base_score", 1
    };

    PalParkEncounter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getBaseScore());








}


void test_PalParkEncounter_rate_is_assigned_from_json()
{
    bourne::json input =
    {
        "rate", 1
    };

    PalParkEncounter obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRate());








}




void test_PalParkEncounter_base_score_is_converted_to_json()
{
    bourne::json input =
    {
        "base_score", 1
    };

    PalParkEncounter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["base_score"] == output["base_score"]);




}


void test_PalParkEncounter_rate_is_converted_to_json()
{
    bourne::json input =
    {
        "rate", 1
    };

    PalParkEncounter obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["rate"] == output["rate"]);




}



