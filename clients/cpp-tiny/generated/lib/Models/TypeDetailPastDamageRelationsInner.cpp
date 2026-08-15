

#include "TypeDetail_past_damage_relations_inner.h"

using namespace Tiny;

TypeDetail_past_damage_relations_inner::TypeDetail_past_damage_relations_inner()
{
	generation = AbilityDetail_pokemon_inner_pokemon();
	damage_relations = TypeDetail_past_damage_relations_inner_damage_relations();
}

TypeDetail_past_damage_relations_inner::TypeDetail_past_damage_relations_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

TypeDetail_past_damage_relations_inner::~TypeDetail_past_damage_relations_inner()
{

}

void
TypeDetail_past_damage_relations_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *damage_relationsKey = "damage_relations";

    if(object.has_key(damage_relationsKey))
    {
        bourne::json value = object[damage_relationsKey];




        TypeDetail_past_damage_relations_inner_damage_relations* obj = &damage_relations;
		obj->fromJson(value.dump());

    }


}

bourne::json
TypeDetail_past_damage_relations_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["generation"] = getGeneration().toJson();






	object["damage_relations"] = getDamageRelations().toJson();


    return object;

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



