#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonEvolution.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonEvolution::PokemonEvolution()
{
	//__init();
}

PokemonEvolution::~PokemonEvolution()
{
	//__cleanup();
}

void
PokemonEvolution::__init()
{
	//version_group = null;
	//is_default = bool(false);
	//item = null;
	//trigger = null;
	//gender = int(0);
	//held_item = null;
	//known_move = new PokemonEvolution_known_move();
	//known_move_type = new PokemonEvolution_known_move();
	//location = null;
	//min_level = int(0);
	//min_happiness = int(0);
	//min_beauty = int(0);
	//min_affection = int(0);
	//near_special_rock = bool(false);
	//needs_multiplayer = bool(false);
	//needs_overworld_rain = bool(false);
	//party_species = null;
	//party_type = null;
	//relative_physical_stats = int(0);
	//time_of_day = std::string();
	//trade_species = null;
	//turn_upside_down = bool(false);
	//region = null;
	//required_pokemon_form = null;
	//evolved_pokemon_form = null;
	//used_move = null;
	//min_move_count = int(0);
	//min_steps = int(0);
	//min_damage_taken = int(0);
	//new std::list()std::list> allowed_natures;
	//condition_expression = null;
}

void
PokemonEvolution::__cleanup()
{
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(item != NULL) {
	//
	//delete item;
	//item = NULL;
	//}
	//if(trigger != NULL) {
	//
	//delete trigger;
	//trigger = NULL;
	//}
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
	//if(min_level != NULL) {
	//
	//delete min_level;
	//min_level = NULL;
	//}
	//if(min_happiness != NULL) {
	//
	//delete min_happiness;
	//min_happiness = NULL;
	//}
	//if(min_beauty != NULL) {
	//
	//delete min_beauty;
	//min_beauty = NULL;
	//}
	//if(min_affection != NULL) {
	//
	//delete min_affection;
	//min_affection = NULL;
	//}
	//if(near_special_rock != NULL) {
	//
	//delete near_special_rock;
	//near_special_rock = NULL;
	//}
	//if(needs_multiplayer != NULL) {
	//
	//delete needs_multiplayer;
	//needs_multiplayer = NULL;
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
	//if(turn_upside_down != NULL) {
	//
	//delete turn_upside_down;
	//turn_upside_down = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(required_pokemon_form != NULL) {
	//
	//delete required_pokemon_form;
	//required_pokemon_form = NULL;
	//}
	//if(evolved_pokemon_form != NULL) {
	//
	//delete evolved_pokemon_form;
	//evolved_pokemon_form = NULL;
	//}
	//if(used_move != NULL) {
	//
	//delete used_move;
	//used_move = NULL;
	//}
	//if(min_move_count != NULL) {
	//
	//delete min_move_count;
	//min_move_count = NULL;
	//}
	//if(min_steps != NULL) {
	//
	//delete min_steps;
	//min_steps = NULL;
	//}
	//if(min_damage_taken != NULL) {
	//
	//delete min_damage_taken;
	//min_damage_taken = NULL;
	//}
	//if(allowed_natures != NULL) {
	//allowed_natures.RemoveAll(true);
	//delete allowed_natures;
	//allowed_natures = NULL;
	//}
	//if(condition_expression != NULL) {
	//
	//delete condition_expression;
	//condition_expression = NULL;
	//}
	//
}

void
PokemonEvolution::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_defaultKey = "is_default";
	node = json_object_get_member(pJsonObject, is_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_default, node, "bool", "");
		} else {
			
		}
	}
	const gchar *itemKey = "item";
	node = json_object_get_member(pJsonObject, itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *triggerKey = "trigger";
	node = json_object_get_member(pJsonObject, triggerKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionTriggerSummary")) {
			jsonToValue(&trigger, node, "EvolutionTriggerSummary", "EvolutionTriggerSummary");
		} else {
			
			EvolutionTriggerSummary* obj = static_cast<EvolutionTriggerSummary*> (&trigger);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *genderKey = "gender";
	node = json_object_get_member(pJsonObject, genderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gender, node, "int", "");
		} else {
			
		}
	}
	const gchar *held_itemKey = "held_item";
	node = json_object_get_member(pJsonObject, held_itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&held_item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&held_item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *known_moveKey = "known_move";
	node = json_object_get_member(pJsonObject, known_moveKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonEvolution_known_move")) {
			jsonToValue(&known_move, node, "PokemonEvolution_known_move", "PokemonEvolution_known_move");
		} else {
			
			PokemonEvolution_known_move* obj = static_cast<PokemonEvolution_known_move*> (&known_move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *known_move_typeKey = "known_move_type";
	node = json_object_get_member(pJsonObject, known_move_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonEvolution_known_move")) {
			jsonToValue(&known_move_type, node, "PokemonEvolution_known_move", "PokemonEvolution_known_move");
		} else {
			
			PokemonEvolution_known_move* obj = static_cast<PokemonEvolution_known_move*> (&known_move_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *locationKey = "location";
	node = json_object_get_member(pJsonObject, locationKey);
	if (node !=NULL) {
	

		if (isprimitive("LocationSummary")) {
			jsonToValue(&location, node, "LocationSummary", "LocationSummary");
		} else {
			
			LocationSummary* obj = static_cast<LocationSummary*> (&location);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *min_happinessKey = "min_happiness";
	node = json_object_get_member(pJsonObject, min_happinessKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_happiness, node, "int", "");
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
	const gchar *min_affectionKey = "min_affection";
	node = json_object_get_member(pJsonObject, min_affectionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_affection, node, "int", "");
		} else {
			
		}
	}
	const gchar *near_special_rockKey = "near_special_rock";
	node = json_object_get_member(pJsonObject, near_special_rockKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&near_special_rock, node, "bool", "");
		} else {
			
		}
	}
	const gchar *needs_multiplayerKey = "needs_multiplayer";
	node = json_object_get_member(pJsonObject, needs_multiplayerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&needs_multiplayer, node, "bool", "");
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
	

		if (isprimitive("PokemonSpeciesSummary")) {
			jsonToValue(&party_species, node, "PokemonSpeciesSummary", "PokemonSpeciesSummary");
		} else {
			
			PokemonSpeciesSummary* obj = static_cast<PokemonSpeciesSummary*> (&party_species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *party_typeKey = "party_type";
	node = json_object_get_member(pJsonObject, party_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeSummary")) {
			jsonToValue(&party_type, node, "TypeSummary", "TypeSummary");
		} else {
			
			TypeSummary* obj = static_cast<TypeSummary*> (&party_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *relative_physical_statsKey = "relative_physical_stats";
	node = json_object_get_member(pJsonObject, relative_physical_statsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&relative_physical_stats, node, "int", "");
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
	

		if (isprimitive("PokemonSpeciesSummary")) {
			jsonToValue(&trade_species, node, "PokemonSpeciesSummary", "PokemonSpeciesSummary");
		} else {
			
			PokemonSpeciesSummary* obj = static_cast<PokemonSpeciesSummary*> (&trade_species);
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
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("RegionSummary")) {
			jsonToValue(&region, node, "RegionSummary", "RegionSummary");
		} else {
			
			RegionSummary* obj = static_cast<RegionSummary*> (&region);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *required_pokemon_formKey = "required_pokemon_form";
	node = json_object_get_member(pJsonObject, required_pokemon_formKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonFormSummary")) {
			jsonToValue(&required_pokemon_form, node, "PokemonFormSummary", "PokemonFormSummary");
		} else {
			
			PokemonFormSummary* obj = static_cast<PokemonFormSummary*> (&required_pokemon_form);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *evolved_pokemon_formKey = "evolved_pokemon_form";
	node = json_object_get_member(pJsonObject, evolved_pokemon_formKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonFormSummary")) {
			jsonToValue(&evolved_pokemon_form, node, "PokemonFormSummary", "PokemonFormSummary");
		} else {
			
			PokemonFormSummary* obj = static_cast<PokemonFormSummary*> (&evolved_pokemon_form);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *used_moveKey = "used_move";
	node = json_object_get_member(pJsonObject, used_moveKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveSummary")) {
			jsonToValue(&used_move, node, "MoveSummary", "MoveSummary");
		} else {
			
			MoveSummary* obj = static_cast<MoveSummary*> (&used_move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *min_move_countKey = "min_move_count";
	node = json_object_get_member(pJsonObject, min_move_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_move_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_stepsKey = "min_steps";
	node = json_object_get_member(pJsonObject, min_stepsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_steps, node, "int", "");
		} else {
			
		}
	}
	const gchar *min_damage_takenKey = "min_damage_taken";
	node = json_object_get_member(pJsonObject, min_damage_takenKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&min_damage_taken, node, "int", "");
		} else {
			
		}
	}
	const gchar *allowed_naturesKey = "allowed_natures";
	node = json_object_get_member(pJsonObject, allowed_naturesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<NatureSummary> new_list;
			NatureSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureSummary")) {
					jsonToValue(&inst, temp_json, "NatureSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			allowed_natures = new_list;
		}
		
	}
	const gchar *condition_expressionKey = "condition_expression";
	node = json_object_get_member(pJsonObject, condition_expressionKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionConditionExpression")) {
			jsonToValue(&condition_expression, node, "EvolutionConditionExpression", "EvolutionConditionExpression");
		} else {
			
			EvolutionConditionExpression* obj = static_cast<EvolutionConditionExpression*> (&condition_expression);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonEvolution::PokemonEvolution(char* json)
{
	this->fromJson(json);
}

char*
PokemonEvolution::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemKey = "item";
	json_object_set_member(pJsonObject, itemKey, node);
	if (isprimitive("EvolutionTriggerSummary")) {
		EvolutionTriggerSummary obj = getTrigger();
		node = converttoJson(&obj, "EvolutionTriggerSummary", "");
	}
	else {
		
		EvolutionTriggerSummary obj = static_cast<EvolutionTriggerSummary> (getTrigger());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *triggerKey = "trigger";
	json_object_set_member(pJsonObject, triggerKey, node);
	if (isprimitive("int")) {
		int obj = getGender();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *genderKey = "gender";
	json_object_set_member(pJsonObject, genderKey, node);
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getHeldItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getHeldItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *held_itemKey = "held_item";
	json_object_set_member(pJsonObject, held_itemKey, node);
	if (isprimitive("PokemonEvolution_known_move")) {
		PokemonEvolution_known_move obj = getKnownMove();
		node = converttoJson(&obj, "PokemonEvolution_known_move", "");
	}
	else {
		
		PokemonEvolution_known_move obj = static_cast<PokemonEvolution_known_move> (getKnownMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *known_moveKey = "known_move";
	json_object_set_member(pJsonObject, known_moveKey, node);
	if (isprimitive("PokemonEvolution_known_move")) {
		PokemonEvolution_known_move obj = getKnownMoveType();
		node = converttoJson(&obj, "PokemonEvolution_known_move", "");
	}
	else {
		
		PokemonEvolution_known_move obj = static_cast<PokemonEvolution_known_move> (getKnownMoveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *known_move_typeKey = "known_move_type";
	json_object_set_member(pJsonObject, known_move_typeKey, node);
	if (isprimitive("LocationSummary")) {
		LocationSummary obj = getLocation();
		node = converttoJson(&obj, "LocationSummary", "");
	}
	else {
		
		LocationSummary obj = static_cast<LocationSummary> (getLocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *locationKey = "location";
	json_object_set_member(pJsonObject, locationKey, node);
	if (isprimitive("int")) {
		int obj = getMinLevel();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_levelKey = "min_level";
	json_object_set_member(pJsonObject, min_levelKey, node);
	if (isprimitive("int")) {
		int obj = getMinHappiness();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_happinessKey = "min_happiness";
	json_object_set_member(pJsonObject, min_happinessKey, node);
	if (isprimitive("int")) {
		int obj = getMinBeauty();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_beautyKey = "min_beauty";
	json_object_set_member(pJsonObject, min_beautyKey, node);
	if (isprimitive("int")) {
		int obj = getMinAffection();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_affectionKey = "min_affection";
	json_object_set_member(pJsonObject, min_affectionKey, node);
	if (isprimitive("bool")) {
		bool obj = getNearSpecialRock();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *near_special_rockKey = "near_special_rock";
	json_object_set_member(pJsonObject, near_special_rockKey, node);
	if (isprimitive("bool")) {
		bool obj = getNeedsMultiplayer();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *needs_multiplayerKey = "needs_multiplayer";
	json_object_set_member(pJsonObject, needs_multiplayerKey, node);
	if (isprimitive("bool")) {
		bool obj = getNeedsOverworldRain();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *needs_overworld_rainKey = "needs_overworld_rain";
	json_object_set_member(pJsonObject, needs_overworld_rainKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		PokemonSpeciesSummary obj = getPartySpecies();
		node = converttoJson(&obj, "PokemonSpeciesSummary", "");
	}
	else {
		
		PokemonSpeciesSummary obj = static_cast<PokemonSpeciesSummary> (getPartySpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *party_speciesKey = "party_species";
	json_object_set_member(pJsonObject, party_speciesKey, node);
	if (isprimitive("TypeSummary")) {
		TypeSummary obj = getPartyType();
		node = converttoJson(&obj, "TypeSummary", "");
	}
	else {
		
		TypeSummary obj = static_cast<TypeSummary> (getPartyType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *party_typeKey = "party_type";
	json_object_set_member(pJsonObject, party_typeKey, node);
	if (isprimitive("int")) {
		int obj = getRelativePhysicalStats();
		node = converttoJson(&obj, "int", "");
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
	if (isprimitive("PokemonSpeciesSummary")) {
		PokemonSpeciesSummary obj = getTradeSpecies();
		node = converttoJson(&obj, "PokemonSpeciesSummary", "");
	}
	else {
		
		PokemonSpeciesSummary obj = static_cast<PokemonSpeciesSummary> (getTradeSpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *trade_speciesKey = "trade_species";
	json_object_set_member(pJsonObject, trade_speciesKey, node);
	if (isprimitive("bool")) {
		bool obj = getTurnUpsideDown();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *turn_upside_downKey = "turn_upside_down";
	json_object_set_member(pJsonObject, turn_upside_downKey, node);
	if (isprimitive("RegionSummary")) {
		RegionSummary obj = getRegion();
		node = converttoJson(&obj, "RegionSummary", "");
	}
	else {
		
		RegionSummary obj = static_cast<RegionSummary> (getRegion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("PokemonFormSummary")) {
		PokemonFormSummary obj = getRequiredPokemonForm();
		node = converttoJson(&obj, "PokemonFormSummary", "");
	}
	else {
		
		PokemonFormSummary obj = static_cast<PokemonFormSummary> (getRequiredPokemonForm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *required_pokemon_formKey = "required_pokemon_form";
	json_object_set_member(pJsonObject, required_pokemon_formKey, node);
	if (isprimitive("PokemonFormSummary")) {
		PokemonFormSummary obj = getEvolvedPokemonForm();
		node = converttoJson(&obj, "PokemonFormSummary", "");
	}
	else {
		
		PokemonFormSummary obj = static_cast<PokemonFormSummary> (getEvolvedPokemonForm());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *evolved_pokemon_formKey = "evolved_pokemon_form";
	json_object_set_member(pJsonObject, evolved_pokemon_formKey, node);
	if (isprimitive("MoveSummary")) {
		MoveSummary obj = getUsedMove();
		node = converttoJson(&obj, "MoveSummary", "");
	}
	else {
		
		MoveSummary obj = static_cast<MoveSummary> (getUsedMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *used_moveKey = "used_move";
	json_object_set_member(pJsonObject, used_moveKey, node);
	if (isprimitive("int")) {
		int obj = getMinMoveCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_move_countKey = "min_move_count";
	json_object_set_member(pJsonObject, min_move_countKey, node);
	if (isprimitive("int")) {
		int obj = getMinSteps();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_stepsKey = "min_steps";
	json_object_set_member(pJsonObject, min_stepsKey, node);
	if (isprimitive("int")) {
		int obj = getMinDamageTaken();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *min_damage_takenKey = "min_damage_taken";
	json_object_set_member(pJsonObject, min_damage_takenKey, node);
	if (isprimitive("NatureSummary")) {
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getAllowedNatures());
		node = converttoJson(&new_list, "NatureSummary", "array");
	} else {
		node = json_node_alloc();
		list<NatureSummary> new_list = static_cast<list <NatureSummary> > (getAllowedNatures());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *allowed_naturesKey = "allowed_natures";
	json_object_set_member(pJsonObject, allowed_naturesKey, node);
	if (isprimitive("EvolutionConditionExpression")) {
		EvolutionConditionExpression obj = getConditionExpression();
		node = converttoJson(&obj, "EvolutionConditionExpression", "");
	}
	else {
		
		EvolutionConditionExpression obj = static_cast<EvolutionConditionExpression> (getConditionExpression());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *condition_expressionKey = "condition_expression";
	json_object_set_member(pJsonObject, condition_expressionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

VersionGroupSummary
PokemonEvolution::getVersionGroup()
{
	return version_group;
}

void
PokemonEvolution::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

bool
PokemonEvolution::getIsDefault()
{
	return is_default;
}

void
PokemonEvolution::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

ItemSummary
PokemonEvolution::getItem()
{
	return item;
}

void
PokemonEvolution::setItem(ItemSummary  item)
{
	this->item = item;
}

EvolutionTriggerSummary
PokemonEvolution::getTrigger()
{
	return trigger;
}

void
PokemonEvolution::setTrigger(EvolutionTriggerSummary  trigger)
{
	this->trigger = trigger;
}

int
PokemonEvolution::getGender()
{
	return gender;
}

void
PokemonEvolution::setGender(int  gender)
{
	this->gender = gender;
}

ItemSummary
PokemonEvolution::getHeldItem()
{
	return held_item;
}

void
PokemonEvolution::setHeldItem(ItemSummary  held_item)
{
	this->held_item = held_item;
}

PokemonEvolution_known_move
PokemonEvolution::getKnownMove()
{
	return known_move;
}

void
PokemonEvolution::setKnownMove(PokemonEvolution_known_move  known_move)
{
	this->known_move = known_move;
}

PokemonEvolution_known_move
PokemonEvolution::getKnownMoveType()
{
	return known_move_type;
}

void
PokemonEvolution::setKnownMoveType(PokemonEvolution_known_move  known_move_type)
{
	this->known_move_type = known_move_type;
}

LocationSummary
PokemonEvolution::getLocation()
{
	return location;
}

void
PokemonEvolution::setLocation(LocationSummary  location)
{
	this->location = location;
}

int
PokemonEvolution::getMinLevel()
{
	return min_level;
}

void
PokemonEvolution::setMinLevel(int  min_level)
{
	this->min_level = min_level;
}

int
PokemonEvolution::getMinHappiness()
{
	return min_happiness;
}

void
PokemonEvolution::setMinHappiness(int  min_happiness)
{
	this->min_happiness = min_happiness;
}

int
PokemonEvolution::getMinBeauty()
{
	return min_beauty;
}

void
PokemonEvolution::setMinBeauty(int  min_beauty)
{
	this->min_beauty = min_beauty;
}

int
PokemonEvolution::getMinAffection()
{
	return min_affection;
}

void
PokemonEvolution::setMinAffection(int  min_affection)
{
	this->min_affection = min_affection;
}

bool
PokemonEvolution::getNearSpecialRock()
{
	return near_special_rock;
}

void
PokemonEvolution::setNearSpecialRock(bool  near_special_rock)
{
	this->near_special_rock = near_special_rock;
}

bool
PokemonEvolution::getNeedsMultiplayer()
{
	return needs_multiplayer;
}

void
PokemonEvolution::setNeedsMultiplayer(bool  needs_multiplayer)
{
	this->needs_multiplayer = needs_multiplayer;
}

bool
PokemonEvolution::getNeedsOverworldRain()
{
	return needs_overworld_rain;
}

void
PokemonEvolution::setNeedsOverworldRain(bool  needs_overworld_rain)
{
	this->needs_overworld_rain = needs_overworld_rain;
}

PokemonSpeciesSummary
PokemonEvolution::getPartySpecies()
{
	return party_species;
}

void
PokemonEvolution::setPartySpecies(PokemonSpeciesSummary  party_species)
{
	this->party_species = party_species;
}

TypeSummary
PokemonEvolution::getPartyType()
{
	return party_type;
}

void
PokemonEvolution::setPartyType(TypeSummary  party_type)
{
	this->party_type = party_type;
}

int
PokemonEvolution::getRelativePhysicalStats()
{
	return relative_physical_stats;
}

void
PokemonEvolution::setRelativePhysicalStats(int  relative_physical_stats)
{
	this->relative_physical_stats = relative_physical_stats;
}

std::string
PokemonEvolution::getTimeOfDay()
{
	return time_of_day;
}

void
PokemonEvolution::setTimeOfDay(std::string  time_of_day)
{
	this->time_of_day = time_of_day;
}

PokemonSpeciesSummary
PokemonEvolution::getTradeSpecies()
{
	return trade_species;
}

void
PokemonEvolution::setTradeSpecies(PokemonSpeciesSummary  trade_species)
{
	this->trade_species = trade_species;
}

bool
PokemonEvolution::getTurnUpsideDown()
{
	return turn_upside_down;
}

void
PokemonEvolution::setTurnUpsideDown(bool  turn_upside_down)
{
	this->turn_upside_down = turn_upside_down;
}

RegionSummary
PokemonEvolution::getRegion()
{
	return region;
}

void
PokemonEvolution::setRegion(RegionSummary  region)
{
	this->region = region;
}

PokemonFormSummary
PokemonEvolution::getRequiredPokemonForm()
{
	return required_pokemon_form;
}

void
PokemonEvolution::setRequiredPokemonForm(PokemonFormSummary  required_pokemon_form)
{
	this->required_pokemon_form = required_pokemon_form;
}

PokemonFormSummary
PokemonEvolution::getEvolvedPokemonForm()
{
	return evolved_pokemon_form;
}

void
PokemonEvolution::setEvolvedPokemonForm(PokemonFormSummary  evolved_pokemon_form)
{
	this->evolved_pokemon_form = evolved_pokemon_form;
}

MoveSummary
PokemonEvolution::getUsedMove()
{
	return used_move;
}

void
PokemonEvolution::setUsedMove(MoveSummary  used_move)
{
	this->used_move = used_move;
}

int
PokemonEvolution::getMinMoveCount()
{
	return min_move_count;
}

void
PokemonEvolution::setMinMoveCount(int  min_move_count)
{
	this->min_move_count = min_move_count;
}

int
PokemonEvolution::getMinSteps()
{
	return min_steps;
}

void
PokemonEvolution::setMinSteps(int  min_steps)
{
	this->min_steps = min_steps;
}

int
PokemonEvolution::getMinDamageTaken()
{
	return min_damage_taken;
}

void
PokemonEvolution::setMinDamageTaken(int  min_damage_taken)
{
	this->min_damage_taken = min_damage_taken;
}

std::list<NatureSummary>
PokemonEvolution::getAllowedNatures()
{
	return allowed_natures;
}

void
PokemonEvolution::setAllowedNatures(std::list <NatureSummary> allowed_natures)
{
	this->allowed_natures = allowed_natures;
}

EvolutionConditionExpression
PokemonEvolution::getConditionExpression()
{
	return condition_expression;
}

void
PokemonEvolution::setConditionExpression(EvolutionConditionExpression  condition_expression)
{
	this->condition_expression = condition_expression;
}


