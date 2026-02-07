#tag Class
Protected Class PokemonDetailPastTypesInner

	#tag Property, Flags = &h0
		generation As OpenAPIClient.Models.AbilityDetailPokemonInnerPokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		types() As OpenAPIClient.Models.PokemonDetailTypesInner
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
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AbilityDetailPokemonInnerPokemon"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailTypesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


