#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypePastRelationships.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypePastRelationships::TypePastRelationships()
{
	//__init();
}

TypePastRelationships::~TypePastRelationships()
{
	//__cleanup();
}

void
TypePastRelationships::__init()
{
	//generation = null;
	//damage_relations = null;
}

void
TypePastRelationships::__cleanup()
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
TypePastRelationships::fromJson(char* jsonStr)
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
	const gchar *damage_relationsKey = "damage_relations";
	node = json_object_get_member(pJsonObject, damage_relationsKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeRelationships")) {
			jsonToValue(&damage_relations, node, "TypeRelationships", "TypeRelationships");
		} else {
			
			TypeRelationships* obj = static_cast<TypeRelationships*> (&damage_relations);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TypePastRelationships::TypePastRelationships(char* json)
{
	this->fromJson(json);
}

char*
TypePastRelationships::toJson()
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
	if (isprimitive("TypeRelationships")) {
		TypeRelationships obj = getDamageRelations();
		node = converttoJson(&obj, "TypeRelationships", "");
	}
	else {
		
		TypeRelationships obj = static_cast<TypeRelationships> (getDamageRelations());
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

GenerationSummary
TypePastRelationships::getGeneration()
{
	return generation;
}

void
TypePastRelationships::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

TypeRelationships
TypePastRelationships::getDamageRelations()
{
	return damage_relations;
}

void
TypePastRelationships::setDamageRelations(TypeRelationships  damage_relations)
{
	this->damage_relations = damage_relations;
}


