
#include "MoveChange.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_MoveChange_accuracy_is_assigned_from_json()
{
    bourne::json input =
    {
        "accuracy", 1
    };

    MoveChange obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAccuracy());








}


void test_MoveChange_power_is_assigned_from_json()
{
    bourne::json input =
    {
        "power", 1
    };

    MoveChange obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPower());








}


void test_MoveChange_pp_is_assigned_from_json()
{
    bourne::json input =
    {
        "pp", 1
    };

    MoveChange obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPp());








}


void test_MoveChange_effect_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "effect_chance", 1
    };

    MoveChange obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getEffectChance());








}






void test_MoveChange_accuracy_is_converted_to_json()
{
    bourne::json input =
    {
        "accuracy", 1
    };

    MoveChange obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["accuracy"] == output["accuracy"]);




}


void test_MoveChange_power_is_converted_to_json()
{
    bourne::json input =
    {
        "power", 1
    };

    MoveChange obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["power"] == output["power"]);




}


void test_MoveChange_pp_is_converted_to_json()
{
    bourne::json input =
    {
        "pp", 1
    };

    MoveChange obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["pp"] == output["pp"]);




}


void test_MoveChange_effect_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "effect_chance", 1
    };

    MoveChange obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["effect_chance"] == output["effect_chance"]);




}





