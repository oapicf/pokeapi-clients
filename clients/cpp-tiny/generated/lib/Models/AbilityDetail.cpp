

#include "AbilityDetail.h"

using namespace Tiny;

AbilityDetail::AbilityDetail()
{
	id = int(0);
	name = std::string();
	is_main_series = bool(false);
	generation = GenerationSummary();
	names = std::list<AbilityName>();
	effect_entries = std::list<AbilityEffectText>();
	effect_changes = std::list<AbilityChange>();
	flavor_text_entries = std::list<AbilityFlavorText>();
	pokemon = std::list<AbilityDetail_pokemon_inner>();
}

AbilityDetail::AbilityDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

AbilityDetail::~AbilityDetail()
{

}

void
AbilityDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *is_main_seriesKey = "is_main_series";

    if(object.has_key(is_main_seriesKey))
    {
        bourne::json value = object[is_main_seriesKey];



        jsonToValue(&is_main_series, value, "bool");


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<AbilityName> names_list;
        AbilityName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<AbilityEffectText> effect_entries_list;
        AbilityEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *effect_changesKey = "effect_changes";

    if(object.has_key(effect_changesKey))
    {
        bourne::json value = object[effect_changesKey];


        std::list<AbilityChange> effect_changes_list;
        AbilityChange element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_changes_list.push_back(element);
        }
        effect_changes = effect_changes_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<AbilityFlavorText> flavor_text_entries_list;
        AbilityFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *pokemonKey = "pokemon";

    if(object.has_key(pokemonKey))
    {
        bourne::json value = object[pokemonKey];


        std::list<AbilityDetail_pokemon_inner> pokemon_list;
        AbilityDetail_pokemon_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_list.push_back(element);
        }
        pokemon = pokemon_list;


    }


}

bourne::json
AbilityDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["is_main_series"] = isIsMainSeries();







	object["generation"] = getGeneration().toJson();




    std::list<AbilityName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        AbilityName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<AbilityEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        AbilityEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<AbilityChange> effect_changes_list = getEffectChanges();
    bourne::json effect_changes_arr = bourne::json::array();

    for(auto& var : effect_changes_list)
    {
        AbilityChange obj = var;
        effect_changes_arr.append(obj.toJson());
    }
    object["effect_changes"] = effect_changes_arr;






    std::list<AbilityFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        AbilityFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<AbilityDetail_pokemon_inner> pokemon_list = getPokemon();
    bourne::json pokemon_arr = bourne::json::array();

    for(auto& var : pokemon_list)
    {
        AbilityDetail_pokemon_inner obj = var;
        pokemon_arr.append(obj.toJson());
    }
    object["pokemon"] = pokemon_arr;




    return object;

}

int
AbilityDetail::getId()
{
	return id;
}

void
AbilityDetail::setId(int id)
{
	this->id = id;
}

std::string
AbilityDetail::getName()
{
	return name;
}

void
AbilityDetail::setName(std::string name)
{
	this->name = name;
}

bool
AbilityDetail::isIsMainSeries()
{
	return is_main_series;
}

void
AbilityDetail::setIsMainSeries(bool is_main_series)
{
	this->is_main_series = is_main_series;
}

GenerationSummary
AbilityDetail::getGeneration()
{
	return generation;
}

void
AbilityDetail::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

std::list<AbilityName>
AbilityDetail::getNames()
{
	return names;
}

void
AbilityDetail::setNames(std::list<AbilityName> names)
{
	this->names = names;
}

std::list<AbilityEffectText>
AbilityDetail::getEffectEntries()
{
	return effect_entries;
}

void
AbilityDetail::setEffectEntries(std::list<AbilityEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<AbilityChange>
AbilityDetail::getEffectChanges()
{
	return effect_changes;
}

void
AbilityDetail::setEffectChanges(std::list<AbilityChange> effect_changes)
{
	this->effect_changes = effect_changes;
}

std::list<AbilityFlavorText>
AbilityDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
AbilityDetail::setFlavorTextEntries(std::list<AbilityFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<AbilityDetail_pokemon_inner>
AbilityDetail::getPokemon()
{
	return pokemon;
}

void
AbilityDetail::setPokemon(std::list<AbilityDetail_pokemon_inner> pokemon)
{
	this->pokemon = pokemon;
}



