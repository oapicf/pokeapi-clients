

#include "GrowthRateDetail.h"

using namespace Tiny;

GrowthRateDetail::GrowthRateDetail()
{
	id = int(0);
	name = std::string();
	formula = std::string();
	descriptions = std::list<GrowthRateDescription>();
	levels = std::list<Experience>();
	pokemon_species = std::list<PokemonSpeciesSummary>();
}

GrowthRateDetail::GrowthRateDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

GrowthRateDetail::~GrowthRateDetail()
{

}

void
GrowthRateDetail::fromJson(std::string jsonObj)
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

    const char *formulaKey = "formula";

    if(object.has_key(formulaKey))
    {
        bourne::json value = object[formulaKey];



        jsonToValue(&formula, value, "std::string");


    }

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<GrowthRateDescription> descriptions_list;
        GrowthRateDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }

    const char *levelsKey = "levels";

    if(object.has_key(levelsKey))
    {
        bourne::json value = object[levelsKey];


        std::list<Experience> levels_list;
        Experience element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            levels_list.push_back(element);
        }
        levels = levels_list;


    }

    const char *pokemon_speciesKey = "pokemon_species";

    if(object.has_key(pokemon_speciesKey))
    {
        bourne::json value = object[pokemon_speciesKey];


        std::list<PokemonSpeciesSummary> pokemon_species_list;
        PokemonSpeciesSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_list.push_back(element);
        }
        pokemon_species = pokemon_species_list;


    }


}

bourne::json
GrowthRateDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["formula"] = getFormula();





    std::list<GrowthRateDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        GrowthRateDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<Experience> levels_list = getLevels();
    bourne::json levels_arr = bourne::json::array();

    for(auto& var : levels_list)
    {
        Experience obj = var;
        levels_arr.append(obj.toJson());
    }
    object["levels"] = levels_arr;






    std::list<PokemonSpeciesSummary> pokemon_species_list = getPokemonSpecies();
    bourne::json pokemon_species_arr = bourne::json::array();

    for(auto& var : pokemon_species_list)
    {
        PokemonSpeciesSummary obj = var;
        pokemon_species_arr.append(obj.toJson());
    }
    object["pokemon_species"] = pokemon_species_arr;




    return object;

}

int
GrowthRateDetail::getId()
{
	return id;
}

void
GrowthRateDetail::setId(int  id)
{
	this->id = id;
}

std::string
GrowthRateDetail::getName()
{
	return name;
}

void
GrowthRateDetail::setName(std::string  name)
{
	this->name = name;
}

std::string
GrowthRateDetail::getFormula()
{
	return formula;
}

void
GrowthRateDetail::setFormula(std::string  formula)
{
	this->formula = formula;
}

std::list<GrowthRateDescription>
GrowthRateDetail::getDescriptions()
{
	return descriptions;
}

void
GrowthRateDetail::setDescriptions(std::list <GrowthRateDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<Experience>
GrowthRateDetail::getLevels()
{
	return levels;
}

void
GrowthRateDetail::setLevels(std::list <Experience> levels)
{
	this->levels = levels;
}

std::list<PokemonSpeciesSummary>
GrowthRateDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
GrowthRateDetail::setPokemonSpecies(std::list <PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}



