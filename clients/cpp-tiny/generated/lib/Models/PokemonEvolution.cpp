

#include "PokemonEvolution.h"

using namespace Tiny;

PokemonEvolution::PokemonEvolution()
{
	version_group = null;
	is_default = bool(false);
	item = null;
	trigger = null;
	gender = int(0);
	held_item = null;
	known_move = PokemonEvolution_known_move();
	known_move_type = PokemonEvolution_known_move();
	location = null;
	min_level = int(0);
	min_happiness = int(0);
	min_beauty = int(0);
	min_affection = int(0);
	near_special_rock = bool(false);
	needs_multiplayer = bool(false);
	needs_overworld_rain = bool(false);
	party_species = null;
	party_type = null;
	relative_physical_stats = int(0);
	time_of_day = std::string();
	trade_species = null;
	turn_upside_down = bool(false);
	region = null;
	required_pokemon_form = null;
	evolved_pokemon_form = null;
	used_move = null;
	min_move_count = int(0);
	min_steps = int(0);
	min_damage_taken = int(0);
	allowed_natures = std::list<NatureSummary>();
	condition_expression = null;
}

PokemonEvolution::PokemonEvolution(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonEvolution::~PokemonEvolution()
{

}

void
PokemonEvolution::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }

    const char *is_defaultKey = "is_default";

    if(object.has_key(is_defaultKey))
    {
        bourne::json value = object[is_defaultKey];



        jsonToValue(&is_default, value, "bool");


    }

    const char *itemKey = "item";

    if(object.has_key(itemKey))
    {
        bourne::json value = object[itemKey];




        ItemSummary* obj = &item;
		obj->fromJson(value.dump());

    }

    const char *triggerKey = "trigger";

    if(object.has_key(triggerKey))
    {
        bourne::json value = object[triggerKey];




        EvolutionTriggerSummary* obj = &trigger;
		obj->fromJson(value.dump());

    }

    const char *genderKey = "gender";

    if(object.has_key(genderKey))
    {
        bourne::json value = object[genderKey];



        jsonToValue(&gender, value, "int");


    }

    const char *held_itemKey = "held_item";

    if(object.has_key(held_itemKey))
    {
        bourne::json value = object[held_itemKey];




        ItemSummary* obj = &held_item;
		obj->fromJson(value.dump());

    }

    const char *known_moveKey = "known_move";

    if(object.has_key(known_moveKey))
    {
        bourne::json value = object[known_moveKey];




        PokemonEvolution_known_move* obj = &known_move;
		obj->fromJson(value.dump());

    }

    const char *known_move_typeKey = "known_move_type";

    if(object.has_key(known_move_typeKey))
    {
        bourne::json value = object[known_move_typeKey];




        PokemonEvolution_known_move* obj = &known_move_type;
		obj->fromJson(value.dump());

    }

    const char *locationKey = "location";

    if(object.has_key(locationKey))
    {
        bourne::json value = object[locationKey];




        LocationSummary* obj = &location;
		obj->fromJson(value.dump());

    }

    const char *min_levelKey = "min_level";

    if(object.has_key(min_levelKey))
    {
        bourne::json value = object[min_levelKey];



        jsonToValue(&min_level, value, "int");


    }

    const char *min_happinessKey = "min_happiness";

    if(object.has_key(min_happinessKey))
    {
        bourne::json value = object[min_happinessKey];



        jsonToValue(&min_happiness, value, "int");


    }

    const char *min_beautyKey = "min_beauty";

    if(object.has_key(min_beautyKey))
    {
        bourne::json value = object[min_beautyKey];



        jsonToValue(&min_beauty, value, "int");


    }

    const char *min_affectionKey = "min_affection";

    if(object.has_key(min_affectionKey))
    {
        bourne::json value = object[min_affectionKey];



        jsonToValue(&min_affection, value, "int");


    }

    const char *near_special_rockKey = "near_special_rock";

    if(object.has_key(near_special_rockKey))
    {
        bourne::json value = object[near_special_rockKey];



        jsonToValue(&near_special_rock, value, "bool");


    }

    const char *needs_multiplayerKey = "needs_multiplayer";

    if(object.has_key(needs_multiplayerKey))
    {
        bourne::json value = object[needs_multiplayerKey];



        jsonToValue(&needs_multiplayer, value, "bool");


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




        PokemonSpeciesSummary* obj = &party_species;
		obj->fromJson(value.dump());

    }

    const char *party_typeKey = "party_type";

    if(object.has_key(party_typeKey))
    {
        bourne::json value = object[party_typeKey];




        TypeSummary* obj = &party_type;
		obj->fromJson(value.dump());

    }

    const char *relative_physical_statsKey = "relative_physical_stats";

    if(object.has_key(relative_physical_statsKey))
    {
        bourne::json value = object[relative_physical_statsKey];



        jsonToValue(&relative_physical_stats, value, "int");


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




        PokemonSpeciesSummary* obj = &trade_species;
		obj->fromJson(value.dump());

    }

    const char *turn_upside_downKey = "turn_upside_down";

    if(object.has_key(turn_upside_downKey))
    {
        bourne::json value = object[turn_upside_downKey];



        jsonToValue(&turn_upside_down, value, "bool");


    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];




        RegionSummary* obj = &region;
		obj->fromJson(value.dump());

    }

    const char *required_pokemon_formKey = "required_pokemon_form";

    if(object.has_key(required_pokemon_formKey))
    {
        bourne::json value = object[required_pokemon_formKey];




        PokemonFormSummary* obj = &required_pokemon_form;
		obj->fromJson(value.dump());

    }

    const char *evolved_pokemon_formKey = "evolved_pokemon_form";

    if(object.has_key(evolved_pokemon_formKey))
    {
        bourne::json value = object[evolved_pokemon_formKey];




        PokemonFormSummary* obj = &evolved_pokemon_form;
		obj->fromJson(value.dump());

    }

    const char *used_moveKey = "used_move";

    if(object.has_key(used_moveKey))
    {
        bourne::json value = object[used_moveKey];




        MoveSummary* obj = &used_move;
		obj->fromJson(value.dump());

    }

    const char *min_move_countKey = "min_move_count";

    if(object.has_key(min_move_countKey))
    {
        bourne::json value = object[min_move_countKey];



        jsonToValue(&min_move_count, value, "int");


    }

    const char *min_stepsKey = "min_steps";

    if(object.has_key(min_stepsKey))
    {
        bourne::json value = object[min_stepsKey];



        jsonToValue(&min_steps, value, "int");


    }

    const char *min_damage_takenKey = "min_damage_taken";

    if(object.has_key(min_damage_takenKey))
    {
        bourne::json value = object[min_damage_takenKey];



        jsonToValue(&min_damage_taken, value, "int");


    }

    const char *allowed_naturesKey = "allowed_natures";

    if(object.has_key(allowed_naturesKey))
    {
        bourne::json value = object[allowed_naturesKey];


        std::list<NatureSummary> allowed_natures_list;
        NatureSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            allowed_natures_list.push_back(element);
        }
        allowed_natures = allowed_natures_list;


    }

    const char *condition_expressionKey = "condition_expression";

    if(object.has_key(condition_expressionKey))
    {
        bourne::json value = object[condition_expressionKey];




        EvolutionConditionExpression* obj = &condition_expression;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonEvolution::toJson()
{
    bourne::json object = bourne::json::object();






	object["version_group"] = getVersionGroup().toJson();





    object["is_default"] = isIsDefault();







	object["item"] = getItem().toJson();






	object["trigger"] = getTrigger().toJson();





    object["gender"] = getGender();







	object["held_item"] = getHeldItem().toJson();






	object["known_move"] = getKnownMove().toJson();






	object["known_move_type"] = getKnownMoveType().toJson();






	object["location"] = getLocation().toJson();





    object["min_level"] = getMinLevel();






    object["min_happiness"] = getMinHappiness();






    object["min_beauty"] = getMinBeauty();






    object["min_affection"] = getMinAffection();






    object["near_special_rock"] = isNearSpecialRock();






    object["needs_multiplayer"] = isNeedsMultiplayer();






    object["needs_overworld_rain"] = isNeedsOverworldRain();







	object["party_species"] = getPartySpecies().toJson();






	object["party_type"] = getPartyType().toJson();





    object["relative_physical_stats"] = getRelativePhysicalStats();






    object["time_of_day"] = getTimeOfDay();







	object["trade_species"] = getTradeSpecies().toJson();





    object["turn_upside_down"] = isTurnUpsideDown();







	object["region"] = getRegion().toJson();






	object["required_pokemon_form"] = getRequiredPokemonForm().toJson();






	object["evolved_pokemon_form"] = getEvolvedPokemonForm().toJson();






	object["used_move"] = getUsedMove().toJson();





    object["min_move_count"] = getMinMoveCount();






    object["min_steps"] = getMinSteps();






    object["min_damage_taken"] = getMinDamageTaken();





    std::list<NatureSummary> allowed_natures_list = getAllowedNatures();
    bourne::json allowed_natures_arr = bourne::json::array();

    for(auto& var : allowed_natures_list)
    {
        NatureSummary obj = var;
        allowed_natures_arr.append(obj.toJson());
    }
    object["allowed_natures"] = allowed_natures_arr;








	object["condition_expression"] = getConditionExpression().toJson();


    return object;

}

VersionGroupSummary
PokemonEvolution::getVersionGroup()
{
	return version_group;
}

void
PokemonEvolution::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}

