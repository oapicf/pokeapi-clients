
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
#include "PokemonShapeDetail_awesome_names_inner.h"
#include "PokemonShapeDetail_names_inner.h"
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	std::list<PokemonShapeDetail_awesome_names_inner> getAwesomeNames();

	/*! \brief Set 
	 */
	void setAwesomeNames(std::list<PokemonShapeDetail_awesome_names_inner> awesome_names);
	/*! \brief Get 
	 */
	std::list<PokemonShapeDetail_names_inner> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list<PokemonShapeDetail_names_inner> names);
	/*! \brief Get 
	 */
	std::list<PokemonSpeciesSummary> getPokemonSpecies();

	/*! \brief Set 
	 */
	void setPokemonSpecies(std::list<PokemonSpeciesSummary> pokemon_species);


    private:
    int id{};
    std::string name{};
    std::list<PokemonShapeDetail_awesome_names_inner> awesome_names;
    std::list<PokemonShapeDetail_names_inner> names;
    std::list<PokemonSpeciesSummary> pokemon_species;
};
}

#endif /* TINY_CPP_CLIENT_PokemonShapeDetail_H_ */
