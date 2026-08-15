
#include "BerryDetail.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_BerryDetail_id_is_assigned_from_json()
{
    bourne::json input =
    {
        "id", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getId());








}


void test_BerryDetail_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_BerryDetail_growth_time_is_assigned_from_json()
{
    bourne::json input =
    {
        "growth_time", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getGrowthTime());








}


void test_BerryDetail_max_harvest_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_harvest", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxHarvest());








}


void test_BerryDetail_natural_gift_power_is_assigned_from_json()
{
    bourne::json input =
    {
        "natural_gift_power", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getNaturalGiftPower());








}


void test_BerryDetail_size_is_assigned_from_json()
{
    bourne::json input =
    {
        "size", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSize());








}


void test_BerryDetail_smoothness_is_assigned_from_json()
{
    bourne::json input =
    {
        "smoothness", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSmoothness());








}


void test_BerryDetail_soil_dryness_is_assigned_from_json()
{
    bourne::json input =
    {
        "soil_dryness", 1
    };

    BerryDetail obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSoilDryness());








}







void test_BerryDetail_id_is_converted_to_json()
{
    bourne::json input =
    {
        "id", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);




}


void test_BerryDetail_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_BerryDetail_growth_time_is_converted_to_json()
{
    bourne::json input =
    {
        "growth_time", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["growth_time"] == output["growth_time"]);




}


void test_BerryDetail_max_harvest_is_converted_to_json()
{
    bourne::json input =
    {
        "max_harvest", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_harvest"] == output["max_harvest"]);




}


void test_BerryDetail_natural_gift_power_is_converted_to_json()
{
    bourne::json input =
    {
        "natural_gift_power", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["natural_gift_power"] == output["natural_gift_power"]);




}


void test_BerryDetail_size_is_converted_to_json()
{
    bourne::json input =
    {
        "size", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["size"] == output["size"]);




}


void test_BerryDetail_smoothness_is_converted_to_json()
{
    bourne::json input =
    {
        "smoothness", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["smoothness"] == output["smoothness"]);




}


void test_BerryDetail_soil_dryness_is_converted_to_json()
{
    bourne::json input =
    {
        "soil_dryness", 1
    };

    BerryDetail obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["soil_dryness"] == output["soil_dryness"]);




}






