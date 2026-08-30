
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

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int id);
	/*! \brief Get 
	 */
	int getAppeal();

	/*! \brief Set 
	 */
	void setAppeal(int appeal);
	/*! \brief Get 
	 */
	int getJam();

	/*! \brief Set 
	 */
	void setJam(int jam);
	/*! \brief Get 
	 */
	std::list<ContestEffectEffectText> getEffectEntries();

	/*! \brief Set 
	 */
	void setEffectEntries(std::list<ContestEffectEffectText> effect_entries);
	/*! \brief Get 
	 */
	std::list<ContestEffectFlavorText> getFlavorTextEntries();

	/*! \brief Set 
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
