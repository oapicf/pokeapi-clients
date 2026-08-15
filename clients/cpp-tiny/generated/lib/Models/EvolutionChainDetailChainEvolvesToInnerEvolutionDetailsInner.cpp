

#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h"

using namespace Tiny;

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner()
{
	gender = EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	held_item = EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	item = EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	known_move = null;
	known_move_type = null;
	location = EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	min_affection = int(0);
	min_beauty = int(0);
	min_happiness = int(0);
	min_level = int(0);
	needs_overworld_rain = bool(false);
	party_species = std::string();
	party_type = std::string();
	relative_physical_stats = std::string();
	time_of_day = std::string();
	trade_species = std::string();
	trigger = AbilityDetail_pokemon_inner_pokemon();
	turn_upside_down = bool(false);
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner()
{

}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *genderKey = "gender";

    if(object.has_key(genderKey))
    {
        bourne::json value = object[genderKey];




        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = &gender;
		obj->fromJson(value.dump());

    }

    const char *held_itemKey = "held_item";

    if(object.has_key(held_itemKey))
    {
        bourne::json value = object[held_itemKey];




        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = &held_item;
		obj->fromJson(value.dump());

    }

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *known_moveKey = "known_move";

    if(object.has_key(known_moveKey))
    {
        bourne::json value = object[known_moveKey];




        Object* obj = &known_move;
		obj->fromJson(value.dump());

    }

    const char *known_move_typeKey = "known_move_type";

    if(object.has_key(known_move_typeKey))
    {
        bourne::json value = object[known_move_typeKey];




        Object* obj = &known_move_type;
		obj->fromJson(value.dump());

    }

    const char *locationKey = "location";

    if(object.has_key(locationKey))
    {
        bourne::json value = object[locationKey];




        EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = &location;
		obj->fromJson(value.dump());

    }

    const char *min_affectionKey = "min_affection";

    if(object.has_key(min_affectionKey))
    {
        bourne::json value = object[min_affectionKey];



        jsonToValue(&min_affection, value, "int");


    }

    const char *min_beautyKey = "min_beauty";

    if(object.has_key(min_beautyKey))
    {
        bourne::json value = object[min_beautyKey];



        jsonToValue(&min_beauty, value, "int");


    }

    const char *min_happinessKey = "min_happiness";

    if(object.has_key(min_happinessKey))
    {
        bourne::json value = object[min_happinessKey];



        jsonToValue(&min_happiness, value, "int");


    }

    const char *min_levelKey = "min_level";

    if(object.has_key(min_levelKey))
    {
        bourne::json value = object[min_levelKey];



        jsonToValue(&min_level, value, "int");


    }

    const char *needs_overworld_rainKey = "needs_overworld_rain";

    if(object.has_key(needs_overworld_rainKey))
    {
        bourne::json value = object[needs_overworld_rainKey];



        jsonToValue(&needs_overworld_rain, value, "bool");


    }

    const char *party_speciesKey = "party_species";

    if(object.has_key(party_speciesKey))
    {
        bourne::json value = object[party_speciesKey];



        jsonToValue(&party_species, value, "std::string");


    }

    const char *party_typeKey = "party_type";

    if(object.has_key(party_typeKey))
    {
        bourne::json value = object[party_typeKey];



        jsonToValue(&party_type, value, "std::string");


    }

    const char *relative_physical_statsKey = "relative_physical_stats";

    if(object.has_key(relative_physical_statsKey))
    {
        bourne::json value = object[relative_physical_statsKey];



        jsonToValue(&relative_physical_stats, value, "std::string");


    }

    const char *time_of_dayKey = "time_of_day";

    if(object.has_key(time_of_dayKey))
    {
        bourne::json value = object[time_of_dayKey];



        jsonToValue(&time_of_day, value, "std::string");


    }

    const char *trade_speciesKey = "trade_species";

    if(object.has_key(trade_speciesKey))
    {
        bourne::json value = object[trade_speciesKey];



        jsonToValue(&trade_species, value, "std::string");


    }

    const char *triggerKey = "trigger";

    if(object.has_key(triggerKey))
    {
        bourne::json value = object[triggerKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &trigger;
		obj->fromJson(value.dump());

    }

    const char *turn_upside_downKey = "turn_upside_down";

    if(object.has_key(turn_upside_downKey))
    {
        bourne::json value = object[turn_upside_downKey];



        jsonToValue(&turn_upside_down, value, "bool");


    }


}

bourne::json
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["gender"] = getGender().toJson();






	object["held_item"] = getHeldItem().toJson();






	object["item"] = getItem().toJson();






	object["known_move"] = getKnownMove().toJson();






	object["known_move_type"] = getKnownMoveType().toJson();






	object["location"] = getLocation().toJson();





    object["min_affection"] = getMinAffection();






    object["min_beauty"] = getMinBeauty();






    object["min_happiness"] = getMinHappiness();






    object["min_level"] = getMinLevel();






    object["needs_overworld_rain"] = isNeedsOverworldRain();






    object["party_species"] = getPartySpecies();






    object["party_type"] = getPartyType();






    object["relative_physical_stats"] = getRelativePhysicalStats();






    object["time_of_day"] = getTimeOfDay();






    object["trade_species"] = getTradeSpecies();







	object["trigger"] = getTrigger().toJson();





    object["turn_upside_down"] = isTurnUpsideDown();



    return object;

}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getGender()
{
	return gender;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setGender(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  gender)
{
	this->gender = gender;
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getHeldItem()
{
	return held_item;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setHeldItem(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  held_item)
{
	this->held_item = held_item;
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getItem()
{
	return item;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setItem(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  item)
{
	this->item = item;
}

Object
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getKnownMove()
{
	return known_move;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setKnownMove(Object  known_move)
{
	this->known_move = known_move;
}

Object
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getKnownMoveType()
{
	return known_move_type;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setKnownMoveType(Object  known_move_type)
{
	this->known_move_type = known_move_type;
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getLocation()
{
	return location;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setLocation(EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender  location)
{
	this->location = location;
}

int
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getMinAffection()
{
	return min_affection;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setMinAffection(int  min_affection)
{
	this->min_affection = min_affection;
}

int
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getMinBeauty()
{
	return min_beauty;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setMinBeauty(int  min_beauty)
{
	this->min_beauty = min_beauty;
}

int
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getMinHappiness()
{
	return min_happiness;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setMinHappiness(int  min_happiness)
{
	this->min_happiness = min_happiness;
}

int
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getMinLevel()
{
	return min_level;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setMinLevel(int  min_level)
{
	this->min_level = min_level;
}

bool
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::isNeedsOverworldRain()
{
	return needs_overworld_rain;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setNeedsOverworldRain(bool  needs_overworld_rain)
{
	this->needs_overworld_rain = needs_overworld_rain;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getPartySpecies()
{
	return party_species;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setPartySpecies(std::string  party_species)
{
	this->party_species = party_species;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getPartyType()
{
	return party_type;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setPartyType(std::string  party_type)
{
	this->party_type = party_type;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getRelativePhysicalStats()
{
	return relative_physical_stats;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setRelativePhysicalStats(std::string  relative_physical_stats)
{
	this->relative_physical_stats = relative_physical_stats;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getTimeOfDay()
{
	return time_of_day;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setTimeOfDay(std::string  time_of_day)
{
	this->time_of_day = time_of_day;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getTradeSpecies()
{
	return trade_species;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setTradeSpecies(std::string  trade_species)
{
	this->trade_species = trade_species;
}

AbilityDetail_pokemon_inner_pokemon
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getTrigger()
{
	return trigger;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setTrigger(AbilityDetail_pokemon_inner_pokemon  trigger)
{
	this->trigger = trigger;
}

bool
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::isTurnUpsideDown()
{
	return turn_upside_down;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setTurnUpsideDown(bool  turn_upside_down)
{
	this->turn_upside_down = turn_upside_down;
}



