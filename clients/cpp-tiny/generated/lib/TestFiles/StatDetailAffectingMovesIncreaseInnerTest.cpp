
#include "StatDetail_affecting_moves_increase_inner.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_StatDetail_affecting_moves_increase_inner_change_is_assigned_from_json()
{
    bourne::json input =
    {
        "change", 1
    };

    StatDetail_affecting_moves_increase_inner obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChange());








}




void test_StatDetail_affecting_moves_increase_inner_change_is_converted_to_json()
{
    bourne::json input =
    {
        "change", 1
    };

    StatDetail_affecting_moves_increase_inner obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["change"] == output["change"]);




}



