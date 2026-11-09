
/*
 * ContestEffectDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ContestEffectDetail_H_
#define TINY_CPP_CLIENT_ContestEffectDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ContestEffectEffectText.h"
#include "ContestEffectFlavorText.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestEffectDetail{
public:

    /*! \brief Constructor.
	 */
    ContestEffectDetail();
    ContestEffectDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ContestEffectDetail();


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
	/*! \brief Get The base number of hearts the user of this move gets.
	 */
	int getAppeal();

	/*! \brief Set The base number of hearts the user of this move gets.
	 */
	void setAppeal(int appeal);
	/*! \brief Get The base number of hearts the user's opponent loses.
	 */
	int getJam();

	/*! \brief Set The base number of hearts the user's opponent loses.
	 */
	void setJam(int jam);
	/*! \brief Get The result of this contest effect listed in different languages.
	 */
	std::list<ContestEffectEffectText> getEffectEntries();

	/*! \brief Set The result of this contest effect listed in different languages.
	 */
	void setEffectEntries(std::list<ContestEffectEffectText> effect_entries);
	/*! \brief Get The flavor text of this contest effect listed in different languages.
	 */
	std::list<ContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set The flavor text of this contest effect listed in different languages.
	 */
	void setFlavorTextEntries(std::list<ContestEffectFlavorText> flavor_text_entries);


    private:
    int id{};
    int appeal{};
    int jam{};
    std::list<ContestEffectEffectText> effect_entries;
    std::list<ContestEffectFlavorText> flavor_text_entries;
};
}

#endif /* TINY_CPP_CLIENT_ContestEffectDetail_H_ */
