
/*
 * PokemonColorDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonColorDetail_H_
#define TINY_CPP_CLIENT_PokemonColorDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonColorName.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonColorDetail{
public:

    /*! \brief Constructor.
	 */
    PokemonColorDetail();
    PokemonColorDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonColorDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string name);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokemonColorName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<PokemonColorName> names);
	/*! \brief Get A list of the Pokémon species that have this color.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of the Pokémon species that have this color.
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<PokemonColorName> names;
    std::list<PokemonSpeciesSummary> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokemonColorDetail_H_ */
