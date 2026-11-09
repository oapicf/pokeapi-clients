#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonPastType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonPastType::PokemonPastType()
{
	//__init();
}

PokemonPastType::~PokemonPastType()
{
	//__cleanup();
}

void
PokemonPastType::__init()
{
	//generation = null;
	//new std::list()std::list> types;
}

void
PokemonPastType::__cleanup()
{
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(types != NULL) {
	//types.RemoveAll(true);
	//delete types;
	//types = NULL;
	//}
	//
}

void
PokemonPastType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonType> new_list;
			PokemonType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonType")) {
					jsonToValue(&inst, temp_json, "PokemonType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
}

PokemonPastType::PokemonPastType(char* json)
{
	this->fromJson(json);
}

char*
PokemonPastType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("PokemonType")) {
		list<PokemonType> new_list = static_cast<list <PokemonType> > (getTypes());
		node = converttoJson(&new_list, "PokemonType", "array");
	} else {
		node = json_node_alloc();
		list<PokemonType> new_list = static_cast<list <PokemonType> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *typesKey = "types";
	json_object_set_member(pJsonObject, typesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

GenerationSummary
PokemonPastType::getGeneration()
{
	return generation;
}

void
PokemonPastType::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

std::list<PokemonType>
PokemonPastType::getTypes()
{
	return types;
}

void
PokemonPastType::setTypes(std::list <PokemonType> types)
{
	this->types = types;
}


