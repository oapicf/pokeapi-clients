#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_past_types_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_past_types_inner::PokemonDetail_past_types_inner()
{
	//__init();
}

PokemonDetail_past_types_inner::~PokemonDetail_past_types_inner()
{
	//__cleanup();
}

void
PokemonDetail_past_types_inner::__init()
{
	//generation = new AbilityDetail_pokemon_inner_pokemon();
	//new std::list()std::list> types;
}

void
PokemonDetail_past_types_inner::__cleanup()
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
PokemonDetail_past_types_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&generation, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typesKey = "types";
	node = json_object_get_member(pJsonObject, typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_types_inner> new_list;
			PokemonDetail_types_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_types_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_types_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			types = new_list;
		}
		
	}
}

PokemonDetail_past_types_inner::PokemonDetail_past_types_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_past_types_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getGeneration();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
	if (isprimitive("PokemonDetail_types_inner")) {
		list<PokemonDetail_types_inner> new_list = static_cast<list <PokemonDetail_types_inner> > (getTypes());
		node = converttoJson(&new_list, "PokemonDetail_types_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_types_inner> new_list = static_cast<list <PokemonDetail_types_inner> > (getTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_types_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_types_inner obj = *it;
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

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_past_types_inner::getGeneration()
{
	return generation;
}

void
PokemonDetail_past_types_inner::setGeneration(AbilityDetail_pokemon_inner_pokemon  generation)
{
	this->generation = generation;
}

std::list<PokemonDetail_types_inner>
PokemonDetail_past_types_inner::getTypes()
{
	return types;
}

void
PokemonDetail_past_types_inner::setTypes(std::list <PokemonDetail_types_inner> types)
{
	this->types = types;
}


