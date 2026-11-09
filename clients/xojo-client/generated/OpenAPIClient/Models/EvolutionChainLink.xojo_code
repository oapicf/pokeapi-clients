#tag Class
Protected Class EvolutionChainLink

	#tag Property, Flags = &h0
		#tag Note
			Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
		#tag EndNote
		is_baby As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon species at this point in the evolution chain.
		#tag EndNote
		species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			All details regarding the specific details of the referenced Pokémon species evolution.
		#tag EndNote
		evolution_details() As OpenAPIClient.Models.PokemonEvolution
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A List of chain objects.
		#tag EndNote
		evolves_to() As OpenAPIClient.Models.EvolutionChainLink
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
			Name="is_baby"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="evolution_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEvolution"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="evolves_to"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionChainLink"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


