

#include "EncounterPokemonDetail.h"

using namespace Tiny;

EncounterPokemonDetail::EncounterPokemonDetail()
{
	min_perfect_ivs = int(0);
	always_shiny = bool(false);
	never_shiny = bool(false);
	is_alpha = bool(false);
}

EncounterPokemonDetail::EncounterPokemonDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterPokemonDetail::~EncounterPokemonDetail()
{

}

void
EncounterPokemonDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *min_perfect_ivsKey = "min_perfect_ivs";

    if(object.has_key(min_perfect_ivsKey))
    {
        bourne::json value = object[min_perfect_ivsKey];



        jsonToValue(&min_perfect_ivs, value, "int");


    }

    const char *always_shinyKey = "always_shiny";

    if(object.has_key(always_shinyKey))
    {
        bourne::json value = object[always_shinyKey];



        jsonToValue(&always_shiny, value, "bool");


    }

    const char *never_shinyKey = "never_shiny";

    if(object.has_key(never_shinyKey))
    {
        bourne::json value = object[never_shinyKey];



        jsonToValue(&never_shiny, value, "bool");


    }

    const char *is_alphaKey = "is_alpha";

    if(object.has_key(is_alphaKey))
    {
        bourne::json value = object[is_alphaKey];



        jsonToValue(&is_alpha, value, "bool");


    }


}

bourne::json
EncounterPokemonDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["min_perfect_ivs"] = getMinPerfectIvs();






    object["always_shiny"] = isAlwaysShiny();






    object["never_shiny"] = isNeverShiny();






    object["is_alpha"] = isIsAlpha();



    return object;

}

int
EncounterPokemonDetail::getMinPerfectIvs()
{
	return min_perfect_ivs;
}

void
EncounterPokemonDetail::setMinPerfectIvs(int min_perfect_ivs)
{
	this->min_perfect_ivs = min_perfect_ivs;
}

bool
EncounterPokemonDetail::isAlwaysShiny()
{
	return always_shiny;
}

void
EncounterPokemonDetail::setAlwaysShiny(bool always_shiny)
{
	this->always_shiny = always_shiny;
}

bool
EncounterPokemonDetail::isNeverShiny()
{
	return never_shiny;
}

void
EncounterPokemonDetail::setNeverShiny(bool never_shiny)
{
	this->never_shiny = never_shiny;
}

bool
EncounterPokemonDetail::isIsAlpha()
{
	return is_alpha;
}

void
EncounterPokemonDetail::setIsAlpha(bool is_alpha)
{
	this->is_alpha = is_alpha;
}



