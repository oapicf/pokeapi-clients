
#include "SuperContestEffectDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_SuperContestEffectDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    SuperContestEffectDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_SuperContestEffectDetail_appeal_is_assigned_from_json()
{
    bourne::json input =
    {
        "appeal", 1
    };

    SuperContestEffectDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAppeal());








}





void test_SuperContestEffectDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    SuperContestEffectDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_SuperContestEffectDetail_appeal_is_converted_to_json()
{
    bourne::json input =
    {
        "appeal", 1
    };

    SuperContestEffectDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["appeal"] == output["appeal"]);




}




