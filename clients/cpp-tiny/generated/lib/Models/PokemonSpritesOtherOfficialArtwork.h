
/*
 * PokemonSpritesOtherOfficialArtwork.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PokemonSpritesOtherOfficialArtwork_H_
#define TINY_CPP_CLIENT_PokemonSpritesOtherOfficialArtwork_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AnyType.h"
#include <map>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOtherOfficialArtwork{
public:

    /*! \brief Constructor.
	 */
    PokemonSpritesOtherOfficialArtwork();
    PokemonSpritesOtherOfficialArtwork(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PokemonSpritesOtherOfficialArtwork();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The URL of the default front official artwork, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default front official artwork, or null if unavailable.
	 */
	void setFrontDefault(std::string front_default);
	/*! \brief Get The URL of the shiny front official artwork, or null if unavailable.
	 */
	std::string getFrontShiny();

	/*! \brief Set The URL of the shiny front official artwork, or null if unavailable.
	 */
	void setFrontShiny(std::string front_shiny);
	/*! \brief Get Additional official artwork grouped by version. Available keys vary by resource.
	 */
	std::map<std::string, std::map<std::string, AnyType>> getVersions();

	/*! \brief Set Additional official artwork grouped by version. Available keys vary by resource.
	 */
	void setVersions(std::map<std::string, std::map<std::string, AnyType>> versions);


    private:
    std::string front_default{};
    std::string front_shiny{};
    std::map<std::string, std::map<std::string, AnyType>> versions;
};
}

#endif /* TINY_CPP_CLIENT_PokemonSpritesOtherOfficialArtwork_H_ */
