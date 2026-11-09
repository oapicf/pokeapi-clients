/*
 * PokemonSpritesOtherOfficialArtwork.h
 *
 * 
 */

#ifndef _PokemonSpritesOtherOfficialArtwork_H_
#define _PokemonSpritesOtherOfficialArtwork_H_


#include <string>
#include "AnyType.h"
#include <map>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PokemonSpritesOtherOfficialArtwork : public Object {
public:
	/*! \brief Constructor.
	 */
	PokemonSpritesOtherOfficialArtwork();
	PokemonSpritesOtherOfficialArtwork(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PokemonSpritesOtherOfficialArtwork();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL of the default front official artwork, or null if unavailable.
	 */
	std::string getFrontDefault();

	/*! \brief Set The URL of the default front official artwork, or null if unavailable.
	 */
	void setFrontDefault(std::string  front_default);
	/*! \brief Get The URL of the shiny front official artwork, or null if unavailable.
	 */
	std::string getFrontShiny();

	/*! \brief Set The URL of the shiny front official artwork, or null if unavailable.
	 */
	void setFrontShiny(std::string  front_shiny);
	/*! \brief Get Additional official artwork grouped by version. Available keys vary by resource.
	 */
	std::map<std::string, std::string> getVersions();

	/*! \brief Set Additional official artwork grouped by version. Available keys vary by resource.
	 */
	void setVersions(std::map <std::string, std::string> versions);

private:
	std::string front_default;
	std::string front_shiny;
	std::map <std::string, std::string>versions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PokemonSpritesOtherOfficialArtwork_H_ */
