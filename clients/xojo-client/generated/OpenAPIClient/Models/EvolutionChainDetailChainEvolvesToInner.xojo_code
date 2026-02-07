#tag Class
Protected Class EvolutionChainDetailChainEvolvesToInner

	#tag Property, Flags = &h0
		evolution_details() As OpenAPIClient.Models.EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		is_baby As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		species As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
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
			Name="evolution_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner"
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
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


