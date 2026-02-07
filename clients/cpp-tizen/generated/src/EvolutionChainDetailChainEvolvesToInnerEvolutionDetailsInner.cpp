#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner()
{
	//__init();
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner()
{
	//__cleanup();
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::__init()
{
	//gender = new EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	//held_item = new EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	//item = new EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	//known_move = null;
	//known_move_type = null;
	//location = new EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender();
	//min_affection = int(0);
	//min_beauty = int(0);
	//min_happiness = int(0);
	//min_level = int(0);
	//needs_overworld_rain = bool(false);
	//party_species = std::string();
	//party_type = std::string();
	//relative_physical_stats = std::string();
	//time_of_day = std::string();
	//trade_species = std::string();
	//trigger = new AbilityDetail_pokemon_inner_pokemon();
	//turn_upside_down = bool(false);
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::__cleanup()
{
	//if(gender != NULL) {
	//
	//delete gender;
	//gender = NULL;
	//}
	//if(held_item != NULL) {
	//
	//delete held_item;
	//held_item = NULL;
	//}
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//if(known_move != NULL) {
	//
	//delete known_move;
	//known_move = NULL;
	//}
	//if(known_move_type != NULL) {
	//
	//delete known_move_type;
	//known_move_type = NULL;
	//}
	//if(location != NULL) {
	//
	//delete location;
	//location = NULL;
	//}
	//if(min_affection != NULL) {
	//
	//delete min_affection;
	//min_affection = NULL;
	//}
	//if(min_beauty != NULL) {
	//
	//delete min_beauty;
	//min_beauty = NULL;
	//}
	//if(min_happiness != NULL) {
	//
	//delete min_happiness;
	//min_happiness = NULL;
	//}
	//if(min_level != NULL) {
	//
	//delete min_level;
	//min_level = NULL;
	//}
	//if(needs_overworld_rain != NULL) {
	//
	//delete needs_overworld_rain;
	//needs_overworld_rain = NULL;
	//}
	//if(party_species != NULL) {
	//
	//delete party_species;
	//party_species = NULL;
	//}
	//if(party_type != NULL) {
	//
	//delete party_type;
	//party_type = NULL;
	//}
	//if(relative_physical_stats != NULL) {
	//
	//delete relative_physical_stats;
	//relative_physical_stats = NULL;
	//}
	//if(time_of_day != NULL) {
	//
	//delete time_of_day;
	//time_of_day = NULL;
	//}
	//if(trade_species != NULL) {
	//
	//delete trade_species;
	//trade_species = NULL;
	//}
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
	//}
	//if(turn_upside_down != NULL) {
	//
	//delete turn_upside_down;
	//turn_upside_down = NULL;
	//}
	//
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *genderKey = "gender";
	node = json_object_get_member(pJsonObject, genderKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
			jsonToValue(&gender, node, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender");
		} else {
			
			EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender*> (&gender);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *held_itemKey = "held_item";
	node = json_object_get_member(pJsonObject, held_itemKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
			jsonToValue(&held_item, node, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender");
		} else {
			
			EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender*> (&held_item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
			jsonToValue(&item, node, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender");
		} else {
			
			EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *known_moveKey = "known_move";
	node = json_object_get_member(pJsonObject, known_moveKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&known_move, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&known_move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *known_move_typeKey = "known_move_type";
	node = json_object_get_member(pJsonObject, known_move_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&known_move_type, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&known_move_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
			jsonToValue(&location, node, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender");
		} else {
			
			EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender* obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender*> (&location);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *min_affectionKey = "min_affection";
	node = json_object_get_member(pJsonObject, min_affectionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_affection, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_beautyKey = "min_beauty";
	node = json_object_get_member(pJsonObject, min_beautyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_beauty, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_happinessKey = "min_happiness";
	node = json_object_get_member(pJsonObject, min_happinessKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_happiness, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_levelKey = "min_level";
	node = json_object_get_member(pJsonObject, min_levelKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_level, node, "int", "");
		} else {
			
		}
	}
	const gchar *needs_overworld_rainKey = "needs_overworld_rain";
	node = json_object_get_member(pJsonObject, needs_overworld_rainKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&needs_overworld_rain, node, "bool", "");
		} else {
			
		}
	}
	const gchar *party_speciesKey = "party_species";
	node = json_object_get_member(pJsonObject, party_speciesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&party_species, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *party_typeKey = "party_type";
	node = json_object_get_member(pJsonObject, party_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&party_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *relative_physical_statsKey = "relative_physical_stats";
	node = json_object_get_member(pJsonObject, relative_physical_statsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&relative_physical_stats, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *time_of_dayKey = "time_of_day";
	node = json_object_get_member(pJsonObject, time_of_dayKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&time_of_day, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *trade_speciesKey = "trade_species";
	node = json_object_get_member(pJsonObject, trade_speciesKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&trade_species, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&trigger, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&trigger);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *turn_upside_downKey = "turn_upside_down";
	node = json_object_get_member(pJsonObject, turn_upside_downKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&turn_upside_down, node, "bool", "");
		} else {
			
		}
	}
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner(char* json)
{
	this->fromJson(json);
}

char*
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = getGender();
		node = converttoJson(&obj, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "");
	}
	else {
		
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender> (getGender());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *genderKey = "gender";
	json_object_set_member(pJsonObject, genderKey, node);
	if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = getHeldItem();
		node = converttoJson(&obj, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "");
	}
	else {
		
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender> (getHeldItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *held_itemKey = "held_item";
	json_object_set_member(pJsonObject, held_itemKey, node);
	if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = getItem();
		node = converttoJson(&obj, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "");
	}
	else {
		
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKnownMove();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getKnownMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *known_moveKey = "known_move";
	json_object_set_member(pJsonObject, known_moveKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKnownMoveType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getKnownMoveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *known_move_typeKey = "known_move_type";
	json_object_set_member(pJsonObject, known_move_typeKey, node);
	if (isprimitive("EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender")) {
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = getLocation();
		node = converttoJson(&obj, "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender", "");
	}
	else {
		
		EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender obj = static_cast<EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender> (getLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("int")) {
		int obj = getMinAffection();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_affectionKey = "min_affection";
	json_object_set_member(pJsonObject, min_affectionKey, node);
	if (isprimitive("int")) {
		int obj = getMinBeauty();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_beautyKey = "min_beauty";
	json_object_set_member(pJsonObject, min_beautyKey, node);
	if (isprimitive("int")) {
		int obj = getMinHappiness();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_happinessKey = "min_happiness";
	json_object_set_member(pJsonObject, min_happinessKey, node);
	if (isprimitive("int")) {
		int obj = getMinLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_levelKey = "min_level";
	json_object_set_member(pJsonObject, min_levelKey, node);
	if (isprimitive("bool")) {
		bool obj = getNeedsOverworldRain();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *needs_overworld_rainKey = "needs_overworld_rain";
	json_object_set_member(pJsonObject, needs_overworld_rainKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartySpecies();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *party_speciesKey = "party_species";
	json_object_set_member(pJsonObject, party_speciesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPartyType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *party_typeKey = "party_type";
	json_object_set_member(pJsonObject, party_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRelativePhysicalStats();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *relative_physical_statsKey = "relative_physical_stats";
	json_object_set_member(pJsonObject, relative_physical_statsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTimeOfDay();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *time_of_dayKey = "time_of_day";
	json_object_set_member(pJsonObject, time_of_dayKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTradeSpecies();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *trade_speciesKey = "trade_species";
	json_object_set_member(pJsonObject, trade_speciesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getTrigger();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getTrigger());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
	if (isprimitive("bool")) {
		bool obj = getTurnUpsideDown();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *turn_upside_downKey = "turn_upside_down";
	json_object_set_member(pJsonObject, turn_upside_downKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getKnownMove()
{
	return known_move;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setKnownMove(std::string  known_move)
{
	this->known_move = known_move;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getKnownMoveType()
{
	return known_move_type;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setKnownMoveType(std::string  known_move_type)
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
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getNeedsOverworldRain()
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
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::getTurnUpsideDown()
{
	return turn_upside_down;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner::setTurnUpsideDown(bool  turn_upside_down)
{
	this->turn_upside_down = turn_upside_down;
}


