

#include "EvolutionTriggerDetail.h"

using namespace Tiny;

EvolutionTriggerDetail::EvolutionTriggerDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<EvolutionTriggerName>();
	pokemon_species = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

EvolutionTriggerDetail::EvolutionTriggerDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionTriggerDetail::~EvolutionTriggerDetail()
{

}

void
EvolutionTriggerDetail::fromJson(std::string jsonObj)
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

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<EvolutionTriggerName> names_list;
        EvolutionTriggerName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pokemon_speciesKey = "pokemon_species";

    if(object.has_key(pokemon_speciesKey))
    {
        bourne::json value = object[pokemon_speciesKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> pokemon_species_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_list.push_back(element);
        }
        pokemon_species = pokemon_species_list;


    }


}

bourne::json
EvolutionTriggerDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<EvolutionTriggerName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EvolutionTriggerName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> pokemon_species_list = getPokemonSpecies();
    bourne::json pokemon_species_arr = bourne::json::array();

    for(auto& var : pokemon_species_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        pokemon_species_arr.append(obj.toJson());
    }
    object["pokemon_species"] = pokemon_species_arr;




    return object;

}

int
EvolutionTriggerDetail::getId()
{
	return id;
}

void
EvolutionTriggerDetail::setId(int id)
{
	this->id = id;
}

std::string
EvolutionTriggerDetail::getName()
{
	return name;
}

void
EvolutionTriggerDetail::setName(std::string name)
{
	this->name = name;
}

std::list<EvolutionTriggerName>
EvolutionTriggerDetail::getNames()
{
	return names;
}

void
EvolutionTriggerDetail::setNames(std::list<EvolutionTriggerName> names)
{
	this->names = names;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
EvolutionTriggerDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
EvolutionTriggerDetail::setPokemonSpecies(std::list<AbilityDetail_pokemon_inner_pokemon> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