bool
PokemonEvolution::isIsDefault()
{
	return is_default;
}

void
PokemonEvolution::setIsDefault(bool is_default)
{
	this->is_default = is_default;
}

ItemSummary
PokemonEvolution::getItem()
{
	return item;
}

void
PokemonEvolution::setItem(ItemSummary item)
{
	this->item = item;
}

EvolutionTriggerSummary
PokemonEvolution::getTrigger()
{
	return trigger;
}

void
PokemonEvolution::setTrigger(EvolutionTriggerSummary trigger)
{
	this->trigger = trigger;
}

int
PokemonEvolution::getGender()
{
	return gender;
}

void
PokemonEvolution::setGender(int gender)
{
	this->gender = gender;
}

ItemSummary
PokemonEvolution::getHeldItem()
{
	return held_item;
}

void
PokemonEvolution::setHeldItem(ItemSummary held_item)
{
	this->held_item = held_item;
}

PokemonEvolution_known_move
PokemonEvolution::getKnownMove()
{
	return known_move;
}

void
PokemonEvolution::setKnownMove(PokemonEvolution_known_move known_move)
{
	this->known_move = known_move;
}

PokemonEvolution_known_move
PokemonEvolution::getKnownMoveType()
{
	return known_move_type;
}

void
PokemonEvolution::setKnownMoveType(PokemonEvolution_known_move known_move_type)
{
	this->known_move_type = known_move_type;
}

