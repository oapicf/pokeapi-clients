#tag Class
Protected Class PokemonSpeciesDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		gender_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		capture_rate As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		base_happiness As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		is_baby As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		is_legendary As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		is_mythical As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		hatch_counter As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		has_gender_differences As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		forms_switchable As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		growth_rate As OpenAPIClient.Models.GrowthRateSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		pokedex_numbers() As OpenAPIClient.Models.PokemonDexEntry
	#tag EndProperty


	#tag Property, Flags = &h0
		egg_groups() As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		color As OpenAPIClient.Models.PokemonColorSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		shape As OpenAPIClient.Models.PokemonShapeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		evolves_from_species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		evolution_chain As OpenAPIClient.Models.EvolutionChainSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		habitat As OpenAPIClient.Models.PokemonHabitatSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.PokemonFormDetailFormNamesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		pal_park_encounters() As OpenAPIClient.Models.PokemonSpeciesDetailPalParkEncountersInner
	#tag EndProperty


	#tag Property, Flags = &h0
		form_descriptions() As OpenAPIClient.Models.PokemonSpeciesDescription
	#tag EndProperty


	#tag Property, Flags = &h0
		flavor_text_entries() As OpenAPIClient.Models.PokemonSpeciesFlavorText
	#tag EndProperty


	#tag Property, Flags = &h0
		genera() As OpenAPIClient.Models.PokemonSpeciesDetailGeneraInner
	#tag EndProperty


	#tag Property, Flags = &h0
		varieties() As OpenAPIClient.Models.PokemonSpeciesDetailVarietiesInner
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
			Type="AbilityDetailPokemonInnerPokemon"
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
			Type="PokemonFormDetailFormNamesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pal_park_encounters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesDetailPalParkEncountersInner"
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
			Type="PokemonSpeciesDetailGeneraInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="varieties"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesDetailVarietiesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


