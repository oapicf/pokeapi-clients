
#include "LocationAreaEncounterDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_LocationAreaEncounterDetail_min_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinLevel());








}


void test_LocationAreaEncounterDetail_max_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_level", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxLevel());








}


void test_LocationAreaEncounterDetail_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "chance", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChance());








}






void test_LocationAreaEncounterDetail_min_level_is_converted_to_json()
{
    bourne::json input =
    {
        "min_level", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_level"] == output["min_level"]);




}


void test_LocationAreaEncounterDetail_max_level_is_converted_to_json()
{
    bourne::json input =
    {
        "max_level", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_level"] == output["max_level"]);




}


void test_LocationAreaEncounterDetail_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "chance", 1
    };

    LocationAreaEncounterDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["chance"] == output["chance"]);




}





