#tag Class
Protected Class PokemonSpeciesDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
		#tag EndNote
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The chance of this Pokémon being female, in eighths; or -1 for genderless.
		#tag EndNote
		gender_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The base capture rate; up to 255. The higher the number, the easier the catch.
		#tag EndNote
		capture_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
		#tag EndNote
		base_happiness As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this is a baby Pokémon.
		#tag EndNote
		is_baby As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this is a legendary Pokémon.
		#tag EndNote
		is_legendary As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this is a mythical Pokémon.
		#tag EndNote
		is_mythical As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
		#tag EndNote
		hatch_counter As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this Pokémon has visual gender differences.
		#tag EndNote
		has_gender_differences As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not this Pokémon has multiple forms and can switch between them.
		#tag EndNote
		forms_switchable As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The rate at which this Pokémon species gains levels.
		#tag EndNote
		growth_rate As OpenAPIClient.Models.GrowthRateSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of Pokedexes and the indexes reserved within them for this Pokémon species.
		#tag EndNote
		pokedex_numbers() As OpenAPIClient.Models.PokemonDexEntry
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of egg groups this Pokémon species is a member of.
		#tag EndNote
		egg_groups() As OpenAPIClient.Models.EggGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The color of this Pokémon for Pokédex search.
		#tag EndNote
		color As OpenAPIClient.Models.PokemonColorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The shape of this Pokémon for Pokédex search.
		#tag EndNote
		shape As OpenAPIClient.Models.PokemonShapeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon species that evolves into this Pokemon_species.
		#tag EndNote
		evolves_from_species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The evolution chain this Pokémon species is a member of.
		#tag EndNote
		evolution_chain As OpenAPIClient.Models.EvolutionChainSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The habitat this Pokémon species can be encountered in.
		#tag EndNote
		habitat As OpenAPIClient.Models.PokemonHabitatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation this Pokémon species was introduced in.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.PokemonSpeciesName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of encounters that can be had with this Pokémon species in pal park.
		#tag EndNote
		pal_park_encounters() As OpenAPIClient.Models.PokemonSpeciesPalParkEncounter
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Descriptions of different forms Pokémon take on within the Pokémon species.
		#tag EndNote
		form_descriptions() As OpenAPIClient.Models.PokemonSpeciesDescription
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of flavor text entries for this Pokémon species.
		#tag EndNote
		flavor_text_entries() As OpenAPIClient.Models.PokemonSpeciesFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The genus of this Pokémon species listed in multiple languages.
		#tag EndNote
		genera() As OpenAPIClient.Models.PokemonSpeciesGenus
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of the Pokémon that exist within this Pokémon species.
		#tag EndNote
		varieties() As OpenAPIClient.Models.PokemonSpeciesVariety
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender_rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="capture_rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="base_happiness"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_baby"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_legendary"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_mythical"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hatch_counter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="has_gender_differences"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="forms_switchable"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="growth_rate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GrowthRateSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokedex_numbers"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDexEntry"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="egg_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EggGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="color"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonColorSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="shape"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonShapeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="evolves_from_species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="evolution_chain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionChainSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="habitat"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonHabitatSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pal_park_encounters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesPalParkEncounter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="form_descriptions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesDescription"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="flavor_text_entries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesFlavorText"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="genera"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesGenus"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="varieties"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesVariety"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


