
#include "NatureBattleStylePreference.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_NatureBattleStylePreference_low_hp_preference_is_assigned_from_json()
{
    bourne::json input =
    {
        "low_hp_preference", 1
    };

    NatureBattleStylePreference obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLowHpPreference());








}


void test_NatureBattleStylePreference_high_hp_preference_is_assigned_from_json()
{
    bourne::json input =
    {
        "high_hp_preference", 1
    };

    NatureBattleStylePreference obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHighHpPreference());








}




void test_NatureBattleStylePreference_low_hp_preference_is_converted_to_json()
{
    bourne::json input =
    {
        "low_hp_preference", 1
    };

    NatureBattleStylePreference obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["low_hp_preference"] == output["low_hp_preference"]);




}


void test_NatureBattleStylePreference_high_hp_preference_is_converted_to_json()
{
    bourne::json input =
    {
        "high_hp_preference", 1
    };

    NatureBattleStylePreference obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["high_hp_preference"] == output["high_hp_preference"]);




}



