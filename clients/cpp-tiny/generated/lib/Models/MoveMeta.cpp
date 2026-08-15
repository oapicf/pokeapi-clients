

#include "MoveMeta.h"

using namespace Tiny;

MoveMeta::MoveMeta()
{
	ailment = MoveMetaAilmentSummary();
	category = MoveMetaCategorySummary();
	min_hits = int(0);
	max_hits = int(0);
	min_turns = int(0);
	max_turns = int(0);
	drain = int(0);
	healing = int(0);
	crit_rate = int(0);
	ailment_chance = int(0);
	flinch_chance = int(0);
	stat_chance = int(0);
}

MoveMeta::MoveMeta(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveMeta::~MoveMeta()
{

}

void
MoveMeta::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ailmentKey = "ailment";

    if(object.has_key(ailmentKey))
    {
        bourne::json value = object[ailmentKey];




        MoveMetaAilmentSummary* obj = &ailment;
		obj->fromJson(value.dump());

    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];




        MoveMetaCategorySummary* obj = &category;
		obj->fromJson(value.dump());

    }

    const char *min_hitsKey = "min_hits";

    if(object.has_key(min_hitsKey))
    {
        bourne::json value = object[min_hitsKey];



        jsonToValue(&min_hits, value, "int");


    }

    const char *max_hitsKey = "max_hits";

    if(object.has_key(max_hitsKey))
    {
        bourne::json value = object[max_hitsKey];



        jsonToValue(&max_hits, value, "int");


    }

    const char *min_turnsKey = "min_turns";

    if(object.has_key(min_turnsKey))
    {
        bourne::json value = object[min_turnsKey];



        jsonToValue(&min_turns, value, "int");


    }

    const char *max_turnsKey = "max_turns";

    if(object.has_key(max_turnsKey))
    {
        bourne::json value = object[max_turnsKey];



        jsonToValue(&max_turns, value, "int");


    }

    const char *drainKey = "drain";

    if(object.has_key(drainKey))
    {
        bourne::json value = object[drainKey];



        jsonToValue(&drain, value, "int");


    }

    const char *healingKey = "healing";

    if(object.has_key(healingKey))
    {
        bourne::json value = object[healingKey];



        jsonToValue(&healing, value, "int");


    }

    const char *crit_rateKey = "crit_rate";

    if(object.has_key(crit_rateKey))
    {
        bourne::json value = object[crit_rateKey];



        jsonToValue(&crit_rate, value, "int");


    }

    const char *ailment_chanceKey = "ailment_chance";

    if(object.has_key(ailment_chanceKey))
    {
        bourne::json value = object[ailment_chanceKey];



        jsonToValue(&ailment_chance, value, "int");


    }

    const char *flinch_chanceKey = "flinch_chance";

    if(object.has_key(flinch_chanceKey))
    {
        bourne::json value = object[flinch_chanceKey];



        jsonToValue(&flinch_chance, value, "int");


    }

    const char *stat_chanceKey = "stat_chance";

    if(object.has_key(stat_chanceKey))
    {
        bourne::json value = object[stat_chanceKey];



        jsonToValue(&stat_chance, value, "int");


    }


}

bourne::json
MoveMeta::toJson()
{
    bourne::json object = bourne::json::object();






	object["ailment"] = getAilment().toJson();






	object["category"] = getCategory().toJson();





    object["min_hits"] = getMinHits();






    object["max_hits"] = getMaxHits();






    object["min_turns"] = getMinTurns();






    object["max_turns"] = getMaxTurns();






    object["drain"] = getDrain();






    object["healing"] = getHealing();






    object["crit_rate"] = getCritRate();






    object["ailment_chance"] = getAilmentChance();






    object["flinch_chance"] = getFlinchChance();






    object["stat_chance"] = getStatChance();



    return object;

}

MoveMetaAilmentSummary
MoveMeta::getAilment()
{
	return ailment;
}

void
MoveMeta::setAilment(MoveMetaAilmentSummary  ailment)
{
	this->ailment = ailment;
}

MoveMetaCategorySummary
MoveMeta::getCategory()
{
	return category;
}

void
MoveMeta::setCategory(MoveMetaCategorySummary  category)
{
	this->category = category;
}

int
MoveMeta::getMinHits()
{
	return min_hits;
}

void
MoveMeta::setMinHits(int  min_hits)
{
	this->min_hits = min_hits;
}

int
MoveMeta::getMaxHits()
{
	return max_hits;
}

void
MoveMeta::setMaxHits(int  max_hits)
{
	this->max_hits = max_hits;
}

int
MoveMeta::getMinTurns()
{
	return min_turns;
}

void
MoveMeta::setMinTurns(int  min_turns)
{
	this->min_turns = min_turns;
}

int
MoveMeta::getMaxTurns()
{
	return max_turns;
}

void
MoveMeta::setMaxTurns(int  max_turns)
{
	this->max_turns = max_turns;
}

int
MoveMeta::getDrain()
{
	return drain;
}

void
MoveMeta::setDrain(int  drain)
{
	this->drain = drain;
}

int
MoveMeta::getHealing()
{
	return healing;
}

void
MoveMeta::setHealing(int  healing)
{
	this->healing = healing;
}

int
MoveMeta::getCritRate()
{
	return crit_rate;
}

void
MoveMeta::setCritRate(int  crit_rate)
{
	this->crit_rate = crit_rate;
}

int
MoveMeta::getAilmentChance()
{
	return ailment_chance;
}

void
MoveMeta::setAilmentChance(int  ailment_chance)
{
	this->ailment_chance = ailment_chance;
}

int
MoveMeta::getFlinchChance()
{
	return flinch_chance;
}

void
MoveMeta::setFlinchChance(int  flinch_chance)
{
	this->flinch_chance = flinch_chance;
}

int
MoveMeta::getStatChance()
{
	return stat_chance;
}

void
MoveMeta::setStatChance(int  stat_chance)
{
	this->stat_chance = stat_chance;
}



