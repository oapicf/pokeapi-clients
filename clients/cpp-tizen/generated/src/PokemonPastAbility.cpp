#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonPastAbility.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonPastAbility::PokemonPastAbility()
{
	//__init();
}

PokemonPastAbility::~PokemonPastAbility()
{
	//__cleanup();
}

void
PokemonPastAbility::__init()
{
	//new std::list()std::list> abilities;
	//generation = null;
}

void
PokemonPastAbility::__cleanup()
{
	//if(abilities != NULL) {
	//abilities.RemoveAll(true);
	//delete abilities;
	//abilities = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//
}

void
PokemonPastAbility::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *abilitiesKey = "abilities";
	node = json_object_get_member(pJsonObject, abilitiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonAbilityPast> new_list;
			PokemonAbilityPast inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonAbilityPast")) {
					jsonToValue(&inst, temp_json, "PokemonAbilityPast", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			abilities = new_list;
		}
		
	}
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonPastAbility::PokemonPastAbility(char* json)
{
	this->fromJson(json);
}

char*
PokemonPastAbility::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PokemonAbilityPast")) {
		list<PokemonAbilityPast> new_list = static_cast<list <PokemonAbilityPast> > (getAbilities());
		node = converttoJson(&new_list, "PokemonAbilityPast", "array");
	} else {
		node = json_node_alloc();
		list<PokemonAbilityPast> new_list = static_cast<list <PokemonAbilityPast> > (getAbilities());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonAbilityPast>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonAbilityPast obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *abilitiesKey = "abilities";
	json_object_set_member(pJsonObject, abilitiesKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<PokemonAbilityPast>
PokemonPastAbility::getAbilities()
{
	return abilities;
}

void
PokemonPastAbility::setAbilities(std::list <PokemonAbilityPast> abilities)
{
	this->abilities = abilities;
}

GenerationSummary
PokemonPastAbility::getGeneration()
{
	return generation;
}

void
PokemonPastAbility::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}


