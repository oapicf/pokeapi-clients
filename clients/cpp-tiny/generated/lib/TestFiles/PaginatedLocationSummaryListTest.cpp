
#include "PaginatedLocationSummaryList.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PaginatedLocationSummaryList_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    PaginatedLocationSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}


void test_PaginatedLocationSummaryList_next_is_assigned_from_json()
{


    bourne::json input =
    {
        "next", "hello"
    };

    PaginatedLocationSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNext().c_str());






}


void test_PaginatedLocationSummaryList_previous_is_assigned_from_json()
{


    bourne::json input =
    {
        "previous", "hello"
    };

    PaginatedLocationSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrevious().c_str());






}




void test_PaginatedLocationSummaryList_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    PaginatedLocationSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}


void test_PaginatedLocationSummaryList_next_is_converted_to_json()
{

    bourne::json input =
    {
        "next", "hello"
    };

    PaginatedLocationSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["next"] == output["next"]);



}


void test_PaginatedLocationSummaryList_previous_is_converted_to_json()
{

    bourne::json input =
    {
        "previous", "hello"
    };

    PaginatedLocationSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["previous"] == output["previous"]);



}



