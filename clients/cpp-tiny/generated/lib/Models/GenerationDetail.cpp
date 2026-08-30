

#include "GenerationDetail.h"

using namespace Tiny;

GenerationDetail::GenerationDetail()
{
	id = int(0);
	name = std::string();
	abilities = std::list<AbilitySummary>();
	main_region = RegionSummary();
	moves = std::list<MoveSummary>();
	names = std::list<GenerationName>();
	pokemon_species = std::list<PokemonSpeciesSummary>();
	types = std::list<TypeSummary>();
	version_groups = std::list<VersionGroupSummary>();
}

GenerationDetail::GenerationDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

GenerationDetail::~GenerationDetail()
{

}

void
GenerationDetail::fromJson(std::string jsonObj)
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

    const char *abilitiesKey = "abilities";

    if(object.has_key(abilitiesKey))
    {
        bourne::json value = object[abilitiesKey];


        std::list<AbilitySummary> abilities_list;
        AbilitySummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            abilities_list.push_back(element);
        }
        abilities = abilities_list;


    }

    const char *main_regionKey = "main_region";

    if(object.has_key(main_regionKey))
    {
        bourne::json value = object[main_regionKey];




        RegionSummary* obj = &main_region;
		obj->fromJson(value.dump());

    }

    const char *movesKey = "moves";

    if(object.has_key(movesKey))
    {
        bourne::json value = object[movesKey];


        std::list<MoveSummary> moves_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            moves_list.push_back(element);
        }
        moves = moves_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<GenerationName> names_list;
        GenerationName element;
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


        std::list<PokemonSpeciesSummary> pokemon_species_list;
        PokemonSpeciesSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokemon_species_list.push_back(element);
        }
        pokemon_species = pokemon_species_list;


    }

    const char *typesKey = "types";

    if(object.has_key(typesKey))
    {
        bourne::json value = object[typesKey];


        std::list<TypeSummary> types_list;
        TypeSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            types_list.push_back(element);
        }
        types = types_list;


    }

    const char *version_groupsKey = "version_groups";

    if(object.has_key(version_groupsKey))
    {
        bourne::json value = object[version_groupsKey];


        std::list<VersionGroupSummary> version_groups_list;
        VersionGroupSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_groups_list.push_back(element);
        }
        version_groups = version_groups_list;


    }


}

bourne::json
GenerationDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<AbilitySummary> abilities_list = getAbilities();
    bourne::json abilities_arr = bourne::json::array();

    for(auto& var : abilities_list)
    {
        AbilitySummary obj = var;
        abilities_arr.append(obj.toJson());
    }
    object["abilities"] = abilities_arr;








	object["main_region"] = getMainRegion().toJson();




    std::list<MoveSummary> moves_list = getMoves();
    bourne::json moves_arr = bourne::json::array();

    for(auto& var : moves_list)
    {
        MoveSummary obj = var;
        moves_arr.append(obj.toJson());
    }
    object["moves"] = moves_arr;






    std::list<GenerationName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        GenerationName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokemonSpeciesSummary> pokemon_species_list = getPokemonSpecies();
    bourne::json pokemon_species_arr = bourne::json::array();

    for(auto& var : pokemon_species_list)
    {
        PokemonSpeciesSummary obj = var;
        pokemon_species_arr.append(obj.toJson());
    }
    object["pokemon_species"] = pokemon_species_arr;






    std::list<TypeSummary> types_list = getTypes();
    bourne::json types_arr = bourne::json::array();

    for(auto& var : types_list)
    {
        TypeSummary obj = var;
        types_arr.append(obj.toJson());
    }
    object["types"] = types_arr;






    std::list<VersionGroupSummary> version_groups_list = getVersionGroups();
    bourne::json version_groups_arr = bourne::json::array();

    for(auto& var : version_groups_list)
    {
        VersionGroupSummary obj = var;
        version_groups_arr.append(obj.toJson());
    }
    object["version_groups"] = version_groups_arr;




    return object;

}

int
GenerationDetail::getId()
{
	return id;
}

void
GenerationDetail::setId(int id)
{
	this->id = id;
}

std::string
GenerationDetail::getName()
{
	return name;
}

void
GenerationDetail::setName(std::string name)
{
	this->name = name;
}

std::list<AbilitySummary>
GenerationDetail::getAbilities()
{
	return abilities;
}

void
GenerationDetail::setAbilities(std::list<AbilitySummary> abilities)
{
	this->abilities = abilities;
}

RegionSummary
GenerationDetail::getMainRegion()
{
	return main_region;
}

void
GenerationDetail::setMainRegion(RegionSummary main_region)
{
	this->main_region = main_region;
}

std::list<MoveSummary>
GenerationDetail::getMoves()
{
	return moves;
}

void
GenerationDetail::setMoves(std::list<MoveSummary> moves)
{
	this->moves = moves;
}

std::list<GenerationName>
GenerationDetail::getNames()
{
	return names;
}

void
GenerationDetail::setNames(std::list<GenerationName> names)
{
	this->names = names;
}

std::list<PokemonSpeciesSummary>
GenerationDetail::getPokemonSpecies()
{
	return pokemon_species;
}

void
GenerationDetail::setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species)
{
	this->pokemon_species = pokemon_species;
}

std::list<TypeSummary>
GenerationDetail::getTypes()
{
	return types;
}

void
GenerationDetail::setTypes(std::list<TypeSummary> types)
{
	this->types = types;
}

std::list<VersionGroupSummary>
GenerationDetail::getVersionGroups()
{
	return version_groups;
}

void
GenerationDetail::setVersionGroups(std::list<VersionGroupSummary> version_groups)
{
	this->version_groups = version_groups;
}



