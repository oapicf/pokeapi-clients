
#include "ItemPrice.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ItemPrice_purchase_price_is_assigned_from_json()
{
    bourne::json input =
    {
        "purchase_price", 1
    };

    ItemPrice obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getPurchasePrice());








}


void test_ItemPrice_sell_price_is_assigned_from_json()
{
    bourne::json input =
    {
        "sell_price", 1
    };

    ItemPrice obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSellPrice());








}





void test_ItemPrice_purchase_price_is_converted_to_json()
{
    bourne::json input =
    {
        "purchase_price", 1
    };

    ItemPrice obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["purchase_price"] == output["purchase_price"]);




}


void test_ItemPrice_sell_price_is_converted_to_json()
{
    bourne::json input =
    {
        "sell_price", 1
    };

    ItemPrice obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sell_price"] == output["sell_price"]);




}




