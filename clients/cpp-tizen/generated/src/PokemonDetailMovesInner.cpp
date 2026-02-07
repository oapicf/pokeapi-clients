#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_moves_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_moves_inner::PokemonDetail_moves_inner()
{
	//__init();
}

PokemonDetail_moves_inner::~PokemonDetail_moves_inner()
{
	//__cleanup();
}

void
PokemonDetail_moves_inner::__init()
{
	//move = new AbilityDetail_pokemon_inner_pokemon();
	//new std::list()std::list> version_group_details;
}

void
PokemonDetail_moves_inner::__cleanup()
{
	//if(move != NULL) {
	//
	//delete move;
	//move = NULL;
	//}
	//if(version_group_details != NULL) {
	//version_group_details.RemoveAll(true);
	//delete version_group_details;
	//version_group_details = NULL;
	//}
	//
}

void
PokemonDetail_moves_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *moveKey = "move";
	node = json_object_get_member(pJsonObject, moveKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&move, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_group_detailsKey = "version_group_details";
	node = json_object_get_member(pJsonObject, version_group_detailsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDetail_moves_inner_version_group_details_inner> new_list;
			PokemonDetail_moves_inner_version_group_details_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDetail_moves_inner_version_group_details_inner")) {
					jsonToValue(&inst, temp_json, "PokemonDetail_moves_inner_version_group_details_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_group_details = new_list;
		}
		
	}
}

PokemonDetail_moves_inner::PokemonDetail_moves_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_moves_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getMove();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *moveKey = "move";
	json_object_set_member(pJsonObject, moveKey, node);
	if (isprimitive("PokemonDetail_moves_inner_version_group_details_inner")) {
		list<PokemonDetail_moves_inner_version_group_details_inner> new_list = static_cast<list <PokemonDetail_moves_inner_version_group_details_inner> > (getVersionGroupDetails());
		node = converttoJson(&new_list, "PokemonDetail_moves_inner_version_group_details_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDetail_moves_inner_version_group_details_inner> new_list = static_cast<list <PokemonDetail_moves_inner_version_group_details_inner> > (getVersionGroupDetails());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDetail_moves_inner_version_group_details_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDetail_moves_inner_version_group_details_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_group_detailsKey = "version_group_details";
	json_object_set_member(pJsonObject, version_group_detailsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner::getMove()
{
	return move;
}

void
PokemonDetail_moves_inner::setMove(AbilityDetail_pokemon_inner_pokemon  move)
{
	this->move = move;
}

std::list<PokemonDetail_moves_inner_version_group_details_inner>
PokemonDetail_moves_inner::getVersionGroupDetails()
{
	return version_group_details;
}

void
PokemonDetail_moves_inner::setVersionGroupDetails(std::list <PokemonDetail_moves_inner_version_group_details_inner> version_group_details)
{
	this->version_group_details = version_group_details;
}


