
#include "MoveMeta.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"





void test_MoveMeta_min_hits_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_hits", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinHits());








}


void test_MoveMeta_max_hits_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_hits", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxHits());








}


void test_MoveMeta_min_turns_is_assigned_from_json()
{
    bourne::json input =
    {
        "min_turns", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMinTurns());








}


void test_MoveMeta_max_turns_is_assigned_from_json()
{
    bourne::json input =
    {
        "max_turns", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getMaxTurns());








}


void test_MoveMeta_drain_is_assigned_from_json()
{
    bourne::json input =
    {
        "drain", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getDrain());








}


void test_MoveMeta_healing_is_assigned_from_json()
{
    bourne::json input =
    {
        "healing", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHealing());








}


void test_MoveMeta_crit_rate_is_assigned_from_json()
{
    bourne::json input =
    {
        "crit_rate", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getCritRate());








}


void test_MoveMeta_ailment_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "ailment_chance", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getAilmentChance());








}


void test_MoveMeta_flinch_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "flinch_chance", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getFlinchChance());








}


void test_MoveMeta_stat_chance_is_assigned_from_json()
{
    bourne::json input =
    {
        "stat_chance", 1
    };

    MoveMeta obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getStatChance());








}





void test_MoveMeta_min_hits_is_converted_to_json()
{
    bourne::json input =
    {
        "min_hits", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_hits"] == output["min_hits"]);




}


void test_MoveMeta_max_hits_is_converted_to_json()
{
    bourne::json input =
    {
        "max_hits", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_hits"] == output["max_hits"]);




}


void test_MoveMeta_min_turns_is_converted_to_json()
{
    bourne::json input =
    {
        "min_turns", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["min_turns"] == output["min_turns"]);




}


void test_MoveMeta_max_turns_is_converted_to_json()
{
    bourne::json input =
    {
        "max_turns", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["max_turns"] == output["max_turns"]);




}


void test_MoveMeta_drain_is_converted_to_json()
{
    bourne::json input =
    {
        "drain", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["drain"] == output["drain"]);




}


void test_MoveMeta_healing_is_converted_to_json()
{
    bourne::json input =
    {
        "healing", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["healing"] == output["healing"]);




}


void test_MoveMeta_crit_rate_is_converted_to_json()
{
    bourne::json input =
    {
        "crit_rate", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["crit_rate"] == output["crit_rate"]);




}


void test_MoveMeta_ailment_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "ailment_chance", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ailment_chance"] == output["ailment_chance"]);




}


void test_MoveMeta_flinch_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "flinch_chance", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["flinch_chance"] == output["flinch_chance"]);




}


void test_MoveMeta_stat_chance_is_converted_to_json()
{
    bourne::json input =
    {
        "stat_chance", 1
    };

    MoveMeta obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["stat_chance"] == output["stat_chance"]);




}


