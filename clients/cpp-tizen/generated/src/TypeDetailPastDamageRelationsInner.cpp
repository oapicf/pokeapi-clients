#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeDetail_past_damage_relations_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeDetail_past_damage_relations_inner::TypeDetail_past_damage_relations_inner()
{
	//__init();
}

TypeDetail_past_damage_relations_inner::~TypeDetail_past_damage_relations_inner()
{
	//__cleanup();
}

void
TypeDetail_past_damage_relations_inner::__init()
{
	//generation = new AbilityDetail_pokemon_inner_pokemon();
	//damage_relations = new TypeDetail_past_damage_relations_inner_damage_relations();
}

void
TypeDetail_past_damage_relations_inner::__cleanup()
{
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(damage_relations != NULL) {
	//
	//delete damage_relations;
	//damage_relations = NULL;
	//}
	//
}

void
TypeDetail_past_damage_relations_inner::fromJson(char* jsonStr)
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
	const gchar *damage_relationsKey = "damage_relations";
	node = json_object_get_member(pJsonObject, damage_relationsKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeDetail_past_damage_relations_inner_damage_relations")) {
			jsonToValue(&damage_relations, node, "TypeDetail_past_damage_relations_inner_damage_relations", "TypeDetail_past_damage_relations_inner_damage_relations");
		} else {
			
			TypeDetail_past_damage_relations_inner_damage_relations* obj = static_cast<TypeDetail_past_damage_relations_inner_damage_relations*> (&damage_relations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TypeDetail_past_damage_relations_inner::TypeDetail_past_damage_relations_inner(char* json)
{
	this->fromJson(json);
}

char*
TypeDetail_past_damage_relations_inner::toJson()
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
	if (isprimitive("TypeDetail_past_damage_relations_inner_damage_relations")) {
		TypeDetail_past_damage_relations_inner_damage_relations obj = getDamageRelations();
		node = converttoJson(&obj, "TypeDetail_past_damage_relations_inner_damage_relations", "");
	}
	else {
		
		TypeDetail_past_damage_relations_inner_damage_relations obj = static_cast<TypeDetail_past_damage_relations_inner_damage_relations> (getDamageRelations());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damage_relationsKey = "damage_relations";
	json_object_set_member(pJsonObject, damage_relationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
TypeDetail_past_damage_relations_inner::getGeneration()
{
	return generation;
}

void
TypeDetail_past_damage_relations_inner::setGeneration(AbilityDetail_pokemon_inner_pokemon  generation)
{
	this->generation = generation;
}

TypeDetail_past_damage_relations_inner_damage_relations
TypeDetail_past_damage_relations_inner::getDamageRelations()
{
	return damage_relations;
}

void
TypeDetail_past_damage_relations_inner::setDamageRelations(TypeDetail_past_damage_relations_inner_damage_relations  damage_relations)
{
	this->damage_relations = damage_relations;
}


