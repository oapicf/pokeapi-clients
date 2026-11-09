

#include "TypePastRelationships.h"

using namespace Tiny;

TypePastRelationships::TypePastRelationships()
{
	generation = null;
	damage_relations = null;
}

TypePastRelationships::TypePastRelationships(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypePastRelationships::~TypePastRelationships()
{

}

void
TypePastRelationships::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *damage_relationsKey = "damage_relations";

    if(object.has_key(damage_relationsKey))
    {
        bourne::json value = object[damage_relationsKey];




        TypeRelationships* obj = &damage_relations;
		obj->fromJson(value.dump());

    }


}

bourne::json
TypePastRelationships::toJson()
{
    bourne::json object = bourne::json::object();






	object["generation"] = getGeneration().toJson();






	object["damage_relations"] = getDamageRelations().toJson();


    return object;

}

GenerationSummary
TypePastRelationships::getGeneration()
{
	return generation;
}

void
TypePastRelationships::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

TypeRelationships
TypePastRelationships::getDamageRelations()
{
	return damage_relations;
}

void
TypePastRelationships::setDamageRelations(TypeRelationships damage_relations)
{
	this->damage_relations = damage_relations;
}