LocationSummary
PokemonEvolution::getLocation()
{
	return location;
}

void
PokemonEvolution::setLocation(LocationSummary location)
{
	this->location = location;
}

int
PokemonEvolution::getMinLevel()
{
	return min_level;
}

void
PokemonEvolution::setMinLevel(int min_level)
{
	this->min_level = min_level;
}

int
PokemonEvolution::getMinHappiness()
{
	return min_happiness;
}

void
PokemonEvolution::setMinHappiness(int min_happiness)
{
	this->min_happiness = min_happiness;
}

int
PokemonEvolution::getMinBeauty()
{
	return min_beauty;
}

void
PokemonEvolution::setMinBeauty(int min_beauty)
{
	this->min_beauty = min_beauty;
}

int
PokemonEvolution::getMinAffection()
{
	return min_affection;
}

void
PokemonEvolution::setMinAffection(int min_affection)
{
	this->min_affection = min_affection;
}

bool
PokemonEvolution::isNearSpecialRock()
{
	return near_special_rock;
}

void
PokemonEvolution::setNearSpecialRock(bool near_special_rock)
{
	this->near_special_rock = near_special_rock;
}

bool
PokemonEvolution::isNeedsMultiplayer()
{
	return needs_multiplayer;
}

void
PokemonEvolution::setNeedsMultiplayer(bool needs_multiplayer)
{
	this->needs_multiplayer = needs_multiplayer;
}

