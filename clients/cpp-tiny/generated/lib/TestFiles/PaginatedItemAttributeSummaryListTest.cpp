
#include "PaginatedItemAttributeSummaryList.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_PaginatedItemAttributeSummaryList_count_is_assigned_from_json()
{
    bourne::json input =
    {
        "count", 1
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCount());








}


void test_PaginatedItemAttributeSummaryList_next_is_assigned_from_json()
{


    bourne::json input =
    {
        "next", "hello"
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getNext().c_str());






}


void test_PaginatedItemAttributeSummaryList_previous_is_assigned_from_json()
{


    bourne::json input =
    {
        "previous", "hello"
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPrevious().c_str());






}




void test_PaginatedItemAttributeSummaryList_count_is_converted_to_json()
{
    bourne::json input =
    {
        "count", 1
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["count"] == output["count"]);




}


void test_PaginatedItemAttributeSummaryList_next_is_converted_to_json()
{

    bourne::json input =
    {
        "next", "hello"
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["next"] == output["next"]);



}


void test_PaginatedItemAttributeSummaryList_previous_is_converted_to_json()
{

    bourne::json input =
    {
        "previous", "hello"
    };

    PaginatedItemAttributeSummaryList obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["previous"] == output["previous"]);



}



