
/*
 * PokemonShapeDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonShapeDetail_H_
#define TINY_CPP_CLIENT_PokemonShapeDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PokemonShapeAwesomeName.h"
#include "PokemonShapeName.h"
#include "PokemonSpeciesSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonShapeDetail{
public:

    /*! \brief Constructor.
	 */
    PokemonShapeDetail();
    PokemonShapeDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonShapeDetail();


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
	/*! \brief Get The \"scientific\" name of this Pokémon shape listed in different languages.
	 */
	std::list<PokemonShapeAwesomeName> getAwesomeNames();

	/*! \brief Set The \"scientific\" name of this Pokémon shape listed in different languages.
	 */
	void setAwesomeNames(std::list<PokemonShapeAwesomeName> awesome_names);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<PokemonShapeName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list<PokemonShapeName> names);
	/*! \brief Get A list of the Pokémon species that have this shape.
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set A list of the Pokémon species that have this shape.
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<PokemonShapeAwesomeName> awesome_names;
    std::list<PokemonShapeName> names;
    std::list<PokemonSpeciesSummary> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokemonShapeDetail_H_ */
