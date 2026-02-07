#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_moves_inner_version_group_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_moves_inner_version_group_details_inner::PokemonDetail_moves_inner_version_group_details_inner()
{
	//__init();
}

PokemonDetail_moves_inner_version_group_details_inner::~PokemonDetail_moves_inner_version_group_details_inner()
{
	//__cleanup();
}

void
PokemonDetail_moves_inner_version_group_details_inner::__init()
{
	//level_learned_at = int(0);
	//move_learn_method = new AbilityDetail_pokemon_inner_pokemon();
	//version_group = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokemonDetail_moves_inner_version_group_details_inner::__cleanup()
{
	//if(level_learned_at != NULL) {
	//
	//delete level_learned_at;
	//level_learned_at = NULL;
	//}
	//if(move_learn_method != NULL) {
	//
	//delete move_learn_method;
	//move_learn_method = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//
}

void
PokemonDetail_moves_inner_version_group_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *level_learned_atKey = "level_learned_at";
	node = json_object_get_member(pJsonObject, level_learned_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&level_learned_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *move_learn_methodKey = "move_learn_method";
	node = json_object_get_member(pJsonObject, move_learn_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&move_learn_method, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&move_learn_method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&version_group, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonDetail_moves_inner_version_group_details_inner::PokemonDetail_moves_inner_version_group_details_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_moves_inner_version_group_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLevelLearnedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *level_learned_atKey = "level_learned_at";
	json_object_set_member(pJsonObject, level_learned_atKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getMoveLearnMethod();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getMoveLearnMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *move_learn_methodKey = "move_learn_method";
	json_object_set_member(pJsonObject, move_learn_methodKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getVersionGroup();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonDetail_moves_inner_version_group_details_inner::getLevelLearnedAt()
{
	return level_learned_at;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setLevelLearnedAt(int  level_learned_at)
{
	this->level_learned_at = level_learned_at;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner_version_group_details_inner::getMoveLearnMethod()
{
	return move_learn_method;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setMoveLearnMethod(AbilityDetail_pokemon_inner_pokemon  move_learn_method)
{
	this->move_learn_method = move_learn_method;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_moves_inner_version_group_details_inner::getVersionGroup()
{
	return version_group;
}

void
PokemonDetail_moves_inner_version_group_details_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group)
{
	this->version_group = version_group;
}


