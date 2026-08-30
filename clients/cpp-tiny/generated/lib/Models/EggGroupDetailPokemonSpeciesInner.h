
/*
 * EggGroupDetail_pokemon_species_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_EggGroupDetail_pokemon_species_inner_H_
#define TINY_CPP_CLIENT_EggGroupDetail_pokemon_species_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class EggGroupDetail_pokemon_species_inner{
public:

    /*! \brief Constructor.
	 */
    EggGroupDetail_pokemon_species_inner();
    EggGroupDetail_pokemon_species_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~EggGroupDetail_pokemon_species_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Pokemon species name.
	 */
	std::string getName();

	/*! \brief Set Pokemon species name.
	 */
	void setName(std::string name);
	/*! \brief Get The URL to get more information about the species
	 */
	std::string getUrl();

	/*! \brief Set The URL to get more information about the species
	 */
	void setUrl(std::string url);


    private:
    std::string name{};
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_EggGroupDetail_pokemon_species_inner_H_ */
