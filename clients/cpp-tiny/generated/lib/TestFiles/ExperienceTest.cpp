
#include "Experience.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Experience_level_is_assigned_from_json()
{
    bourne::json input =
    {
        "level", 1
    };

    Experience obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getLevel());








}


void test_Experience_experience_is_assigned_from_json()
{
    bourne::json input =
    {
        "experience", 1
    };

    Experience obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getExperience());








}



void test_Experience_level_is_converted_to_json()
{
    bourne::json input =
    {
        "level", 1
    };

    Experience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["level"] == output["level"]);




}


void test_Experience_experience_is_converted_to_json()
{
    bourne::json input =
    {
        "experience", 1
    };

    Experience obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["experience"] == output["experience"]);




}