bool
PokemonEvolution::isNeedsOverworldRain()
{
	return needs_overworld_rain;
}

void
PokemonEvolution::setNeedsOverworldRain(bool needs_overworld_rain)
{
	this->needs_overworld_rain = needs_overworld_rain;
}

PokemonSpeciesSummary
PokemonEvolution::getPartySpecies()
{
	return party_species;
}

void
PokemonEvolution::setPartySpecies(PokemonSpeciesSummary party_species)
{
	this->party_species = party_species;
}

TypeSummary
PokemonEvolution::getPartyType()
{
	return party_type;
}

void
PokemonEvolution::setPartyType(TypeSummary party_type)
{
	this->party_type = party_type;
}

int
PokemonEvolution::getRelativePhysicalStats()
{
	return relative_physical_stats;
}

void
PokemonEvolution::setRelativePhysicalStats(int relative_physical_stats)
{
	this->relative_physical_stats = relative_physical_stats;
}

std::string
PokemonEvolution::getTimeOfDay()
{
	return time_of_day;
}

void
PokemonEvolution::setTimeOfDay(std::string time_of_day)
{
	this->time_of_day = time_of_day;
}

PokemonSpeciesSummary
PokemonEvolution::getTradeSpecies()
{
	return trade_species;
}

void
PokemonEvolution::setTradeSpecies(PokemonSpeciesSummary trade_species)
{
	this->trade_species = trade_species;
}

bool
PokemonEvolution::isTurnUpsideDown()
{
	return turn_upside_down;
}

void
PokemonEvolution::setTurnUpsideDown(bool turn_upside_down)
{
	this->turn_upside_down = turn_upside_down;
}

RegionSummary
PokemonEvolution::getRegion()
{
	return region;
}

void
PokemonEvolution::setRegion(RegionSummary region)
{
	this->region = region;
}

PokemonFormSummary
PokemonEvolution::getRequiredPokemonForm()
{
	return required_pokemon_form;
}

void
PokemonEvolution::setRequiredPokemonForm(PokemonFormSummary required_pokemon_form)
{
	this->required_pokemon_form = required_pokemon_form;
}

PokemonFormSummary
PokemonEvolution::getEvolvedPokemonForm()
{
	return evolved_pokemon_form;
}

void
PokemonEvolution::setEvolvedPokemonForm(PokemonFormSummary evolved_pokemon_form)
{
	this->evolved_pokemon_form = evolved_pokemon_form;
}

MoveSummary
PokemonEvolution::getUsedMove()
{
	return used_move;
}

void
PokemonEvolution::setUsedMove(MoveSummary used_move)
{
	this->used_move = used_move;
}

int
PokemonEvolution::getMinMoveCount()
{
	return min_move_count;
}

void
PokemonEvolution::setMinMoveCount(int min_move_count)
{
	this->min_move_count = min_move_count;
}

int
PokemonEvolution::getMinSteps()
{
	return min_steps;
}

void
PokemonEvolution::setMinSteps(int min_steps)
{
	this->min_steps = min_steps;
}

int
PokemonEvolution::getMinDamageTaken()
{
	return min_damage_taken;
}

void
PokemonEvolution::setMinDamageTaken(int min_damage_taken)
{
	this->min_damage_taken = min_damage_taken;
}

std::list<NatureSummary>
PokemonEvolution::getAllowedNatures()
{
	return allowed_natures;
}

void
PokemonEvolution::setAllowedNatures(std::list<NatureSummary> allowed_natures)
{
	this->allowed_natures = allowed_natures;
}

EvolutionConditionExpression
PokemonEvolution::getConditionExpression()
{
	return condition_expression;
}

void
PokemonEvolution::setConditionExpression(EvolutionConditionExpression condition_expression)
{
	this->condition_expression = condition_expression;
}



